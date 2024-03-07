
    import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 3.g: Instantiate at least three different rooms
        Room room1 = new Room(2, 4, 3);
        Room room2 = new Room(1, 2, 2);
        Room room3 = new Room(3, 3, 4);

        // 3.h: Add the three rooms to a collection
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        // 3.i: Instantiate a new building
        Building building = new Building(rooms, 2, 3, true);

        // 3.j: Call countLampsInBuilding method
        int totalLamps = countLampsInBuilding(building);
        System.out.println("Total number of lamps in the building: " + totalLamps);

        // 3.k: Call isNormal method
        boolean isNormalBuilding = isNormal(building);
        if (!isNormalBuilding) {
            System.out.println("This is an odd building");
        }
    }

    // 3.j: countLampsInBuilding method
    public static int countLampsInBuilding(Building building) {
        int totalLamps = 0;
        for (Room room : building.getRooms()) {
            totalLamps += room.getNumberOfLamps();
        }
        return totalLamps;
    }

    // 3.k: isNormal method
    public static boolean isNormal(Building building) {
        return building.getNumberOfFloors() > building.getRooms().size();
    }
}