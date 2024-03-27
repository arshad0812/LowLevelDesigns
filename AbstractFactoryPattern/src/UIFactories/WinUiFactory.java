package UIFactories;

import Functionalities.SysButton;
import Functionalities.SysCheckBox;
import Windows.WinButton;
import Windows.WinCheckBox;

public class WinUiFactory implements UIFactory{

    @Override
    public SysButton CreateButton() {
        return new WinButton();
    }

    @Override
    public SysCheckBox CreateChckBox() {
        return new WinCheckBox();
    }
}
