package com.statespey.main.graphics;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import org.jinstagram.Instagram;
import org.jinstagram.entity.common.Images;
import org.jinstagram.entity.users.feed.MediaFeed;
import org.jinstagram.entity.users.feed.MediaFeedData;

public class InstagramPosts extends JPanel {
	private static final long serialVersionUID = 1L;

	Instagram instagram = new Instagram("4189671200.d4afd14.681cdec170d8456fa29e32f4aaa047f3", "3f653e4d103646a8acda64598fa7cf21");
	Image[] image = new Image[16];

	public void loadImage() {
		try {
			MediaFeed feed = instagram.getUserRecentMedia();
			List<MediaFeedData> feedDataList = feed.getData();
			for (MediaFeedData data : feedDataList) { 
				Images images = data.getImages();
				URL url = new URL(images.getStandardResolution().getImageUrl());
				image[0] = ImageIO.read(url);
				image[1] = ImageIO.read(url);
				image[2] = ImageIO.read(url);
				image[3] = ImageIO.read(url);
				image[4] = ImageIO.read(url);
				image[5] = ImageIO.read(url);
				image[6] = ImageIO.read(url);
				image[7] = ImageIO.read(url);
				image[8] = ImageIO.read(url);
				image[9] = ImageIO.read(url);
				image[10] = ImageIO.read(url);
				image[11] = ImageIO.read(url);
				image[12] = ImageIO.read(url);
				image[13] = ImageIO.read(url);
				image[14] = ImageIO.read(url);
				image[15] = ImageIO.read(url);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				validate();
			}
		});
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		// FIRST ROW
		g.drawImage(image[0], 0, 0, 200, 200, this);
		g.drawImage(image[1], 200, 0, 200, 200, this);
		g.drawImage(image[2], 400, 0, 200, 200, this);
		g.drawImage(image[3], 600, 0, 200, 200, this);
		// SECOND ROW
		g.drawImage(image[4], 0, 200, 200, 200, this);
		g.drawImage(image[5], 200, 200, 200, 200, this);
		g.drawImage(image[6], 400, 200, 200, 200, this);
		g.drawImage(image[7], 600, 200, 200, 200, this);
		// THIRD ROW
		g.drawImage(image[8], 0, 400, 200, 200, this);
		g.drawImage(image[9], 200, 400, 200, 200, this);
		g.drawImage(image[10], 400, 400, 200, 200, this);
		g.drawImage(image[11], 600, 400, 200, 200, this);
		// FOURTH ROW
		g.drawImage(image[12], 0, 600, 200, 200, this);
		g.drawImage(image[13], 200, 600, 200, 200, this);
		g.drawImage(image[14], 400, 600, 200, 200, this);
		g.drawImage(image[15], 600, 600, 200, 200, this);
	}
}
