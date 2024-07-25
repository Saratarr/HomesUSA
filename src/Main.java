import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Houses.*;

public class Main {

    static List<Houses> houses;

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Do you want to build a house?\nY/N>");
        String buildHouse = s.nextLine();

        if (buildHouse.equals("Y")) {

            houses = new ArrayList<>();

            houses.add(new Houses());
            houses.add(new Houses());
            houses.add(new Houses());
            houses.add(new Houses());

            houses.get(0).paintHouse("green");
            houses.get(1).paintHouse();
            houses.get(2).paintHouse();
            houses.get(3).paintHouse();


            for(Houses h : houses) {
                h.describe();
            }

        } else if (buildHouse.equals("N")) {
            System.out.println("Okay, then. Let's build another day!");
        } else {
            System.out.println("I'm sorry, builder, but I did not understand your command.");
        }

    s.close();
    }
}