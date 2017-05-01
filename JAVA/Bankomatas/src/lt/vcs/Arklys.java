package lt.vcs;

import static lt.vcs.VcsUtils.*;

/**
 *
 * @author Ovidas
 */
public class Arklys extends Gyvunas {
    
    public void gyvent(){
        out("Arklys gyvena");
        gyventKaipGyvunui();
    }

    @Override
    public String getWorld() {
        return "land";
    }
    
}
