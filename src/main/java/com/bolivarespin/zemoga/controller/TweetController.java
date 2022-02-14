package com.bolivarespin.zemoga.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bolivarespin.zemoga.model.service.ITweetService;
import twitter4j.Status;

@RestController
public class TweetController {

	@Autowired
	private ITweetService tweetService;
	
	@GetMapping("/tweets")
	public List<Status> getTweets(){
		return tweetService.getTweetsByUser();
	}
}
