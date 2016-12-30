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

/**A test for the functions of a regular aircraft.
 * Just a plane aircraft.
 *
 * @author 07mct
 */
public class StandardAircraftTest {

    /**Test of createAircraft method, of class StandardAircraft.
     * Tests that upon calling createaircraft on a regular aircraft,
     * the appropriate string is returned.
     */
    @Test
    public void testCreateAircraft() 
    {
        System.out.println("CreateAircraft test for a standard aircraft.");
        StandardAircraft instance = new StandardAircraft();
        assertEquals("A standard aircraft has been created.",instance.createAircraft());
    }

     /**
     * Test of remove method, of class StandardAircraft.
     * 
     * Tests that upon calling remove() on a standard aircraft, that 
     * the aircraft itself is returned, as its undecorated.
     */    
    @Test
    public void testRemoveExtension() 
    {
        System.out.println("CreateAircraft test for a standard aircraft.");
        StandardAircraft instance = new StandardAircraft();
        Aircraft expResult = instance;
        Aircraft result = instance.removeExtension();
        assertEquals(expResult, result);
    }
    
}
