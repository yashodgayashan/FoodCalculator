import java.util.ArrayList;
import java.util.List;

public class Canteen {
    private String name;
    private int breakfast;
    private int lunch;
    private int dinner;

    public Canteen(String name) {
        this.name = name;
        this.breakfast = 0;
        this.lunch = 0;
        this.dinner = 0;
    }

    public String[] toArray() {
        String[] canteen = new String[4];
        canteen[0] = name;
        canteen[1] = Integer.toString(breakfast);
        canteen[2] = Integer.toString(lunch);
        canteen[3] = Integer.toString(dinner);
        return canteen;
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
    public int getBreakfast() {
        return breakfast;
    }

    /**
     * @param breakfast the breakfast to set
     */
    public void setBreakfast(int breakfast) {
        this.breakfast = breakfast;
    }

    public void addBreakfast(int breakfast) {
        this.breakfast += breakfast;
    }

    /**
     * @return the lunch
     */
    public int getLunch() {
        return lunch;
    }

    /**
     * @param lunch the lunch to set
     */
    public void setLunch(int lunch) {
        this.lunch = lunch;
    }

    public void addLunch(int lunch) {
        this.lunch += lunch;
    }

    /**
     * @return the dinner
     */
    public int getDinner() {
        return dinner;
    }

    /**
     * @param dinner the dinner to set
     */
    public void setDinner(int dinner) {
        this.dinner = dinner;
    }

    public void addDinner(int dinner) {
        this.dinner += dinner;
    }
}