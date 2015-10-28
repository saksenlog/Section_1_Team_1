package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class DonorDeclaration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Donor Declaration Page</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link href=\"bootstrap/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Donor Declaration Page</h1>\n");
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
      out.write("          <li><a href=\"Donor.jsp\">Donor</a></li>\n");
      out.write("          <li><a href=\"#\">Hospital</a></li>\n");
      out.write("          <li><a href=\"#\">Custodian</a></li>\n");
      out.write("          <li><a href=\"#\">Contact</a></li>        \n");
      out.write("          <li><a href=\"#\">FAQ</a></li>\n");
      out.write("          \n");
      out.write("        </ul>\n");
      out.write("       </div>     \n");
      out.write("      </nav>\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("  <h2>Please fill the below declaration Form!</h2>\n");
      out.write("  <form class=\"form-horizontal\" role=\"form\" action=\"DonorDeclarationServlet\" method=\"post\">\n");
      out.write("      \n");
      out.write("    <div class=\"container\">\n");
      out.write("  <h2>In the Case that organ/tissue donation for transplantation is possible after my death</h2>\n");
      out.write("  <p>I DECLARE:</p>\n");
      out.write("  <form role=\"form\">\n");
      out.write("    <div class=\"checkbox\">\n");
      out.write("        <label><input type=\"checkbox\" value=\"\">Yes,I give permission for organs and tissue to be taken  <br> from my body after doctor's certification of death </label>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"checkbox\">\n");
      out.write("      <label><input type=\"checkbox\" value=\"\">Yes,I give permission for the use of organs and tissue with the exception of the following:  </label>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"checkbox\">\n");
      out.write("      <label><input type=\"checkbox\" value=\"\">I'm declaring the following persons as my custodians </label>\n");
      out.write("    </div>\n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label class=\"control-label col-sm-2\" for=\"Custodian1 Name\">Custodian1 Name</label>\n");
      out.write("        <div class=\"col-sm-3\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" name=\"Custodian1 Name\" id=\"Custodian1 Name\" placeholder=\"Custodian1 Name\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-3\">\n");
      out.write("            <label class=\"control-label col-sm-2\" for=\"Custodian1 Email\">Custodian1 Email</label>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-3\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" name=\"Custodian1 Email\" id=\"Custodian1 Email\" placeholder=\"Custodian1 Email\">\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("      <br> <br>\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label class=\"control-label col-sm-2\" for=\"Custodian2 Name\">Custodian2 Name</label>\n");
      out.write("        <div class=\"col-sm-3\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" name=\"Custodian2 Name\" id=\"Custodian2 Name\" placeholder=\"Custodian2 Name\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-3\">\n");
      out.write("            <label class=\"control-label col-sm-2\" for=\"Custodian2 Email\">Custodian2 Email</label>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-3\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" name=\"Custodian2 Email\" id=\"Custodian2 Email\" placeholder=\"Custodian2 Email\">\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("      <br> <br>\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label class=\"control-label col-sm-2\" for=\"Custodian3 Name\">Custodian3 Name</label>\n");
      out.write("        <div class=\"col-sm-3\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" name=\"Custodian3 Name\" id=\"Custodian3 Name\" placeholder=\"Custodian3 Name\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-3\">\n");
      out.write("            <label class=\"control-label col-sm-2\" for=\"Custodian3 Email\">Custodian3 Email</label>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-3\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" name=\"Custodian3 Email\" id=\"Custodian3 Email\" placeholder=\"Custodian3 Email\">\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("      <br> <br>\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label class=\"control-label col-sm-2\" for=\"Custodian4 Name\">Custodian4 Name</label>\n");
      out.write("        <div class=\"col-sm-3\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" name=\"Custodian4 Name\" id=\"Custodian4 Name\" placeholder=\"Custodian2 Name\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-3\">\n");
      out.write("            <label class=\"control-label col-sm-2\" for=\"Custodian4 Email\">Custodian4 Email</label>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-3\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" name=\"Custodian4 Email\" id=\"Custodian2 Email\" placeholder=\"Custodian2 Email\">\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("      <br> <br>\n");
      out.write("    \n");
      out.write("\n");
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
