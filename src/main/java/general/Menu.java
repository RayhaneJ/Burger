package general;

import java.util.List;

import static general.MenuType.CHEESE_MENU;
import static general.MenuType.MEAT_MENU;

public class Menu {
    private Tariff pricing;
    private MenuType menuType;
    private Burger burger;

    public Menu(Tariff pricing){
        this.pricing = pricing;
    }

    public void setPricing(Tariff pricing) {
        this.pricing = pricing;
    }

    public void setMenuType(MenuType menuType) {
        this.menuType = menuType;
    }

    public Burger getBurger(){
        if(pricing == Tariff.CHEAP)
            return createMacDeauBurger();
        else
            return createBigBurger();
    }

    public void addProduct(Product product){
        if(pricing == Tariff.CHEAP)
            switch (Product.cl)
        burger.items.add(product);
    }

    public Burger createMacDeauBurger(){
        switch (menuType){
            case MEAT_MENU:
                burger = new Burger(MEAT_MENU, List.of(new Meat(Meat.MeatType.BEEF, 100), new Sauce(Sauce.SauceType.BURGER, 40), new DeepFriedOnions(10), new Cheddar(10)));
                break;
            case FISH_MENU:
                burger = new Burger(MEAT_MENU, List.of(new Meat(Meat.MeatType.WHITEFISH, 50), new Sauce(Sauce.SauceType.BEARNAISE, 40)));
                break;
            case CHEESE_MENU:
                burger = new Burger(CHEESE_MENU, List.of(new Meat(Meat.MeatType.BEEF, 50), new Cheddar(10)));
                break;
        }
        return burger;
    }

    public Burger createBigBurger(){
        switch (menuType){
            case MEAT_MENU:
                burger = new Burger(MEAT_MENU, List.of(new Meat(Meat.MeatType.BEEF, 400), new Sauce(Sauce.SauceType.BURGER, 20), new DeepFriedOnions(20), new Tomato(10)));
                break;
            case FISH_MENU:
                burger = new Burger(MEAT_MENU, List.of(new Meat(Meat.MeatType.WHITEFISH, 200), new Sauce(Sauce.SauceType.BEARNAISE, 20)));
                break;
            case CHEESE_MENU:
                burger = new Burger(CHEESE_MENU, List.of(new Meat(Meat.MeatType.BEEF, 200), new Cheddar(30), new DeepFriedOnions(20)));
                break;
        }
        return burger;
    }


}
