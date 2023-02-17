/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crapssimulator;
import java.util.*;

/**
 *
 * @author Walter Beardman wabdgz
 */

    

public class Stats{
    
    
    public HashMap<String,Integer> record = new HashMap<>();
    
    public HashMap<Integer,Integer> freq = new HashMap<>();
    
    
    public Stats(){
        this.record.put("Wins",0);
        this.record.put("Losses",0);
        this.freq.put(2,0);
        this.freq.put(3,0);
        this.freq.put(4,0);
        this.freq.put(5,0);
        this.freq.put(6,0);
        this.freq.put(7,0);
        this.freq.put(8,0);
        this.freq.put(9,0);
        this.freq.put(10,0);
        this.freq.put(11,0);
        this.freq.put(12,0);
        
    }
    public void setRecord(String key){
        Integer count = record.get(key);
        
        if (count == null){
            record.put(key, 1);
            
        }
        else{
            record.put(key, count+1);
        }
        
        
    }
    
    public void setFreq(int roll){
        freq.put(roll, +1);
        
    }
    
    public void Show(){
        
        System.out.println("--------------------");
        System.out.println("Stats");
        System.out.println("--------------------");
        System.out.println("Wins and Losses:");
        for(String key : record.keySet()){
            
            System.out.println(key + ":" + record.get(key));
        }
        
        System.out.println("--------------------");
        System.out.println("Frequency of Numbers rolled.");
        for(int key : freq.keySet()){
            
            System.out.println(key + ":" + freq.get(key));
        }
        System.out.println("--------------------");
    }
    
}
