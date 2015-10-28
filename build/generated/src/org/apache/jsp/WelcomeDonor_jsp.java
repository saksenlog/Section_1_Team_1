package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class WelcomeDonor_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Donor page</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link href=\"bootstrap/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Welcome to Donor Room</h1>\n");
      out.write("        Welcome ");
      out.print(session.getAttribute("userName"));
      out.write("\n");
      out.write("<a href='logout.jsp'>Log out</a>\n");
      out.write("        \n");
      out.write("        <nav class=\"navbar navbar-inverse\">\n");
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
      out.write("         \n");
      out.write("        </ul>\n");
      out.write("       </div>     \n");
      out.write("      </nav>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("            <div class=\"container\">\n");
      out.write("                <form action=\"DonorDeclaration.jsp\" method=\"get\"> \n");
      out.write("        <div class=\"form-group\">        \n");
      out.write("            <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("          <input type=\"submit\" class=\"btn btn-default\" value=\"Donor Declaration  \"> <br>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("                    <br>\n");
      out.write("                    <br><br>\n");
      out.write("                <form action=\"\" method=\"get\"> \n");
      out.write("        <div class=\"form-group\">        \n");
      out.write("              <div class=\"col-sm-offset-2 col-sm-10\"> \n");
      out.write("          <input type=\"submit\" class=\"btn btn-default\" value=\"View/Edit Custodian\">\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
