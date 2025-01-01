package models;

public class WindowSystem implements SystemUI{

	@Override
	public Button CreateButton() {
		// TODO Auto-generated method stub
		return new OkButton();
	}

	@Override
	public Checkbox CreateCheckbox() {
		// TODO Auto-generated method stub
		return new OkCheckBox();
	}

}
