package ToyShop;

public class Main {

    public static void main(String[] args) {

        ToyShop toyShop = new ToyShop();

        Toy toy1 = new Toy(1, "constructor", 30, 20);
        Toy toy2 = new Toy(2, "robot", 60, 60);
        Toy toy3 = new Toy(3, "doll", 20, 10);
        Toy toy4 = new Toy(4, "cube", 50, 30);
        Toy toy5 = new Toy(2, "ball", 100, 40);
        Toy toy6 = new Toy(3, "plane", 70, 35);

        toyShop.addToy(toy1);
        toyShop.addToy(toy2);
        toyShop.addToy(toy3);
        toyShop.addToy(toy4);
        toyShop.addToy(toy5);
        toyShop.addToy(toy6);

        toyShop.changeToyFrequency(1, 40);

        toyShop.competition();

        Toy prizeToy = toyShop.getPrizeToy();
        if (prizeToy != null) {
            System.out.println("Выиграла игрушка: " + prizeToy.getName());
        }
    }
}