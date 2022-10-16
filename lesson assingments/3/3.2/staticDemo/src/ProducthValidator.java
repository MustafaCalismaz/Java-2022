public class ProducthValidator {

    static {
        System.out.println("Static yapici blok calisti");
    }
    static {
        System.out.println("Static yapici blok calisti");
    }
    static {
        System.out.println("Static yapici blok calisti");
    }
    static {
        System.out.println("Static yapici blok calisti");
    }
    public static boolean isValid(Product product){
        if (product.price > 0 && !product.name.isEmpty())
        {
            return true;
        }else {
            return false;
        }
    }

    public void bisey(){

    }

/*    public static class BaskaBirClass
    {
        public static void Sil(){

        }
    }
    //inner class*/
}
