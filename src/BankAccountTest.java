import javax.swing.*;
import  java.lang.Double;

public class BankAccountTest {
    public static  void  main(String [] args)
    {

        String accountNumber = JOptionPane.showInputDialog("What is Account Number?");
        String name = JOptionPane.showInputDialog("Your  Name?");
        String function  = JOptionPane.showInputDialog("Press 'W' for Withdraw or 'D' for Deposite balance");
        String amount ;
        double final_amount;
        String details;

        BankAccount accountDetails = new BankAccount(accountNumber, name, 300);


        if(function.equals('W'))
        {
            amount = JOptionPane.showInputDialog("How much amount?");

            final_amount = Double.parseDouble(amount);
            accountDetails.withdrawAmount(final_amount);
        }
        else
        {
            amount = JOptionPane.showInputDialog("How much amount?");

            final_amount = Double.parseDouble(amount);
            accountDetails.depositeAmount(final_amount);
        }
        details = accountDetails.getAccountInfo();
        JOptionPane.showMessageDialog(null, details);


    }

}
