package general;

public enum SauceType implements FoodConstituent {
    BURGER, BARBECUE, BEARNAISE;

    @Override
    public double calories_per_100g() {
        return 0;
    }

    public double price(){
        return 0;
    }
}
