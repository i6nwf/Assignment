public class Flower {
    private String name;
    private int petals;
    private float price;

    public Flower(String name, int petals, float price) {
        this.name = name;
        this.petals = petals;
        this.price = price;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setPetals(int petals) {
        this.petals = petals;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public int getPetals() {
        return petals;
    }

    public float getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Flower rose = new Flower("Rose", 32, 10.99f);
        System.out.println("Name: " + rose.getName());
        System.out.println("Petals: " + rose.getPetals());
        System.out.println("Price: " + rose.getPrice());
    }
}
