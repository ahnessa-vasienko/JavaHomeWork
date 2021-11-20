package hw7;

    class Tshirt extends Clothes implements ManClothes, WomenClothes {
    public Tshirt(Atelier.Size s, float price, String color) {
        super(Atelier.Size.S, price, color);
    }


        @Override
    public void dressMan() {
        System.out.println("мужчина одевает футболку " + getInfo());
    }

    @Override
    public void dressWomen() {
        System.out.println("женщина одевает футболку " + getInfo());
    }
}