package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.bhaskara.Bhaskara;

public final class bhaskara_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Calcular Bhaskara</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Calcular Bhaskara</h1>\n");
      out.write("        <hr>\n");
      out.write("        ");

            float a, b, c, delta, x;
            
            a = Float.parseFloat(request.getParameter("a"));
            b = Float.parseFloat(request.getParameter("b"));
            c = Float.parseFloat(request.getParameter("c"));
            delta = Float.parseFloat(request.getParameter("delta"));
            x = Float.parseFloat(request.getParameter("x"));
                
                
            Bhaskara bhaskara = new Bhaskara();
            
            bhaskara.setA(a);
            bhaskara.setB(b);
            bhaskara.setC(c);
            bhaskara.setDelta(delta);
            bhaskara.setX(x);

            
      out.write("\n");
      out.write("            <strong>Dado Informados: </strong>\n");
      out.write("            <ul>\n");
      out.write("                <li><strong>Defina o valor de a: </strong>");
      out.print( a);
      out.write("</li>\n");
      out.write("                <li><strong>Defina o valor de b: </strong>");
      out.print( b);
      out.write("</li>\n");
      out.write("                <li><strong>Defina o valor de c: </strong>");
      out.print( c);
      out.write("</li>   \n");
      out.write("            </ul>\n");
      out.write("            <hr>\n");
      out.write("            <strong>Calculo de Delta: </strong>\n");
      out.write("            <ul>\n");
      out.write("                <li><strong>Delta: </strong>");
      out.print(String.format("%.2f",bhaskara.calcularDelta()));
      out.write("</li>\n");
      out.write("                <li><strong>x1: </strong>");
      out.print( bhaskara.getDelta());
      out.write("</li>\n");
      out.write("                \n");
      out.write("            </ul>\n");
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
