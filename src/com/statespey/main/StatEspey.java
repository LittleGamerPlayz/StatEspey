package com.statespey.main;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

import com.statespey.main.graphics.InstagramPosts;

public class StatEspey {

	public final static int width = Toolkit.getDefaultToolkit().getScreenSize().width;
	public final static int height = Toolkit.getDefaultToolkit().getScreenSize().height;

	JFrame frame = new JFrame();
	Image[] image;

	public static void main(String[] args) {
		StatEspey window = new StatEspey();
		InstagramPosts ip = new InstagramPosts();
		ip.loadImage();
		JScrollPane scroll = new JScrollPane(ip);
		scroll.getViewport().setPreferredSize(new Dimension(800, 640));
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		window.frame.getContentPane().setLayout(new FlowLayout());
		window.frame.add(scroll);
		window.frame.pack();
		window.frame.setTitle("StatEspey - Viral Media Tracker for Instagram");
		window.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.frame.setVisible(true);
		window.frame.setResizable(false);
	}
}