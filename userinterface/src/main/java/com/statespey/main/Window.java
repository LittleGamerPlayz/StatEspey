package com.statespey.main;

import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Window {

	JFrame frame = new JFrame();

	public Window() {

	}

	public static void main(String[] args) {
		Window window = new Window();
		window.frame.setIconImage(Toolkit.getDefaultToolkit().getImage("res\\icon.png"));
		window.frame.setVisible(true);
		window.frame.setSize(Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height);
		window.frame.setResizable(false);
		window.frame.setTitle("StatEspey - Viral Video Tracker for Instagram");
		window.frame.isUndecorated();

	}
}