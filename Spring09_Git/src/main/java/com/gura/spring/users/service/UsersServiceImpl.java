package com.gura.spring.users.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.gura.spring.users.dao.UsersDao;
import com.gura.spring.users.dto.UsersDto;

@Component
public class UsersServiceImpl implements UsersService{

	@Autowired
	private UsersDao usersDao;
	
	@Override
	public void insert(UsersDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ModelAndView isValid(UsersDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(UsersDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<String, Object> canUseId(String id) {
		boolean canUse = usersDao.canUseId(id);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("canUse", canUse);
		return map;
	}

}
