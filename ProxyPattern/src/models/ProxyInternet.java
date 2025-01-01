package models;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{
	
	private Internet internet;
	private List<String> BannedSites;
	
	public ProxyInternet() {
		this.internet=new Google();
		this.BannedSites=new ArrayList<>();
		BannedSites.add("tamilrockers");
	}

	@Override
	public void search(String SearchQuery) {
		if(BannedSites.contains(SearchQuery)) {
			System.out.println("Error Site cant be reached");
			return;
		}
		internet.search(SearchQuery);
		
		// TODO Auto-generated method stub
		
	}

}
