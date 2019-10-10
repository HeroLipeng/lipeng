package com.lipeng.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lipeng.dao.GoodsMapper;
import com.lipeng.domain.Goods;
import com.lipeng.domain.Kinds;
import com.lipeng.domain.Types;

/**
 * @作者：李鹏
 *@date
 */
@Service
public class GoodsServiceImpl implements GoodsService {
	@Autowired
	private GoodsMapper mapper;
	
	@Override
	public List<Goods> getGoodsList(String gname) {
		// TODO Auto-generated method stub
		return mapper.getGoodsList(gname);
	}

	/*
	 * @Override public boolean delGoods(String gid) { // TODO Auto-generated method
	 * stub return mapper.delGoods(gid); }
	 */
	@Override
	public boolean addGoods(Goods goods) {
		// TODO Auto-generated method stub
		return mapper.addGoods(goods);
	}
	@Override
	public Goods getGoodsById(Integer gid) {
		// TODO Auto-generated method stub
		return mapper.getGoodsById(gid);
	}
	@Override
	public boolean updateGoods(Goods goods) {
		// TODO Auto-generated method stub
		return mapper.updateGoods(goods);
	}

	@Override
	public List<Types> types() {
		// TODO Auto-generated method stub
		return mapper.types();
	}

	@Override
	public List<Kinds> kinds() {
		// TODO Auto-generated method stub
		return mapper.kinds();
	}

	

	

}
