package inputdialoguetest;

import javax.swing.*;

public class InputDialogueTest {

    public static void main(String[] args) {
        
        String num1,num2; 
        
        num1 = JOptionPane.showInputDialog("Enter First Number");
        
        num2 = JOptionPane.showInputDialog("Enter Second Number");
        
        int a=Integer.parseInt(num1);
        
        int b=Integer.parseInt(num2);
        
         int sum=a+b;
         
         JOptionPane.showMessageDialog(null,sum);
     
    }
    
}
