package FactoryDesignPattern;


import FactoryDesignPattern.components.button.Button;
import FactoryDesignPattern.components.button.IosButton;
import FactoryDesignPattern.components.dropDown.DropDown;
import FactoryDesignPattern.components.dropDown.IosDropDown;
import FactoryDesignPattern.components.menu.IosMenu;
import FactoryDesignPattern.components.menu.Menu;
import FactoryDesignPattern.components.scrollWheel.IosScrollWheel;
import FactoryDesignPattern.components.scrollWheel.ScrollWheel;

public class IosUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new IosDropDown();
    }

    @Override
    public ScrollWheel createScrollWheel() {
        return new IosScrollWheel();
    }
}
