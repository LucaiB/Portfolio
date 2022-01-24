import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;

public class Payment implements ActionListener {
	private JButton btd;
	private JFrame frmd;
	private JPanel pnld;
	private JTextField tfd1;
	private JTextField tfd2;
	private JTextField tfd3;

	DataInputStream din;
	DataOutputStream dout;
	String data[][]=new String[100][100];
	int i=0;
	int temp =0;
	private String senderAc;
	private String receiverAc;
	private double amt;
	private String amount;
	JFrame frmacc;
	JLabel lb;
   BlockChain records;

	Payment(JFrame frmacc, JLabel lb, BlockChain records) {
		// TODO Auto-generated method stub

		this.frmacc=frmacc;
		this.lb=lb;
      this.records = records;
		
		frmd = new JFrame("Payment");
		frmd.setSize(700,125);
      frmd.setLocationRelativeTo (null);
		frmd.setVisible(true);

		pnld = new JPanel(new FlowLayout());
		frmd.add(pnld);
		pnld.add(new JLabel("AccNo:"));
		tfd1 = new JTextField(8);
		pnld.add(tfd1);
		pnld.add(new JLabel("ReceiverAccNo:"));
		tfd3 = new JTextField(10);
		pnld.add(tfd3);
		pnld.add(new JLabel("Amount:"));
		tfd2 = new JTextField(8);
		pnld.add(tfd2);

		btd=new JButton("Ok");
		pnld.add(btd);
		btd.addActionListener(this);
		lb.setText("Payment is Processing...");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		if(obj==btd)
		{
			fillArray();
			getdata();
			payment();
			frmd.dispose();
			lb.setText("Payment is done.");
		}
	}

	private void getdata() {
		// TODO Auto-generated method stub
		senderAc=tfd1.getText();
		receiverAc= tfd3.getText();
		amount=tfd2.getText();
      
      records.addBlock(new Block("Payment", new java.util.Date(), amount));
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
						temp =i;
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

	private void payment() {
		// TODO Auto-generated method stub
		
		int x=0,f=0;
		while(x<i)
		{
			if(data[x][0].equals(receiverAc))
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
			
		int y=0,z=0;
		while(y<i)
		{
			if(data[y][0].equals(senderAc))
			{
				double bal=Double.parseDouble(data[y][2]);
				String ty=data[y][3];
				if(ty.equals("Savings"))
				{
					if((bal-amt)>2000)
					{
						bal=bal-amt;
					}
					else
					{
						JOptionPane.showMessageDialog(frmacc, "Min Balence 2000.Withdrawal cannot be done");
					}

				}
				else if(ty.equals("Current"))
				{
					if((bal-amt)>5000)
					{
						bal=bal-amt;
					}

					else
					{
						JOptionPane.showMessageDialog(frmacc, "Min Balence 5000.Withdrawal cannot be done");
					}
				}

				data[y][2]=Double.toString(bal);
				z=1;
			}
			y++;
		}

		if(z==0)
		{
			JOptionPane.showMessageDialog(frmacc,"Account No is not Present");
		}

		if(z==1)
		{
			try {
				writeFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Block a = new Block("v1", new java.util.Date(), "5");
		//LucexBank.getChain().addBlock(a);
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
		JOptionPane.showMessageDialog(frmacc,"Payment is done Successfully");
	}

}

