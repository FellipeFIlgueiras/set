package br.com.filgueiras.set;

import java.util.LinkedList;

public class Set<T> {
    
    private LinkedList<T> elements;

    public Set() {
        this.elements = new LinkedList<>();
    }

    public boolean add(T element) {
        if(!contains(element) && element != null) {
            this.elements.add(element);
            return true;
        }
        return false;
    }

    public boolean addAt(T element, int position) {
        if(!contains(element) && element != null) {
            this.elements.add(position, element);
            return true;
        }
        return false;
    }

    public T getElement(int index) {
        return this.elements.get(index);
    }

    public int size()  {
        return this.elements.size();
    }

    public boolean contains(T element) {
        for(int i = 0; i < this.elements.size(); i++) {
            T t = this.elements.get(i);
            if(t.hashCode() == element.hashCode()) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(T element) {
        return this.elements.indexOf(element);
    }

    public void remover(T element) {
        this.elements.remove(element);
    }

}
