package academy.learnprogramming.burgers;


import java.util.List;

public class HealthyBurger extends BaseBurger {
    HealthyBurger(double price, String name, String rollType, String meat, int maximumAdditions) {
        super(price, name, rollType, meat, maximumAdditions, List.of(Additions.CUCUMBER, Additions.AVOCADO));
    }

    @Override
    public void showMenu() {
        super.showMenu(this);
    }
}
