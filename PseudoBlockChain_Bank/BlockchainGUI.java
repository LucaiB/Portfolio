import javax.swing.*;
import java.awt.*;
import java.net.*;
import java.awt.event.*;

public class BlockchainGUI extends JPanel{
	private JPanel panel;
	private JButton nButton;
	private JButton cButton;
	private ImageIcon picture;
	private JButton nButton1;
	private JButton nButton2;
	private JButton nButton3;
	private JTextField southText;

	public BlockchainGUI() {

		setLayout(new BorderLayout());
		nButton = new JButton("Login to Account");
		add(nButton, BorderLayout.NORTH);

		nButton1 = new JButton("south");
		add(nButton1, BorderLayout.SOUTH);
		nButton1.setBackground(new Color(249, 52, 78));

		//nButton2 = new JButton("east");
		//add(nButton2, BorderLayout.EAST);
		//nButton2.setBackground(new Color(55, 120, 255));

		nButton3 = new JButton("west");
		add(nButton3, BorderLayout.WEST);
		nButton3.setBackground(new Color(60, 240, 180));

		southText = new JTextField(240);
		nButton1.add(southText);
		southText.addActionListener(new Listener1());

		try {
			picture = new ImageIcon(new URL("https://cdn4.glstock.com/10231/7015/7015_325.jpg"));
		} catch (Exception e) {
		}
		cButton = new JButton(picture);
		add(cButton, BorderLayout.CENTER);

		nButton.setForeground(Color.red);
		nButton.setBackground(new Color(34, 78, 255));

		nButton.setFont(new Font("Courier", Font.ITALIC, 24));
		nButton.addActionListener(new Listener1());
		nButton1.addActionListener(new Listener1());
		//nButton2.addActionListener(new Listener1());
		nButton3.addActionListener(new Listener1());
		cButton.addActionListener(new Listener1());

	}

	private class Listener1 implements ActionListener {

public void actionPerformed(ActionEvent e)
{

if(e.getSource() == nButton)
   nButton.setText("This is the North");
else if(e.getSource() == nButton1)
   nButton1.setText("This is the South");
//else if(e.getSource() == nButton2)   
 //  nButton2.setText("This is the east");
else if(e.getSource() == nButton3)
   nButton3.setText("This is the west");
else if(e.getSource() == cButton)
	return;
//cButton.setIcon();
}
	}

	public static void main(String[] args) {

		boolean USE_CROSS_PLATFORM_UI = true;
		if (USE_CROSS_PLATFORM_UI) {
			try {
				UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		JFrame frame = new JFrame("Bank");
		frame.setSize(600, 450);
		frame.setLocation(200, 200);
		frame.setResizable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new BlockchainGUI());
		frame.setVisible(true);
	}
}
