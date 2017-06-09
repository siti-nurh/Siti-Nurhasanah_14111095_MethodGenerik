/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodgenerik;
    import static generic5.genApp5.printArray;
/**
 *
 * @author siti
 */
//method generik yang menerima parameter bertipe reference
public class maingenApp5 implements genApp5 {
    
    public static void main(String[] args){ 
        System.out.println("Ini dengan tipe data Integer");
        Double dArr[] = new Double[3];
        dArr[0] = 1.00;
        dArr[1] = 2.02;
        dArr[2] = 3.75;
        
        printArray(dArr);
}

   
}