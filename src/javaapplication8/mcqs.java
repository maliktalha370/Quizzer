/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.io.Serializable;

/**
 *
 * @author Talha Zubair
 */
public class mcqs implements Serializable {
  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    public String quo;
    public String opt1;
    public String opt2;
    public String opt3;
    public String opt4;
    
    public String ans;
    
    mcqs(String q,String a,String b,String c,String d,String e)
    {
        quo=q;
        opt1=a;
        opt2=b;
        opt3=c;
        opt4=d;        
        ans=e;
        
    }
   
    
}
