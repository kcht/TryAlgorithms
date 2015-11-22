package inner_classes;

/**
 * lokalna klasa wewnetzna - klasa o zasiegu wyznaczonym przez metodę! (a nie przez klasE)
 */
public class Package5 {
    public Destination destination(String s){
        class PDestination implements  Destination{
            private String label ;
            private PDestination(String whereTo){
                label = whereTo;
            }
            public String readLabel(){
                return label;
            }
        }
        return new PDestination(s);
    }

     public static void main(String ...a){
        Package5 p = new Package5();
         Destination d = p.destination("Honolulu");
     }
}
