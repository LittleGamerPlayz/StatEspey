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

	Instagram instagram = new Instagram("4189671200.d4afd14.681cdec170d8456fa29e32f4aaa047f3", "3f653e4d103646a8acda64598fa7cf21");
	Image[] image = new Image[40];
	
	public void loadImage() {
		try {
			MediaFeed mediaFeed = instagram.getUserRecentMedia();
			List<MediaFeedData> feedDataList = mediaFeed.getData();
			for (MediaFeedData data : feedDataList) {
				MediaFeedData mediaData = feedDataList.get(0);

				Likes likes = mediaData.getLikes();
				int likeCount = likes.getCount();
				
				Random random = new Random();
				int randomNum = random.getInt(feedDataList.size());
				String mediaId = mediaData.getId();

				mediaFeed = instagram.getUserRecentMedia(likeCount, mediaId, mediaId);
				
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
				image[16] = ImageIO.read(url);
				image[17] = ImageIO.read(url);
				image[18] = ImageIO.read(url);
				image[19] = ImageIO.read(url);
				image[20] = ImageIO.read(url);
				image[21] = ImageIO.read(url);
				image[22] = ImageIO.read(url);
				image[23] = ImageIO.read(url);
				image[24] = ImageIO.read(url);
				image[25] = ImageIO.read(url);
				image[26] = ImageIO.read(url);
				image[27] = ImageIO.read(url);
				image[28] = ImageIO.read(url);
				image[29] = ImageIO.read(url);
				image[30] = ImageIO.read(url);
				image[31] = ImageIO.read(url);
				image[32] = ImageIO.read(url);
				image[33] = ImageIO.read(url);
				image[34] = ImageIO.read(url);
				image[35] = ImageIO.read(url);
				image[35] = ImageIO.read(url);
				image[37] = ImageIO.read(url);
				image[38] = ImageIO.read(url);
				image[39] = ImageIO.read(url);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				setPreferredSize(new Dimension(800, 1800));
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
		// FIFTH ROW
		g.drawImage(image[16], 0, 800, 200, 200, this);
		g.drawImage(image[17], 200, 800, 200, 200, this);
		g.drawImage(image[18], 400, 800, 200, 200, this);
		g.drawImage(image[19], 600, 800, 200, 200, this);
		// SIXTH ROW
		g.drawImage(image[20], 0, 1000, 200, 200, this);
		g.drawImage(image[21], 200, 1000, 200, 200, this);
		g.drawImage(image[22], 400, 1000, 200, 200, this);
		g.drawImage(image[23], 600, 1000, 200, 200, this);
		// SEVENTH ROW
		g.drawImage(image[24], 0, 1200, 200, 200, this);
		g.drawImage(image[25], 200, 1200, 200, 200, this);
		g.drawImage(image[26], 400, 1200, 200, 200, this);
		g.drawImage(image[27], 600, 1200, 200, 200, this);
		// EIGHTH ROW
		g.drawImage(image[28], 0, 1400, 200, 200, this);
		g.drawImage(image[29], 200, 1400, 200, 200, this);
		g.drawImage(image[30], 400, 1400, 200, 200, this);
		g.drawImage(image[31], 600, 1400, 200, 200, this);
		// NINTH ROW
		g.drawImage(image[32], 0, 1600, 200, 200, this);
		g.drawImage(image[33], 200, 1600, 200, 200, this);
		g.drawImage(image[34], 400, 1600, 200, 200, this);
		g.drawImage(image[35], 600, 1600, 200, 200, this);
		// TENTH ROW
		g.drawImage(image[36], 0, 1800, 200, 200, this);
		g.drawImage(image[37], 200, 1800, 200, 200, this);
		g.drawImage(image[38], 400, 1800, 200, 200, this);
		g.drawImage(image[39], 600, 1800, 200, 200, this);
	}
}
