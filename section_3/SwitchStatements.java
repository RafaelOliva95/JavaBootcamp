public class SwitchStatements {
    public static void main(String[] args) {

        // Section 1: Weather conditions
        String weather = "sunny";
        // Determine what to wear based on the weather (e.g., sunny, cloudy, rainy, snowy)
        // Decide whether to use if-else or switch
        switch(weather){
            case "sunny":
                System.out.println("Wear a t-shirt");
                break;
            case "cloudy":
                System.out.println("Wear a light jacket");
                break;
            case "rainy":
                System.out.println("Wear a raincoat");
                break;
            case "snowy":
                System.out.println("Wear a snowsuit");
                break;
            default:
                System.out.println("Invalid weather condition");
                break;
        }

        // Section 2: User role
        int role = 2;
        // Determine user access level based on the role (e.g., 1: admin, 2: editor, 3: user)
        // Decide whether to use if-else or switch
        switch(role){
            case 1:
                System.out.println("You are an admin");
                break;
            case 2:
                System.out.println("You are an editor");
                break;
            case 3:
                System.out.println("You are a user");
                break;
            default:
                System.out.println("Invalid role");
                break;
        }

        // Section 3: Temperature and humidity
        int temperature = 75;
        int humidity = 65;
        // Determine the comfort level based on both temperature and humidity (e.g., too hot, too cold, comfortable)
        // Decide whether to use if-else or switch
        if(temperature >= 80 && humidity >= 60){
            System.out.println("It's too hot and humid");
        } else if (temperature >= 80){
            System.out.println("It's too hot");
        }else if(temperature <= 50 && humidity >= 60){
            System.out.println("It's too cold and humid");
        } else if(temperature <= 50){
            System.out.println("It's too cold");
        } else {
            System.out.println("It's comfortable");
        }
        // Section 5: Age and income
        int age = 25;
        int income = 50000;
        // Determine eligibility for a specific credit card based on age and income
        // Decide whether to use if-else or switch
        if(age >= 25 && income >= 40000){
            System.out.println("You are eligible for a credit card");
        } else {
            System.out.println("You are not eligible for a credit card");
        } 

        // Section 1: Traffic light colors
        String lightColor = "green";
        // Determine what action to take based on the traffic light color (e.g., green, yellow, red)
        // Decide whether to use if-else or switch
        switch(lightColor){
            case "green":
                System.out.println("Go");
                break;
            case "yellow":
                System.out.println("Slow down");
                break;
            case "red":
                System.out.println("Stop");
                break;
            default:
                System.out.println("Invalid light color");
                break;
        }

        // Section 2: Exam grade
        int grade = 85;
        // Determine the letter grade based on the numeric grade (e.g., A, B, C, D, F)
        // Decide whether to use if-else or switch
        if(grade >= 90){
            System.out.println("A");
        } else if(grade >= 80){
            System.out.println("B");
        } else if(grade >= 70){
            System.out.println("C");
        } else if(grade >= 60){
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        // Section 3: Browser type
        String browser = "Chrome";
        // Check if the browser is one of the following: Chrome, Firefox, Safari, Edge, or Opera
        // Decide whether to use if-else or switch
        
        switch (browser){
            case "Chrome":
            case "Firefox":
            case "Safari":
            case "Edge":
            case "Opera":
                System.out.println("Valid browser");
                break;
            default:
                System.out.println("Invalid browser");
                break;
        }

    }
}
