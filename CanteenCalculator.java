import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CanteenCalculator {
    private List<Person> students;
    private List<Canteen> canteens;

    public CanteenCalculator(List<Person> students) {
        this.students = students;
    }

    public void calculate() {
        canteens = new ArrayList<>();
        Canteen staff = new Canteen("Staff");
        Canteen sumuduAyya = new Canteen("Sumudu Ayya");
        Canteen godaYata = new Canteen("Goda Yata");
        for (Person person : students) {
            if (person.getBreakfast().getPlace() == CanteenType.STAFF) {
                staff.addBreakfast(person.getBreakfast().getPrice());
            } else if (person.getBreakfast().getPlace() == CanteenType.GODA_YATA) {
                godaYata.addBreakfast(person.getBreakfast().getPrice());
            } else if (person.getBreakfast().getPlace() == CanteenType.SUMUDU_AYYA) {
                sumuduAyya.addBreakfast(person.getBreakfast().getPrice());
            }

            if (person.getLunch().getPlace() == CanteenType.STAFF) {
                staff.addLunch(person.getLunch().getPrice());
            } else if (person.getLunch().getPlace() == CanteenType.GODA_YATA) {
                godaYata.addLunch(person.getLunch().getPrice());
            } else if (person.getLunch().getPlace() == CanteenType.SUMUDU_AYYA) {
                sumuduAyya.addLunch(person.getLunch().getPrice());
            }

            if (person.getDinner().getPlace() == CanteenType.STAFF) {
                staff.addDinner(person.getDinner().getPrice());
            } else if (person.getDinner().getPlace() == CanteenType.GODA_YATA) {
                godaYata.addDinner(person.getDinner().getPrice());
            } else if (person.getDinner().getPlace() == CanteenType.SUMUDU_AYYA) {
                sumuduAyya.addDinner(person.getDinner().getPrice());
            }
        }
        canteens.add(staff);
        canteens.add(godaYata);
        canteens.add(sumuduAyya);
    }

    public void writeFile() throws IOException {
        calculate();
        FileWriter csvWriter = new FileWriter("canteen.csv");

        csvWriter.append("Name,Breakfast,Lunch,Dinner");
        csvWriter.append("\n");

        for (Canteen canteen : canteens) {
            csvWriter.append(String.join(",", canteen.toArray()));
            csvWriter.append("\n");
        }
        csvWriter.flush();
        csvWriter.close();
    }
}