
public class Person{
    private String name;
    private Gender gender;
    private Food breakfast;
    private Food lunch;
    private Food dinner;

    public Person(String[] data) {
        setName(data[1]);
        setGender(data[2]);
        setBreakfast(data[3]);
        setLunch(data[4]);
        setDinner(data[5]);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the breakfast
     */
    public Food getBreakfast() {
        return breakfast;
    }

    /**
     * @param breakfast the breakfast to set
     */
    public void setBreakfast(Food breakfast) {
        this.breakfast = breakfast;
    }

    public void setBreakfast(String data) {
        this.breakfast = new Food(data);
    }

    /**
     * @return the lunch
     */
    public Food getLunch() {
        return lunch;
    }

    /**
     * @param lunch the lunch to set
     */
    public void setLunch(Food lunch) {
        this.lunch = lunch;
    }

    public void setLunch(String data) {
        this.lunch = new Food(data);
    }

    /**
     * @return the dinner
     */
    public Food getDinner() {
        return dinner;
    }

    /**
     * @param dinner the dinner to set
     */
    public void setDinner(Food dinner) {
        this.dinner = dinner;
    }

    public void setDinner(String data) {
        this.dinner = new Food(data);
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(Gender gender) {
        this.gender = gender;
    }


    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        if(gender.equals(Constants.MALE)) {
            this.gender = Gender.MALE;
        } else {
            this.gender = Gender.FEMALE;
        }
    }

    /**
     * @return the gender
     */
    public Gender getGender() {
        return gender;
    }
}