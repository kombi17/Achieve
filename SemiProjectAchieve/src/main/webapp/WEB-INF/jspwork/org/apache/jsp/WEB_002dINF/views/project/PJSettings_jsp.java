/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.62
 * Generated at: 2022-06-15 09:40:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.project;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PJSettings_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1652789277576L));
    _jspx_dependants.put("jar:file:/C:/workspace/SemiProject_Achieve/SemiProjectAchieve/src/main/webapp/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
  }

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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>project-settings</title>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../resources/css/project-settings.css\">\r\n");
      out.write("\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/FAQ.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <main>  \r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/common/header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/common/sideMenu.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"body\">\r\n");
      out.write("            \r\n");
      out.write("                <div class=\"setting-main\">\r\n");
      out.write("\r\n");
      out.write("                    <div name=\"setting-header\" id=\"infor-first\">\r\n");
      out.write("                        프로젝트 설정 \r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                        <div name=\"setting-body\" class=\"setting-body\">\r\n");
      out.write("                            참여자 관리 (차단, 탈퇴) <button id=\"member-control\"\r\n");
      out.write("                            location.href=\"../member/dropMember-list.jsp\">변경</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                        <div name=\"setting-body\" class=\"setting-body\">\r\n");
      out.write("                            프로젝트 공개\r\n");
      out.write("                        \r\n");
      out.write("                            <select name=\"project-public\" id=\"project-public\" onchange=\"showValue(this)\">\r\n");
      out.write("                                <option value=\"Y\">공개</option>\r\n");
      out.write("                                <option value=\"P\">클래스명 공개</option>\r\n");
      out.write("                                <option value=\"N\">비공개</option>\r\n");
      out.write("\r\n");
      out.write("                            </select>\r\n");
      out.write("                                \r\n");
      out.write("                        </div>\r\n");
      out.write("                    \r\n");
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                        <div name=\"setting-body\" class=\"setting-body\">\r\n");
      out.write("                                \r\n");
      out.write("\r\n");
      out.write("                            클래스 이름 변경 <button id=\"nameChangeBtn\">변경</button>\r\n");
      out.write("                            <input type=\"text\" id=\"PJNameChange\" name=\"PJNameChange\"\r\n");
      out.write("                             maxlength=\"20\" autocomplete=\"off\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    \r\n");
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                        <div name=\"setting-body\" class=\"setting-body\">\r\n");
      out.write("                            과제 관리 <button id=\"homework-control\">변경</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    \r\n");
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                        <div name=\"setting-body\" class=\"setting-body\">\r\n");
      out.write("                            전체 쪽지 발송 <button id=\"text-all\">발송</button>\r\n");
      out.write("                            \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <textarea placeholder=\"전체 쪽지는 여기에 작성하세요.\" id=\"sendAll-text\"></textarea>\r\n");
      out.write("                    \r\n");
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                        <div name=\"setting-body\" class=\"setting-body\">\r\n");
      out.write("                            소개 수정 <button id=\"IntroEditBtn\">수정</button>\r\n");
      out.write("                            \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <textarea placeholder=\"바꿀 소개를 작성하세요.\" id=\"projectIntro\">개발2팀입니당</textarea>\r\n");
      out.write("\r\n");
      out.write("                        <div name=\"setting-body\" class=\"setting-body\">\r\n");
      out.write("                            공지 작성 <button id=\"write-notice\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/board/write?mode=insert&type=2&projectNo=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.projectNo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("&cp=1\">작성</a></button>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("           \r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("    </main>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/common/footer.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/PJSettings.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.6.0.min.js\" integrity=\"sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
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
