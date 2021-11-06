package hw6;

    public abstract class Animal {
    private String  food;
    private String location;

    public Animal(String food,String location){
        this. food=food;
        this.location=location;

    }

    public String getFood(String food) {
        return  food;
    }

    public void setFood(String food) {
        this. food = food;
    }


    public String getLocation (String location) {
            return location;
        }

        public void setLocation(String location) {
            this. location = location;
        }


    public abstract String getFood();
    public abstract void location();

    @Override
    public String toString() {
        return "Animal{" +
                "рыба='" + food + '\'' +
                ", дом='" + location +
                '}';
    }

        public abstract void eat();

        public abstract void sleep();
    }
