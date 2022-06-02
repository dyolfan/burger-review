package academy.learnprogramming.burgers;

import java.util.List;

public class DeluxeBurger extends BaseBurger {
    DeluxeBurger(double price, String name, String rollType, String meat) {
        super(price, name, rollType, meat, 0, List.of(Additions.CHIPS, Additions.DRINK), List.of(Additions.CHIPS, Additions.DRINK));
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
