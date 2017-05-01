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
public enum Gender {
        
    MALE (1, "male"),
    FEMALE (2, "female"),
    OTHER (3, "trans-gender or other circumstance");
    
    private int id;
    private String description;
    
    private Gender (int id, String description){
        this.id = id;
        this.description=description;
    }
    
    public static Gender getById(int id) {
        switch (id) {
            case 1:
            return MALE;
            case 2:
                return FEMALE;
            case 3:
                return OTHER;
            default:
                return null;
        }    
    }
    

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}
