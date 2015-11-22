package inner_classes.factory_method;

/**
 * Created by chack on 11/22/2015.
 */

class Checkers implements Game{
    private Checkers() {}
    private int moves = 0;
    private static final int MOVES = 3;

    @Override
    public boolean move() {

        System.out.print("Checkers: move: "+moves);
        ++moves;
        return moves !=MOVES;

    }

    public static GameFactory factory = new GameFactory() {
        public Game getGame(){
            return new Checkers();
        }
    };
}


class Chess implements Game{
    private Chess(){}
    private int moves =0;
    private static final int MOVES = 4;

    @Override
    public boolean move(){
        System.out.println("Chess: move: "+moves);
        ++moves;
        return moves!=MOVES;
    }

    public static GameFactory factory = new GameFactory() {
        @Override
        public Game getGame() {
            return new Chess();
        }
    };
}

public class Games {
    public static void playGame(GameFactory factory){
        Game s = factory.getGame();
        while(s.move()){}
    }

    public static void main(String ... args){
        playGame(Checkers.factory);
        playGame(Chess.factory);
    }
}
