package Houses;

class Rooms {

    int windows;
    int floor;

    public void Room() {
        this.windows = 5;
        this.windows = (int)(Math.ceil(Math.random() * 4));
    }

    // public floor() {
    //    this.floor = 2;
    //    this.floor = (int)(Math.ceil(Math.random() * 3));
    // }

    public void describe() {
        System.out.print("The house has " + windows + " located on floor " + floor + ".");
    }

}