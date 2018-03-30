package com.statespey.main;

import java.awt.BorderLayout;
import java.awt.Canvas;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

import com.statespey.main.graphics.InstagramPosts;

public class StatEspey extends Canvas {
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		InstagramPosts ip = new InstagramPosts();
		JScrollPane jsp = new JScrollPane(ip, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		jsp.setBounds(5, 5, 200, 300);
		ip.loadImage();
		frame.setLayout(new BorderLayout());
		frame.setTitle("StatEspey");
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setSize(825, 630);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.add(jsp);
	}
}