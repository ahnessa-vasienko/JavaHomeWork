package hw7;

    class Pants extends Clothes implements ManClothes, WomenClothes {
    public Pants( Atelier.Size m, float price, String color) {
        super(Atelier.Size.M, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("мужчина одевает штаны " + getInfo());
    }

    @Override
    public void dressWomen() {
        System.out.println("женщина одевает штаны " + getInfo());
    }
}

