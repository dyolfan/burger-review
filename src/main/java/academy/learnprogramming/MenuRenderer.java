package academy.learnprogramming;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Scanner;

public class MenuRenderer {
    private static final DecimalFormat NUMBER_FORMAT = new DecimalFormat("0.00");
    private final BaseBurger burger;

    public MenuRenderer(BaseBurger burger) {
        this.burger = burger;
    }

    public void renderMenu() {
        Scanner scanner = new Scanner(System.in);
        int additionsLeft = burger.getMaximumAdditions();
        List<Additions> additionsList = this.burger.getAdditions();

        do {
            System.out.println(getFullMenu());
            if (burger.getMaximumAdditions() > 0) {
                additionsLeft = showAdditions(scanner, additionsList, additionsLeft);
            } else {
                additionsLeft = 0;
            }
        } while (additionsLeft > 0);

        if (additionsLeft == 0) {
            System.out.println("No more additions can be added! Total price - " + formatNumber(burger.getPrice()) + "$");
        }
        printBurgerBaseComponents();
        printSelectedAdditions();
    }

    private int showAdditions(Scanner scanner, List<Additions> additionsList, int additionsLeft) {
        int menuOption = scanner.nextInt();
        if (menuOption >= 0 && menuOption <= additionsList.size()) {
            if (menuOption == 0) {
                additionsLeft = 0;
                printBurgerPrice(burger);
            }
            Additions selectedAddition = additionsList.get(menuOption - 1);
            burger.addAddition(selectedAddition);
            printAdditionAdded(selectedAddition);
            printBurgerPrice(burger);
            additionsLeft--;
        } else {
            System.out.println("Incorrect number!");
        }

        return additionsLeft;
    }

    private String getFullMenu() {
        List<Additions> additionsList = this.burger.getAdditions();

        StringBuilder stringBuilder = new StringBuilder(" \n" + burger.getName() + " - base price " + burger.getBasePrice() + "$ - Menu with additions:");
        stringBuilder.append("\n0) Exit from menu");
        for (int i = 0; i < additionsList.size(); i++) {
            Additions addition = additionsList.get(i);
            stringBuilder.append("\n");
            stringBuilder.append(i + 1).append(") ").append(addition.getName()).append(" price = ").append(formatNumber(addition.getPrice())).append("$");

        }
        return stringBuilder.toString();
    }

    private void printBurgerPrice(BaseBurger burger) {
        System.out.println("Burger price = " + (formatNumber(burger.getPrice())) + "$");
    }

    private void printAdditionAdded(Additions addition) {
        System.out.println(addition.getName() + " added.");
    }

    private void printBurgerBaseComponents() {
        System.out.println("Burger components:");
        System.out.println(" - meat - " + this.burger.getMeat());
        System.out.println(" - roll - " + this.burger.getRoll());
    }

    private void printSelectedAdditions() {
        StringBuilder stringBuilder = new StringBuilder("Selected additions:");
        this.burger.getSelectedAdditions().forEach(addition -> stringBuilder.append("\n -").append(addition.getName()));
        System.out.println(stringBuilder);
    }

    private String formatNumber(Double number) {
        return NUMBER_FORMAT.format(number);
    }
}
