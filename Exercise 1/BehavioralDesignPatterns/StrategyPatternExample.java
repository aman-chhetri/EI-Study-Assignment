interface Strategy {
    int execute(int a, int b);
}

class ConcreteStrategyA implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a + b; // Addition
    }
}

class ConcreteStrategyB implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a - b; // Subtraction
    }
}

class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int a, int b) {
        return strategy.execute(a, b);
    }
}

public class StrategyPatternExample {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyA());
        System.out.println("Addition: " + context.executeStrategy(5, 3));

        context = new Context(new ConcreteStrategyB());
        System.out.println("Subtraction: " + context.executeStrategy(5, 3));
    }
}
