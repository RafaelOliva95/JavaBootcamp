/* 03/20/2025
 * author: Rafael Oliva
 * Basic Code to show the basic int variables functionality 
 * Example in a buss behavior
 */
public class Variables{
    public static void main (String[] args){
        //Start the bus route
        int passengers = 0;

        //Open the doors
        passengers = 5;
        System.out.println(passengers);

        //We expected that at least each passenger has a ticket
        int busTickets = passengers;
        System.out.println(busTickets);
        
        //max int value that can be stored before run out of memory
        int maxValue = 2147483647; 
        System.out.println(maxValue + 1);

        //Update variables
        //Get into a new bus station
        passengers = passengers + 5;
        busTickets = busTickets + 5;
        System.out.println(passengers);

        //Get to another bus statuion where some passengers get out of the bus
        passengers -= 3;
        System.out.println(passengers);

        //Arrive to the end of the route
        passengers = passengers - passengers;
        System.out.println("Passengers who took the bus today: " + busTickets);
    }
}