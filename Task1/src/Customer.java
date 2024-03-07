import java.util.ArrayList;

// 1.a: Lav en klasse Customer
public class Customer {
    // 1.a: Attributter
    private String firstName;
    private String lastName;
    private String username;
    private int id;
    private static int counter = 0;

    // 1.b: Konstruktør
    public Customer(String firstName, String lastName, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        counter++; // 1.c: Tæller op hver gang konstruktøren kaldes
        this.id = counter; // Bruger counter til at initialisere id
    }

    // 1.d: toString() metode
    @Override
    public String toString() {
        return "Customer ID: " + id + "\nName: " + firstName + " " + lastName + "\nUsername: " + username;
    }

    // 1.d: Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public int getId() {
        return id;
    }
}