package com.statespey.main;

import org.jinstagram.Instagram;
import org.jinstagram.auth.model.Token;
import org.jinstagram.exceptions.InstagramException;

public class InstagramTokenHandler {
	public static void main(String[] argv) throws InstagramException {
		
		Token token = new Token("4189671200.d4afd14.681cdec170d8456fa29e32f4aaa047f3","3f653e4d103646a8acda64598fa7cf21");
		Instagram instagram = new Instagram(token);
		
	}
}