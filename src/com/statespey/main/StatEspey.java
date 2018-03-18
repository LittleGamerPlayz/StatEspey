package com.statespey.main;

import java.awt.BorderLayout;
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

	public static void main(String[] args) throws IOException {
		BufferedImage img = ImageIO.read(StatEspey.class.getResourceAsStream("/test.png"));
		ImagePanel ip = new ImagePanel();
		StatEspey window = new StatEspey();
		window.frame.setIconImage(Toolkit.getDefaultToolkit().getImage("resources\\icon.png"));
		window.frame.setVisible(true);
		window.frame.setResizable(true);
		window.frame.setTitle("StatEspey - Viral Media Tracker for Instagram");
		window.frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		window.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.frame.setAlwaysOnTop(true);
		window.frame.setLayout(new BorderLayout());
		ip.setImage(img);
		window.frame.add(ip, BorderLayout.CENTER);
		window.frame.revalidate();
	}
}