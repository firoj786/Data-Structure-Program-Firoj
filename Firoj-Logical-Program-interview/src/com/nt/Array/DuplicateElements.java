package com.nt.Array;

class DuplicateElements {
    public static void countDuplicateElements(String str) {
        int count = 1;
        int max=0;
        char result=' ';
        char ch[]=str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                }
            }
            for (int k = i - 1; k >= 0; k--) {
                if (ch[i] == ch[k]) {
                    count = 1;
                    break;
                }
            }
            if (count > 1) {
                if(count>max){
                    max = count;
                    result = ch[i];
                }
               // System.out.println(ch[i] + " " + count + " Times");
                count = 1;
            }
        }
        System.out.println(result+" "+max);
    }
public static void main(String[] args) {
    	String str="aaaaaaaaaaaaaaaaabbssac";
    	countDuplicateElements(str);
    }
}