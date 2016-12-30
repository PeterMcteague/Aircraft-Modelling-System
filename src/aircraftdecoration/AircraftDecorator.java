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
* Defines a abstract decorator for an aircraft.
* See https://www.tutorialspoint.com/design_pattern/decorator_pattern.htm
* Defines a generic decorator template. 
* Must be extended for a usable one. Can be extended for ones specific to 
* a certain type of aircraft too.
* 
* @author p4029206
* @see Aircraft
* @see AircraftKidsDecorator for an example of extension.
*/
public abstract class AircraftDecorator implements Aircraft
{
    /**The aircraft to decorate.*/
    protected Aircraft decoratedAircraft;
    
    /**A constructor for the aircraft decorator.
     * Sets the aircraft to be decorated.
     * 
     * @param ac The aircraft to decorate using the decorator.
     */
    public AircraftDecorator(Aircraft ac)
    {
        this.decoratedAircraft = ac;
    }
    
     /**For creating an aircraft, in a manufacturing sense.
     * That is it puts all the parts of the aircraft together, so
     * a regular aircraft will just state it's a regular aircraft and a 
     * decorated one will state its decorations.
     * 
     * In this case, just returns the string for the decorated aircraft.
     * 
     * @return A string describing the aircraft.
     */
    @Override
    public String createAircraft()
    {
        return this.decoratedAircraft.createAircraft();
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
        return decoratedAircraft;
    }
}
