import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GenderWiseCalculator {

    private List<Person> students;
    private List<List<String>> people;

    public GenderWiseCalculator(List<Person> students) {
        this.students = students;
    }

    public void writeFile() throws IOException {
        calculate();
        FileWriter csvWriter = new FileWriter("person.csv");

        csvWriter.append("Name,Breakfast cost,Lunch Cost,Dinner cost,Total");
        csvWriter.append("\n");

        for (List<String> person : people) {
            csvWriter.append(String.join(",", person));
            csvWriter.append("\n");
        }
        csvWriter.flush();
        csvWriter.close();
    }

    public void calculate() {
        people = new ArrayList<>();
        for (Person student : students) {
            List<String> person = new ArrayList<>();
            person.add(student.getName());
            person.add(Integer.toString(student.getBreakfast().getPrice()));
            person.add(Integer.toString(student.getLunch().getPrice()));
            person.add(Integer.toString(student.getDinner().getPrice()));
            person.add(
                Integer.toString(
                    student.getBreakfast().getPrice() + 
                    student.getLunch().getPrice() + 
                    student.getDinner().getPrice()
                )
            );
            people.add(person);
        }
    }
} 