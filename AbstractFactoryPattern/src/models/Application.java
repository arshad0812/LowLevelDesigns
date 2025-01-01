package models;

public class Application {

	public Button button;
	public Checkbox checkbox;
	
	
	public Application(SystemUI systemui) {
		this.button=systemui.CreateButton();
		this.checkbox=systemui.CreateCheckbox();
	}
	
	public void OpenWindows(){
		button.click();
		checkbox.tick();
	}	
	
}
