package Patterns.DecoratorPattern;

public class DecoratorDriver {
    public static void driver() {
        BasePizza margherita = new Margherita();
        System.out.println(margherita.cost()); // 100

        BasePizza extraCheeseFarmhouse = new ExtraCheese(new Farmhouse());
        System.out.println(extraCheeseFarmhouse.cost()); // 220

        BasePizza mushroomExtraCheeseMargherita = new Mushroom(new ExtraCheese(new Margherita()));
        System.out.println(mushroomExtraCheeseMargherita.cost()); // 170

        BasePizza doubleCheeseFarmhouse = new ExtraCheese(new ExtraCheese(new Farmhouse()));
        System.out.println(doubleCheeseFarmhouse.cost()); // 240
    }
}
