package com.statespey.main.graphics;

import java.awt.Graphics;
import java.awt.Window;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.jinstagram.Instagram;

public class ImagePanel extends JPanel {
	private static final long serialVersionUID = 1L;

	Instagram instagram = new Instagram("4189671200.d4afd14.681cdec170d8456fa29e32f4aaa047f3","3f653e4d103646a8acda64598fa7cf21");
	BufferedImage image;
	ImagePanel[] imagePanels;

	public ImagePanel() {
		
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (image != null) {
			g.drawImage(image, 0, 0, this);
		}
	}
}
