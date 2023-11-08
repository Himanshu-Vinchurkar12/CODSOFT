import javax.swing.*;
class Result50
{
public static void main(String args[])
{
 String S = JOptionPane.showInputDialog(null,"Enter your name");
 int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your Mathematics marks"));
 int n1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your Physics marks"));
 int n2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your Chemistry marks"));
 int n3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your Biology marks"));
 int n4 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your English marks"));
 System.out.println("NAME is:"+S);
 System.out.println("Mathematics:"+n);
 System.out.println("Physics:"+n1);
 System.out.println("Chemistry:"+n2); 
 System.out.println("Biology:"+n3); 
 System.out.println("English:"+n4); 
 int Total=n+n1+n2+n3+n4;
 System.out.println("Total:"+Total);
 double P = (Total*100)/500;
 System.out.println("Percentage:"+P+"%");
 if(P>=90)
 {
 System.out.println("Excellent"+" "+"A+");
 }
  else if(P>=80)
 {
 System.out.println("Very good"+" "+"A");
 }
   else if(P>=75)
 {
 System.out.println("Good"+" "+"B+");
 }
   else if(P>=55)
 {
 System.out.println("Passable"+" "+"c");
 }
    else
 {
 System.out.println("Failure");
  }
 }  
}