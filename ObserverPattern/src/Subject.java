public interface Subject {

    void addObserver(Observer observer);
    void removeObersver(Observer observer);
    void notifyObserver();
}
