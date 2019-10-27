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
	<section class="container">
		<form method="get" action="./index.jsp" class="form-inline mt-2">
			<select name="lectureDivide"  class="form-control mx-1 mt-2">
				<option value="��ü">��ü</option>
				<option value="���">���</option>
				<option value="�̹���">�̹���</option>
				<option value="����">����</option>
			</select>
			<input type="text" name="search" class="form-control mx-1 mt-2" placeholder="������ �Է��ϼ���">
			
			<button type="submit" class="btn btn-primary mx-1 mt-2">�˻�</button>
			<a class="btn btn-primary mx-1 mt-2" data-toggle="modal" href="#registerModal">����ϱ�</a>
			<a class="btn btn-danger mx-1 mt-2" data-toggle="modal" href="#reportModal">�Ű�</a>
		</form>
			<div class="card bg-light mt-3">
			<div class="card-header bg-light">
				<div class="row">
					<div class="col-8 text-left"> ��ǻ�Ͱ���&nbsp;<small>��â��</small></div>
					<div class="col-4 text-right">
						����<span style="color:red;">a</span>
					</div>
				</div>
			</div>
			<div class="card-body">
				<h5 class="card-title">
					���� ���ƿ�.&nbsp;<small>����� �����ΰ���</small>
				</h5>
				<p class="card-text"> ���� �γ��ؿ�</p>
				<div class = "row">
					<div class="col-9 text-left">
						���� <span style="color : red;">A</span>
						����1 <span style="color : red;">A1</span>
						����22 <span style="color : red;">A2</span>
						<span style="color:green;"> (��õ : 15)</span>
					</div>
					<div class="col-3 text-right">
						<a onclick="return confirm('��õ�Ͻðٽ��ϱ�?')" href=./likeAction.jsp?changhoonID=">��õ</a>
						<a onclick="return confirm('�����Ͻðٽ��ϱ�?')" href=./deleteAction.jsp?changhoonID=">����</a>
																
					</div>
				</div>
			</div>
		</div>
		<div class="card bg-light mt-3">
			<div class="card-header bg-light">
				<div class="row">
					<div class="col-8 text-left"> �濵�а���&nbsp;<small>��â��</small></div>
					<div class="col-4 text-right">
						����<span style="color:red;">a</span>
					</div>
				</div>
			</div>
			<div class="card-body">
				<h5 class="card-title">
					���� ���ƿ�.&nbsp;<small>����� �����ΰ���</small>
				</h5>
				<p class="card-text"> ���� �γ��ؿ�</p>
				<div class = "row">
					<div class="col-9 text-left">
						���� <span style="color : red;">A</span>
						����1 <span style="color : red;">A1</span>
						����22 <span style="color : red;">A2</span>
						<span style="color:green;"> (��õ : 15)</span>
					</div>
					<div class="col-3 text-right">
						<a onclick="return confirm('��õ�Ͻðٽ��ϱ�?')" href=./likeAction.jsp?changhoonID=">��õ</a>
						<a onclick="return confirm('�����Ͻðٽ��ϱ�?')" href=./deleteAction.jsp?changhoonID=">����</a>
																
					</div>
				</div>
			</div>
		</div>
		</section>
	
		<div class="modal fade" id="registerModal" tabindex="-1" role="dialog" aria-labelledby="model" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<h5 class="modal-title" id="modal"> ���</h5>
						<button type="button" class="close" data-dismiss="modal" aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>					
					</div>
					<div class="modal-body">
						<form action="./changhoonregister.jsp" method="post">
							<div class="form-row">
								<div class="form-group col-sm-6">
									<label> ���� </label>
								<input type="text" name="lectureName" class="form-control" maxlength="20">
								</div>
								<div class="form-group col-sm-6">
									<label> �̸� </label>
									<input type="text" name="Name" class="form-control" maxlength="20">
								</div>
							</div>
							<div class="form-row">
								<div class="form-group col-sm-4">
									<label>���濬��</label>
									<select name="lectureYear" class="form-control">										
										<option value="2011">2008</option>
										<option value="2011">2009</option>
										<option value="2011">2010</option>
										<option value="2011">2011</option>
										<option value="2011">2012</option>
										<option value="2011">2013</option>
										<option value="2011">2014</option>
										<option value="2011">2015</option>
										<option value="2011">2016</option>
										<option value="2017">2017</option>
										<option value="2018">2018</option>
										<option value="2019 selected">2019</option>
									</select>
								</div>
								<div class="form-group col-sm-4">
									<label>�����б�</label>
									<select name="semesterDivide" class="form-control">
										<option value="2011">2008</option>
										<option value="2011">2009</option>
										<option value="2011">2010</option>
										
									</select>
								</div>
								<div class="form-group col-sm-4">
									<label>�����б�</label>
									<select name="semesterDivide" class="form-control">
										<option value="2011">2008</option>
										<option value="2011">2009</option>
										<option value="2011">2010</option>										
									</select>
								</div>
							</div>
							<div class="form-group">
								<label>����</label>
								<input type="text" name="Time" class="form-control" maxlength="30">
							</div>
							<div class="form-group">
								<label>����</label>
								<textarea name="Context" class=form-control maxlength="2048" style="height: 180px;"></textarea>
							</div>
							<div class="form-row">
								<div class="form-group col-sm-3">
									<label>����</label>
									<select name="score" class="form-control">
										<option value="A">A</option>
										<option value="b">b</option>
										<option value="c">c</option>
										<option value="d">d</option>																										
									</select>								
								</div>
								<div class="form-group col-sm-3">
									<label>�γ�</label>
									<select name="ssss" class="form-control">
										<option value="A">A</option>
										<option value="b">A</option>
										<option value="c">A</option>
										<option value="d">A</option>																										
									</select>								
								</div>
								<div class="form-group col-sm-3">
									<label>����</label>
									<select name="aaa" class="form-control">
										<option value="A">A</option>
										<option value="b">A</option>
										<option value="c">A</option>
										<option value="d">A</option>																										
									</select>															
								</div>
							</div>
							<div class ="modal-footer">
								<button type="button" class="btn btn-secondary" data-dismiss="modal"> ���</button>
								<button type="submit" class="btn btn-primary">���</button>
							</div>
						</form>			
					</div>
				</div>
			</div>
		</div>
	<div class="modal fade" id="reportModal" tabindex="-1" role="dialog" aria-labelledby="model" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<h5 class="modal-title" id="modal"> �Ű�</h5>
						<button type="button" class="close" data-dismiss="modal" aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>					
					</div>
					<div class="modal-body">
						<form action="./changhoonreport.jsp" method="post">							
							<div class="form-group">
								<label>�Ű�����</label>
								<input type="text" name="Time" class="form-control" maxlength="30">
							</div>
							<div class="form-group">
								<label>�Ű� ����</label>
								<textarea name="Context" class=form-control maxlength="2048" style="height: 180px;"></textarea>
							</div>						
							<div class ="modal-footer">
								<button type="button" class="btn btn-secondary" data-dismiss="modal"> ���</button>
								<button type="submit" class="btn btn-danger">���</button>
							</div>
						</form>			
					</div>
				</div>
			</div>
		</div>
		
	<footer class ="bg-dark mt-4 p-5 text-center" style="color: #FFFFFF;">
		Copyright &copy; 2019 ��â�� All Rights Reserved.
	</footer>

	<!-- �ڹ��߰� -->
	<script src="./js/jquery.min.js"></script>
	<script src="./js/popper.js"></script>
	<script src="./js/bootstrap.min.js"></script>
</body>
</html>