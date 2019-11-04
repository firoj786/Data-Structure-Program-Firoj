package com.nt.stack;
public class App {
public static void main(String[] args) {
          Stack st=new Stack(10);
          st.push(20);
          st.push(40);
          st.push(60);
          st.push(80);
         
          
          while(!st.isEmpty()) {
        	  long value=st.pop();
          System.out.println(value);
}
	}
}
