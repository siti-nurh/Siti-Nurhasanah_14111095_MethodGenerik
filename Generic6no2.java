/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generic6no2;

/**
 *
 * @author siti
 */
public class Generic6no2 {
    String mahasiswa;
    
    public String getMahasiswa(){
        return mahasiswa;
    }
    public void setMahasiswa(String mhs){
     this.mahasiswa= mhs;   
    
    }
 
    private static <T> void newMahasiswa (T free) {
        System.out.println(free);
    }    
    public static void main (String[] Args){
        Generic6no2 nw = new Generic6no2();
        
        nw.setMahasiswa("Siti Nurhasanah");
        System.out.println(nw.getMahasiswa());
        newMahasiswa("Teknik Informatika S1");
        
    }
}

   
