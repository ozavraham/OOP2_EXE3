import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Test");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel primary = new JPanel();
		primary.setPreferredSize(new Dimension(280,100));
		Button bGreen= new Button("Green!");
		Button bRed= new Button("Red!");
		Button bBlue= new Button("Blue!");
		Button bYellow= new Button("Yellow!");
		primary.add(bRed);
		primary.add(bGreen);
		primary.add(bBlue);
		primary.add(bYellow);
		frame.getContentPane().add(primary);
		frame.pack();
		frame.setVisible(true);
		bRed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primary.setBackground(Color.red);
				frame.setBackground(Color.red);
			}
		});
		bBlue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primary.setBackground(Color.blue);
				frame.setBackground(Color.blue);
			}
		});
		bGreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primary.setBackground(Color.green);
				frame.setBackground(Color.green);
			}
		});
		bYellow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primary.setBackground(Color.yellow);
				frame.setBackground(Color.yellow);
			}
		});
	}
}
