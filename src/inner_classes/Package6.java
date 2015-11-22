package inner_classes;

/**
 * zagniezdzanie w obrebie dowolnego zasiegu
 */
public class Package6 {

    private void internalTracking(boolean b){
        if(b){
            class TrackingSlip{
                private String id;
                TrackingSlip(String s){
                    id = s;

                }
                String getSlip(){
                    return id;
                }
            }
            TrackingSlip ts = new TrackingSlip("slip");
            String s = ts.getSlip();
        }
    }


    public static void main(String ...a){
        Package6 p = new Package6();
        p.internalTracking(true);
    }
}