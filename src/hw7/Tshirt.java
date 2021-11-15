package hw7;



public abstract class Tshirt extends Clothes {

    public Tshirt(Size xs, int i, String red) {
    }

    interface ManClothes {
        static void dressMan(Clothes[] clothes) {
            System.out.println("Мужская одежда:");
            for (Clothes clothe : clothes) {
                if (clothe instanceof Pants || clothe instanceof Tshirt || clothe instanceof Pants) {
                    clothe.dressMan();
                }
            }
        }
    }
}
