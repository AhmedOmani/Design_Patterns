//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Bundle hairBundle = new Bundle() ;
        Bundle serum = new Bundle() ;

        serum.addECommerceUnit(new Product("Loyal" , 190.0));

        hairBundle.addECommerceUnit(new Product("Hair Tonic" , 160.00)) ;
        hairBundle.addECommerceUnit(new Product("Hair mix" , 245.50));
        hairBundle.addECommerceUnit(serum);

        System.out.println(hairBundle.getTotalPrice());

    }
}