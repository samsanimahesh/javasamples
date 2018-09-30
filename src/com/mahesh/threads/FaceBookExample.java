package com.mahesh.threads;

import java.util.List;

import facebook4j.Account;
import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import facebook4j.Friend;
import facebook4j.Friendlist;
import facebook4j.ResponseList;
import facebook4j.User;
import facebook4j.api.AccountMethods;
import facebook4j.api.FriendMethods;
import facebook4j.auth.AccessToken;
import facebook4j.conf.ConfigurationBuilder;

public class FaceBookExample {
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws FacebookException {
		
		
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true)
		  .setOAuthAppId("164593054055656")
		  .setOAuthAppSecret("b89d3c0e5c78b093190828167ec53cd1").setOAuthAccessToken("EAACVsk6EZCOgBAEDGQSBL64RM385RNlhBHvctjZApBAZAiG5jbUZCx7Kgzbfiwmp3CCUwqgs0Ms9YbrrWEicYxTcx7ByZBavzMoZABHLFADjg07qiYcjutWaVjGZCy2rEQF2ZAC7lsVG6I4mqyAwJHAJAarj0cVJG2SRl376AYf8hIyqsHgpQDNI");
		FacebookFactory ff = new FacebookFactory(cb.build());
		Facebook facebook = ff.getInstance();
		System.out.println(facebook);

		FriendMethods friendMethods = facebook.friends();
//getFriends("10212355473305661");
		System.out.println(friendMethods.getFriends("10212355473305661").getSummary().getTotalCount());
		
	}

}
