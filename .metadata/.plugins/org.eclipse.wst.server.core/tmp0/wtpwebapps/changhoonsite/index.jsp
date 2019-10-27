<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width. initial=scale=1, shrick-to-fit=no">
	<title>창훈이커뮤니티</title>
	<!-- Css 추가 -->
	<link rel="stylesheet" href="./css/bootstrap.min.css">
	<link rel="styleshhet" href="./css/custom.css">
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="index.jsp"> 창훈커뮤니티</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbor">\
			<span class="navbar-toggler-icon"></span>
		</button>
		<div id="navbar" class="collapse navbar-collapse">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active">
					<a class="nav-link" href="index.jsp">메인으로</a>
				</li>
				<li class="nav-item dropdown">
					<a class="nav-link dropdown-toggle" id="dropdown" data-toggle="dropdown">
						회원관리
					</a>
					<div class="dropdown-menu" aria-labelledby="dropdown">
						<a class="dropdown-item" href="userlogin.jsp">로그인</a>
						<a class="dropdown-item" href="userjoin.jsp">회원가입</a>
						<a class="dropdown-item" href="userlogout.jsp">로그아웃</a>
						
					</div>	
			</ul>
			<form class="from-inline my-2 my-lg-0">
			
				<input class = "from-control mr-sm-2" type="search" placeholder="내용을 입력하세요" aria-label="Serach">
				<button class= "btn btn-outline-success my-3 my-sm-0" type="submit">검색</button>
			</form>
		</div>
	</nav>
	<section class="container">
		<form method="get" action="./index.jsp" class="form-inline mt-2">
			<select name="lectureDivide"  class="form-control mx-1 mt-2">
				<option value="전체">전체</option>
				<option value="잡담">잡담</option>
				<option value="이미지">이미지</option>
				<option value="정보">정보</option>
			</select>
			<input type="text" name="search" class="form-control mx-1 mt-2" placeholder="내용을 입력하세요">
			
			<button type="submit" class="btn btn-primary mx-1 mt-2">검색</button>
			<a class="btn btn-primary mx-1 mt-2" data-toggle="modal" href="#registerModal">등록하기</a>
			<a class="btn btn-danger mx-1 mt-2" data-toggle="modal" href="#reportModal">신고</a>
		</form>
			<div class="card bg-light mt-3">
			<div class="card-header bg-light">
				<div class="row">
					<div class="col-8 text-left"> 컴퓨터개론&nbsp;<small>이창훈</small></div>
					<div class="col-4 text-right">
						총합<span style="color:red;">a</span>
					</div>
				</div>
			</div>
			<div class="card-body">
				<h5 class="card-title">
					정말 좋아요.&nbsp;<small>여기는 내용인가요</small>
				</h5>
				<p class="card-text"> 강의 널널해요</p>
				<div class = "row">
					<div class="col-9 text-left">
						성적 <span style="color : red;">A</span>
						성적1 <span style="color : red;">A1</span>
						성적22 <span style="color : red;">A2</span>
						<span style="color:green;"> (추천 : 15)</span>
					</div>
					<div class="col-3 text-right">
						<a onclick="return confirm('추천하시겟습니까?')" href=./likeAction.jsp?changhoonID=">추천</a>
						<a onclick="return confirm('삭제하시겟습니까?')" href=./deleteAction.jsp?changhoonID=">삭제</a>
																
					</div>
				</div>
			</div>
		</div>
		<div class="card bg-light mt-3">
			<div class="card-header bg-light">
				<div class="row">
					<div class="col-8 text-left"> 경영학개론&nbsp;<small>이창훈</small></div>
					<div class="col-4 text-right">
						총합<span style="color:red;">a</span>
					</div>
				</div>
			</div>
			<div class="card-body">
				<h5 class="card-title">
					정말 좋아요.&nbsp;<small>여기는 내용인가요</small>
				</h5>
				<p class="card-text"> 강의 널널해요</p>
				<div class = "row">
					<div class="col-9 text-left">
						성적 <span style="color : red;">A</span>
						성적1 <span style="color : red;">A1</span>
						성적22 <span style="color : red;">A2</span>
						<span style="color:green;"> (추천 : 15)</span>
					</div>
					<div class="col-3 text-right">
						<a onclick="return confirm('추천하시겟습니까?')" href=./likeAction.jsp?changhoonID=">추천</a>
						<a onclick="return confirm('삭제하시겟습니까?')" href=./deleteAction.jsp?changhoonID=">삭제</a>
																
					</div>
				</div>
			</div>
		</div>
		</section>
	
		<div class="modal fade" id="registerModal" tabindex="-1" role="dialog" aria-labelledby="model" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<h5 class="modal-title" id="modal"> 등록</h5>
						<button type="button" class="close" data-dismiss="modal" aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>					
					</div>
					<div class="modal-body">
						<form action="./changhoonregister.jsp" method="post">
							<div class="form-row">
								<div class="form-group col-sm-6">
									<label> 제목 </label>
								<input type="text" name="lectureName" class="form-control" maxlength="20">
								</div>
								<div class="form-group col-sm-6">
									<label> 이름 </label>
									<input type="text" name="Name" class="form-control" maxlength="20">
								</div>
							</div>
							<div class="form-row">
								<div class="form-group col-sm-4">
									<label>개방연도</label>
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
									<label>수강학기</label>
									<select name="semesterDivide" class="form-control">
										<option value="2011">2008</option>
										<option value="2011">2009</option>
										<option value="2011">2010</option>
										
									</select>
								</div>
								<div class="form-group col-sm-4">
									<label>수강학기</label>
									<select name="semesterDivide" class="form-control">
										<option value="2011">2008</option>
										<option value="2011">2009</option>
										<option value="2011">2010</option>										
									</select>
								</div>
							</div>
							<div class="form-group">
								<label>제목</label>
								<input type="text" name="Time" class="form-control" maxlength="30">
							</div>
							<div class="form-group">
								<label>내용</label>
								<textarea name="Context" class=form-control maxlength="2048" style="height: 180px;"></textarea>
							</div>
							<div class="form-row">
								<div class="form-group col-sm-3">
									<label>종합</label>
									<select name="score" class="form-control">
										<option value="A">A</option>
										<option value="b">b</option>
										<option value="c">c</option>
										<option value="d">d</option>																										
									</select>								
								</div>
								<div class="form-group col-sm-3">
									<label>널널</label>
									<select name="ssss" class="form-control">
										<option value="A">A</option>
										<option value="b">A</option>
										<option value="c">A</option>
										<option value="d">A</option>																										
									</select>								
								</div>
								<div class="form-group col-sm-3">
									<label>과제</label>
									<select name="aaa" class="form-control">
										<option value="A">A</option>
										<option value="b">A</option>
										<option value="c">A</option>
										<option value="d">A</option>																										
									</select>															
								</div>
							</div>
							<div class ="modal-footer">
								<button type="button" class="btn btn-secondary" data-dismiss="modal"> 취소</button>
								<button type="submit" class="btn btn-primary">등록</button>
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
						<h5 class="modal-title" id="modal"> 신고</h5>
						<button type="button" class="close" data-dismiss="modal" aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>					
					</div>
					<div class="modal-body">
						<form action="./changhoonreport.jsp" method="post">							
							<div class="form-group">
								<label>신고제목</label>
								<input type="text" name="Time" class="form-control" maxlength="30">
							</div>
							<div class="form-group">
								<label>신고 내용</label>
								<textarea name="Context" class=form-control maxlength="2048" style="height: 180px;"></textarea>
							</div>						
							<div class ="modal-footer">
								<button type="button" class="btn btn-secondary" data-dismiss="modal"> 취소</button>
								<button type="submit" class="btn btn-danger">등록</button>
							</div>
						</form>			
					</div>
				</div>
			</div>
		</div>
		
	<footer class ="bg-dark mt-4 p-5 text-center" style="color: #FFFFFF;">
		Copyright &copy; 2019 이창훈 All Rights Reserved.
	</footer>

	<!-- 자바추가 -->
	<script src="./js/jquery.min.js"></script>
	<script src="./js/popper.js"></script>
	<script src="./js/bootstrap.min.js"></script>
</body>
</html>