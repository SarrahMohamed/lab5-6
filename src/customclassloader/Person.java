/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customclassloader;

/**
 *
 * @author sara
 */
public class Person   {
    public static int s=3;
    public int d=1;
   public Person()
    {
        s++;
    }
   public void print()
   {
       System.out.println(s);
   }
    
}
