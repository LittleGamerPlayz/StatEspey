package com.statespey.main;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import com.statespey.main.graphics.ImagePanel;

public class StatEspey {

	static int width = Toolkit.getDefaultToolkit().getScreenSize().width;
	static int height = Toolkit.getDefaultToolkit().getScreenSize().height;

	JFrame frame = new JFrame();
	ImagePanel[] imagePanels = new ImagePanel[12];

	public static void main(String[] args) throws IOException {
		BufferedImage img = ImageIO.read(StatEspey.class.getResourceAsStream("/test.png"));
		StatEspey window = new StatEspey();
		ImagePanel ip = new ImagePanel();

		window.frame.setIconImage(Toolkit.getDefaultToolkit().getImage("resources\\icon.png"));
		window.frame.setVisible(true);
		window.frame.setResizable(true);
		window.frame.setTitle("StatEspey - Viral Media Tracker for Instagram");
		window.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.frame.setLayout(new GridLayout(4, 3));
		window.frame.setSize(width, height);
		window.frame.pack();
		ip.setImage(img);

		for (int i = 0; i < window.imagePanels.length; i++) {
			window.imagePanels[i] = new ImagePanel();
		}

		window.frame.add(ip, BorderLayout.CENTER);
		window.frame.revalidate();
	}
}