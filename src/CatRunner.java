public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Bob", 6, 10.8);
        cat1.introduce();
        cat1.printCatInfo();
        Cat cat2 = new Cat("Joe", 15, 32.8);
        cat2.printCatInfo();
        cat2.introduce();


    }
}
