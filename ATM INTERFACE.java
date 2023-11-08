


import javax.swing.*;

class ATM
{
    int Balance;
    int Pin = 2804;

    public  void CheakPin()
   {
       int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your Pin"));
        System.out.println("Pin is :"+n);
        if (n == Pin)
        {
            menu();
            }
        else 
      {
            System.out.println(" Please Enter valid Pin");
             
        }
    }
  public void menu(){
    System.out.println("Enter your choice :");
    System.out.println("1. Cheak Account Balance");
    System.out.println("2. Deposite Amount");
    System.out.println("3. Withdraw Amount");
    System.out.println("4.Exit");

   int opt = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your choise"));

    if (opt == 1)
  {
        cheakbalance();
    }
    else if (opt == 2) 
  {
       Deposite(); 
    }
    else if (opt == 3) 
  {
        Withdraw();
    }
    else if (opt == 4) 
  {
        return;
        }
    else
  {
        System.out.println("Enter a valid choice:");
    }

  }

  public void cheakbalance(){
    System.out.println("Balance: "+Balance);
    menu();
    }
  
    public void Withdraw(){
    
    int Amount = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Amount to Withdraw:"));
     System.out.println(" Amount to Withdraw: "+Amount);
    if(Amount>Balance){
        System.out.println("Insuffient Balance");
    }
    else{
        Balance = Balance - Amount;
        System.out.println("Money Withdraw Successful");
    }
    menu();
    }
    
    public void Deposite()
 {
    int Money = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Amout to Deposite:"));
    Balance = Balance + Money;
    System.out.println("Money Deposite: "+Money);
    System.out.println("Money Deposited Successful");
    menu();
  }

    public static void main (String args[]) 
    {

        ATM obj = new ATM();
        obj.CheakPin();
    }
}