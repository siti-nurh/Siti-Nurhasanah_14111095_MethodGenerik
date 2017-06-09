
package gentanpaparameter;

/**
 *
 * @author siti
 */
public class GentanpaParameter <T> {

   private T type;
    public T getType() {
        return type;  
    }
    
    public void setType(T type) {
        this.type=type;
    }
    private static <N> void anythingYouWanted (N freeParType) {
        System.out.println(freeParType) ;
    }
    
    private static <Y> void belajar() {
        System.out.println();
    }
    
    
        public static void main(String[] args) {
            anythingYouWanted(1);
            
        }
    }
    