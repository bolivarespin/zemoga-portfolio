package com.bolivarespin.zemoga.model.service;

import java.util.List;
import org.springframework.stereotype.Service;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

@Service
public class TweetServiceImpl implements ITweetService{
	
	@Override
	public List<Status> getTweetsByUser() {
		try {
			
			Twitter iTwitter = new TwitterFactory().getInstance();
            List<Status> statuses = iTwitter.getUserTimeline();
    		return statuses;
		} catch(TwitterException te) {
			te.printStackTrace();
            System.out.println("Failed to verify credentials: " + te.getMessage());
            System.exit(-1);	
		}
		
		return null;
	}
	
	public static Twitter getTwitterinstance() {
		Twitter iTwitter = TwitterFactory.getSingleton();
		return iTwitter;
		
	}
	
	public String createTweet(String twitt) {
	    Twitter iTwitter = getTwitterinstance();
	    Status status = null;
		try {
			status = iTwitter.updateStatus(twitt);
		} catch (TwitterException e) {
			e.printStackTrace();
		}
	    return status.getText();
	}
	
	
}
