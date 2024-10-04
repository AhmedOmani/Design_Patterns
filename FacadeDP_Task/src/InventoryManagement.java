public class InventoryManagement {

    private int numOfproducts ;

    public void setNumOfproducts(int numOfproducts) {
        this.numOfproducts = numOfproducts;
    }

    public boolean checkAvailability(int Quantity) {
        if (Quantity <= numOfproducts) {
            numOfproducts -= Quantity ;
            System.out.println("Quantity is enough , process loding..");
            return true;
        }
        System.out.println("Quantity is not enough , process loding..");
        return false;
    }
}
