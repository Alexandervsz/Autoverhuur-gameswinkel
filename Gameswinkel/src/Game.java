import java.time.LocalDate;

public class Game {
    String name;
    int releaseYear;
    private Double sellingPrice;

    public Game(String name, int releaseYear, Double sellingPrice) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.sellingPrice = sellingPrice;
    }

    public double getPrice() {
        int currentYear = LocalDate.now().getYear();
        return sellingPrice * Math.pow(0.7, (currentYear - releaseYear));
    }
}
