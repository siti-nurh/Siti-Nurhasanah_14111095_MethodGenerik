/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericmethod;

/**
 *
 * @author siti
 */
public class Generic <T> {
    private T type;
    public T getType() {
        return type;  
    }
    
    public void setType(T type) {
        this.type=type;
    }
    private static <N, T> void anythingYouWanted (N freeParType, T belajar) {
        System.out.println(freeParType) ;
        System.out.println(belajar);
    }
    
        public static void main(String[] args) {
            anythingYouWanted(1,"belajar");
            
        }
    }
    

