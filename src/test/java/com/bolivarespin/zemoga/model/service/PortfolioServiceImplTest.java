package com.bolivarespin.zemoga.model.service;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import com.bolivarespin.zemoga.model.dao.PortfolioDao;
import com.bolivarespin.zemoga.model.entity.Portfolio;

class PortfolioServiceImplTest {
	
	private PortfolioDao portfolioDao = Mockito.mock(PortfolioDao.class);
	
	@InjectMocks
	private PortfolioServiceImpl portfolioService;
	
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
	void testFindById() {
		Optional<Portfolio> returnValue = Optional.of((Portfolio) portfolio);
		Mockito.when(portfolioDao.findById(9)).thenReturn(returnValue);
		Portfolio portfolioTest = portfolioService.findById(9);
		assertEquals("test experience summary", portfolioTest.getExperience_summary());
		assertNotNull(portfolioService.findById(9));
	}

	@Test
	void testUpdatePortfolio() {
		Mockito.when(portfolioDao.save(portfolio)).thenReturn(portfolio);
		Portfolio portfolioTest = portfolioService.updatePortfolio(portfolio);
		assertEquals("Edgar Bolivar", portfolioTest.getNames());
		assertNotNull(portfolioService.updatePortfolio(portfolio));
	}

}
