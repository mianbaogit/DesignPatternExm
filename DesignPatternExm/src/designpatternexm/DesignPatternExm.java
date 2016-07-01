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
public class DesignPatternExm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("*** Modified Observer Pattern Demo***\n");
        Subject sub = new Subject();
        Observer1 ob1 = new Observer1();
        Observer2 ob2 = new Observer2();
        sub.register(ob1);
        sub.register(ob2);
        sub.setMyValue(5);
        System.out.println();
        sub.setMyValue(25);
        System.out.println();
//unregister ob1 only
        sub.unregister(ob1);
//Now only ob2 will observe the change
        sub.setMyValue(100);
    }

}
