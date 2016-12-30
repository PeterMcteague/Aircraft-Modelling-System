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

/**A plain aircraft. Nothing too special.
 *
 * Implements Aircraft.
 * 
 * Is just a plane aircraft.
 * Doesn't include methods and attributes that aren't relevant to this component.
 * 
 * @author p4029206
 * @see Aircraft
 */
public class StandardAircraft implements Aircraft
{
    /**For creating an aircraft, in a manufacturing sense.
     * That is it puts all the parts of the aircraft together, so
     * a regular aircraft will just state it's a regular aircraft and a 
     * decorated one will state its decorations.
     * 
     * @return A string describing the aircraft.
     */
    @Override
    public String createAircraft() 
    {
        return ("A standard aircraft has been created.");
    }

    /**For removing the newest extension to the aircraft.
     * Removes the decorator by returning it to what it was before.
     * On a undecorated aircraft, just returns itself.
     * 
     * @return The aircraft without its newest decoration.
     */
    @Override
    public Aircraft removeExtension() 
    {
        return this;
    }
}
