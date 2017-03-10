package gitTest;
import javax.swing.*;
import java.awt.*;


public class Hello {
	int a = 0;
	public static void main(String args[]){
		JFrame window1 = new JFrame("µÚÒ»¸ö´°¿Ú");
		Container con = window1.getContentPane();
		con.setBackground(Color.yellow);
		window1.setBounds(60, 100, 600, 400);
		window1.setVisible(true);
		window1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	public a geta(){
		return a;
	}
}
