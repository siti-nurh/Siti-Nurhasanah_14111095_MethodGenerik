/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generic6;

/**
 *
 * @author siti
 */
public class Generic6 {
    private T type;
    private N type1;
    
    public T getType(){
        return type;
    }
    public void setType(T type){
        this.type = type;
    }
    
    public N getType0(){
        return type1;
    }
    
    public void setType1(N type1){
        this.type1 = type1;
    }
    
    public static void main(String[] args){
    Generic6<Integer, String> a = new Generic6<>();
    a.setType(1);
    a.setType1("MTS Karangnunggal");
    
    System.out.println(a.getType());
    System.out.println(a.getType1());
    
} 
}