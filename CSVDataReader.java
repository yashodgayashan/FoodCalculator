import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVDataReader {

    private final String COMMA = ",";
    private String fileName;
    private List<String> headerList;
    private List<Person> students;

    /**
     * @return the students
     */
    public List<Person> getStudents() {
        return students;
    }

    public void setStudents() throws IOException {
        BufferedReader csvFileReader = readFile();
        students = new ArrayList<Person>();
        csvFileReader
            .lines()
            .skip(1)
            .map(
                data -> {
                    String[] line = data.split(COMMA);
                    return new Person(line);
                }
            ).forEach((person) -> {
                this.students.add(person);
            });
        csvFileReader.close();
    }

    public CSVDataReader(String fileName) throws IOException {
        this.fileName = fileName;
        setStudents();
    }
    /**
     * @return the fileName
     */
    public String getFileName() {
        return fileName;
    }

    public List<String> getHeaderList() {
        return headerList;
    }

    /**
     * @param fileName the fileName to set
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public BufferedReader readFile() throws FileNotFoundException {
        return new BufferedReader(new FileReader(fileName));
    }
}