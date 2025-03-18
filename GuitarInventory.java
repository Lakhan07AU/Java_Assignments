import java.util.ArrayList;
import java.util.List;

public class GuitarInventory {
    private List<Guitar> guitars;

    public GuitarInventory() {
        guitars = new ArrayList<>();
    }

    public void addGuitar(Guitar guitar) {
        guitars.add(guitar);
    }

    public void viewGuitars() {
        if (guitars.isEmpty()) {
            System.out.println("No guitars in inventory.");
            return;
        }
        for (Guitar guitar : guitars) {
            System.out.println(guitar);
        }
    }

    public Guitar findGuitar(String model) {
        for (Guitar guitar : guitars) {
            if (guitar.getModel().equalsIgnoreCase(model)) {
                return guitar;
            }
        }
        return null;
    }
}