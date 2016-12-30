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

/**The driver class. 
 * 
 * Just runs a demonstration that the system works as intended.
 * @author p4029206
*/
public class DriverClass 
{
    /**The main method.
     * Runs when the user runs the program.
     * 
     * @param args Required for main.
     * @see main
     */
    public static void main(String[] args) 
    {
        System.out.println("Using the decorator pattern we can add and remove"
                + " facilities from an aircraft.");
        System.out.println("In this example we will add a kids play area.");
        System.out.println("First we create a basic aircraft.");
        Aircraft testAircraft = new StandardAircraft();
        System.out.println(testAircraft.createAircraft());
        
        System.out.println("");
        
        System.out.println("Then we add a kids play area.");
        testAircraft = new AircraftKidsDecoration(testAircraft);
        System.out.println(testAircraft.createAircraft());
        
        System.out.println("");
        
        System.out.println("Then on top of that we could add a bar.");
        testAircraft = new AircraftBarDecoration(testAircraft);
        System.out.println(testAircraft.createAircraft());
        
        System.out.println("");
        
        System.out.println("Then if we decide we don't want the bar, we could"
                + " remove that.");
        testAircraft = testAircraft.removeExtension();
        System.out.println(testAircraft.createAircraft());
        System.out.println("Note how now we just have the kids area.");
        
        System.out.println("");
        
        System.out.println("This system is useful as of course, a luxury aircraft"
                + " should have a bar.");
        Aircraft luxuryAircraft = new LuxuryAircraft();
        luxuryAircraft = new AircraftBarDecoration(luxuryAircraft);
        System.out.println(luxuryAircraft.createAircraft());
        System.out.println("See how we can plan putting extensions onto any "
                + "aircraft where it is suitable, allowing us to model things"
                + " in a more in depth way.");
    }
}
