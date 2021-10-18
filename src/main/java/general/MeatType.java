package general;

public enum MeatType implements FoodConstituent {
    BEEF, WHITEFISH;

    @Override
    public double calories_per_100g() {
        return 0;
    }
}
