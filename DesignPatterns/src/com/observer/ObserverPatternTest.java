package com.observer;

public class ObserverPatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mytopic mytopic = new Mytopic();
		
		Observer obj1 = new MyTopicSubscriber("Obj 1");
		Observer obj2 = new MyTopicSubscriber("obj 2");
		Observer obj3 = new MyTopicSubscriber("obj 3");
		
		mytopic.register(obj1);
		mytopic.register(obj2);
		mytopic.register(obj3);
		
		obj1.setSubject(mytopic);
		obj2.setSubject(mytopic);
		obj3.setSubject(mytopic);
		
		obj1.update();
		
		mytopic.postMessage("New Message .");
		
	}

}
