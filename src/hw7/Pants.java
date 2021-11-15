package hw7;

public abstract class Pants extends Clothes {
    public Pants(Size S, int i, String blue){

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
