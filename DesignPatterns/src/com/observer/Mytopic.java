package com.observer;

import java.util.ArrayList;
import java.util.List;

public class Mytopic implements Subject {

	private List<Observer> Observers;
	private String message;
	private boolean changed;
	
	private final Object MUTEX = new Object();
	
	public Mytopic() {
		this.Observers = new ArrayList<>();
	}
	
	@Override
	public void register(Observer obj) {
		if(obj == null) throw new NullPointerException("Null Observer");
		synchronized (MUTEX) {
			if(!Observers.contains(obj)) Observers.add(obj);
		}
	}
	
	@Override
	public void unregister(Observer obj) {
		synchronized (MUTEX){
			Observers.remove(obj);
		}
	}
	
	@Override
	public void notifyObservers() {
		List<Observer> observerslocal = null;
		
		// synchonization  is used to make  sure any observer registered after message is received  is not notified
		
		synchronized (MUTEX) {
			if(!changed)
				return;
			observerslocal = new ArrayList<>(this.Observers);
			this.changed= false;
		}
		for(Observer obj: observerslocal) {
			obj.update();
		}
	}
	
	@Override
	public Object getUpdate(Observer obj) {
		return this.message;
	}
	
	// method to post message to topic
	public void postMessage(String msg) {
		System.out.println("Message posted to the topic :- "+msg);	
		this.message = message;
		this.changed = true;
		notifyObservers();
		
	}
}
