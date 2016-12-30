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

/**A decoration for an aircraft that adds a bar to it.
 * 
 * @author 07mct
 * @see AircraftDecorator
 * @see Aircraft
 */
public class AircraftBarDecoration extends AircraftDecorator
{   
    /**A constructor for the decoration.
     * Simply calls the constructor for whatever is passed in.
     * 
     * @param ac - An aircraft to be passed in for the decoration to go on.
     */
    public AircraftBarDecoration(Aircraft ac) 
    {
        super(ac);
    }
    
    /**For creating an aircraft, in a manufacturing sense.
     * That is it puts all the parts of the aircraft together, so
     * a regular aircraft will just state it's a regular aircraft and a 
     * decorated one will state its decorations.
     * In this case it adds a bar to the aircraft it is decorating.
     * 
     * @return A string describing the aircraft.
     */
    @Override
    public String createAircraft()
    {
        return (super.createAircraft() + " It also has a bar.");
    }
}
