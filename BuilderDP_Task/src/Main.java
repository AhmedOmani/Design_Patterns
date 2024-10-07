//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ConfigurationManager manager = new ConfigurationManagerBuilder()
                .setControlPreferences("Theme")
                .setGraphicsQuality("720")
                .setSoundOptions("High")
                .build() ;

        System.out.println(manager.getControlPreferences());
        System.out.println(manager.getGraphicsQuality());
        System.out.println(manager.getSoundOptions());
    }
}