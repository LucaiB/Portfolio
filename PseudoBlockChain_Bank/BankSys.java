import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.*;
import java.awt.*;
import javax.swing.*;

class BankSystemPvt implements ActionListener
{
   RandomAccessFile file;
   DataInputStream din;
   DataOutputStream dout;
   
   RandomAccessFile Chainrecord;
   DataInputStream inRec;
   DataOutputStream outRec;

   JFrame bank;
   JPanel pnlp;
	
   JLabel welcome;
	
   JFrame frmacc;
   JPanel pnlacc;
   JTextField tfacc,tfname,tfb;
   JComboBox JCBtype;
   String [] types = {"Savings", "Current", "Checking", "Transactional", "Retirement"};
   JButton btacc;

   JFrame frmv;
   JPanel pnlv;
   JScrollPane sp;
   JTable tbv;

   JFrame frmd;
   JPanel pnld;
   JButton btd;
   JTextField tfd1,tfd2;
   private JMenu help;
   private JMenuItem about;

   int f=0;
   private JMenuBar mbar;
   private JMenu file1;
   private JMenu transaction;
   private JMenuItem newacc, search, view, exit, withdraw, deposit, payment;
   BlockChain records = new BlockChain();


   JToolBar tb;
   JButton newac,searchac,exitac,helpac;

   BankSystemPvt()
   {
      bank=new JFrame("LucasAlexBank");
      bank.setSize(690,600);
      bank.setLocationRelativeTo (null);
      bank.setVisible(true);
      bank.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      welcome = new JLabel();		
   	
      mbar=new JMenuBar();
      bank.setJMenuBar(mbar);
      pnlp=new JPanel(new BorderLayout());
      bank.setLayout(new BorderLayout());
   
      file1=new JMenu("File");
      mbar.add(file1);
      newacc=new JMenuItem("New Account");
      file1.add(newacc);
      search=new JMenuItem("Search");
      file1.add(search);
      view=new JMenuItem("View");
      file1.add(view);
      exit=new JMenuItem("Exit");
      file1.add(exit);
      transaction=new JMenu("Transaction");
      mbar.add(transaction);
      withdraw=new JMenuItem("Withdraw");
      transaction.add(withdraw);
      deposit=new JMenuItem("Deposit");
      transaction.add(deposit);
      payment = new JMenuItem("Payment");
      transaction.add(payment);
      help=new JMenu("Help");
      mbar.add(help);
      about=new JMenuItem("About");
      help.add(about);
   	
      tb=new JToolBar();
   	
      newac=new JButton(new ImageIcon("E:/imagesimp/new.gif"));
      tb.add(newac);
      searchac=new JButton(new ImageIcon("E:/imagesimp/find.gif"));
      tb.add(searchac);	
      exitac=new JButton(new ImageIcon("E:/images/Keys.gif"));
      tb.add(exitac);	
      helpac=new JButton(new ImageIcon("E:/imagesimp/about.gif"));
      tb.add(helpac);	
   	
      bank.add(pnlp,"Center");
      pnlp.add(tb,"North");
   	
      newacc.addActionListener(this);
      search.addActionListener(this);
      payment.addActionListener(this);
      view.addActionListener(this);
      exit.addActionListener(this);
      withdraw.addActionListener(this);
      deposit.addActionListener(this);
      about.addActionListener(this);
      newac.addActionListener(this);
      searchac.addActionListener(this);
      exitac.addActionListener(this);
      helpac.addActionListener(this);
   		
      bank.add(welcome, "Center");
      welcome.setFont(welcome.getFont().deriveFont(32.0f));    
      welcome.setHorizontalAlignment(SwingConstants.CENTER);
      welcome.setText("Welcome to the Lucex Bank!");
   }


   public void actionPerformed(ActionEvent e) {
   	// TODO Auto-generated method stub
   	
      if(e.getSource()==about)
      {
      
         JOptionPane.showMessageDialog(bank, "Banking System by Lucas and Alex");
      }
      if(e.getSource()==helpac)
      {
      
         JOptionPane.showMessageDialog(bank, "Banking System by Lucas and Alex");
      }
   	
      if(e.getSource()==newac)
      {
         newAcc();
         welcome.setText("New Account Registration is Going on...");
      }
      if(e.getSource()==newacc)
      {
         newAcc();
         welcome.setText("New Account Registration is Going on...");
      }
   
      if(e.getSource()==withdraw)
      {
         new Withdraw(frmacc,welcome, records);
      }
   
      if(e.getSource()==deposit)
      {
         new Deposit(frmacc,welcome, records);
      }
   
      if(e.getSource()==search)
      {
         new Search(frmacc,welcome);
      }
      
      if(e.getSource() == payment)
      {
         new Payment(frmacc,welcome, records);
      }
   
      if(e.getSource()==searchac)
      {
         new Search(frmacc,welcome);
      }
   
      if(e.getSource()==view)
      {
         try {
            view();
         } catch (IOException e1) {
         	// TODO Auto-generated catch block
            e1.printStackTrace();
         }
      }
   
      if(e.getSource()==exit)
      {
         welcome.setText(null);
         System.exit(0);
      }
   
      if(e.getSource()==exitac)
      {
         welcome.setText(null);
         System.exit(0);
      }
   
      if(e.getSource()==btacc)
      {
         accCreate();
         frmacc.dispose();
         welcome.setText("New Account Registration is Completed.");
      }
   }


