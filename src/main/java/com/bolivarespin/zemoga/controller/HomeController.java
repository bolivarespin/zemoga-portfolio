package com.bolivarespin.zemoga.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bolivarespin.zemoga.model.entity.Portfolio;
import com.bolivarespin.zemoga.model.service.IPortfolioService;
import com.bolivarespin.zemoga.model.service.ITweetService;
import twitter4j.Status;

@Controller
public class HomeController {
	
	@Autowired
	private IPortfolioService portfolioService;
	
	@Autowired
	private ITweetService tweetService;
	
	@GetMapping("/")
	public String showHome(Model model) {
		Portfolio portfolio = portfolioService.findById(9);
		List<Status> tweets = tweetService.getTweetsByUser();
		System.out.println(tweets);
		model.addAttribute("mensaje","Hola a todos");
		model.addAttribute("porta",portfolio);
		model.addAttribute("tweets",tweets);
		return "home";
	}
	
}
