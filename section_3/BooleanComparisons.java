import java.util.Scanner;

public class BooleanComparisons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // *Part 1 - Notes comparison
        System.out.println("Hello this is Java, give me your Chemistry Grade here: ");
        int chemistryGrade = scanner.nextInt();
        System.out.println("Excellent, now give me your Biology Grade here: ");
        int biologyGrade = scanner.nextInt();
        System.out.println("Me: Hi Java, did I score better in biology?");
        System.out.println("Java: " + (biologyGrade > chemistryGrade) + "\n");
        
        // *Part 2 - Sales comparison
        System.out.println("Hello this is Java, give me your sales here: ");
        double sales = scanner.nextDouble();
        System.out.println("Give your cost of production here: ");
        double costs = scanner.nextDouble();
        System.out.println("Me: Hi Java, did we make money?");
        System.out.println("Java: " + (sales > costs) + "\n");
        
        // *Part 3 - Temperature comparison
        System.out.println("Hello this is Java, give me your current temperature here: ");
        double temperature = scanner.nextDouble();
        System.out.println("Give me the desire temperature: ");
        double targetTemperature = scanner.nextDouble();
        System.out.println("Me: Hi Java, is the temperature colder than our target?");
        System.out.println("Java: " + (temperature < targetTemperature) + "\n");

        // *Part 4 - Speed comparison
        System.out.println("Hello this is Java, give me your current speed here: ");
        int currentSpeed = scanner.nextInt();
        System.out.println("Give me the speed limit: ");
        int speedLimit = scanner.nextInt();
        System.out.println("Me: Hi Java, am I driving slower than the speed limit?");
        System.out.println("Java: " + (currentSpeed < speedLimit) + "\n");

        // *Part 5 - Age comparison
        System.out.println("Hello this is Java, give me your age here: ");
        int age = scanner.nextInt();
        System.out.println("Give me the retirement age: ");
        int retirementAge = scanner.nextInt();
        System.out.println("Me: Hi Java, am I old enough to retire?");
        System.out.println("Java: " + (age >= retirementAge) + "\n");

        // *Part 6 - Salary comparison
        System.out.println("Give me your salary: ");
        double salary = scanner.nextDouble();
        System.out.println("Gice me the max Salary: ");
        double maxSalary = scanner.nextDouble();
        System.out.println("Me: Hi Java, is my salary less than or equal to the maximum salary?");
        System.out.println("Java: " + (salary <= maxSalary) + "\n");

        // *Part 7 - Score comparison
        System.out.println("Hello this is Java, give me your score here: ");
        scanner.nextLine();
        char myGrade = scanner.nextLine().charAt(0);
        System.out.println("Give me the best grade: ");
        char bestGrade = scanner.nextLine().charAt(0);
        System.out.println("Me: Hi Java, did I get the best possible grade?");
        System.out.println("Java: " + (myGrade == bestGrade) + "\n");
        
        // *Part 8 - phone number
        System.out.println("Give me your phone number: ");
        int phoneNumber = scanner.nextInt();
        int contactNumber = 5551234;
        System.out.println("Me: Hi Java, is this the correct phone number for my contact?");
        System.out.println("Java: " + (phoneNumber == contactNumber) + "\n");
        
        // *Part 9 - different letter
        System.out.println("Give me a letter: ");
        scanner.nextLine();
        char letter1 = scanner.nextLine().charAt(0);
        System.out.println("Give me another letter: ");
        char letter2 = scanner.nextLine().charAt(0);
        System.out.println("Me: Hi Java, are these two letters different?");
        System.out.println("Java: " + (letter1 != letter2) + "\n");
        
        // *Part 10 - Different Longs
        System.out.println("How far is the city at the north of you?: ");
        long distance1 = scanner.nextLong();
        System.out.println("How far is the city at the south of you?: ");
        long distance2 = scanner.nextLong();
        System.out.println("Me: Hi Java, are these two cities at the same distance?");
        System.out.println("Java: " + (distance1 == distance2) + "\n");

        // *Part 11 - Words comparison
        System.out.println("Give me a word: ");
        scanner.nextLine();
        String word = scanner.nextLine();
        System.out.println("Give me another word: ");
        String secondWord = scanner.nextLine();
        System.out.println("Me: Are the two words the same?");
        System.out.println("Java: " + word.equals(secondWord) + "\n"); //!Never use comparison operators on strings
        System.out.println("Give me a word: ");
        String thirdWord = scanner.nextLine();
        System.out.println("Give me another word: ");
        String fourthWord = scanner.nextLine();
        System.out.println("Me: Are the two words different");
        System.out.println("Java: " + !thirdWord.equals(fourthWord) + "\n");
        scanner.close();

    }
}