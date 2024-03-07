import java.util.ArrayList;

// 1.e: Main klasse
public class Main {
    public static void main(String[] args) {
        // 1.e: Opret en ArrayList af Customer objekter
        ArrayList<Customer> customers = new ArrayList<>();

        // Tilføj nogle Customer objekter til ArrayList'en
        customers.add(new Customer("John", "Doe", "johndoe123"));
        customers.add(new Customer("Jane", "Smith", "janesmith456"));
        customers.add(new Customer("Alice", "Johnson", "alicej"));

        // 1.f: Test printCustomers metoden
        printCustomers(customers);
    }

    // 1.f: printCustomers metode
    public static void printCustomers(ArrayList<Customer> customers) {
        System.out.println("Customers:");
        for (Customer customer : customers) {
            System.out.println(customer);
            System.out.println(); // Tilføjer en tom linje mellem hver kunde
        }
    }
}