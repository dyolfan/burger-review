package academy.learnprogramming;

import academy.learnprogramming.burgers.BurgerFactory;

public class Main {

    public static void main(String[] args) {
        BurgerFactory.createBaseBurger(2.50d, "Чёрствый хлеб", "Колбаса", "Шляпа-бургер").showMenu();

        BurgerFactory.createDeluxeBurger(3d, "Булочка с сезамом", "Говядина", "Топчик").showMenu();

        BurgerFactory.createHealthyBurger(3.50d, "Блины из коровьего говна", "Мезинец повара", "Тапок").showMenu();
    }
}
