package hw7;

    class Tie extends Clothes implements ManClothes {
    public Tie( Atelier.Size xxs, float price, String color) {
        super(Atelier.Size.XXS, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("мужчина одевает галстук " + getInfo());
    }
}