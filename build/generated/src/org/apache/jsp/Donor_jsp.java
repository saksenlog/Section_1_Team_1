package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Donor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("       <title>New user Registration page</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <!--<link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">-->\n");
      out.write("        <link href=\"bootstrap/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Welcome to Donor Login page</h1>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("          <nav class=\"navbar navbar-inverse\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("        <a class=\"navbar-brand\" href=\"#\">Organdonationlive</a> \n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("       <div>\n");
      out.write("        <ul class=\"nav navbar-nav\">\n");
      out.write("          <li><a href=\"home.jsp\">Home</a></li>\n");
      out.write("          <li class =\"active\"><a href=\"Donor.jsp\">Donor</a></li>\n");
      out.write("          <li><a href=\"#\">Hospital</a></li>\n");
      out.write("          <li><a href=\"#\">Custodian</a></li>\n");
      out.write("          <li><a href=\"#\">Contact</a></li>        \n");
      out.write("          <li><a href=\"#\">FAQ</a></li>\n");
      out.write("          <li><a href=\"Register.jsp\">NewUser Registraion</a></li>\n");
      out.write("        </ul>\n");
      out.write("       </div>     \n");
      out.write("      </nav>\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("  <h2>Donor Login Form</h2>\n");
      out.write("  <p>Please enter the user name and password to validate the credentials</p>\n");
      out.write("  <form class=\"form-inline\" action=\"DonorLoginServlet\" role=\"form\" method=\"post\">\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"UserName\">User Name:</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" name=\"UserName\" id=\"UserName\" placeholder=\"Enter UserName\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"pwd\">Password:</label>\n");
      out.write("      <input type=\"password\" class=\"form-control\" name=\"Password\" id=\"pwd\" placeholder=\"Enter password\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"checkbox\">\n");
      out.write("      <label><input type=\"checkbox\"> Remember me</label>\n");
      out.write("    <div class=\"form-group\">        \n");
      out.write("      <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("          <input type=\"submit\" class=\"btn btn-default\" value=\"Login\">\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("     \n");
      out.write("</div>\n");
      out.write("      \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("<!-- <form name=\"Newuser\" action=\"UserRegistrationServlet\" method=\"post\"> \n");
      out.write("            First Name : <input type=\"text\" name=\"FirstName\" value=\"\" size=\"20\" /><br> <br>\n");
      out.write("            Last Name  : <input type=\"text\" name=\"LastName\" value=\"\" size=\"20\" /><br> <br>\n");
      out.write("            Email_Addr : <input type=\"text\" name=\"Email\" value=\"\" size=\"20\" /><br> <br>\n");
      out.write("            User Name  : <input type=\"text\" name=\"UserName\" value=\"\" size=\"20\" /><br> <br>\n");
      out.write("            Password   : <input type=\"password\" name=\"Password\" value=\"\" size=\"20\" /> <br> <br>\n");
      out.write("            Retype Pswd: <input type=\"password\" name=\"Password\" value=\"\" size=\"20\" /> <br> <br>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <input type=\"submit\" class=\"btn btn-default\" name=\"Submit\" />\n");
      out.write("            </div>\n");
      out.write("        </form>  -->\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    ");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
