/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpatternmodifiledv2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author X1 carbon
 */
public class Subject implements ISubject {

    private final List<IObserver> observerList = new ArrayList<>();
    private int myValue;

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
        //Notify observers
        notifyObservers(myValue);
    }

    @Override
    public void register(IObserver o) {
        this.observerList.add(o);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void unregister(IObserver o) {
        this.observerList.remove(o);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void notifyObservers(int i) {
        for (IObserver o : this.observerList) {
            o.update(this.getClass().getSimpleName(),i);
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
