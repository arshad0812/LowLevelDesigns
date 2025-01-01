package Models;

public class subscriber implements Observer{
	private String name;

	
	public subscriber(String name)
	{
		this.name=name;
	}
		
	@Override
	public void UpdateLatestNews(String latestNews) {
		// TODO Auto-generated method stub
		System.out.println("Latest news "+ latestNews+" recieved");
		
	}

}
