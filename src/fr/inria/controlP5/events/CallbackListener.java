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
package fr.inria.controlP5.events;

/**
 * <p>
 * Use a CallbackListener to listen for controller related actions such as pressed, released, etc.
 * Callbacks cn be added via the ControlP5.addCallback() methods.
 * </p>
 * 
 * @example use/ControlP5callback
 * @see controlP5.ControlP5#addCallback(CallbackListener)
 */
public interface CallbackListener {

	public void controlEvent(CallbackEvent theEvent);

}
