/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.71
 * Generated at: 2023-02-14 16:32:25 UTC
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\" />\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\r\n");
      out.write("    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\r\n");
      out.write("    <link\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("      href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\"\r\n");
      out.write("      integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\"\r\n");
      out.write("      crossorigin=\"anonymous\"\r\n");
      out.write("    />\r\n");
      out.write("    <script\r\n");
      out.write("      src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"\r\n");
      out.write("      integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\"\r\n");
      out.write("      crossorigin=\"anonymous\"\r\n");
      out.write("    ></script>\r\n");
      out.write("    <script\r\n");
      out.write("      src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\"\r\n");
      out.write("      integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\"\r\n");
      out.write("      crossorigin=\"anonymous\"\r\n");
      out.write("    ></script>\r\n");
      out.write("    <script\r\n");
      out.write("      src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\"\r\n");
      out.write("      integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\"\r\n");
      out.write("      crossorigin=\"anonymous\"\r\n");
      out.write("    ></script>\r\n");
      out.write("\r\n");
      out.write("    <title>MSTANG</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Google font -->\r\n");
      out.write("    <link\r\n");
      out.write("      href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700\"\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("    />\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap -->\r\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"css/bootstrap.min.css\" />\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom stlylesheet -->\r\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"./css/landingpage.css\" />\r\n");
      out.write("\r\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("    <style>\r\n");
      out.write("      .nav-style {\r\n");
      out.write("        font-size: 15px;\r\n");
      out.write("        font-weight: 600;\r\n");
      out.write("        margin-right: 31px;\r\n");
      out.write("        background-color: rgba(47, 103, 177, 0.6);\r\n");
      out.write("        color: white;\r\n");
      out.write("        padding: 13px 8px;\r\n");
      out.write("        border-radius: 5px;\r\n");
      out.write("      }\r\n");
      out.write("    </style>\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\r\n");
      out.write("      <a\r\n");
      out.write("        class=\"navbar-brand\"\r\n");
      out.write("        style=\"font-size: 15px; font-weight: 600; margin-right: 10px\"\r\n");
      out.write("        href=\"#\"\r\n");
      out.write("        ><img src=\"./img/LOGO.png\" width=\"150%\" height=\"200%\"\r\n");
      out.write("      /></a>\r\n");
      out.write("      <button\r\n");
      out.write("        class=\"navbar-toggler\"\r\n");
      out.write("        type=\"button\"\r\n");
      out.write("        data-toggle=\"collapse\"\r\n");
      out.write("        data-target=\"#navbarNavAltMarkup\"\r\n");
      out.write("        aria-controls=\"navbarNavAltMarkup\"\r\n");
      out.write("        aria-expanded=\"false\"\r\n");
      out.write("        aria-label=\"Toggle navigation\"\r\n");
      out.write("      >\r\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("      </button>\r\n");
      out.write("      <div\r\n");
      out.write("        class=\"collapse navbar-collapse\"\r\n");
      out.write("        id=\"navbarNavAltMarkup\"\r\n");
      out.write("        style=\"margin-left: 700px\"\r\n");
      out.write("      >\r\n");
      out.write("        <div class=\"navbar-nav\">\r\n");
      out.write("          <a class=\"nav-item nav-link nav-style\" href=\"./viewticket.jsp\"\r\n");
      out.write("            >View Your Ticket</a\r\n");
      out.write("          >\r\n");
      out.write("\r\n");
      out.write("          <a class=\"nav-item nav-link nav-style\" href=\"#\">Contact Us</a>\r\n");
      out.write("          <a class=\"nav-item nav-link nav-style\" href=\"#\">Sign In/Sign Up</a>\r\n");
      out.write("          <a class=\"nav-item nav-link nav-style\" href=\"#\">Admin Login</a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <div id=\"booking\" class=\"section\">\r\n");
      out.write("      <div class=\"section-center\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("          <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-7 col-md-push-5\">\r\n");
      out.write("              <div class=\"booking-cta\">\r\n");
      out.write("                <h1>Make your reservation</h1>\r\n");
      out.write("                <p>\r\n");
      out.write("                  Welcome to our bus ticket reservation system! We're here to\r\n");
      out.write("                  make your travel experience as smooth and enjoyable as\r\n");
      out.write("                  possible\r\n");
      out.write("                </p>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-4 col-md-pull-7\">\r\n");
      out.write("                <form action=\"register\" method=\"post\">\r\n");
      out.write("              <div class=\"booking-form\">\r\n");
      out.write("              \r\n");
      out.write("                  <div class=\"form-group\">\r\n");
      out.write("                    <span class=\"form-label\">SOURCE</span>\r\n");
      out.write("                    <input\r\n");
      out.write("                      class=\"form-control\"\r\n");
      out.write("                      type=\"text\"\r\n");
      out.write("                      placeholder=\"Enter a source \" name=\"source\" \r\n");
      out.write("                    />\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"form-group\">\r\n");
      out.write("                    <span class=\"form-label\">DESTINATION</span>\r\n");
      out.write("                    <input\r\n");
      out.write("                      class=\"form-control\"\r\n");
      out.write("                      type=\"text\"\r\n");
      out.write("                      placeholder=\"Enter a destination \" name =\"destination\"\r\n");
      out.write("                    />\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-6\">\r\n");
      out.write("                      <div class=\"form-group\">\r\n");
      out.write("                        <span class=\"form-label\">Date-of-Travel</span>\r\n");
      out.write("                        <input class=\"form-control\" type=\"date\" name = \"datee\" required />\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  \r\n");
      out.write("                    <input type=\"submit\">\r\n");
      out.write("              </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
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
