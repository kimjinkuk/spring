package com.gura.spring.cafe.dao;

import java.util.List;

import com.gura.spring.cafe.dto.CafeDto;

public interface CafeDao {
	public void increaseViewCount(int num);
	public void insert(CafeDto dto);
	public void update(CafeDto dto);
	public void delete(int num);
	public CafeDto getDate(int num);
	public List<CafeDto> getList();

}
