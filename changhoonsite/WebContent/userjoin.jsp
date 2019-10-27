<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width. initial=scale=1, shrick-to-fit=no">
	<title>â����Ŀ�´�Ƽ</title>
	<!-- Css �߰� -->
	<link rel="stylesheet" href="./css/bootstrap.min.css">
	<link rel="styleshhet" href="./css/custom.css">
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="index.jsp"> â��Ŀ�´�Ƽ</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbor">\
			<span class="navbar-toggler-icon"></span>
		</button>
		<div id="navbar" class="collapse navbar-collapse">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active">
					<a class="nav-link" href="index.jsp">��������</a>
				</li>
				<li class="nav-item dropdown">
					<a class="nav-link dropdown-toggle" id="dropdown" data-toggle="dropdown">
						ȸ������
					</a>
					<div class="dropdown-menu" aria-labelledby="dropdown">
						<a class="dropdown-item" href="userlogin.jsp">�α���</a>
						<a class="dropdown-item" href="userjoin.jsp">ȸ������</a>
						<a class="dropdown-item" href="userlogout.jsp">�α׾ƿ�</a>
						
					</div>	
			</ul>
			<form class="from-inline my-2 my-lg-0">
			
				<input class = "from-control mr-sm-2" type="search" placeholder="������ �Է��ϼ���" aria-label="Serach">
				<button class= "btn btn-outline-success my-3 my-sm-0" type="submit">�˻�</button>
			</form>
		</div>
	</nav>
	<section class="container mt-4" style="max-width: 600px;">
		<form method="post" action="./userRegisterAction.jsp">
			<div class="form-group">
				<label>���̵�</label>
				<input type="text" name="userID" class="form-control">				
			</div>
			<div class="form-group">
				<label>��й�ȣ</label>
				<input type="text" name="userPassword" class="form-control">				
			</div>
			<div class="form-group">
				<label>�̸���</label>
				<input type="email" name="userEmail" class="form-control">
			
			</div>
			<button type="submit" class="btn btn-primary"> ȸ������ </button>		
		</form>
				
		</section>
			
	<footer class ="bg-dark mt-4 p-5 text-center" style="color: #FFFFFF;">
		Copyright &copy; 2019 ��â�� All Rights Reserved.
	</footer>

	<!-- �ڹ��߰� -->
	<script src="./js/jquery.min.js"></script>
	<script src="./js/popper.js"></script>
	<script src="./js/bootstrap.min.js"></script>
</body>
</html>