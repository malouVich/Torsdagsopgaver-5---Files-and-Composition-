
// 3.a: Create Room class
public class Room {
    // 3.a: Fields
    private int numberOfDoors;
    private int numberOfLamps;
    private int numberOfWindows;

    // 3.b: Constructor
    public Room(int numberOfDoors, int numberOfLamps, int numberOfWindows) {
        this.numberOfDoors = numberOfDoors;
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }

    // 3.c: Getters
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getNumberOfLamps() {
        return numberOfLamps;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }
}
