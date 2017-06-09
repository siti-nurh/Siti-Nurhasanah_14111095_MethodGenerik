/
package genapp;

/**
 *
 * @author siti
 */
public class GenApp {

   private static <T> void printArray(T[] a) 
   {
       for (Object o : a) {
           System.out.println(o);
       }
       
   }
    public static void main(String[] args) {
        Integer iArr[]=new Integer[3];
        iArr[0]=10;
        iArr[1]=20;
        iArr[2]=30;
        printArray(iArr);
        
        String sArray[]=new String[3];
        sArray[0]="sepuluh";
        sArray[1]="dua puluh";
        sArray[2]="tiga puluh";
        printArray(sArray);
        
        Character cAr[]=new Character[3];
        cAr[0]='%';
        cAr[1]='^';
        cAr[2]='*';
        printArray(cAr);
        
        Double dAr[]=new Double[3];
        dAr[0]=1.00;
        dAr[1]=2.05;
        dAr[2]=3.00;
        printArray(dAr);
        
        
    }
    
}
