package com.bolivarespin.zemoga.controller;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import com.bolivarespin.zemoga.model.entity.Portfolio;
import com.bolivarespin.zemoga.model.service.IPortfolioService;

class PortfolioControllerTest {
	
	private IPortfolioService portfolioService = Mockito.mock(IPortfolioService.class); 

	@InjectMocks
	PortfolioController portfolioController;

	private Portfolio portfolio;
	
	@SuppressWarnings("deprecation")
	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		portfolio = new Portfolio();
		portfolio.setIdportfolio(9);
		portfolio.setDescription("test description");
		portfolio.setExperience_summary("test experience summary");
		portfolio.setImage_url("avatar.be.png");
		portfolio.setNames("Edgar Bolivar");
		portfolio.setLast_names("Espin Alarcon");
			
	}

	@Test
	void testGetPortafolio() {
	    when(portfolioService.findById(9)).thenReturn(portfolio);
		assertNotNull(portfolioController.getPortafolio(9));
	}

	@Test
	void testUpdatePortfolio() {
		when(portfolioService.updatePortfolio(portfolio)).thenReturn(portfolio);
		assertNotNull(portfolioController.getPortafolio(9));
	}

}
