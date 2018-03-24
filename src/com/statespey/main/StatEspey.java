package com.statespey.main;

import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StatEspey extends JPanel {
	private static final long serialVersionUID = 1L;
	
	int width = Toolkit.getDefaultToolkit().getScreenSize().width;
	int height = Toolkit.getDefaultToolkit().getScreenSize().height;

	ImageIcon[] imagePanels = new ImageIcon[12];
	JLabel[] label = new JLabel[12];
	JFrame frame = new JFrame();

	public static void main(String[] args) throws IOException {
		@SuppressWarnings("unused")
		BufferedImage img = ImageIO.read(StatEspey.class.getResourceAsStream("/test.png"));
		StatEspey window = new StatEspey();
		
		window.imagePanels[0] = new ImageIcon("resources\\test.png");
		window.label[0] = new JLabel(window.imagePanels[0]);
		
		window.imagePanels[1] = new ImageIcon("resources\\saw.png");
		window.label[1] = new JLabel(window.imagePanels[1]);
		
		window.frame.setIconImage(Toolkit.getDefaultToolkit().getImage("resources\\icon.png"));
		window.frame.setVisible(true);
		window.frame.setResizable(false);
		window.frame.setTitle("StatEspey - Viral Media Tracker for Instagram");
		window.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.frame.setLayout(new GridLayout(4, 3));
		window.frame.setSize(window.width, window.height);

		for (int i = 0; i < window.imagePanels.length; i++) {
			window.imagePanels[i] = new ImageIcon();

		}	
		
		window.frame.add(window.label[0]);
		window.frame.add(window.label[1]);
		
		window.frame.pack();
		window.frame.revalidate();
		
	}
}