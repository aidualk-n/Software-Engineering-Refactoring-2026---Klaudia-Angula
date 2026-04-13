public class CustomerTest {
    public static void main(String[] args) {
        // Set up test data
        Movie regularMovie = new Movie("The Godfather", Movie.REGULAR);
        Movie newReleaseMovie = new Movie("Oppenheimer", Movie.NEW_RELEASE);
        Movie childrensMovie = new Movie("Frozen", Movie.CHILDRENS);

        Rental rental1 = new Rental(regularMovie, 3);  // 2 + 1.5 = 3.5
        Rental rental2 = new Rental(newReleaseMovie, 2); // 2*3 = 6
        Rental rental3 = new Rental(childrensMovie, 4); // 1.5 + 1.5 = 3.0

        Customer customer = new Customer("Test Customer");
        customer.addRental(rental1);
        customer.addRental(rental2);
        customer.addRental(rental3);

        String statement = customer.statement();
        System.out.println(statement);

        // Expected output (adjust based on your format)
        String expectedStart = "Rental Record for Test Customer";
        if (statement.startsWith(expectedStart)) {
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAILED");
        }
    }
}