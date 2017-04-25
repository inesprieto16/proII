/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.pkg3;
import java.util.LinkedList;
/**
 *
 * @author inesprieto16
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Integer> l;
        l=multiplos(10,3);
        for(Integer j:l){
            System.out.println(j);
        }
    }
    public static LinkedList<Integer> multiplos(int n,int m){
        LinkedList<Integer> l=new LinkedList<>();
        for(int i=0;i<n;i++){
            l.add(m*(1+i));
        }
        return l;
    }
    
}
