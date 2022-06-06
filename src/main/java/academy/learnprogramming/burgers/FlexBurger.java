package academy.learnprogramming.burgers;

import java.util.List;

public class FlexBurger extends BaseBurger {
    FlexBurger(double price, String name, String rollType, String meat) {
        super(price, name, rollType, meat, 1, List.of(Additions.EGG, Additions.DRINK), List.of(Additions.DRINK));
    }

    @Override
    public List<Additions> getBaseAdditions() {
        return List.of();
    }
}
