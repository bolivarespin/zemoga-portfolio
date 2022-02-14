package com.bolivarespin.zemoga.model.service;

import java.util.List;
import twitter4j.Status;

public interface ITweetService {
	public List<Status> getTweetsByUser();
	public String createTweet(String tweet);
}
