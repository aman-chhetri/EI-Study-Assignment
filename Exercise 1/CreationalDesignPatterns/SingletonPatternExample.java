public class SingletonPatternExample {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println("Singleton Instance: " + singleton);
    }
}
