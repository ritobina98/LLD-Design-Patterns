package FactoryDesignPattern;

import FactoryDesignPattern.components.button.Button;
import FactoryDesignPattern.components.dropDown.DropDown;
import FactoryDesignPattern.components.menu.Menu;
import FactoryDesignPattern.components.scrollWheel.ScrollWheel;

public class Demo {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        flutter.setSupportPlatform(SupportPlatform.MAC);

        //app building code
        UIFactory uiFactory = flutter.getUIFactory();
        Button button = uiFactory.createButton();
        Menu menu = uiFactory.createMenu();
        DropDown dropDown = uiFactory.createDropDown();
        ScrollWheel scrollWheel = uiFactory.createScrollWheel();
    }
}
