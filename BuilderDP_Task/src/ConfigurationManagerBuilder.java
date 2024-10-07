public class ConfigurationManagerBuilder implements ConfigurationManagerInterface {

    String graphicsQuality ;
    String SoundOptions ;
    String controlPreferences ;

    @Override
    public ConfigurationManagerBuilder setGraphicsQuality(String graphicsQuality) {
        this.graphicsQuality = graphicsQuality ;
        return this ;
    }

    @Override
    public ConfigurationManagerBuilder setSoundOptions(String SoundOptions) {
        this.SoundOptions = SoundOptions ;
        return this ;
    }

    @Override
    public ConfigurationManagerBuilder setControlPreferences(String controlPreferences) {
        this.controlPreferences = controlPreferences;
        return this ;
    }

    public ConfigurationManager build() {
        return new ConfigurationManager(this) ;
    }
}
