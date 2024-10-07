public class ConfigurationManager {

    private String graphicsQuality ;
    private String SoundOptions ;
    private String controlPreferences ;

    ConfigurationManager(ConfigurationManagerBuilder configurationManagerBuilder) {
        graphicsQuality = configurationManagerBuilder.graphicsQuality ;
        SoundOptions = configurationManagerBuilder.SoundOptions ;
        controlPreferences = configurationManagerBuilder.controlPreferences ;
    }

    public String getGraphicsQuality() {
        return graphicsQuality;
    }

    public String getSoundOptions() {
        return SoundOptions;
    }

    public String getControlPreferences() {
        return controlPreferences;
    }

}
