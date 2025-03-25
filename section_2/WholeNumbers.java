/* 03/25/2025
 * author: Rafael Oliva
 * Basic Code to show how to use long variable
 * Example using big numbers examples
 */
public class WholeNumbers{
    public static void main(String[] args) {
        //int is just 4 bytes 
        //From: -2,147,483,648 to 2,147,483,647
        //long is 8 bytes
        //From: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        /*int*/ long globalPopulation = 8_000_000_000L;
        long dailyGoogleSearches = 8_500_000_000L;
        System.out.println("Global Population: " + globalPopulation);
        System.out.println("Daily, there are this many google searches: " + dailyGoogleSearches);
    }
}