package inner_classes;

/**
 * Created by chack on 11/22/2015.
 */

//klasa zewnetrzna ma metode zwracajaca referenchje do klasy wew.
public class Package2 {
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

    public Destination to(String d){
        return new Destination(d);
    }

    public Content content(){
        return new Content();
    }

    public void ship(String dest){
        Content c = content();
        Destination d = to(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String... args){
        Package2 p = new Package2();
        p.ship("Tasmania");


        //definicja referencji inner class. Tak musimy też dobierać się do klasy wewnetrznej spoza tej klasy.
        Package2 p2 = new Package2();

        Package2.Content c = p2.content();
        Package2.Destination d = p2.to("Australia");
    }
}

