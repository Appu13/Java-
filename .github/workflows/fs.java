import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class fs {

	public static void main(String[] args) {
		//create new frame
		JFrame f=new JFrame("First");
		JTextField tf=new JTextField();
		tf.setBounds(50,50,150,20);
		JLabel l1=new JLabel();
		l1.setBounds(50, 100,250,20);
		JButton b=new JButton("Find ip");
		b.setBounds(100, 200, 100, 50);
		//adding the components to the frame
		f.add(tf); f.add(b);f.add(l1);
		//setting the features of the frame
		f.setSize(300, 400);
		f.setLayout(null);
		f.setVisible(true);
		//waiting for action
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String ho=tf.getText();
					//getting address of the host
					String ip=java.net.InetAddress.getByName(ho).getHostAddress();
					//displaying address
					l1.setText("IP of "+ho+"is: "+ip);
				}catch (Exception e1) {
					// TODO: handle exception
					System.out.println(e1);
				}
				
			}
		});

	}
	
	

}
