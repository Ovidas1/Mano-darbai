package lt.vcs;

import static lt.vcs.VcsUtils.*;
/**
 * Zaidimo klase, reprezentuojanti viena zaidimo partija
 */
public class Game {

    /** pirmas zaidejas */
    private final Player p1;
    /** antras zaidejas */
    private final Player p2;

    private Player activePlayer;

    /**
     * zaidimo konstruktorius
     * @param p1 pirmas zaidejas
     * @param p2 antras zaidejas
     */
    public Game(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
        activePlayer = p1;
    }

    /**
     * startuoja zaidima/partija
     * @grazina player objekta - zaideja kuris laimejo partija
     */
    public Player start() {
        
        int p1Bet = inInt(activePlayer.getName()+ " Ivesk statoma suma");
        int p2Bet = inInt(nextActive().getName()+ " Ivesk statoma suma");
        activePlayer.setCash(activePlayer.getCash() - p1Bet);
        nextActive().setCash(nextActive().getCash() - p2Bet);
        if (p1Bet<p2Bet){
            out(activePlayer.getName()+ " prisininkas pakele statyma iki" + p2Bet);
            int choise = inInt("Ka darysite?: 1-islyginsite, 2-foldinsite");
            if (choise ==2){
                nextActive().setCash(nextActive().getCash() + p1Bet + p2Bet );
                return nextActive();
 
            }
        }
        int pot = p1Bet + p2Bet;
        activePlayer.setHand(new Hand(GameUtils.rollHand()));
        out(activePlayer.getName() + " Tavo ranka: " + GameUtils.intArrayToString(activePlayer.getHand().getHandArray()));
        nextActive().setHand(new Hand(GameUtils.rollHand()));
        out(nextActive().getName() + " Tavo ranka: " + GameUtils.intArrayToString(nextActive().getHand().getHandArray()));
        
        Player laimetojas = GameUtils.kasLaimejo(p1, p2);
        out("Laimejo: " +laimetojas.getName() + ", sveikinam!");
        int totalPot = getTotalPot(pot, laimetojas.getHand().getCombination());
        out ("Laimejimo suma: " + totalPot);
        laimetojas.setCash(laimetojas.getCash() +totalPot);
        return laimetojas;
    }
    
    private int getTotalPot(int pot, Combination combo){
        return pot+ combo.getBonus();
    }
    
    private Player nextActive(){
        return Main.getNextActivePlayer(this);
    }

    public Player getP1() {
        return p1;
    }

    public Player getP2() {
        return p2;
    }

    public Player getActivePlayer() {
        return activePlayer;
    }

    public void setActivePlayer(Player activePlayer) {
        this.activePlayer = activePlayer;
    }
}
