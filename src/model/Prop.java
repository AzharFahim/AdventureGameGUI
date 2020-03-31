package model;

public class Prop extends GameObject{//Prop class inherited from GameObject class
	
	/**
	 *
	 * The Prop class creates objects on the map for the player to interact with.
	 * These prop objects contain important storyline information which will help better the 
	 * user's undertsanding of the storyline and provide them with important hints and information to 
	 * win the game. The intention of the props is to add more atmosphere to the game while remaining purposeful. 
	 *
	 */

	/**
	 * This is the copy constructor for Prop.
	 *
	 * @param prop Prop object to be copied
	 */
	public Prop(Prop prop)
	{
		super(prop);
	}
	
	/**
	 * The Prop object constructor
	 * To help place the prop in the respective location and give it the relative decription.
	 * Inherits the variables from the parent class
	 * @param des prop description text
	 * @param x integer representing x position
	 * @param y integer representing y position
	 */
	public Prop(String des, int x, int y) {
		super(x,y,des);
	} 
	
	

}
