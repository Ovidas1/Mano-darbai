/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.vcs;

/**
 *
 * @author Ovidas
 */
  
public enum Banknotas {
    
    PENKI (5, "penki"),
    DESIMT (10, "desimt"),
    DVIM (20, "dvim"),
    PEM (50, ("pem")),
    SIMTAS (100, "simtas");
    
    private int sk;
    private String label;
    
    private Banknotas(int sk, String label){
        this.sk = sk;
        this.label=label;
    }

    public int getSk() {
        return sk;
    }

    public String getLabel() {
        return label;
    }

  
}
