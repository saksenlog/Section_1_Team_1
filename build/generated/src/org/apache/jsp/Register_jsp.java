package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.test.webapp.constants.CommonConstants;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <h1>Welcome to new user registration page</h1>\n");
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
      out.write("          <li><a href=\"Donor.jsp\">Donor</a></li>\n");
      out.write("          <li><a href=\"#\">Hospital</a></li>\n");
      out.write("          <li><a href=\"#\">Custodian</a></li>\n");
      out.write("          <li><a href=\"#\">Contact</a></li>        \n");
      out.write("          <li><a href=\"#\">FAQ</a></li>\n");
      out.write("          <li class=\"active\"><a href=\"Register.jsp\">NewUser Registraion</a></li>\n");
      out.write("        </ul>\n");
      out.write("       </div>     \n");
      out.write("      </nav>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
 
            
            String registerValid = (String)request.getAttribute("registerValid");
            if(null != registerValid && (CommonConstants.TRUE).equalsIgnoreCase(registerValid)){
        
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"alert alert-success fade in\">\n");
      out.write("\n");
      out.write("                <a href=\"#\" class=\"close\" data-dismiss=\"alert\">&times;</a>\n");
      out.write("\n");
      out.write("                <strong>Success!</strong> User Registration Successful.\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        ");
     
            }else if(("false").equalsIgnoreCase(registerValid)){
        
      out.write("\n");
      out.write("            \n");
      out.write("\n");
      out.write("            <div class=\"alert alert-danger fade in\">\n");
      out.write("\n");
      out.write("                <a href=\"#\" class=\"close\" data-dismiss=\"alert\">&times;</a>\n");
      out.write("\n");
      out.write("                <strong>Error!</strong> A problem has been occurred while submitting your data.\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");

            }else{}
            
        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("  <h2>Registration form</h2>\n");
      out.write("  <form class=\"form-horizontal\" role=\"form\" action=\"UserRegistrationServlet\" method=\"post\">\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <label class=\"control-label col-sm-2\" for=\"fName\">First Name</label>\n");
      out.write("        <div class=\"col-sm-3\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" name=\"firstName\" id=\"firstName\" placeholder=\"First Name\">\n");
      out.write("        </div>\n");
      out.write("    </div> \n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <label class=\"control-label col-sm-2\" for=\"lastName\">Last Name</label>\n");
      out.write("        <div class=\"col-sm-3\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" name=\"lastName\" id=\"lastName\" placeholder=\"Last Name\">\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <label class=\"control-label col-sm-2\" for=\"lastName\">User Name</label>\n");
      out.write("        <div class=\"col-sm-3\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" name=\"userName\" id=\"userName\" placeholder=\"User Name\">\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("      \n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label class=\"control-label col-sm-2\" for=\"pwd\">Password</label>\n");
      out.write("      <div class=\"col-sm-3\">          \n");
      out.write("        <input type=\"password\" class=\"form-control\" name=\"pwd\" id=\"pwd\" placeholder=\"Enter password\">\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label class=\"control-label col-sm-2\" for=\"pwd\">Retype-Password</label>\n");
      out.write("      <div class=\"col-sm-3\">          \n");
      out.write("        <input type=\"password\" class=\"form-control\" name=\"rePwd\" id=\"rePwd\" placeholder=\"Enter password\">\n");
      out.write("      </div>\n");
      out.write("    </div>  \n");
      out.write("      \n");
      out.write("     <div class=\"form-group\">\n");
      out.write("        <label class=\"control-label col-sm-2\" for=\"sel1\">User-Role</label>\n");
      out.write("        <div class=\"col-sm-3\"> \n");
      out.write("        <select class=\"form-control\" name =\"User_Role\" id=\"sel1\">\n");
      out.write("    <option>SELECT VALUES</option>        \n");
      out.write("    <option>DONOR</option>\n");
      out.write("    <option>HOSPITAL</option>\n");
      out.write("    <option>CUSTODIAN</option>\n");
      out.write("  </select>\n");
      out.write("        </div>\n");
      out.write("     </div>\n");
      out.write("        \n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <label class=\"control-label col-sm-2\" for=\"address1\">Address1</label>\n");
      out.write("        <div class=\"col-sm-3\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" name=\"address1\" id=\"address1\" placeholder=\"Address 1\">\n");
      out.write("        </div>\n");
      out.write("    </div>  \n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <label class=\"control-label col-sm-2\" for=\"address2\">Address2</label>\n");
      out.write("        <div class=\"col-sm-3\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" name=\"address2\" id=\"address2\" placeholder=\"Address 2\">\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <label class=\"control-label col-sm-2\" for=\"city\">City</label>\n");
      out.write("        <div class=\"col-sm-3\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" name=\"city\" id=\"city\" placeholder=\"City\">\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <label class=\"control-label col-sm-2\" for=\"state\">State</label>\n");
      out.write("        <div class=\"col-sm-3\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" name=\"state\" id=\"state\" placeholder=\"State\">\n");
      out.write("        </div>\n");
      out.write("    </div>   \n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label class=\"control-label col-sm-2\" for=\"email\">Email:</label>\n");
      out.write("      <div class=\"col-sm-3\">\n");
      out.write("        <input type=\"email\" class=\"form-control\" name=\"emailId\" id=\"emailId\" placeholder=\"Enter email\">\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div class=\"form-group\">        \n");
      out.write("      <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("          <input type=\"submit\" class=\"btn btn-default\" value=\"submit\">\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("       <!-- <form name=\"Newuser\" action=\"UserRegistrationServlet\" method=\"post\"> \n");
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
