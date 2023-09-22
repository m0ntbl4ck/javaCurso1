
package com.example;

/**
 *
 * @author mont_
 */
public final class PatronSingelton {
    
   private static final String[] ips = new String[5];
    
    static{
        ips[0]="127.168.0.1";
        ips[1]="127.168.0.2";
        ips[2]="127.168.0.3";
        ips[3]="127.168.0.4";
        ips[4]="127.168.0.5";
    }

    public static String[] getIps() {
       
       return ips;
    }
    
    
    private static final PatronSingelton instance = new PatronSingelton();

    private PatronSingelton() {
    }

    public static PatronSingelton getInstance() {
        return instance;
    }
    
    
}
