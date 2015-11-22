package inner_classes;

/**
 * Created by chack on 11/22/2015.
 */

//.this i .new
public class Package3 {
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

    public static void main(String ... s){
        Package3 package3 = new Package3();
        //tworzymy obiekt klasy wewnetrznej

        Package3.Content c = package3.new Content();
        Package3.Destination d = package3.new Destination("Amazonia");
    }
}
