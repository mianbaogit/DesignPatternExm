/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

/**
 *
 * @author X1 carbon
 */
public interface ISubject {
    void register(Observer o);
    void unregister(Observer o);
    void notifyObservers();
}
