/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.45
 * Generated at: 2019-10-17 10:45:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width. initial=scale=1, shrick-to-fit=no\">\r\n");
      out.write("\t<title>창훈이커뮤니티</title>\r\n");
      out.write("\t<!-- Css 추가 -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"./css/bootstrap.min.css\">\r\n");
      out.write("\t<link rel=\"styleshhet\" href=\"./css/custom.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\r\n");
      out.write("\t\t<a class=\"navbar-brand\" href=\"index.jsp\"> 창훈커뮤니티</a>\r\n");
      out.write("\t\t<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbor\">\\\r\n");
      out.write("\t\t\t<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\t\t<div id=\"navbar\" class=\"collapse navbar-collapse\">\r\n");
      out.write("\t\t\t<ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("\t\t\t\t<li class=\"nav-item active\">\r\n");
      out.write("\t\t\t\t\t<a class=\"nav-link\" href=\"index.jsp\">메인으로</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\">\r\n");
      out.write("\t\t\t\t\t<a class=\"nav-link dropdown-toggle\" id=\"dropdown\" data-toggle=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t회원관리\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"userlogin.jsp\">로그인</a>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"userjoin.jsp\">회원가입</a>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"userlogout.jsp\">로그아웃</a>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<form class=\"from-inline my-2 my-lg-0\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<input class = \"from-control mr-sm-2\" type=\"search\" placeholder=\"내용을 입력하세요\" aria-label=\"Serach\">\r\n");
      out.write("\t\t\t\t<button class= \"btn btn-outline-success my-3 my-sm-0\" type=\"submit\">검색</button>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\t<section class=\"container\">\r\n");
      out.write("\t\t<form method=\"get\" action=\"./index.jsp\" class=\"form-inline mt-2\">\r\n");
      out.write("\t\t\t<select name=\"lectureDivide\"  class=\"form-control mx-1 mt-2\">\r\n");
      out.write("\t\t\t\t<option value=\"전체\">전체</option>\r\n");
      out.write("\t\t\t\t<option value=\"잡담\">잡담</option>\r\n");
      out.write("\t\t\t\t<option value=\"이미지\">이미지</option>\r\n");
      out.write("\t\t\t\t<option value=\"정보\">정보</option>\r\n");
      out.write("\t\t\t</select>\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"search\" class=\"form-control mx-1 mt-2\" placeholder=\"내용을 입력하세요\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<button type=\"submit\" class=\"btn btn-primary mx-1 mt-2\">검색</button>\r\n");
      out.write("\t\t\t<a class=\"btn btn-primary mx-1 mt-2\" data-toggle=\"modal\" href=\"#registerModal\">등록하기</a>\r\n");
      out.write("\t\t\t<a class=\"btn btn-danger mx-1 mt-2\" data-toggle=\"modal\" href=\"#reportModal\">신고</a>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t\t<div class=\"card bg-light mt-3\">\r\n");
      out.write("\t\t\t<div class=\"card-header bg-light\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-8 text-left\"> 컴퓨터개론&nbsp;<small>이창훈</small></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-4 text-right\">\r\n");
      out.write("\t\t\t\t\t\t총합<span style=\"color:red;\">a</span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"card-body\">\r\n");
      out.write("\t\t\t\t<h5 class=\"card-title\">\r\n");
      out.write("\t\t\t\t\t정말 좋아요.&nbsp;<small>여기는 내용인가요</small>\r\n");
      out.write("\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t<p class=\"card-text\"> 강의 널널해요</p>\r\n");
      out.write("\t\t\t\t<div class = \"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-9 text-left\">\r\n");
      out.write("\t\t\t\t\t\t성적 <span style=\"color : red;\">A</span>\r\n");
      out.write("\t\t\t\t\t\t성적1 <span style=\"color : red;\">A1</span>\r\n");
      out.write("\t\t\t\t\t\t성적22 <span style=\"color : red;\">A2</span>\r\n");
      out.write("\t\t\t\t\t\t<span style=\"color:green;\"> (추천 : 15)</span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-3 text-right\">\r\n");
      out.write("\t\t\t\t\t\t<a onclick=\"return confirm('추천하시겟습니까?')\" href=./likeAction.jsp?changhoonID=\">추천</a>\r\n");
      out.write("\t\t\t\t\t\t<a onclick=\"return confirm('삭제하시겟습니까?')\" href=./deleteAction.jsp?changhoonID=\">삭제</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"card bg-light mt-3\">\r\n");
      out.write("\t\t\t<div class=\"card-header bg-light\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-8 text-left\"> 경영학개론&nbsp;<small>이창훈</small></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-4 text-right\">\r\n");
      out.write("\t\t\t\t\t\t총합<span style=\"color:red;\">a</span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"card-body\">\r\n");
      out.write("\t\t\t\t<h5 class=\"card-title\">\r\n");
      out.write("\t\t\t\t\t정말 좋아요.&nbsp;<small>여기는 내용인가요</small>\r\n");
      out.write("\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t<p class=\"card-text\"> 강의 널널해요</p>\r\n");
      out.write("\t\t\t\t<div class = \"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-9 text-left\">\r\n");
      out.write("\t\t\t\t\t\t성적 <span style=\"color : red;\">A</span>\r\n");
      out.write("\t\t\t\t\t\t성적1 <span style=\"color : red;\">A1</span>\r\n");
      out.write("\t\t\t\t\t\t성적22 <span style=\"color : red;\">A2</span>\r\n");
      out.write("\t\t\t\t\t\t<span style=\"color:green;\"> (추천 : 15)</span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-3 text-right\">\r\n");
      out.write("\t\t\t\t\t\t<a onclick=\"return confirm('추천하시겟습니까?')\" href=./likeAction.jsp?changhoonID=\">추천</a>\r\n");
      out.write("\t\t\t\t\t\t<a onclick=\"return confirm('삭제하시겟습니까?')\" href=./deleteAction.jsp?changhoonID=\">삭제</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<div class=\"modal fade\" id=\"registerModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"model\" aria-hidden=\"true\">\r\n");
      out.write("\t\t\t<div class=\"modal-dialog\">\r\n");
      out.write("\t\t\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t\t<div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t\t\t<h5 class=\"modal-title\" id=\"modal\"> 등록</h5>\r\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("\t\t\t\t\t\t\t<span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("\t\t\t\t\t\t</button>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t\t\t<form action=\"./changhoonregister.jsp\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group col-sm-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label> 제목 </label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"lectureName\" class=\"form-control\" maxlength=\"20\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group col-sm-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label> 이름 </label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"Name\" class=\"form-control\" maxlength=\"20\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group col-sm-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>개방연도</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<select name=\"lectureYear\" class=\"form-control\">\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"2011\">2008</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"2011\">2009</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"2011\">2010</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"2011\">2011</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"2011\">2012</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"2011\">2013</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"2011\">2014</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"2011\">2015</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"2011\">2016</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"2017\">2017</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"2018\">2018</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"2019 selected\">2019</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group col-sm-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>수강학기</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<select name=\"semesterDivide\" class=\"form-control\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"2011\">2008</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"2011\">2009</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"2011\">2010</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group col-sm-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>수강학기</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<select name=\"semesterDivide\" class=\"form-control\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"2011\">2008</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"2011\">2009</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"2011\">2010</option>\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label>제목</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"Time\" class=\"form-control\" maxlength=\"30\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label>내용</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<textarea name=\"Context\" class=form-control maxlength=\"2048\" style=\"height: 180px;\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group col-sm-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>종합</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<select name=\"score\" class=\"form-control\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"A\">A</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"b\">b</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"c\">c</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"d\">d</option>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group col-sm-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>널널</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<select name=\"ssss\" class=\"form-control\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"A\">A</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"b\">A</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"c\">A</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"d\">A</option>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group col-sm-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label>과제</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<select name=\"aaa\" class=\"form-control\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"A\">A</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"b\">A</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"c\">A</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"d\">A</option>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class =\"modal-footer\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\"> 취소</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\">등록</button>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</form>\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t<div class=\"modal fade\" id=\"reportModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"model\" aria-hidden=\"true\">\r\n");
      out.write("\t\t\t<div class=\"modal-dialog\">\r\n");
      out.write("\t\t\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t\t<div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t\t\t<h5 class=\"modal-title\" id=\"modal\"> 신고</h5>\r\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("\t\t\t\t\t\t\t<span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("\t\t\t\t\t\t</button>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t\t\t<form action=\"./changhoonreport.jsp\" method=\"post\">\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label>신고제목</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"Time\" class=\"form-control\" maxlength=\"30\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label>신고 내용</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<textarea name=\"Context\" class=form-control maxlength=\"2048\" style=\"height: 180px;\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class =\"modal-footer\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\"> 취소</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-danger\">등록</button>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</form>\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t<footer class =\"bg-dark mt-4 p-5 text-center\" style=\"color: #FFFFFF;\">\r\n");
      out.write("\t\tCopyright &copy; 2019 이창훈 All Rights Reserved.\r\n");
      out.write("\t</footer>\r\n");
      out.write("\r\n");
      out.write("\t<!-- 자바추가 -->\r\n");
      out.write("\t<script src=\"./js/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"./js/popper.js\"></script>\r\n");
      out.write("\t<script src=\"./js/bootstrap.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
