package UIFactories;

import Functionalities.SysButton;
import Functionalities.SysCheckBox;

public interface UIFactory {
    public SysButton CreateButton();
    public SysCheckBox CreateChckBox();
}
