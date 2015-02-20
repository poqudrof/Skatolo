/* 
 *  controlP5 is a processing gui library.
 * 
 * Copyright (C)  2006-2012 by Andreas Schlegel
 * Copyright (C)  2015 by Jeremy Laviole
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 * 
 * 
 */
package fr.inria.controlP5.gui.controllers;

import fr.inria.controlP5.gui.Controller;


/**
 * The abstract class control behavior allows you to add custom behavior to
 * controllers. Since it is an abstract class it must be extended and method
 * update() must be implemented in your custom control behavior. how to use
 * ControlBehavior please see the ControlP5behavior example in the examples
 * folder.
 * 
 * @example use/ControlP5behavior
 */
public abstract class ControlBehavior {

	protected Controller<?> _myController;

	protected float value;

	protected boolean isActive = true;

	public void init(Controller<?> theController) {
		_myController = theController;
	}

	/**
	 * Returns the controller this behavior is connected to.
	 * 
	 * @return Controller
	 */
	public Controller<?> getController() {
		return _myController;
	}


	
	public float getValue() {
		return value;
	}

	public void setValue(float theValue) {
		value = theValue;
		_myController.setValue(value);
	}

	/**
	 * When extending ControlBehavior, update() has to be overridden.
	 */
	public abstract void update();

	/**
	 * (de)activate the behavior.
	 * 
	 * @param theFlag boolean
	 */
	public void setActive(boolean theFlag) {
		isActive = theFlag;
	}

	/**
	 * check if the behavior is active or not.
	 * 
	 * @return boolean
	 */
	public boolean isActive() {
		return isActive;
	}

	/**
	 * @exclude
	 * @return
	 */
	@Deprecated
	public float value() {
		return value;
	}
	
	/**
	 * @exclude
	 */
	@Deprecated
	public Controller<?> controller() {
		return _myController;
	}}
