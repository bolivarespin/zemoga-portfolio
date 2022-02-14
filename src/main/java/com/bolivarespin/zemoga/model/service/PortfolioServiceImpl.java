package com.bolivarespin.zemoga.model.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolivarespin.zemoga.model.dao.PortfolioDao;
import com.bolivarespin.zemoga.model.entity.Portfolio;

@Service
public class PortfolioServiceImpl implements IPortfolioService{

	@Autowired
	private PortfolioDao portfolioDao;

	@Override
	@Transactional(readOnly = true)
	public Portfolio findById(Integer id) {
		Optional<Portfolio> optional = portfolioDao.findById(id);
		if (optional.isPresent())
			return optional.get();
		return null;
	}

	@Override
	public Portfolio updatePortfolio(Portfolio portfolio) {
		portfolioDao.save(portfolio);
		return portfolio;
	}
	
}
