package com.lipeng.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lipeng.domain.Goods;
import com.lipeng.domain.Kinds;
import com.lipeng.domain.Types;

/**
 * @作者：李鹏
 *@date
 */
public interface GoodsService {
	public List<Goods> getGoodsList(String gname);
		//添加
		public boolean addGoods(Goods goods);
		//查询单条数据
		public Goods getGoodsById(Integer gid);
		//修改
		public boolean updateGoods(Goods goods);
		//查询品牌标
		public List<Types> types();
		//查询类型表
		public List<Kinds> kinds();
	
}
