package scjp;

public class Hotel2 {
    private int roomNr;

    public Hotel2(int roomNr) {
        this.roomNr = roomNr;
    }

    public int getRoomNr() {
        return this.roomNr;
    }

    static Hotel2 doStuff(Hotel2 hotel) {
        hotel = new Hotel2(1);
        return hotel;
    }

    public static void main(String args[]) {
        Hotel2 h1 = new Hotel2(100);
        System.out.print(h1.getRoomNr() + " ");
        Hotel2 h2 = doStuff(h1);
        System.out.print(h1.getRoomNr() + " ");
        System.out.print(h2.getRoomNr() + " ");
        h1 = doStuff(h2);
        System.out.print(h1.getRoomNr() + " ");
        System.out.print(h2.getRoomNr() + " ");
    }



}