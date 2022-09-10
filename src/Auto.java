import java.util.Map;
import java.util.Set;

public class Auto extends Car{
     ;
    private int godVypusk;
    private String model;
    private int price;
    private String color;

    public Auto(int ID, int nomer, String auto, int godVypusk, String model, int price, String color) {
        super(ID, nomer);
        this.godVypusk = godVypusk;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public Auto(Set<Map.Entry<Integer, Integer>> entrySet) {
        super(entrySet.hashCode());
    }

    public Auto() {
        super();
    }

    public int getGodVypusk() {
        return godVypusk;
    }

    public void setGodVypusk(int godVypusk) {
        System.out.println("Colour in black");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        System.out.println("Honda Accord");
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        System.out.println("prise in 250000");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        System.out.println("colour-.black");
    }
}
