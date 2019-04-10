package com.kitri.awt.event;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends Frame {
    
    
    Panel pN = new Panel();
    Panel pC= new Panel();
    
    Label numL = new Label();
    Label openL = new Label();
          
    String bt[] =  {"7","8","9","+","4","5","6","-","1","2","3","*","0","C","=","/"};
    Button btn[] = new Button[16];
    int len = btn.length;
    
    Button exit = new Button("종료");
    
    CalculatorController calculatorController;
    
    public Calculator() {
          super("계산기");
          
          pN.setLayout(new BorderLayout(5, 0));
          pN.add(numL,"Center");
          numL.setBackground(Color.gray);
          numL.setForeground(Color.white);
          pN.add(openL,"East");
          openL.setBackground(Color.DARK_GRAY);
          openL.setForeground(Color.white);
          Font f = new Font("굴림",Font.BOLD, 20);
          numL.setFont(f);
          openL.setFont(f);
          
          
          pC.setLayout(new GridLayout(4, 4, 5, 5));
          
          for(int i=0; i<len;i++) {
               btn[i]= new Button(bt[i]);
               btn[i].setBackground(new Color(250-i*10,250-i,250-i));
               pC.add(btn[i]);  
          }
          
          setLayout(new BorderLayout(0, 10));
          add(pN,"North");
          add(pC,"Center");
          add(exit,"South");
          
          setBounds(300, 200, 300, 500);
          setVisible(true);
          
          calculatorController = new  CalculatorController(this);
          
          for(int i=0;i<len;i++) {
               btn[i].addActionListener(calculatorController);
          }
          exit.addActionListener(calculatorController);
          
          
          
    }
    
    public static void main(String[] args) {
          new Calculator();
    }
    
}

