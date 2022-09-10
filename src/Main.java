import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap<>();
//        map.put(1, 212);
        System.out.println(map.entrySet());
        System.out.println();
        Auto auto = new Auto();
        auto.setColor("black");
        auto.setGodVypusk(2020);
        auto.setModel("Honda");
        auto.setPrice(5000);
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry);


        }
    }
}