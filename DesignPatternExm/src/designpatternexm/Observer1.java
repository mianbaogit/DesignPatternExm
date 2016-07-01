/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternexm;

/**
 *
 * @author cyangmin
 */
public class Observer1 implements IObserver{

    @Override
    public void update(int i) {
        System.out.println("Observer1: myValue in Subject is now: "+i);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
