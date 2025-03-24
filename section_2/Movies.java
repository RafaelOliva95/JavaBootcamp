/* 03/24/2025
 * author: Rafael Oliva
 * Basic Code to show how to use char variable
 * Example using movies in theaters
 */
public class Movies {
    public static void main(String[] args) {
        //As we are using chars we use single quotes ''
        //If String we use double quotes ""
        //char use 2 bytes in memory
        //String use 48 bytes in memory
        //Gold Rule: Use the smallest amount of memory possible
        char kids = 'A';
        char tennagers = 'B';
        char adults = 'C';   
        System.out.println("Movies in Theaters");
        System.out.println("The Lion King: " + kids);
        System.out.println("The Hunger Games: " + tennagers);
        System.out.println("John Wick 4: " + adults);
    }
}
