package com.statespey.main.graphics;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class InstagramPosts extends JPanel {
	private static final long serialVersionUID = 1L;
	
	BufferedImage image;

	// might not work, I am a bit of a trial and error coder
	// but let's see
	public InstagramPosts() {
		try {
			image = ImageIO.read(InstagramPosts.class.getResourceAsStream("/test.png"));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void paintComponent(Graphics g) {
		// g is the surface you draw on
		// if superclass has additional draw stuff)
		super.paintComponent(g); // in case background etc is drawn
		if (image != null) {
			g.drawImage(image, 0, 0, this);
		}
	}
	
	public static void main(String[] argv) {
		InstagramPosts ip = new InstagramPosts();

		System.out.println(ip.image.getHeight());
		System.out.println(ip.image.getWidth());

	}
}
