public class Calendar {
    public static void main(String[] args) {
        
        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        String day = "Friday"; //Can be any day.
        System.out.println("Hey, are you free on " + day + "? \n");


        System.out.println("Hmm, let me check my calendar.");
        
        //Check 'calendar' here:        
        switch(day){
            case "Monday":
                System.out.println("Sorry, I have to stay at work late.");
                break;
            case "Tuesday":
                System.out.println("It looks like I have meetings today!");
                break;
            case "Wednesday":
                System.out.println("I have a dentist appointment. Some other time!");
                break;  
            case "Thursday":
                System.out.println("Sorry, thursday is date night!");
                break;  
            case "Friday":
            case "Saturday":
            case "Sunday":
                System.out.println("I'm free!!");
                break;
            default:
                System.out.println("That's not a day.");    
        }

    }
}
