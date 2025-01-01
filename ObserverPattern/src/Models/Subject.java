package Models;

public interface Subject {
	void addObserver(Observer subscriber);
	void removeObserver(Observer subscriber);
	void notifyObserver();
	void setLatestNews(String news);
}
