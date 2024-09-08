package FactoryDesignPattern;

import FactoryDesignPattern.components.button.Button;
import FactoryDesignPattern.components.dropDown.DropDown;
import FactoryDesignPattern.components.menu.Menu;
import FactoryDesignPattern.components.scrollWheel.ScrollWheel;

public interface UIFactory {

        Button createButton();
        Menu createMenu();
        DropDown createDropDown();
        ScrollWheel createScrollWheel();

}
