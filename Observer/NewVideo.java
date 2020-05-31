/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author crys
 */
 class NewVideo implements Subject {
    private List<Observer> observers;
    private String newVideoTitle;
 
	public NewVideo(){
		this.observers=new ArrayList<>();
	}
 
	@Override
	public void suscribed(Observer obj) {
		if(obj == null) {
			throw new NullPointerException("Null Observer Passed");
		}
		if(!observers.contains(obj)) {
			observers.add(obj);
		}
	}
 
	@Override
	public void unsuscribe(Observer obj) {
		if(obj == null) {
			throw new NullPointerException("Null Observer Passed");
		}
		if(observers.contains(obj)) {
			observers.remove(obj);
		}
	}
 
	@Override
	public void notifyObservers() {
 
		for (Observer observerObj : observers) {
			observerObj.update();
		}
 
	}
 
	@Override
	public Object getUpdate(Observer obj) {
		return this.newVideoTitle;
	}
 
 
	// Postea el video :D 
	public void postNewVideo(String newV){
		System.out.println("Nuevo Video Disponible : "+newV);
		this.newVideoTitle=newV;
		notifyObservers();
	}
}
