package hw6;

import java.util.Objects;

public class Cat extends Animal{
    private String name;
    public String colore;


    public Cat(String food, String location, String name, String colore){
        super(food,location);
        this.name=name;
        this.colore = "Черный";

    }
    public String getName() {
        return name;
    }


    @Override
    public void makeNose (){
        super.makeNose();
        System.out.println(getName() + "Говорит Мяу");
    }
    @Override
    public void Eat () {
        super.Eat();
        System.out.println(getName() + "Ест рыбу");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name) && Objects.equals(colore, cat.colore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, colore);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", colore='" + colore + '\'' +
                '}';
    }
}



