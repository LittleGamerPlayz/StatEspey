package com.statespey.main;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

import com.statespey.main.graphics.InstagramPosts;

public class StatEspey {

	JFrame frame = new JFrame();
	public static void main(String[] args) {
		StatEspey window = new StatEspey();
		InstagramPosts ip = new InstagramPosts();
		JScrollPane scroll = new JScrollPane(ip, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		ip.loadImage();
		window.frame.setTitle("StatEspey - Viral Media Tracker for Instagram");
		window.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.frame.setLayout(new BorderLayout());
		window.frame.setVisible(false);
		window.frame.setResizable(true);
		window.frame.setSize(850, 627);
		window.frame.setLocation(0, 0);
		window.frame.add(scroll);
	}
}