import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;

public class Withdraw implements ActionListener {

	private JFrame frmacc;
	private JFrame frmw;
	private JPanel pnlw;
	private JTextField tfw1;
	private JTextField tfw2;
	private JButton btw;


	DataInputStream din;
	DataOutputStream dout;
	String data[][]=new String[100][100];
	int i=0;
	private String acc;
	private String amount;
	private double amt;
	JLabel lb;
   BlockChain records;

	public Withdraw(JFrame frmacc, JLabel lb, BlockChain records) {
		// TODO Auto-generated constructor stub
		this.frmacc=frmacc;
		this.lb=lb;
      this.records = records;

		frmw = new JFrame("Withdraw");
		frmw.setSize(200,140);
      frmw.setLocationRelativeTo(null);
		frmw.setVisible(true);

		pnlw = new JPanel(new FlowLayout());
		frmw.add(pnlw);
		pnlw.add(new JLabel("AccNo:"));
		tfw1 = new JTextField(8);
		pnlw.add(tfw1);
		pnlw.add(new JLabel("Amount:"));
		tfw2 = new JTextField(8);
		pnlw.add(tfw2);

		btw=new JButton("Ok");
		pnlw.add(btw);
		btw.addActionListener(this);
		lb.setText("Withdrawal is Processing...");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		if(obj==btw)
		{
			fillArray();
			getdata();
			withdrawMoney();
			frmw.dispose();
			lb.setText("WithDrawal is done.");
		}
	}

	private void withdrawMoney() {
		// TODO Auto-generated method stub
		int x=0,f=0;
		while(x<i)
		{
			if(data[x][0].equals(acc))
			{
				double bal=Double.parseDouble(data[x][2]);
				String ty=data[x][3];
				if(ty.equals("Savings"))
				{
					if((bal-amt)>2000)
					{
						bal=bal-amt;
					}
					else
					{
						JOptionPane.showMessageDialog(frmacc, "Min Balance 2000.Withdrawal cannot be done");
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
						JOptionPane.showMessageDialog(frmacc, "Min Balance 5000.Withdrawal cannot be done");
					}
				}

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
		JOptionPane.showMessageDialog(frmacc, "WithDrawal done");
	}


	private void getdata() {
		// TODO Auto-generated method stub
		acc=tfw1.getText();
		amount=tfw2.getText();
		amt=Double.parseDouble(amount);
      
      records.addBlock(new Block("Withdrawal", new java.util.Date(), amount));
      records.displayChain();
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

}
