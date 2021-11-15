package hw7;


public abstract class Clothes {
    public Clothes() {
        super();
    }

    protected Size XXS, XS, S, M, L;

    private String color;
    private static final int price = 0;
    private String description;
    private String euroSize;

    public Size getXXS() {
        return XXS;
    }

    public Size getXS() {
        return XS;
    }

    public Size getS() {
        return S;
    }

    public Size getM() {
        return M;
    }

    public Size getL() {
        return L;
    }

    public String getColor() {
        return color;
    }


    public String getEuroSize() {
        return euroSize;
    }

    public Clothes(String color, int price) {
        this.color = color;

    }

    public Clothes(String description, String euroSize) {
        this.description = description;
        this.euroSize = euroSize;
    }

    protected abstract void dressMan();
    protected abstract void dressWomen();

    public void getSize() {

    }

    public void getPrice() {
    }

    public enum Size {

        XS("Взрослый размер"),
        S("Взрослый размер"),
        M("Взрослый"),
        L("Взрослый размер"),
        XXS("Детский размер");

        private String name;
        private int euroSize;

        Size(String name) {
            this.name = name;
        }

        public void getEuroSize(){
            switch (euroSize) {
                case 32:
            System.out.println("Размер XXS");
            break;
                case 34:
           System.out.println("Размер XS");
            break;
                case 36:
           System.out.println("Размер S");
            break;
               case 38:
                   System.out.println("Размер M");
                   break;
               case 40:
                   System.out.println("Размер L");
                   break;
              }
        }
    }
}