package com.gura.spring.cafe.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;

import com.gura.spring.cafe.dto.CafeDto;

public interface CafeService {
	public void insert(CafeDto dto);
	public void update(CafeDto dto);
	public void delete(int num);
	public ModelAndView getData(int num);
	public ModelAndView getList();
}
