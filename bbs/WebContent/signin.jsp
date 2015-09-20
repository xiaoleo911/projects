<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	
	<h4 align="center">用户登录！</h4>
	
	<s:form action="login" id="login" name="login" namespace="/" theme="simple">
		<table>
			<tr height="30px">
				<td>
					用户名：
				</td>
				<td>
					<input type="text" name="name"/>
				</td>
			</tr>
			<tr height="30px">
				<td>
					密&nbsp; &nbsp;码：
				</td>
				<td>
					<input type="password" name="password"/>
				</td>
			</tr>
			<tr>
				<td>
					<input type="submit" name="Submit" value="登录"/>
				</td>
			</tr>
		</table>
	</s:form>
	

</body>
</html>