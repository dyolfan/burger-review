package academy.learnprogramming;


import java.util.List;

import static academy.learnprogramming.Additions.AVOCADO;
import static academy.learnprogramming.Additions.CUCUMBER;

public class HealthyBurger extends BaseBurger {
    public HealthyBurger(double price, String name, String rollType, String meat, int maximumAdditions) {
        super(price, name, rollType, meat, maximumAdditions, List.of(CUCUMBER, AVOCADO));
    }

    @Override
    public void showMenu() {
        super.showMenu(this);
    }
}
