package com.statespey.main.graphics;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import org.jinstagram.Instagram;
import org.jinstagram.entity.common.Images;
import org.jinstagram.entity.users.feed.MediaFeed;
import org.jinstagram.entity.users.feed.MediaFeedData;
import org.jinstagram.exceptions.InstagramException;

public class InstagramPosts extends JPanel {
	private static final long serialVersionUID = 1L;

	static Instagram instagram = new Instagram("4189671200.d4afd14.681cdec170d8456fa29e32f4aaa047f3","3f653e4d103646a8acda64598fa7cf21");
	BufferedImage image;

	public InstagramPosts() {
		image = null;
	}

	public void loadImage() {
		try {
			MediaFeed feed = instagram.getUserRecentMedia();
			List<MediaFeedData> feedDataList = feed.getData();
			for (MediaFeedData data : feedDataList) {
				Images images = data.getImages();
				URL url = new URL(images.getStandardResolution().getImageUrl());
				image = ImageIO.read(url);
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
		if (image != null) {
			g.drawImage(image, 0, 0, this);
		}
	}

	public static void main(String[] argv) {
		MediaFeed feed = null;
		try {
			feed = instagram.getUserRecentMedia();
		} catch (InstagramException e) {
			e.printStackTrace();

		}

		List<MediaFeedData> feedDataList = feed.getData();
		int i = 0;
		for (MediaFeedData data : feedDataList) {
			System.out.println(i++);
			Images images = data.getImages();
			System.out.println(images.getStandardResolution().getImageUrl());

			System.out.println(data.getCaption());
		}
	}
}
