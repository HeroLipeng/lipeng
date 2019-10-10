package com.lipeng.domain;

/**
 * @作者：李鹏
 *@date
 */
public class Goods {
	private Integer gid;
	private String gname;
	private Double price;
	private Integer tid;
	private Integer kid;
	private Types types;
	private Kinds kinds;
	public Goods() {
		// TODO Auto-generated constructor stub
	}
	public Goods(Integer gid, String gname, Double price, Integer tid, Integer kid, Types types, Kinds kinds) {
		this.gid = gid;
		this.gname = gname;
		this.price = price;
		this.tid = tid;
		this.kid = kid;
		this.types = types;
		this.kinds = kinds;
	}
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public Integer getKid() {
		return kid;
	}
	public void setKid(Integer kid) {
		this.kid = kid;
	}
	public Types getTypes() {
		return types;
	}
	public void setTypes(Types types) {
		this.types = types;
	}
	public Kinds getKinds() {
		return kinds;
	}
	public void setKinds(Kinds kinds) {
		this.kinds = kinds;
	}
	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gname=" + gname + ", price=" + price + ", tid=" + tid + ", kid=" + kid
				+ ", types=" + types + ", kinds=" + kinds + "]";
	}
	
	
	
}
