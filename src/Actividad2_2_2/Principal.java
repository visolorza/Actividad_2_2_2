package Actividad2_2_2;

import java.util.Date;

/**
 *
 * @author Bichoms
 */
public class Principal {
    public static void main(String[] args) {
        
        Date fecha = new Date();
        
        Instagram insta = new Instagram(100, "la mejor clase", true, "Bichoms", "12345");
        Twitter twitt = new Twitter(110, "murió el Choche", fecha, "Bichoms", "12345");
        
        System.out.println(insta.toString());
        System.out.println(twitt.toString());
    }
}
