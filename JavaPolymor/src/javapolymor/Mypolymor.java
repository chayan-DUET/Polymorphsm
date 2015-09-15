/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javapolymor;

/**
 *
 * @author Chayan_pc
 */
public class Mypolymor extends Override{
    void fun()
    {
        System.out.println("this is 1st method fun() with out value");
    }
   void fun(int x)
   {
      // x=5;
       System.out.println("this is 2nd method fun() with value"+x);
   
   }
    @java.lang.Override
  void print()
  {
      System.out.println("Inside Extend override");
  }
}
