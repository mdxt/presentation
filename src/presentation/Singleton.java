package presentation;

/* Singleton pattern restricts the instantiation of a class and ensures that 
 * only one instance of the class exists in the JVM
 * The singleton class must provide a global access point to get the instance 
 * of the class
 * 
 * To implement a Singleton pattern, we have different approaches but all
 * of them have the following common concepts.
 * 
 * 1. Private constructor to restrict instantiation of the class from other 
 * 	  classes.
 * 2. Private static variable of the same class that is the only instance of 
 * 	  the class.
 * 3. Public static method that returns the instance of the class, this is 
 * 	  the global access point for outer world to get the instance of the 
 *    singleton class.
 *    
 * When to Use Singleton Design Pattern
 * 	  For resources that are expensive to create (like database connection 
 * 	  objects)
 * 	  It's good practice to keep all loggers as Singletons which increases 
 * 	  performance
 * 	  Classes which provide access to configuration settings for the 
 * 	  application
 * 	  Classes that contain resources that are accessed in shared mode

 * */

/** Instance is created when class is loaded.
 *  Wastes resources since the instance is unused until called 
 * @author mdxt
 *
 */
class EagerSingleton {
    
    private static final EagerSingleton instance = new EagerSingleton();
    
    private EagerSingleton(){}

    public static EagerSingleton getInstance(){
        return instance;
    }
}

/**Variant of eager init singleton that allows a try-catch block
 * 
 * @author mdxt
 *
 */
class EagerSingletonWithStaticInit {
    
    private static EagerSingletonWithStaticInit instance;
    
    static {
    	try {
			instance = new EagerSingletonWithStaticInit();
		} catch (Exception e) {
			// TODO: handle exception
		}
    }
    
    private EagerSingletonWithStaticInit(){}

    public static EagerSingletonWithStaticInit getInstance(){
        return instance;
    }
}

/**Lazy init singleton, so resources aren't wasted
 * getInstance() has an issue with multithreaded env, if multiple threads enter the if
 * block at the same time, instance will be created multiple times, hence
 * no longer a singleton
 * getInstanceWithThreadSafety() solves this by using a synchronised block within
 * the if block
 * 
 * @author mdxt
 *
 */
class LazySingleton {
    
    private static LazySingleton instance;
    
    private LazySingleton(){}

    public static LazySingleton getInstance(){
    	if(instance == null) instance = new LazySingleton();
        return instance;
    }
    
    public static LazySingleton getInstanceWithThreadSafety() {
    	if(instance == null) {
    		synchronized (LazySingleton.class) {
    			if(instance == null) instance = new LazySingleton();
			}
    	}
    	return instance;
    }
}


/** This works because the static inner class is not called into memory until
 *  its attribute is accessed. Then, since instance is final, it is thread
 *  safe 
 * 
 * @author mdxt
 *
 */
class StaticSingleton {
	private StaticSingleton() {}
	
	private static class SingletonContainer{
		private static final StaticSingleton instance = new StaticSingleton();
	}
	
	public static StaticSingleton getInstance() {
		return SingletonContainer.instance;
	}
}



public class Singleton {
	public static void main(String[] args) {
		StaticSingleton staticSingleton = StaticSingleton.getInstance();
		EagerSingletonWithStaticInit eagerSingletonWithStaticInit = EagerSingletonWithStaticInit.getInstance();
	}
}
