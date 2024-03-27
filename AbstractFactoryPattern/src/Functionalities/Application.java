package Functionalities;

import UIFactories.UIFactory;

public class Application {
    public SysButton button;
    public SysCheckBox checkbox;

    public Application(UIFactory uiFactory){
        button=uiFactory.CreateButton();
        checkbox=uiFactory.CreateChckBox();
    }

    public void paint(){
        button.Click();
        checkbox.Tick();
    }
}
