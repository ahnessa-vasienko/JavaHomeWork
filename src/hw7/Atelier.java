package hw7;

public class Atelier {
    public static void main(String[] args) {
        Tshirt tshirt = new Tshirt(Clothes.Size.XS, 100, "red") {
            @Override
            protected void dressMan() {

            }

            @Override
            protected void dressWomen() {

            }

            @Override
            public String getSize() {
                return null;
            }

            @Override
            public String getPrice() {
                return null;
            }
        };
        Pants pants = new Pants(Clothes.Size.S, 200, "blue") {
            @Override
            protected void dressMan() {

            }

            @Override
            protected void dressWomen() {

            }

            @Override
            public String getSize() {
                return null;
            }

            @Override
            public String getPrice() {
                return null;
            }
        };
        Tie tie = new Tie(Clothes.Size.M, 150, "black") {
            @Override
            protected void dressMan() {

            }

            @Override
            protected void dressWomen() {

            }

            @Override
            public String getSize() {
                return null;
            }

            @Override
            public String getPrice() {
                return null;
            }
        };
        Skirt skirt = new Skirt(Clothes.Size.XS, 200, "yelow") {


            @Override
            protected void dressMan() {

            }

            @Override
            protected void dressWomen() {

            }

            @Override
            public String getSize() {
                return null;
            }

            @Override
            public String getPrice() {
                return null;
            }
        };

         Clothes[] clothes = {new tshirt, new pants, new skirt, new tie};
        public static void dressMan (Clothes);
                System.out.println("Мужская одежда");
        for (Clothes clothe : clothes) {
            if (clothe instanceof Tshirt) {
                System.out.println("Футболка, размера - " + tshirt.getSize() + "цвет -" + tshirt.getColor() + "цена-" + tshirt.getPrice());
            }
        }
    }


    }






