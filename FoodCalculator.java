import java.io.IOException;

public class FoodCalculator {

    public static void main(String args[]) throws IOException {
        CSVDataReader csvDataReader = new CSVDataReader(args[0]);
        PersonCalculator personCalculator = new PersonCalculator(csvDataReader.getStudents());
        personCalculator.writeFile();
        CanteenCalculator canteenCalculator = new CanteenCalculator(csvDataReader.getStudents());
        canteenCalculator.writeFile();
    }
}