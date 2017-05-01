package lt.vcs;

import static lt.vcs.VcsUtils.*;

/**
 *
 * @author Cukrus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        out("Kauliuku pokeris");
        String p1name = inStr("Zaidejas 1, iveskite savo varda");
        String p2name = inStr("Zaidejas 2, iveskite savo varda");
        
        Player p1 = new Player(p1name);
        Player p2 = new Player(p2name);
        boolean zaisti = true;
        
        while (zaisti) {
            Game newGame = new Game(p1, p2);
            Player nugaletojas = newGame.start();
            Player praleimetojas = getPralaimetojas(newGame, nugaletojas);
            out(nugaletojas.getName()+ " jusu likutis: " + nugaletojas.getCash());
            out(praleimetojas.getName()+ " jusu likutis: " + praleimetojas.getCash());
            int choise = inInt("Ka norite daryti toliau? 0-zaisti dar, 1- baigti zaidima");
            if(choise ==1){
                break;
            }
        }
    }
    
    private static Player getPralaimetojas (Game game, Player winner){
        if (winner.equals(game.getP1())){
            return game.getP2();
        }
        else {
            return game.getP1();
        }
    
    }
        public static Player getNextActivePlayer (Game game){
        if (game.getActivePlayer().equals(game.getP1())){
            return game.getP2();
        }
        else {
            return game.getP1();
        }
 
    }

    
    private static int rollDice() {
        return random(1, 6);
    }
    
    /**
     * perridena norimus kauliukus ir perskaiciuoja kombinacija ir kitus skaicius
     * @param dices kauliuku skaiciai, atskirti kableliu, kuriuos norim perridenti
     */
    public static void reRollDice(int[] hand, String dices) {
        dices = dices.replaceAll(" ", "");
        for (String dice : dices.split(",")) {
            Integer nr = new Integer(dice);
            hand[nr - 1] = rollDice();
        }
    }
    
}
