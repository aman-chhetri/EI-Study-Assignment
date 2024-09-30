interface Coffee {
    double cost();
}

class CoffeeImpl implements Coffee {
    @Override
    public double cost() {
        return 5.0; // Basic coffee cost
    }
}

class MilkDecorator implements Coffee {
    private Coffee coffee;

    public MilkDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        return coffee.cost() + 1.5; // Add cost of milk
    }
}

class SugarDecorator implements Coffee {
    private Coffee coffee;

    public SugarDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.5; // Add cost of sugar
    }
}

public class DecoratorPatternExample {
    public static void main(String[] args) {
        Coffee coffee = new CoffeeImpl();
        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);
        System.out.println("Total Coffee Cost: " + coffee.cost());
    }
}
