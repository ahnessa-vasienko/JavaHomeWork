package hw6;
public abstract class Animal {

    public int length;
    private String food;
    private String location;
    private String name;
    private boolean makeNose;
    private boolean slepp;
    private boolean Eat;


    public Animal(String food, String location) {
        this.food = food;
        this.location = location;


    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public void makeNose() {

    }

    public void Eat() {
    }

    public void sllep() {}



    }



