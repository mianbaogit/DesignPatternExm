/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpatternmodifiledv2;

/**
 *
 * @author cyangmin
 */
public class Observer2 implements IObserver{

    @Override
    public void update(String s, int i) {
        System.out.println("Observer2 is observing:myValue is changed in "+s+" to :"+i);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
