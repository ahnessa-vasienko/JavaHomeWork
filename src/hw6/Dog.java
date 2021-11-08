package hw6;

import java.util.Objects;

public class Dog extends Animal{
    private String name;
    public String colore;
    public Dog(String food,String location,String name,String colore){
        super(food, location);
        this.name=name;
        this.colore="Серый";
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

        @Override
        public void makeNose (){
            System.out.println(getName() + "Говорит Гав");
        }
        @Override
        public void Eat () {
            System.out.println(getName() + "Ест мясо");
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name) && Objects.equals(colore, dog.colore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, colore);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", colore='" + colore + '\'' +
                '}';
    }
}
