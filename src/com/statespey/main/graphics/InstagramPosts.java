package com.statespey.main.graphics;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.List;

import javax.swing.JPanel;

import org.jinstagram.Instagram;
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

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (image != null) {
			g.drawImage(image, 0, 0, this);
		}
	}

	public static void main(String[] args) {
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
			data.getImages();
			data.getVideos();

		}
	}
}
