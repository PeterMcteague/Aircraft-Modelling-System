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

import org.junit.Test;
import static org.junit.Assert.*;

/**A J-Unit test for the kids decoration.
 * Tests the functions of AircraftKidsDecoration
 * 
 * @author 07mct
 */
public class AircraftKidsDecorationTest {
    
    /**
     * Test of createAircraft method, of class AircraftKidsDecoration.
     * Tests that upon decorating an aircraft and calling createAircraft() on
     * it, that it returns the appropriate string.
     */
    @Test
    public void testCreateAircraft() 
    {
        System.out.println("CreateAircraft test for a kids extension.");
        Aircraft instance = new StandardAircraft();
        instance = new AircraftKidsDecoration(instance);
        assertEquals("A standard aircraft has been created. It also has a kids area.", instance.createAircraft());
    }
    
     /**
     * Test of remove method, of class AircraftKidsDecoration.
     * 
     * Tests that upon adding a kids area decoration to an aircraft and then 
     * calling remove() on it, that the decoration is removed and it returns 
     * to being a normal aircraft.
     */    
    @Test
    public void testRemove()
    {
        System.out.println("RemoveExtension test for a kids extension.");
        Aircraft ac = new StandardAircraft();
        Aircraft bac = new AircraftKidsDecoration(ac);
        assertEquals(ac,bac.removeExtension());
    }
}
