package ru.avalon.vergentev.j110.labwork3b;

public class Linker {
    public Linker prev;
    public Linker next;
    public String data;


    //CONSTRUCTORS
    public Linker(String data) {
        this.data = data;
        next = null;
        prev = null;
    }

    //METHODS
    @Override
    public String toString() {
        return data;
    }
}
