public class Decimals {
    public static void main(String[] args) {
        // double is 8 bytes
        // float is 4 bytes
        // Avoid using int for math calculations
        double percentage = 73.5;
        System.out.println(percentage + " of percentages are made up");

        double wallet = 20;
        int people = 3;
        //If you do math calculations with integers it will delete decimals
        System.out.println(wallet / people); //If you want decimals, at least one of the variables must be double
    }
}
