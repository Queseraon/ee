<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>번호</th>
			<th>이름</th>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>소개</th>
		</tr>
		<tbody id="tBody"></tbody>
	</table>
	<script>
		function getList(){
			const xhr = new XMLHttpRequest();
			xhr.open('GET','/test-info/list');
			xhr.onreadystatechange = function(){
				if(xhr.readyState === 4){
					if(xhr.status === 200){
						const list = JSON.parse(xhr.responseText);
						let html = '';
						for(const map of list){
							html += '<tr>';
							html += '<td>'+map.tiNum+'</td>';
							html += '<td>'+map.tiName+'</td>';
							html += '<td>'+map.tiId+'</td>';
							html += '<td>'+map.tiPwd+'</td>';
							html += '<td>'+map.tiDesc+'</td>';
							html += '</tr>';
						}
						document.querySelector('#tBody').innerHTML = html;
					}
				}
			}
			xhr.send();
		}
		window.addEventListener('load',getList);
	</script>
</body>
</html>