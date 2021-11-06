package hw6;

    abstract class Cat extends Animal{
    private String name;
    public Cat(String food,String location,String name){
        super(food,location);
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getFood(){
        return "Рыба";
    }
    @Override
    public void eat(){
        System.out.println("Ест");

    }
    @Override
    public void sleep(){
        System.out.println("Спит");

    }
}