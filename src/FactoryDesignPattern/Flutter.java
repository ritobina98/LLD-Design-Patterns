package FactoryDesignPattern;

public class Flutter {

    private int appVersion;
    private String appName;

    private SupportPlatform supportPlatform;

    public SupportPlatform getSupportPlatform() {
        return supportPlatform;
    }

    public void setSupportPlatform(SupportPlatform supportPlatform) {
        this.supportPlatform = supportPlatform;
    }

    public void changeRefreshRate(){
        System.out.println("Change refresh rate");
    }
    public void changeVolume(){
        System.out.println("Change volume");
    }
    public void changeTheme(){
        System.out.println("Change Theme");
    }
    public String getVersion(){
        return "1.1.1";
    }

    public UIFactory getUIFactory() {
        return UIFactoryFactory.getUIFactory(supportPlatform);
    }
}
