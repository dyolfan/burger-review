package academy.learnprogramming;

public class BurgerFactory {
    public static BaseBurger createBaseBurger(double price, String rollType, String meat, String name) {
        return new BaseBurger(price, name, rollType, meat, 4);
    }

    public static HealthyBurger createHealthyBurger(double price, String rollType, String meat, String name) {
        return new HealthyBurger(price, name, meat, rollType, 6);
    }

    public static DeluxeBurger createDeluxeBurger(double price, String rollType, String meat, String name) {
        return new DeluxeBurger(price, name, meat, rollType);
    }
}
