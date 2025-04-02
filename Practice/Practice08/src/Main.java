public class Main {
    public static void main(String[] args) {
        spider spider = new spider(8);
        spider.walk();
        spider.eat();

        Parrot parrot = new Parrot();
        parrot.sing();
        parrot.color();
        parrot.wings(2);
    }
}
