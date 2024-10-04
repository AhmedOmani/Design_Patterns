public class PlaceOrderFacade {

    private InventoryManagement inventoryManagement ;
    private PaymentProcessing paymentProcessing ;
    private ShippingLogistics shippingLogistics ;

    public PlaceOrderFacade() {
        inventoryManagement = new InventoryManagement() ;
        inventoryManagement.setNumOfproducts(10);
        paymentProcessing = new PaymentProcessing() ;
        shippingLogistics = new ShippingLogistics() ;
    }

    public boolean placeOrder(Order order) {
        if (!inventoryManagement.checkAvailability(order.getQuantity()))
            return false;
        paymentProcessing.paymentProcess(order.getPaymentType());
        shippingLogistics.shiping(order.getTransportType());
        return true;
    }
}
