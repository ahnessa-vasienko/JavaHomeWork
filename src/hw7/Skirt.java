package hw7;

public abstract class Skirt extends Clothes {
    public Skirt(Size xs, int i, String yelow) {

    }

    interface WomenClothes {
        static void dressWomen(Clothes[] clothes) {
            System.out.println("Женская одежда:");
            for (Clothes clothe : clothes) {
                if (clothe instanceof Skirt) {
                    clothe.dressWomen();
                }
            }
        }
    }
}


