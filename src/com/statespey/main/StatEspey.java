package com.statespey.main;

import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

import com.statespey.main.graphics.InstagramPosts;

public class StatEspey {
	
	public final static int width = Toolkit.getDefaultToolkit().getScreenSize().width;
	public final static int height = Toolkit.getDefaultToolkit().getScreenSize().height;
	
	JFrame frame = new JFrame();

	public static void main(String[] args) {
		StatEspey window = new StatEspey();
		InstagramPosts ip = new InstagramPosts();
		JScrollPane scroll = new JScrollPane(ip, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		ip.loadImage();
		window.frame.setTitle("StatEspey - Viral Media Tracker for Instagram");
		window.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.frame.setVisible(true);
		window.frame.setResizable(true);
		window.frame.setSize(820, 600);
		window.frame.setLocation(0, 0);
		window.frame.add(scroll);
	}
}