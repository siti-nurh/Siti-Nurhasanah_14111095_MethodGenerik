/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelaskongkrit;

/**
 *
 * @author siti
 */
public class Kelaskongkrit {
    String nama;
    
    public String getNama(){
        return nama;
    }
    public void setNama(String nm){
     this.nama= nm;   
    
    }
 
    private static <T> void klkongkret (T free) {
        System.out.println(free);
    }    
    public static void main (String[] Args){
        Kelaskongkrit kl = new Kelaskongkrit();
        
        kl.setNama("Julaeha");
        System.out.println(kl.getNama());
        klkongkret("this kongkret");
        
    }
    
}

