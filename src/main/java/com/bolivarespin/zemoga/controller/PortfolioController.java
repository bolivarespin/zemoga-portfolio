package com.bolivarespin.zemoga.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.bolivarespin.zemoga.model.entity.Portfolio;
import com.bolivarespin.zemoga.model.service.IPortfolioService;



@RestController
public class PortfolioController {

	@Autowired
	private IPortfolioService portfolioService;

	@GetMapping("/portfolio/{id}")
	public ResponseEntity<Portfolio> getPortafolio(@PathVariable Integer id) {
		return new ResponseEntity<Portfolio>(portfolioService.findById(id), HttpStatus.OK);
	}

	@PutMapping("/portfolio/{id}")
	public ResponseEntity<Portfolio> updatePortfolio(@PathVariable Integer id,@RequestBody Portfolio portfolio){
		portfolio.setIdportfolio(id);
		return new ResponseEntity<Portfolio>(portfolioService.updatePortfolio(portfolio), HttpStatus.OK);
	}
	
}
