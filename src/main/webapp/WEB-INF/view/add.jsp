<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="mystyles.css">
<script type="text/javascript" src="jquery-3.2.1.js"></script>
<script type="text/javascript">
	function add(){
		var param=$("form").serialize();
		$.ajax({
			type:"post",
			url:"add",
			data:param,
			dataType:"json",
			success:function(obj){
				if(obj>0){
					alert("添加成功");
					location="list";
				}else{
					alert("添加失败");
				}
			}
			
			
		})
	}



</script>
</head>
<body>
<form>
<table>

	<tr>
		<td>商品名称</td>
		<td>
			<input type="text" name="gname">
		</td>
	</tr>
	
	<tr>
		<td>商品价格</td>
		<td>
			<input type="text" name="price">
		</td>
	</tr>
	<tr>
		<td>品牌</td>
		<td>
			<select id="types">
				<option>请选择</option>
			</select>
			
		</td>
	</tr>
	<tr>
		<td>商品类型</td>
		<td>
			<select id="kinds">
				<option>请选择</option>
			</select>
		</td>
	</tr>
	<tr>
		<td></td>
		<td>
			<input type="button" value="添加"  onclick="add()">
		</td>
	</tr>
	
	
	



</table>
</form>
<%-- <f:view>
</f:view> --%>
<script type="text/javascript">
	$.ajax({
		type:"post",
		url:"types",
		dataType:"json",
		success:function(obj){
			alert(obj);
			
			$(obj).each(
				var str=$("<option value="+obj.tid+">"+obj.tname+"</option>");
				$("#types").append(str);
			)
		}
	})

	
	$.ajax({
		type:"post",
		url:"kinds",
		dataType:"json",
		success:function(obj){
			alert(obj);
			
			$(obj).each(
				var str=$("<option value="+obj.kid+">"+obj.kname+"</option>");
				$("#kinds").append(str);
			)
		}
	})



</script>








</body>
</html>