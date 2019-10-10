<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="mystyles.css">
<script type="text/javascript" src="jquery-3.2.1.js"></script>
<script type="text/javascript">
//获取id
function dels(){
	var gid="";
	$("[name='check']:checkbox").each(function(){
		gid+=","+this.value;
	})
	alert(gid);
	gid=gid.substring(1);
	if(window.confirm("请问您确定要删除吗？？")){
		$.ajax({
			type:"post",
			url:"delGoods",
			data:"gid="+gid,
			success:function(obj){
				if(obj>0){
					alert("删除成功");
					location="list";
				}else{
					alert("删除失败");
				}
			}
		})
	}
}


</script>
</head>
<body>
<form action="list" method="post">
	<a href="add.jsp"><input type="button" value="添加"  ></a>
	<table>
		<tr>
			<td>请选择</td>
			<td>商品编号</td>
			<td>商品名称</td>
			<td>商品价格</td>
			<td>所属品牌</td>
			<td>商品类型</td>
			<td>修改</td>
		</tr>
		<c:forEach items="${list }" var="a">
			<tr>
				<td><input type="checkbox" name="check" value="${gid }"></td>
				<td>${a.gid }</td>
				<td>${a.gname }</td>
				<td>${a.price }</td>
				<td>${a.tid }</td>
				<td>${a.types.tname }</td>
				<td>${a.kinds.kname }</td>
				<a href="update.jsp?gid=${a.gid }"><input type="button" value="修改"></a>
			</tr>
		
		
		
		</c:forEach>
		<tr>
			<td colspan="11">
				<input type="button" value="批量删除" onclick="dels()">

				当前是${info.pageNum}页，共${info.pages}页
				共${info.total}条数据
				<a href="list?pageNum=1">首页</a>
				<a href="list?pageNum=${info.prePage }">上一页</a>
				<a href="list?pageNum=${info.nextPage }">下一页</a>
				<a href="list?pageNum=${info.pages }">尾页</a>
			</td>
		</tr>
	</table>




</form>

</body>
</html>