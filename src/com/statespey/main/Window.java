package com.statespey.main;

import java.awt.*;

import javax.swing.*;

import com.statespey.main.graphics.InstagramPosts;

public class Window  {
	private static final long serialVersionUID = 1L;
	
	JFrame frame = new JFrame();

	public static void main(String[] args) {

		Window window = new Window();
		window.frame.setIconImage(Toolkit.getDefaultToolkit().getImage("resources\\icon.png"));
		window.frame.setVisible(true);
		window.frame.setResizable(true);
		window.frame.setTitle("StatEspey - Viral Media Tracker for Instagram");
		window.frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		window.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.frame.setAlwaysOnTop(true);

		InstagramPosts ip = new InstagramPosts();
		ip.loadImage();
		window.frame.setLayout(new BorderLayout());
		window.frame.add(ip, BorderLayout.CENTER);
		window.frame.revalidate();
	}
}