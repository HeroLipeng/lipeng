package com.lipeng.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lipeng.domain.Goods;
import com.lipeng.service.GoodsService;

/**
 * @作者：李鹏
 *@date
 */
@Controller
public class GoodsController {
	@Autowired
	private GoodsService service;
	
	@RequestMapping("list")
	public String list(Model m,@RequestParam(defaultValue = "1")int pageNum,String gname) {
		PageHelper.startPage(pageNum, 3);
		List<Goods> list = service.getGoodsList(gname);
		PageInfo info=new PageInfo(list);
		m.addAttribute("list", list);
		m.addAttribute("info", info);
		m.addAttribute("gname", gname);
		return "list";
	}
	
	//添加
	@ResponseBody
	@RequestMapping("add")
	public Object add(Goods goods) {
		boolean b = service.addGoods(goods);
		return b;
	}
	
	//根据id查找一条数据
	@ResponseBody
	@RequestMapping("toUpdate")
	public Object toUpdate(Integer gid) {
		Goods goods = service.getGoodsById(gid);
		return goods;
		
	}
	
	//修改
	@ResponseBody
	@RequestMapping("update")
	public Object update(Goods goods) {
		boolean b = service.updateGoods(goods);
		return b;
	}
	
	
	
}
