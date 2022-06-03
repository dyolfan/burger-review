package academy.learnprogramming.burgers;

import java.util.List;

public interface Burger {
    List<Additions> getBaseAdditions();

    String getName();

    String getMeat();

    String getRoll();

    List<Additions> getAdditions();

    int getMaximumAdditions();

    double getBasePrice();

    double getPrice();

    List<Additions> getSelectedAdditions();

    void showMenu();

    void showMenu(Burger burger);
}
