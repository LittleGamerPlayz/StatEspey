package com.statespey.main.instagram;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import org.jinstagram.Instagram;
import org.jinstagram.entity.common.Images;
import org.jinstagram.entity.common.Likes;
import org.jinstagram.entity.users.feed.MediaFeed;
import org.jinstagram.entity.users.feed.MediaFeedData;

public class InstagramPosts extends JPanel {
	private static final long serialVersionUID = 1L;

	Instagram instagram = new Instagram("4189671200.d4afd14.681cdec170d8456fa29e32f4aaa047f3","3f653e4d103646a8acda64598fa7cf21");
	Image[] image = new Image[80];

	public void loadImage() {
		try {
			MediaFeed mediaFeed = instagram.getUserRecentMedia();
			List<MediaFeedData> feedDataList = mediaFeed.getData();
			for (MediaFeedData data : feedDataList) {

				Images images = data.getImages();
				URL url = new URL(images.getStandardResolution().getImageUrl());

				for (int i = 0; i <= image.length - 1; i++) {
					image[i] = ImageIO.read(url);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				setPreferredSize(new Dimension(800, 3800));
				validate();
			}
		});
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.drawImage(image[0], 0, 0, 200, 200, this);
		g.drawImage(image[1], 200, 0, 200, 200, this);
		g.drawImage(image[2], 400, 0, 200, 200, this);
		g.drawImage(image[3], 600, 0, 200, 200, this);

		g.drawImage(image[4], 0, 200, 200, 200, this);
		g.drawImage(image[5], 200, 200, 200, 200, this);
		g.drawImage(image[6], 400, 200, 200, 200, this);
		g.drawImage(image[7], 600, 200, 200, 200, this);

		g.drawImage(image[8], 0, 400, 200, 200, this);
		g.drawImage(image[9], 200, 400, 200, 200, this);
		g.drawImage(image[10], 400, 400, 200, 200, this);
		g.drawImage(image[11], 600, 400, 200, 200, this);

		g.drawImage(image[12], 0, 600, 200, 200, this);
		g.drawImage(image[13], 200, 600, 200, 200, this);
		g.drawImage(image[14], 400, 600, 200, 200, this);
		g.drawImage(image[15], 600, 600, 200, 200, this);

		g.drawImage(image[16], 0, 800, 200, 200, this);
		g.drawImage(image[17], 200, 800, 200, 200, this);
		g.drawImage(image[18], 400, 800, 200, 200, this);
		g.drawImage(image[19], 600, 800, 200, 200, this);

		g.drawImage(image[20], 0, 1000, 200, 200, this);
		g.drawImage(image[21], 200, 1000, 200, 200, this);
		g.drawImage(image[22], 400, 1000, 200, 200, this);
		g.drawImage(image[23], 600, 1000, 200, 200, this);

		g.drawImage(image[24], 0, 1200, 200, 200, this);
		g.drawImage(image[25], 200, 1200, 200, 200, this);
		g.drawImage(image[26], 400, 1200, 200, 200, this);
		g.drawImage(image[27], 600, 1200, 200, 200, this);

		g.drawImage(image[28], 0, 1400, 200, 200, this);
		g.drawImage(image[29], 200, 1400, 200, 200, this);
		g.drawImage(image[30], 400, 1400, 200, 200, this);
		g.drawImage(image[31], 600, 1400, 200, 200, this);

		g.drawImage(image[32], 0, 1600, 200, 200, this);
		g.drawImage(image[33], 200, 1600, 200, 200, this);
		g.drawImage(image[34], 400, 1600, 200, 200, this);
		g.drawImage(image[35], 600, 1600, 200, 200, this);

		g.drawImage(image[36], 0, 1800, 200, 200, this);
		g.drawImage(image[37], 200, 1800, 200, 200, this);
		g.drawImage(image[38], 400, 1800, 200, 200, this);
		g.drawImage(image[39], 600, 1800, 200, 200, this);

		g.drawImage(image[40], 0, 2000, 200, 200, this);
		g.drawImage(image[41], 200, 2000, 200, 200, this);
		g.drawImage(image[42], 400, 2000, 200, 200, this);
		g.drawImage(image[43], 600, 2000, 200, 200, this);

		g.drawImage(image[44], 0, 2200, 200, 200, this);
		g.drawImage(image[45], 200, 2200, 200, 200, this);
		g.drawImage(image[46], 400, 2200, 200, 200, this);
		g.drawImage(image[47], 600, 2200, 200, 200, this);

		g.drawImage(image[48], 0, 2400, 200, 200, this);
		g.drawImage(image[49], 200, 2400, 200, 200, this);
		g.drawImage(image[50], 400, 2400, 200, 200, this);
		g.drawImage(image[51], 600, 2400, 200, 200, this);

		g.drawImage(image[52], 0, 2600, 200, 200, this);
		g.drawImage(image[53], 200, 2600, 200, 200, this);
		g.drawImage(image[54], 400, 2600, 200, 200, this);
		g.drawImage(image[55], 600, 2600, 200, 200, this);

		g.drawImage(image[56], 0, 2800, 200, 200, this);
		g.drawImage(image[57], 200, 2800, 200, 200, this);
		g.drawImage(image[58], 400, 2800, 200, 200, this);
		g.drawImage(image[59], 600, 2800, 200, 200, this);

		g.drawImage(image[60], 0, 3000, 200, 200, this);
		g.drawImage(image[61], 200, 3000, 200, 200, this);
		g.drawImage(image[62], 400, 3000, 200, 200, this);
		g.drawImage(image[63], 600, 3000, 200, 200, this);

		g.drawImage(image[64], 0, 3200, 200, 200, this);
		g.drawImage(image[65], 200, 3200, 200, 200, this);
		g.drawImage(image[66], 400, 3200, 200, 200, this);
		g.drawImage(image[67], 600, 3200, 200, 200, this);

		g.drawImage(image[68], 0, 3400, 200, 200, this);
		g.drawImage(image[69], 200, 3400, 200, 200, this);
		g.drawImage(image[70], 400, 3400, 200, 200, this);
		g.drawImage(image[71], 600, 3400, 200, 200, this);
		
		g.drawImage(image[72], 0, 3600, 200, 200, this);
		g.drawImage(image[73], 200, 3600, 200, 200, this);
		g.drawImage(image[74], 400, 3600, 200, 200, this);
		g.drawImage(image[75], 600, 3600, 200, 200, this);
		
		g.drawImage(image[76], 0, 3800, 200, 200, this);
		g.drawImage(image[77], 200, 3800, 200, 200, this);
		g.drawImage(image[78], 400, 3800, 200, 200, this);
		g.drawImage(image[79], 600, 3800, 200, 200, this);
	}
}
