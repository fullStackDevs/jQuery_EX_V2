<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%	
		String userCountStr = request.getParameter("userCount");
		int userCount = 0;
		if(userCountStr != null){
			userCount = Integer.parseInt(userCountStr);
		}
		
	%>
	<table>
		<tr>
			<th>id</th>
			<th>First name</th>>
			<th>Last name</th>
		</tr>
		<%
			for(int i = 0; i < userCount; i++){
				
		%>		
		
				<tr>
					<td><%=i %></td>
					<td>John</td>
					<td>Doe</td>
				</tr>
				
		<%
			}
		%>
		
		
		
		
	</table>
</body>
</html>