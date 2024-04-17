import java.util.*;

public class Project {
        public static final Scanner in = new Scanner(System.in);
        public static void main(String args[]) {
            greeting();
            travelTimeBudget();
            timeDifference();
            countryArea();
            nextDestination();

    }
    public static void greeting(){      //PART 1
        System.out.print("Welcome to Vacation Planner! \nWhat is your name ? ");
        String name = in.nextLine();
        System.out.print("Nice to meet you " + name + ", where are you travelling to ? ");
        String vacation = in.nextLine();
        System.out.println("Great! " +vacation + " sounds like a great trip");

    }
    public static void travelTimeBudget() {      //PART 2
        System.out.print("How many days are you going to spend travelling? ");
        int traveltime = in.nextInt();
        System.out.print("How much money in USD are you planning to spend on your trip ? ");
        double budget = in.nextDouble();
        System.out.print("What is the three letter currency symbol for your travel destination ? ");
        String currency = in.next();
        System.out.print("How many " + currency + " are there in 1 USD? " );
        double exchange = in.nextDouble();
        System.out.println("If you are traveling for " + traveltime + " days that is same as " + traveltime * 24 + " hours or " + traveltime * 24 * 60 + " minutes or " + traveltime * 24 * 3600 + " seconds.");
        System.out.println("If you are going to spend $" + (int)budget + " USD that means per day you can spend up to $" + ((int)((budget / traveltime) * 10.0)) / 10.0 + " USD");
        double toeur = (budget * exchange) / traveltime;
        toeur *= 100;
        toeur = (int) toeur;
        toeur /= 100.0;
        System.out.println("Your total budget in " +currency + " is " + budget * exchange + " " + currency + ", which per day is " + toeur + " " +currency);


    }

    public static void timeDifference() {    // PART 3
      System.out.print("What is the time difference in hours between your home and your destination? ");
      int timedif = in.nextInt();
      int timenight = (timedif + 24) % 24;
      int timeday = (timedif + 12) % 24;
      System.out.println("That means that when it is midnight at home it will be " + timenight + ":00 in your travel destination and when it's noon at home it will be " + timeday + ":00");



    }

    public static void countryArea() {    //PART 4
      System.out.print("What is square area of your destination country in km2? ");
      int km2 = in.nextInt();
      double miles2 = 0.38610215854245 * km2;
      miles2 *= 100;
      miles2 = (int) miles2;
      miles2 /= 100.0;
      System.out.println("In miles2 that is " + miles2);


    }

    public static void nextDestination() {   //PART 5
      System.out.print("How many places you traveled to : ");
      int places = in.nextInt();
      for(int i = 0; i < places; i++){
          System.out.print("Enter the name: "); String traveled = in.next();
      }
          System.out.println("Next place you want to travel to : ");
            String[] place = {"Italy", "England", "Netherlands", "Germany", "France"};
        for (int i = 0; i <place.length; i++) {
            System.out.println(i + ": " + place[i]);
        }
          System.out.print("Thank you, Your next location is : " + place[in.nextInt()-1]);
        }
}
