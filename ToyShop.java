package ToyShop;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ToyShop {
    private ArrayList<Toy> toys;
    private ArrayList<Toy> prizeToys;
    private String outputFilePath;

    public ToyShop() {
        toys = new ArrayList<Toy>();
        prizeToys = new ArrayList<Toy>();
        outputFilePath = "output.txt";
    }

    public void addToy(Toy toy) {
        toys.add(toy);
    }

    public void changeToyFrequency(int toyId, double newFrequency) {
        for (Toy toy : toys) {
            if (toy.getId() == toyId) {
                toy.setFrequencyOfToy(newFrequency);
            }
        }
    }

    public void competition() {
        prizeToys.clear();

        for (Toy toy : toys) {
            double random = Math.random() * 100;
            if (random < toy.getFrequencyOfToy()) {
                prizeToys.add(toy);
            }
        }
    }

    public Toy getPrizeToy() {
        if (!prizeToys.isEmpty()) {
            Toy prizeToy = prizeToys.remove(0);
            prizeToy.setQuantity(prizeToy.getQuantity() - 1);

            try {
                FileWriter writer = new FileWriter(outputFilePath, true);
                writer.write((prizeToy.getName()));
                writer.close();
            } catch (IOException e) {
                System.out.println("Ошибка записи в файл");
            }
            return prizeToy;
        } else {
            System.out.println("Игрушки закончились");
            return null;
        }
    }
}