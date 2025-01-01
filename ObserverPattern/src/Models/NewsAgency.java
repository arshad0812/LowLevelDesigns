package Models;

import Models.Observer;
import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject{
		
	private String LatestNews;
	private ArrayList<Observer> subscribers;
	
	public NewsAgency(){
		this.subscribers=new ArrayList<>();
	}
	
	@Override
	public void addObserver(Observer subcriber) {
		subscribers.add(subcriber);
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeObserver(Observer subscriber) {
		// TODO Auto-generated method stub
		subscribers.remove(subscriber);
		
	}

	@Override
	public void notifyObserver() {
		
		for(Observer i:subscribers) {
			i.UpdateLatestNews(LatestNews);
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setLatestNews(String news) {
		LatestNews=news;
		// TODO Auto-generated method stub
		
	}
	

}
