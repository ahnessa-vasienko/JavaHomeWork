package hw7;

public abstract class Tie extends Clothes {
    public Tie(Size M, int i, String black){

    }
    interface ManClothes {

        static void dressMan(Clothes[] clothes) {
            System.out.println("Мужская одежда:");
            for (Clothes clothe : clothes) {
                if (clothe instanceof Pants || clothe instanceof Tshirt || clothe instanceof Tie) {
                    clothe.dressMan();
                }
            }
        }
    }
}
