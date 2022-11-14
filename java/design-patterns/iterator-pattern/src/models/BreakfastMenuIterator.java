package src.models;

import java.util.ArrayList;

// iterator interface can also be imported from java.util package
public class BreakfastMenuIterator implements Iterator {
    ArrayList<MenuItem> items;
    int position = 0;

    public BreakfastMenuIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Object next() {
        MenuItem menuItem = items.get(position);
        position++;
        return menuItem;
    }

    public boolean hasNext() {
        if (position >= items.size() || items.get(position) == null) {
            return false;
        }

        return true;
    }
}
