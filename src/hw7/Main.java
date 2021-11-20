package hw7;


import com.sun.glass.ui.Size;

public class Main {
    public static void main(String[] args) {
        Clothes[] clothes = new Clothes[]{
                new Tshirt(Atelier.Size.S, 58.75f, "желтый"),
                new Pants(Atelier.Size.M, 105.50f, "черный"),
                new Skirt(Atelier.Size.M, 78.45f, "зеленый"),
                new Tie(Atelier.Size.XXS, 15.20f, "красный")
        };

        dressMan(clothes);

        System.out.println();

        dressWomen(clothes);
    }

    private static void dressMan(Clothes[] clothes) {
        for (Clothes c : clothes) {
            if (c instanceof ManClothes) {
                ((ManClothes) c).dressMan();
            }
        }
    }

    private static void dressWomen(Clothes[] clothes) {
        for (Clothes c : clothes) {
            if (c instanceof WomenClothes) {
                ((WomenClothes) c).dressWomen();
            }
        }
    }
}