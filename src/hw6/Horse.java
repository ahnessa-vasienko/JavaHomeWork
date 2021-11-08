package hw6;

import java.util.Objects;

public class Horse extends Animal{
    private String name;
    public String colore;
    public Horse(String food,String location,String name, String colore){
        super(food, location);
        this.name=name;
        this.colore = "Черный";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void makeNose() {
        System.out.println(getName() + "Говорит Иго го");
    }


    @Override
    public void Eat() {
        System.out.println(getName() + "Ест морковь");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return Objects.equals(name, horse.name) && Objects.equals(colore, horse.colore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, colore);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                ", colore='" + colore + '\'' +
                '}';
    }
}

