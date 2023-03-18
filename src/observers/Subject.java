/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observers;

import java.util.*;

/**
 *
 * @author Javier
 */
public class Subject implements SubjectInterface{
    private int flag;
	public int getFlag() 
	{
		return flag;
	}
	public void setFlag(int flag) 
	{
		this.flag = flag;
		//Flag value changed. So notify registered users/observers.
		notifyRegisteredUsers(flag);
	}
	List<Observer> observerList = new ArrayList<Observer>();    
	@Override
	public void register(Observer anObserver) {
		observerList.add(anObserver);

	}
	@Override
	public void unregister(Observer anObserver) {
		observerList.remove(anObserver);		
	}
	@Override
	public void notifyRegisteredUsers(int updatedValue) 
	{
		for (Observer observer : observerList)
			observer.update(updatedValue);
	}
}
