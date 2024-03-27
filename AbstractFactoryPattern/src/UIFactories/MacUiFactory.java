package UIFactories;

import Functionalities.SysButton;
import Functionalities.SysCheckBox;
import Macos.MacButton;
import Macos.MacCheckBox;

public class MacUiFactory implements UIFactory{
    @Override
    public SysButton CreateButton() {
        return new MacButton();
    }

    @Override
    public SysCheckBox CreateChckBox() {
        return new MacCheckBox();
    }
}
