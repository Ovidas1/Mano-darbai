/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.vcs;

import java.util.Date;
import static lt.vcs.VcsUtils.*;
import static lt.vcs.Banknotas.*;
import lt.vcs.Person;

/**
 *
 * @author Ovidas
 */
public class Main {
    
    private static final String PIN = "test";
    
    private static String programName;
    private static Date creationDate;
    private static String creator;
    
    public Main(String name, String programer){
        this(name);
        this.creator = programer;
    }
    
    public Main(String name){
        super();      
        if (name == null || name.isEmpty()){
            out("programa turi tureti pavadinima");
            System.exit(-1);
        }
        this.programName = name;   
        this.creationDate = new Date();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           
//        paskaita3Kodas();
//        
//        paskaita3namudarbas();
                           
          paskaita4Kodas();
    } 
    
    private static void paskaita4Kodas(){
        Object o = new Object ();
        out ("Object: " + o);
        o = new Arklys();
        out ("Arklys: " + o);
        o = new Vienaragis();
        out ("Vienaragis: " + o);
                
        Creature c = new Arklys();
        
        Arklys ark = null;
        if (c instanceof Arklys){
            ark = (Arklys)c;
        }

        gyvenk (ark);
        out ("Arklys: " + c);
        c = new Vienaragis();
        out ("Vienaragis: " + c);
        
        Gyvunas g = new Arklys();
        gyvenk(g);
        out ("Arklys: " + g);
        g = new Vienaragis();
        gyvenk(g);
        out ("Vienaragis: " + g);
        gyvenk(new Arklys());
        
        if (o instanceof Object){
            out("o yra objektas");
        }
        if (o instanceof Creature){
            out("o yra creature");
        }
        if (o instanceof Gyvunas){
            out("o yra gyvunas");
        }
        if (o instanceof Vienaragis){
            out("o yra vienaragis");
        }
        
    }
    
    private static void gyvenk(Gyvunas g){
        g.gyvent();
    }
    

    private static void paskaita3Kodas(){
        out (programName);
        int likutis = 350;
        String pin = inStr ("Iveskite PIN koda");
        if (PIN.equals(pin)){
            //jei kodas teisingai bus vykdomas kodas
            out("Jusu saskaitoje " + likutis + " pinigu");
            out ("Galite pasirinkti tik viena banknota, kiek norite issigryninti");
            out ("Banknotu nominalai: ");
            for (Banknotas bnkn : Banknotas.values()){
                out(bnkn.getLabel());                
            }
            int isemam = inInt("Koki banknota norite issigryninti?");            
            if (isemam <=0 || isemam>likutis){
                out ("Neteisinga suma. Ate");
            }
            else {
                Banknotas bnkn = suraskBanknota(isemam);
                out ("Jums isgryninta " + bnkn.getLabel() + " pinigu");
                out ("Jusu saskaitos likutis: " + (likutis-bnkn.getSk()));
            }
                      
        }
        else {
            //jei kodas neteisingas
            out ("Kodas neteisingas.Ate");
        }
    }
    
    private static void paskaita3namudarbas(){
               String name = inStr("Iveskite varda");
        String surname = inStr("Iveskite pavarde");
        int age = inInt ("Iveskite amziu");
        int gen = inInt ("Pasirinkite lyti: 1-vyras, 2-moteris, 3-kita");
        Person asmuo = new Person(name, surname, age, Gender.getById(gen));
        out (asmuo); 
    }
    
    private static Banknotas suraskBanknota(int sk){
        Banknotas result = null;
        for (Banknotas bnkn : Banknotas.values()){
            if (bnkn.getSk() == sk){
            result = bnkn;
           break;
         
        }
    }
        return result;
    }
    
}
