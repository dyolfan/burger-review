package academy.learnprogramming;

import static academy.learnprogramming.BurgerFactory.*;

public class Main {

    public static void main(String[] args) {
        createBaseBurger(2.50d, "Чёрствый хлеб", "Колбаса", "Шляпа-бургер").showMenu();

        createDeluxeBurger(3d, "Булочка с сезамом", "Говядина", "Топчик").showMenu();

        createHealthyBurger(3.50d, "Блины из коровьего говна", "Мезинец повара", "Тапок").showMenu();
    }
}
