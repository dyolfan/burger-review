package academy.learnprogramming;

public enum Additions {
    LETTUCE(0.50, "Lettuce"), TOMATO(0.45, "Tomato"), CARROT(0.24, "Carrot"),
    CHEESE(0.66, "Cheese"), CUCUMBER(0.70, "Cucumber"), AVOCADO(1.01, "Avocado"),
    CHIPS(1.50, "Chips"), DRINK(1.88, "Drink");

    private double price;
    private String name;

    Additions(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }
}