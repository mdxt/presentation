package presentation;

import java.time.LocalDateTime;

/*
 *The prototype pattern is a classic Gang of Four creational pattern, 
 *and similar to the other members of the creational pattern family: 
 *singleton , factory method, abstract factory, and builder, prototype is also 
 *concerned with object creation, but with a difference. Using the prototype 
 *pattern, you do not create a new object for each client requesting the object. 
 *Instead, you start by creating a single object, called a prototype and make 
 *copies of it for each client requesting the object. In Java, this is achieved 
 *through object cloning, a way to make a copy of an object with the same state
 *as the original object. 
 *
 *But why create copies if we can create new objects through constructor calls, 
 *which is much simpler? Most of the time you will not need to create copies of 
 *objects. But, as you move into enterprise application development where 
 *application performance is critical, you will encounter situations where 
 *construction of an object involves time consuming operations, such as network
 *communication, database reads, and disk I/O. If a large number of such objects 
 *needs to be created, you can avoid repeating those steps for each object by 
 *initially creating a prototype and then making copies of it. 
 * */

class Presenter {
	String name;
	String title;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public Presenter(String name, String title) {
		super();
		this.name = name;
		this.title = title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}

class Presentation implements Cloneable{
	LocalDateTime startTime;
	Presenter presenter;
	public LocalDateTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}
	public Presenter getPresenter() {
		return presenter;
	}
	public void setPresenter(Presenter presenter) {
		this.presenter = presenter;
	}
	public String getTopic() {
		return topic;
	}
	public Presentation(LocalDateTime startTime, Presenter presenter, String topic) {
		super();
		this.startTime = startTime;
		this.presenter = presenter;
		this.topic = topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	String topic;
}

public class Prototype {
	Presenter presenter = new Presenter("Maitreya Dixit", "Associate SE");
	Presentation presentation = new Presentation(LocalDateTime.now(), presenter, "Creational Design Patterns");
	
	
}
