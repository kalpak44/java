/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ArrayLists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {
    public static void main(String[] args){
        
        //http://habrahabr.ru/post/128269/
        
        List<String> aList = new ArrayList<String>();
        aList.add("0");
        
        //http://habrahabr.ru/post/127864/
        List<String> linkedList = new LinkedList<String>();
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.add("4");
        
        linkedList.add(2, "other");
        
        System.out.println(linkedList.hashCode());
        
        for(int i=0;i<linkedList.size();i++){
            System.out.println(linkedList.get(i));
        }
    }
    
}
