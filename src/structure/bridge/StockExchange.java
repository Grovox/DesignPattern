package structure.bridge;

public class StockExchange extends Program{

    public StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stock Exchange development in program...");
        developer.writeCode();
    }
}
