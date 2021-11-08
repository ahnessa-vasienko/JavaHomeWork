package hw6;

import java.lang.reflect.Constructor;

public class Veterinarian {
    private String name;


    public Veterinarian(String name) {
        this.name = name;
    }
    public Veterinarian() {

    }


    public void setName(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    void treatment(Animal animal) {

        System.out.print(animal+"Вылечен");

    }

    public String toString() {
        return "Cat [name"+name+"]";

    }

    }

