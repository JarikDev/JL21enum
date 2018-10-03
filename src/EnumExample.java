enum CoffeSizes {SMALL, MEDIUM, BIG};

public class EnumExample {
    enum CoffeSize {SMALL, MEDIUM, BIG}

    enum CoffeSizes {
        SMALL(100), MEDIUM(200), BIG(300){ String getCoffeClass(){
            return "B";
        }};
        String coffeClass ="A";
        int milliliters;
        CoffeSizes(int milliliters) {
            this.milliliters = milliliters;
        }
        int getMilliliters(){
            return milliliters;
        }
        String getCoffeClass(){
            return coffeClass;
        }

        }


    public static void main(String[] args) {
        CoffeSize coffeSize = CoffeSize.BIG;
        System.out.println(coffeSize);
        CoffeSizes coffeSizes=CoffeSizes.SMALL;
        System.out.println(coffeSizes.getMilliliters());
        System.out.println(coffeSizes.getCoffeClass());
    }
}
