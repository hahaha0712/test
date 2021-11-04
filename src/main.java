/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j07003;
import java.util.*;
import java.io.*;
/**
 *
 * @author Nguyen Thanh Son
 */
public class main {
    public static void main(String[] args)throws IOException, ClassNotFoundException{
        FileInputStream fis = new FileInputStream("DATA.in");
        DataInputStream dis = new DataInputStream(fis);
  
        int N = dis.readInt();
//        System.out.println(N);
        String line=String.valueOf(N);
        long sum=0;
        String st=String.valueOf(sum);
        while(line.length()>1){
            String s1=line.substring(0,line.length()/2);
            String s2=line.substring(line.length()/2,line.length());
            int a1=Integer.parseInt(s1);
            int a2=Integer.parseInt(s2);
            
            System.out.println(a1+a2);
            line=String.valueOf(a1+a2);
        }        
    }
}
