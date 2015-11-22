package inner_classes;

/**
 * Created by chack on 11/22/2015.
 */
public class Package1 {
    class Content{
        private int i = 11;
        public int value(){
            return i;
        }
    }

    class Destination{
        private String label;
        Destination(String whereTo){
            label = whereTo;
        }
        String readLabel(){
            return label;
        }
    }

    public void ship(String dest){
        Content c = new Content();
        Destination d = new Destination(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String... args){
        Package1 p = new Package1();
        p.ship("Tasmania");
    }


}
