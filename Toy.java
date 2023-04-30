package ToyShop;

public class Toy {
    private int id;
    private String name;
    private int quantity;
    private double frequencyOfToy;

    public Toy(int id, String name, int quantity, double frequencyOfToy) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.frequencyOfToy = frequencyOfToy;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;

    }

    public double getFrequencyOfToy() {
        return frequencyOfToy;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setFrequencyOfToy(double frequencyOfToy) {
        this.frequencyOfToy = frequencyOfToy;
    }
}
