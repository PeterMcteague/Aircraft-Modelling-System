/**AircraftDecoration is a package of classes for assigning aircrafts to bays in
*  a airport.
* 
* It has been created as a solution for Advanced Java Programming, ICA1, Task 2
* for a part of scenario 2 - the airport routing controller.
* Specifically for a component to add features to the plane for passengers using
* the decorator pattern.
* It is not a solution for the entire scenario.
* 
* See readme.txt for information on running the program.
* 
* @author p4029206
*/
package aircraftdecoration;

/**
* Exists to create a standard for aircrafts. 
* That is, this file defines methods that must always be in aircrafts for this
* component to function.
* 
* @author p4029206
* @see Parkable
*/
interface Aircraft extends Parkable
{
    /**For creating an aircraft, in a manufacturing sense.
     * That is it puts all the parts of the aircraft together, so
     * a regular aircraft will just state it's a regular aircraft and a 
     * decorated one will state its decorations.
     * 
     * @return A string describing the aircraft.
     */
    String createAircraft();
    
    /**For removing the newest extension to the aircraft.
     * Removes the decorator by returning it to what it was before.
     * On a undecorated aircraft, just returns itself.
     * 
     * @return The aircraft without its newest decoration.
     */
    Aircraft removeExtension();
}
