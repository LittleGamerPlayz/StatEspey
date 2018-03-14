package com.statespey.main;

import org.jinstagram.Instagram;
import org.jinstagram.entity.common.Meta;
import org.jinstagram.entity.common.Pagination;
import org.jinstagram.entity.users.feed.MediaFeed;
import org.jinstagram.entity.users.feed.MediaFeedData;
import org.jinstagram.exceptions.InstagramException;

import java.util.List;

/**
 * © 2012 Joris Hilhorst. All rights reserved.
 * User: Joris
 * Date: 13/03/2018
 * Time: 19:41
 */
public class InstagramExample {
    public static void main(String[] argv) throws InstagramException {
        Instagram instagram = new Instagram("4189671200.d4afd14.681cdec170d8456fa29e32f4aaa047f3");

        MediaFeed feed = instagram.getPopularMedia();
        List<MediaFeedData> feedDataList = feed.getData();
        for (MediaFeedData data : feedDataList) {
//            data.getCaption();
//            data.getImages();
//            data.getLink();
        }

        // not sure how to proceed to next page.
    }
}