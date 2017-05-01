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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class VcsUtils {
    
    private Main pvz = new Main("kj");

    
    public static void out(Object txt){
        System.out.println(timeNow() + " " + txt);
    }
    
    public static String inStr(String txt){
        out(txt);
        return inStr();
   
    }
   
    
    public static String inStr(){
        return newScan().next();
    }
    
    public static int inInt(String txt){
        out(txt);
        return inInt();
           }
    
    public static int inInt(){
        return newScan().nextInt();
    }
        public static String inLine(){
        return newScan().nextLine();
    }
            public static String inLine(String txt){
        out(txt);
        return inLine();
           }
    
    private static Scanner newScan(){
        return new Scanner (System.in);
    }
        private static String timeNow (){
    SimpleDateFormat sdf = new SimpleDateFormat("'yyyy-MM-dd' (HH:mm:ss:SS)");
    return sdf.format(new Date());
        }
        
    public static int random (int from, int to){
       return ThreadLocalRandom.current().nextInt(from, to + 1);
             }   
}
