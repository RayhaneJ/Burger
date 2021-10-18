package general;

import java.util.HashMap;
import java.util.Map;

public class BurgerAdvisor {
    private static final BurgerAdvisor instance = new BurgerAdvisor();
    private static Map<Tariff, BurgerRestaurant> registry = new HashMap<Tariff, BurgerRestaurant>();

    public static void register(Tariff tariff, BurgerRestaurant burgerRestaurant){
        if(!registry.containsKey(tariff))
            registry.put(tariff, burgerRestaurant);
    }

    public static BurgerRestaurant select (Tariff tariff){
        return new BurgerRestaurant();
    }

    public static BurgerAdvisor instance(){
        return instance;
    }
}
