package Houses;

import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class Houses {  // Class

    public int rooms;
    public int windows;
    public String color;
    boolean hasHoA = true;
    static List<String> colorsList = Arrays.asList("red", "blue", "green", "beige", "yellow",
            "gray","navy","black");

    public Houses() {  // Constructor
        this.rooms = 4 + (int)(Math.ceil(Math.random() * 9));  // Value of 0 to 1 ; here is 0 to .9
        this.color = "red";
        this.windows = 8 + (int)(Math.ceil(Math.random() * 9));
        System.out.println(this.windows);

        // System.out.println("Build a " + colorsList + " house!");  // Might comment this out if random works
    }

    public void paintHouse(String color) {
        this.color = color;
    }

    public void paintHouse() {
        int i = + (int)(Math.floor(Math.random() * colorsList.size()));  // Math.floor rounds down from max
        paintHouse(colorsList.get(i));
    }

    public void colorsRandom() {
        Random rand = new Random();
        int randomColors = 2;

        for (int i = 0; i < randomColors; i++) {
            int randomIndex = rand.nextInt(colorsList.size());
            String randomElement = colorsList.get(randomIndex);
        }
    }

    public void isHOA(){
        Random brand = new Random();
        System.out.println(brand.nextBoolean());
    }

    public void describe() {
        System.out.print("This house is " + this.color);
        System.out.print(" and has " + this.rooms + " rooms and " + this.windows + " windows.");

        if(hasHoA) {
            System.out.println(" This house has a HoA.");
        } else {
            System.out.println(" This house does not have a HoA.");
        }


    }
}