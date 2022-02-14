package com.bolivarespin.zemoga.model.service;

import com.bolivarespin.zemoga.model.entity.Portfolio;

public interface IPortfolioService {
	public Portfolio findById(Integer id);
	public Portfolio updatePortfolio(Portfolio portfolio);
}