package com.gura.spring.cafe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.gura.spring.cafe.dao.CafeDao;
import com.gura.spring.cafe.dto.CafeDto;

@Component
public class CafeServiceImpl implements CafeService {

	@Autowired
	private CafeDao cafeDao;

	@Override
	public void insert(CafeDto dto) {
		cafeDao.insert(dto);
	}

	@Override
	public void update(CafeDto dto) {
		cafeDao.update(dto);
	}

	@Override
	public void delete(int num) {
		cafeDao.delete(num);
	}

	@Override
	public ModelAndView getData(int num) {
		// 1. 글정보를 얻어온다.
		CafeDto dto = cafeDao.getDate(num);
		// 2. 조회수를 올린다.
		cafeDao.increaseViewCount(num);
		// 3. 글정보를 ModelAndView 객체에 담는다.
		ModelAndView mView = new ModelAndView();
		mView.addObject("dto", dto);
		// 리턴해준다.
		return mView;
	}

	@Override
	public ModelAndView getList() {
		// Dao 객체를 이용해서 글목록을 얻어온다.
		List<CafeDto> list = cafeDao.getList();
		// ModelAndView 객체를 생성해서 글목록을 담는다.
		ModelAndView mView = new ModelAndView();
		mView.addObject("lits", list);
		// 리턴
		return mView;
	}

	@Override
	public ModelAndView updateForm(int num) {
		//수정할 글정보를 얻어온다. 
		CafeDto dto=cafeDao.getDate(num);
		//수정할 글정보를 ModelAndView 객체에 담고 
		ModelAndView mView=new ModelAndView();
		mView.addObject("dto", dto);
		//리턴해준다. 
		return mView;
	}

}
