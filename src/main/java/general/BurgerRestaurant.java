package general;

public interface BurgerRestaurant {
    BurgerCook order_menu(MenuType menuType);
    BurgerCook order_personal(MeatType menuType);
}
