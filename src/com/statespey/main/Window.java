package com.statespey.main;

import java.awt.Toolkit;

import javax.swing.JFrame;

public class Window {

	JFrame frame = new JFrame();

	public static void main(String[] args) {
		Window window = new Window();
		window.frame.setIconImage(Toolkit.getDefaultToolkit().getImage("resources\\icon.png"));
		window.frame.setVisible(true);
		window.frame.setResizable(false);
		window.frame.setTitle("StatEspey - Viral Media Tracker for Instagram");
		window.frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		window.frame.setAlwaysOnTop(true);

	}
}