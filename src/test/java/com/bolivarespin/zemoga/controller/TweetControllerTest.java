package com.bolivarespin.zemoga.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.bolivarespin.zemoga.model.service.ITweetService;

import twitter4j.Status;
import twitter4j.TwitterObjectFactory;

class TweetControllerTest {

	private ITweetService tweetService = Mockito.mock(ITweetService.class);
	
	@InjectMocks
	private TweetController tweetController;
	
	final List<Status> list = new ArrayList<Status>();
	
	@BeforeEach
	void setUp() throws Exception {
		String rawJson = "{\"id\":\"1234567\",\"text\":\"tweet one test\"}";
		Status status = TwitterObjectFactory.createStatus(rawJson);
		list.add(status);
		
		rawJson = "{\"id\":\"9876543\",\"text\":\"tweet Two test\"}";
		status = TwitterObjectFactory.createStatus(rawJson);
		list.add(status);	
	}

	@SuppressWarnings("deprecation")
	@Test
	void test() {
		MockitoAnnotations.initMocks(this);
		Mockito.when(tweetService.getTweetsByUser()).thenReturn(list);
		assertNotNull(tweetController.getTweets());
	}

}
