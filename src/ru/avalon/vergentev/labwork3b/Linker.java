package ru.avalon.vergentev.labwork3b;

public class Linker {
    Linker next;
    Linker previous;
    String data;

    public Linker(String data) {
        this.data = data;
    }
}
