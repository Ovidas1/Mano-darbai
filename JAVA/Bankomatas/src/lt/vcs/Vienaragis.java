/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.vcs;

import static lt.vcs.VcsUtils.*;

/**
 *
 * @author Ovidas
 */
public class Vienaragis extends Gyvunas{

    @Override
    public void gyvent() {
       out("Vienaragis gyvena");
       gyventKaipGyvunui();
    }

    @Override
    public String getWorld() {
        return "land";
    }
    
}
