package src.models.subjects;

import src.models.observers.Observer;

public interface Subject {
    public void addObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}
