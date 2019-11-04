package com.nt.Array;

import java.util.Set;
import java.util.HashSet;
public class DuplicateArray{
    public static void main(String[] args) {
        int arr[]={2,4,1,5,7,4,2,3,6,1,7};
        Set<Integer> s=new HashSet<>();
        for (int no : arr) {
            if(s.add(no)==false){
            System.out.println(no+" ");
                    
                }
                
        }
        }
            
    }
    
