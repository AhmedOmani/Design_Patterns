public class Premuim implements LoyalityProgram {
    @Override
    public double discount(double price) {
        return price * 0.8;
    }
}
