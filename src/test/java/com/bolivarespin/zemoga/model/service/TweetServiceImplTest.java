package com.bolivarespin.zemoga.model.service;

import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import twitter4j.Status;
import twitter4j.TwitterObjectFactory;

class TweetServiceImplTest {

	private TweetServiceImpl serviceMock = Mockito.mock(TweetServiceImpl.class);
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
	void testGetTweetsByUser() {
		
		MockitoAnnotations.initMocks(this);
		when(serviceMock.getTweetsByUser()).thenReturn(list);
		
	}

}
