public class Main {
    public static void main(String[] args) {
        GUIButtonComponent button = new GUIButtonComponent("red" , "lol" , 1, 1);
        GUIButtonComponent button2 = button.clone() ;
        System.out.println(button2.getColor());
    }
}