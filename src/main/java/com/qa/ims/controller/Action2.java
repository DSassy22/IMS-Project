package com.qa.ims.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.utils.Utils;

public enum Action2 {
	CREATE("To save a new entity into the database"), READ("To read an entity from the database"),
	READ_COST("To get the total cost of an order"), UPDATE("To change an entity already in the database"),
	DELETE("To remove an entity from the database"), RETURN("To return to domain selection");

	public static final Logger LOGGER = LogManager.getLogger();

	private String description;

	Action2(String description) {
		this.description = description;
	}

	/**
	 * Describes the action
	 */
	public String getDescription() {
		return this.name() + ": " + this.description;
	}

	/**
	 * Prints out all possible actions
	 */
	public static void printActions() {
		for (Action2 action : Action2.values()) {
			LOGGER.info(action.getDescription());
		}
	}

	/**
	 * Gets an action based on a users input. If user enters a non-specified
	 * enumeration, it will ask for another input.
	 * 
	 * @return Action type
	 */
	public static Action2 getAction(Utils utils) {
		Action2 action = null;
		do {
			try {
				action = Action2.valueOf(utils.getString().toUpperCase());
			} catch (IllegalArgumentException e) {
				LOGGER.error("Invalid selection please try again");
			}
		} while (action == null);
		return action;
	}

}
