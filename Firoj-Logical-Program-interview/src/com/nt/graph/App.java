package com.nt.graph;
import java.util.Arrays;
public class App{
   public static void main(String[] args) {
       Graph g=new Graph(5);
       g.addEdge(0,1);
       g.addEdge(0,2);
       g.addEdge(0,3);
       g.addEdge(1,2);
       g.addEdge(1,4);
       g.addEdge(2,3);
       g.addEdge(3,1);
       g.addEdge(4,0);
       g.addEdge(4,3);
       Object[] value=g.adj(0);
       for(Object val:value){
           System.out.print(val+" ");
       }
   
   }
}