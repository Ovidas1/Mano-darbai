package lt.vcs;

import static lt.vcs.VcsUtils.*;
/**
 *
 * @author Ovidas
 */
public abstract class Gyvunas implements Creature {

    public abstract void gyvent();
    
    public void gyventKaipGyvunui(){
        out ("Gyvenu kaip gyvunas");
    }
    
    @Override
    public String toString(){
        return this.getClass().getName() + " " + getWorld();
    }
    
}
