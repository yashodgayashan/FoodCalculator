import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PersonCalculator {

    private List<Person> students;
    private List<List<String>> people;
    private int male;
    private int female;

    public PersonCalculator(List<Person> students) {
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

        FileWriter csvWriterTwo = new FileWriter("gender.csv");
        csvWriterTwo.append("Gender,Total");
        csvWriterTwo.append("\n");
        csvWriterTwo.append("Male,");
        csvWriterTwo.append(Integer.toString(male));
        csvWriterTwo.append("\n");
        csvWriterTwo.append("Female,");
        csvWriterTwo.append(Integer.toString(female));

        csvWriterTwo.flush();
        csvWriterTwo.close();
    }

    public void calculate() {
        male = 0;
        female = 0;
        people = new ArrayList<>();
        for (Person student : students) {
            List<String> person = new ArrayList<>();
            person.add(student.getName());
            person.add(Integer.toString(student.getBreakfast().getPrice()));
            person.add(Integer.toString(student.getLunch().getPrice()));
            person.add(Integer.toString(student.getDinner().getPrice()));
            int total = student.getBreakfast().getPrice() + student.getLunch().getPrice() + student.getDinner().getPrice();
            if (student.getGender() == Gender.MALE) {
                male += total;
            } else {
                female += total;
            }
            person.add(Integer.toString(total));
            people.add(person);
        }
    }
} 