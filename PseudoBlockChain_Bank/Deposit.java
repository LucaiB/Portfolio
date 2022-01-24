import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;

public class Deposit implements ActionListener {
   private JButton btd;
   private JFrame frmd;
   private JPanel pnld;
   private JTextField tfd1;
   private JTextField tfd2;

   DataInputStream din;
   DataOutputStream dout;
   DataInputStream inRec;
   DataOutputStream outRec;

   String data[][]=new String[100][100];
   int i=0;
   private String acc;
   private double amt;
   private String amount;
   JFrame frmacc;
   JLabel lb;
   BlockChain records;

   Deposit(JFrame frmacc, JLabel lb, BlockChain records) {
   	// TODO Auto-generated method stub
   
      this.frmacc=frmacc;
      this.lb=lb;
      this.records = records;
      
      
   	
      frmd = new JFrame("Withdraw");
      frmd.setSize(200,140);
      frmd.setLocationRelativeTo (null);
      frmd.setVisible(true);
   
      pnld = new JPanel(new FlowLayout());
      frmd.add(pnld);
      pnld.add(new JLabel("AccNo:"));
      tfd1 = new JTextField(8);
      pnld.add(tfd1);
      pnld.add(new JLabel("Amount:"));
      tfd2 = new JTextField(8);
      pnld.add(tfd2);
   
      btd=new JButton("Ok");
      pnld.add(btd);
      btd.addActionListener(this);
      lb.setText("Deposition is Processing...");
   }

   @Override
   public void actionPerformed(ActionEvent e) {
   	// TODO Auto-generated method stub
      Object obj = e.getSource();
      if(obj==btd)
      {
         fillArray();
         getdata();
         depositMoney();
         frmd.dispose();
         lb.setText("Deposit is done.");
      }
   }

   private void getdata() {
   	// TODO Auto-generated method stub
      acc=tfd1.getText();
      amount=tfd2.getText();
      records.addBlock(new Block("Deposit", new java.util.Date(), amount));
      records.displayChain();
         
      amt=Double.parseDouble(amount);
   }

   private void fillArray() {
   	// TODO Auto-generated method stub
      Boolean eof=false;
   
      try {
         din=new DataInputStream(new FileInputStream("BankSystem.txt"));
      
         while(!eof)
         {
            try{
               while(true)
               {
                  for(int j=0;j<=3;j++)
                  {
                     data[i][j]=din.readUTF();
                  }
                  i++;
               }
            
            }catch(EOFException e)
            {
               eof=true;
            } catch (IOException e) {
            	// TODO Auto-generated catch block
               e.printStackTrace();
            }
         }
      
         try {
            din.close();
         } catch (IOException e) {
         	// TODO Auto-generated catch block
            e.printStackTrace();
         }
      } catch (FileNotFoundException e) {
      	// TODO Auto-generated catch block
         e.printStackTrace();
      }
   
   
   }

   private void depositMoney() {
   	// TODO Auto-generated method stub
      int x=0,f=0;
      while(x<i)
      {
         if(data[x][0].equals(acc))
         {
            double bal=Double.parseDouble(data[x][2]);
            bal=bal+amt;
            data[x][2]=Double.toString(bal);
            f=1;
         }
      
         x++;
      }
   
      if(f==0)
      {
         JOptionPane.showMessageDialog(frmacc,"Account No is not Present");
      }
      if(f==1)
      {
         try {
            writeFile();
         } catch (IOException e) {
         	// TODO Auto-generated catch block
            e.printStackTrace();
         }
      }
   }

   private void writeFile() throws IOException {
   	// TODO Auto-generated method stub
      int x,y;
      dout=new DataOutputStream(new FileOutputStream("Banksystem.txt"));
      for(x=0;x<i;x++)
      {
         for(y=0;y<4;y++)
         {
            dout.writeUTF(data[x][y]);
         }
      }
      JOptionPane.showMessageDialog(frmacc,"Deopsition is done Successfully");
   }

}
