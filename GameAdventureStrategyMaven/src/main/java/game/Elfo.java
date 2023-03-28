package game;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Elfo extends Character {
	final Logger logger = LoggerFactory.getLogger(Barbarian.class);
	
	/**
	* Constructor of Barbarian thar receives as argument a WeaponBehaviour.
	*
	* @param w Weapon with which the Barbarian will fight
	*/
	public Elfo(WeaponBehaviour w) {
		super(w);
	}
	
	@Override
	public void display() {
	// TODO Auto-generated method stub
		logger.info("You are a strong, hulky barbarian!!!.");
		System.out.println("new changes to the code");
		System.out.println("Modified from AB;?");
	}
}
