/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observers;

/**
 *
 * @author Javier
 */
public class ObserverType1 implements Observer{
    String nameOfObserver;
	public ObserverType1(String name)
	{
		this.nameOfObserver = name;
	}   
	@Override
	public void update(int updatedValue) 
	{
		System.out.println( nameOfObserver+" has received an alert: Updated myValue in Subject is: "+ updatedValue);
	}
}
