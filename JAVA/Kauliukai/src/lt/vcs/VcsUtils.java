package lt.vcs;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;



/**
 *
 * @author Cukrus
 */
public class VcsUtils {
    
    public static void out(Object txt) {
        System.out.println(timeNow() + " " + txt);
    }
    
    public static String inStr(String txt) {
        out(txt);
        return inStr();
    }
    
    public static String inStr() {
        return newScan().next();
    }
    
    public static int inInt(String txt) {
        out(txt);
        return inInt();
    }
    
    public static String inLine(String txt) {
        out(txt);
        return inLine();
    }
    
    public static String inLine() {
        return newScan().nextLine();
    }
    
    public static int inInt() {
        return newScan().nextInt();
    }
    
    private static Scanner newScan() {
        return new Scanner(System.in);
    }
    
    private static String timeNow() {
        SimpleDateFormat sdf = new SimpleDateFormat("'['HH:mm:ss.SSS']'");
        return sdf.format(new Date());
    }
    
    public static int random(int from, int to) {
        return ThreadLocalRandom.current().nextInt(from, to + 1);
    }
    
}