   private void view() throws IOException {
   	// TODO Auto-generated method stub
   
      frmv=new JFrame("#Customer Records#");
      frmv.setSize(600,350);
      frmv.setVisible(true);
      pnlv=new JPanel(new BorderLayout());
      frmv.add(pnlv);
   
      int i=0;
      String data[][]=new String[100][100];
      String col[]={"ACCNo","Name","Balance","Type"};
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
      
         din.close();
      } catch (FileNotFoundException e) {
      	// TODO Auto-generated catch block
         e.printStackTrace();
      }
   
      tbv=new JTable(data,col);
      sp=new JScrollPane(tbv);
      pnlv.add(sp);
   
      welcome.setText("Customer Records...");
   }



   private void newAcc() {
   	// TODO Auto-generated method stub
      frmacc=new JFrame("New Account");
      frmacc.setSize(450,150);
      frmacc.setLocationRelativeTo (null);
      frmacc.setVisible(true);
      pnlacc=new JPanel(new FlowLayout());
      frmacc.add(pnlacc);
      pnlacc.add(new JLabel("Name:"));
      tfname=new JTextField(8);
      pnlacc.add(tfname);
      pnlacc.add(new JLabel("Balance:"));
      tfb=new JTextField(8);
      pnlacc.add(tfb);
      pnlacc.add(new JLabel("Type:"));
      JCBtype=new JComboBox(types);                      
      pnlacc.add(JCBtype);
   
      btacc=new JButton("Ok");
      pnlacc.add(btacc);
   
      btacc.addActionListener(this);
      welcome.setText("New Account Registration is Going on...");
   
   }

   private void accCreate() {
   	// TODO Auto-generated method stub
      try {
         file = new RandomAccessFile("BankSystem.txt","rw");
         Chainrecord = new RandomAccessFile("BankRecords.txt","rw");
         
         file.seek(file.length());
      	//			String acc=tfacc.getText();
         int accno=(int)(Math.random()*10000);
         String acc=Integer.toString(accno);
         String name=tfname.getText();
         String bal=tfb.getText();
         String ty=JCBtype.getSelectedItem().toString();
         if(ty.equals("Savings"))
         {
            file.writeUTF(acc);
            file.writeUTF(name);
            file.writeUTF(bal);
            file.writeUTF(ty);
            JOptionPane.showMessageDialog(frmacc, "AccountNo: "+acc+" is Registered");
         }
         else if(ty.equals("Current"))
         {
            file.writeUTF(acc);
            file.writeUTF(name);
            file.writeUTF(bal);
            file.writeUTF(ty);
            JOptionPane.showMessageDialog(frmacc, "AccountNo: "+acc+" is Registered");
         }
            
         else if(ty.equals("Checking"))
         {
            
            file.writeUTF(acc);
            file.writeUTF(name);
            file.writeUTF(bal);
            file.writeUTF(ty);
            JOptionPane.showMessageDialog(frmacc, "AccountNo: "+acc+" is Registered");     
         }
         
         else if(ty.equals("Transactional"))
         {
            
            file.writeUTF(acc);
            file.writeUTF(name);
            file.writeUTF(bal);
            file.writeUTF(ty);
            JOptionPane.showMessageDialog(frmacc, "AccountNo: "+acc+" is Registered");     
         }
         
         else if(ty.equals("Retirement"))
         {
            
            file.writeUTF(acc);
            file.writeUTF(name);
            file.writeUTF(bal);
            file.writeUTF(ty);
            JOptionPane.showMessageDialog(frmacc, "AccountNo: "+acc+" is Registered");     
         }      
      } catch (FileNotFoundException e) {
      	// TODO Auto-generated catch block
         e.printStackTrace();
      } catch (IOException e) {
      	// TODO Auto-generated catch block
         e.printStackTrace();
      }
   }
}


public class BankSys {

   JFrame f;
   public static void main(String[] args) throws IOException
   {
      SwingUtilities.invokeLater(
         new Runnable(){
            public void run()
            {
               new BankSystemPvt();
            }
         });
   }
}
