package academy.learnprogramming;

import java.util.List;

import static academy.learnprogramming.Additions.CHIPS;
import static academy.learnprogramming.Additions.DRINK;

public class DeluxeBurger extends BaseBurger {
    public DeluxeBurger(double price, String name, String rollType, String meat) {
        super(price, name, rollType, meat, 0, List.of(CHIPS, DRINK), List.of(CHIPS, DRINK));
    }

    @Override
    public void showMenu() {
        super.showMenu(this);
    }

    @Override
    public List<Additions> getBaseAdditions() {
        return List.of();
    }
}
