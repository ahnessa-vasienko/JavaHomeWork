package hw7;

    class Skirt extends Clothes implements WomenClothes {
    public Skirt( Atelier.Size M, float price, String color) {
        super(Atelier.Size.M, price, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("женщина одевает юбку " + getInfo());
    }
}
