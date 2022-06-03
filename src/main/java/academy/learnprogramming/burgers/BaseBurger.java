package academy.learnprogramming.burgers;


import academy.learnprogramming.MenuRenderer;

import java.util.ArrayList;
import java.util.List;

public class BaseBurger implements Burger {
    private static final List<Additions> BASE_ADDITIONS = List.of(Additions.LETTUCE, Additions.TOMATO, Additions.CARROT, Additions.CHEESE);
    private final double price;
    private final String name;

    private String rollType;

    private String meat;
    private final List<Additions> additions = new ArrayList<>();

    private final List<Additions> selectedAdditions = new ArrayList<>();

    private final int maximumAdditions;

    BaseBurger(double price, String name, String rollType, String meat, int maximumAdditions) {
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

    @Override
    public List<Additions> getBaseAdditions() {
        return BASE_ADDITIONS;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getMeat() {
        return this.meat;
    }

    @Override
    public String getRoll() {
        return this.rollType;
    }

    @Override
    public List<Additions> getAdditions() {
        return this.additions;
    }

    @Override
    public int getMaximumAdditions() {
        return maximumAdditions;
    }

    public void addAddition(Additions addition) {
        this.selectedAdditions.add(addition);
    }

    @Override
    public double getBasePrice() {
        return this.price;
    }

    @Override
    public double getPrice() {
        return this.selectedAdditions.stream()
                .map(Additions::getPrice)
                .reduce(this.price, Double::sum);
    }

    @Override
    public List<Additions> getSelectedAdditions() {
        return this.selectedAdditions;
    }

    @Override
    public void showMenu() {
        showMenu(this);
    }

    @Override
    public void showMenu(Burger burger) {
        new MenuRenderer(burger).renderMenu();
    }
}
