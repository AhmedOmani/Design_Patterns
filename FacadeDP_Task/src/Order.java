public class Order {

    private String name  ;
    private int quantity ;
    private String paymentType ;
    private String transportType ;

    public Order(String name, int quantity, String paymentType, String transportType) {
        this.name = name;
        this.quantity = quantity;
        this.paymentType = paymentType;
        this.transportType = transportType;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public String getTransportType() {
        return transportType;
    }
}
