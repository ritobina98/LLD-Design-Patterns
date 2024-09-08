package FactoryDesignPattern;

import FactoryDesignPattern.components.button.AndroidButton;
import FactoryDesignPattern.components.button.Button;
import FactoryDesignPattern.components.dropDown.AndroidDropDown;
import FactoryDesignPattern.components.dropDown.DropDown;
import FactoryDesignPattern.components.menu.AndroidMenu;
import FactoryDesignPattern.components.menu.Menu;
import FactoryDesignPattern.components.scrollWheel.AndroidScrollWheel;
import FactoryDesignPattern.components.scrollWheel.ScrollWheel;

public class AndroidUIFactory implements UIFactory{

    public Button createButton() {
        return new AndroidButton();
    }

    public Menu createMenu() {
        return new AndroidMenu();
    }

    public DropDown createDropDown() {
        return new AndroidDropDown();
    }

    public ScrollWheel createScrollWheel() {
        return new AndroidScrollWheel();
    }
}
