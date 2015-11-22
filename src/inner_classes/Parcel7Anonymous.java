package inner_classes;

/**
 * Created by chack on 11/22/2015.
 */
public class Parcel7Anonymous {

    public Content content(){
        return new Content() {
          public int value(){
              return i;
          }
          private int i = 11;
        };
    }

    public static void main(String ... a){
        Parcel7Anonymous p = new Parcel7Anonymous();
        Content c = p.content();
    }
}
