package models;

abstract public class Handler {
	public Handler handler;
	
	public Database db=new Database();
	
	public void setHandler(Handler handler) {
		this.handler=handler;
	}
	
	public abstract boolean handle(Request request);
	
	
	
}
