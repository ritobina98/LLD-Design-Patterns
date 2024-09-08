package FactoryDesignPattern;

import FactoryDesignPattern.components.button.Button;
import FactoryDesignPattern.components.button.MacButton;
import FactoryDesignPattern.components.dropDown.DropDown;
import FactoryDesignPattern.components.dropDown.MacDropDown;
import FactoryDesignPattern.components.menu.MacMenu;
import FactoryDesignPattern.components.menu.Menu;
import FactoryDesignPattern.components.scrollWheel.MacScrollWheel;
import FactoryDesignPattern.components.scrollWheel.ScrollWheel;

public class MacUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Menu createMenu() {
        return new MacMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new MacDropDown();
    }

    @Override
    public ScrollWheel createScrollWheel() {
        return new MacScrollWheel();
    }
}
