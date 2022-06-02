package academy.learnprogramming;


import java.util.ArrayList;
import java.util.List;

import static academy.learnprogramming.Additions.*;

public class BaseBurger {
    private static final List<Additions> BASE_ADDITIONS = List.of(LETTUCE, TOMATO, CARROT, CHEESE);
    private final double price;
    private final String name;

    private String rollType;

    private String meat;
    private final List<Additions> additions = new ArrayList<>();

    private final List<Additions> selectedAdditions = new ArrayList<>();

    private final int maximumAdditions;

    public BaseBurger(double price, String name, String rollType, String meat, int maximumAdditions) {
        this(price, name, rollType, meat, maximumAdditions, List.of());
    }

    BaseBurger(double price, String name, String rollType, String meat, int maximumAdditions, List<Additions> specialAdditions) {
        this(price, name, rollType, meat, maximumAdditions, specialAdditions, List.of());
    }

    BaseBurger(double price, String name, String rollType, String meat, int maximumAdditions, List<Additions> specialAdditions, List<Additions> includedAdditions) {
        this.price = price;
        this.name = name;
        this.maximumAdditions = maximumAdditions;
        this.additions.addAll(getBaseAdditions());
        this.additions.addAll(specialAdditions);
        this.selectedAdditions.addAll(includedAdditions);
        this.rollType = rollType;
        this.meat = meat;
    }

    public List<Additions> getBaseAdditions() {
        return BASE_ADDITIONS;
    }

    public String getName() {
        return this.name;
    }

    public String getMeat() {
        return this.meat;
    }

    public String getRoll() {
        return this.rollType;
    }

    public List<Additions> getAdditions() {
        return this.additions;
    }

    public int getMaximumAdditions() {
        return maximumAdditions;
    }

    public void addAddition(Additions addition) {
        this.selectedAdditions.add(addition);
    }

    public double getBasePrice() {
        return this.price;
    }

    public double getPrice() {
        return this.selectedAdditions.stream()
                .map(Additions::getPrice)
                .reduce(this.price, Double::sum);
    }

    public List<Additions> getSelectedAdditions() {
        return this.selectedAdditions;
    }

    public void showMenu() {
        showMenu(this);
    }

    public void showMenu(BaseBurger burger) {
        new MenuRenderer(burger).renderMenu();
    }
}
