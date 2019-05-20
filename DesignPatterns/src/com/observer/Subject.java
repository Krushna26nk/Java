package com.observer;

public interface Subject {

	// methods to register and unregister observer
	public void register(Observer obj);
	public void unregister(Observer obj);
	
	// method to notify observers for change
	public void notifyObservers();
	
	// method to get updates from subject
	public Object getUpdate(Observer obj);
	
}