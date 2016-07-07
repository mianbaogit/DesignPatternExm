/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpatternmodifiledv2;

/**
 *
 * @author X1 carbon
 */
public interface ISubject {
    void register(IObserver o);
    void unregister(IObserver o);
    void notifyObservers(int i);
}
