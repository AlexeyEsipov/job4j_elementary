package ru.job4j.ex;

public class ElementNotFoundException extends Exception{
    
    public ElementNotFoundException(String keyNotFound) {
        super(keyNotFound);
    }
}
