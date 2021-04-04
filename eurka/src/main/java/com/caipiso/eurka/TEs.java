package com.caipiso.eurka;

public class TEs {
    public static void main(String[] args) {
        String v="Vters";
        char[] chars = v.toCharArray();
        getString(chars,0,chars.length-1);
        System.out.println(chars);
    }

    public static  void  getString(char[] c,int i,int j){
        if(i!=j){
            char temp=c[i];
            c[i]=c[j];
            c[j]=temp;
            i++;j--;
            getString(c,i,j);
        }
    }
}
