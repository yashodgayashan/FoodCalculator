public class Food {
    private CanteenType place;
    private int price;
    private String type;

    public Food(String place, int price, String type) {
        this.setPlace(place);
        this.setPrice(price);
        this.setType(type);
    }

    public Food(String food) {
        String[] foodData = food.split(Constants.DASH);  
        if (foodData.length == 1) {
            setType(null);
            setPrice(0);
            setPlace("no");
        } else {
            setType(foodData[0].trim());
            setPrice(Integer.parseInt(foodData[1].trim()));
            setPlace(foodData[2].trim());
        }
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
    
    public CanteenType getPlace() {
        return place;
    }

    public void setPlace(String place) {
        if (place.equals(Constants.STAFF)) {
            this.place = CanteenType.STAFF;
        } else if (place.equals(Constants.SUMUDU_AYYA)) {
            this.place = CanteenType.SUMUDU_AYYA;
        } else if (place.equals(Constants.GODA_YATA)) {
            this.place = CanteenType.GODA_YATA;
        } else {
            this.place = CanteenType.NO;
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}