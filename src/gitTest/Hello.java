package gitTest;
import javax.swing.*;
import java.awt.*;


public class Hello {
	public static void main(String args[]){
		JFrame window1 = new JFrame("第一个窗口");
		Container con = window1.getContentPane();
		con.setBackground(Color.yellow);
		window1.setBounds(60, 100, 600, 400);
		window1.setVisible(true);
		window1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
