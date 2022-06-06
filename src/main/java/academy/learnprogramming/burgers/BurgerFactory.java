package academy.learnprogramming.burgers;

public class BurgerFactory {
    public static Burger createBaseBurger(double price, String rollType, String meat, String name) {
        return new BaseBurger(price, name, rollType, meat, 4);
    }

    public static Burger createHealthyBurger(double price, String rollType, String meat, String name) {
        return new HealthyBurger(price, name, meat, rollType, 6);
    }

    public static Burger createDeluxeBurger(double price, String rollType, String meat, String name) {
        return new DeluxeBurger(price, name, meat, rollType);
    }
    public static Burger createFlexBurger(double price, String rollType, String meat, String name) {
        return new FlexBurger(price, name, meat, rollType);
    }
}
