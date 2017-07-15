package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_scope_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_message_code_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_spring_message_code_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_scope_nobody.release();
    _jspx_tagPool_spring_message_code_nobody.release();
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!-- \r\n");
      out.write("BIBLIOTECAS\r\n");
      out.write("C - JSTL (PRA AJUDAR A IMPLEMENTAR CÓDIGO JAVA  EM FORMA HTML)\r\n");
      out.write("FMT - JSTL DE FORMATAÇÃO\r\n");
      out.write("SPRING - SPRING\r\n");
      out.write("FORM - FORMULARIOS SPRING\r\n");
      out.write(" -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>Login</title>\r\n");
      out.write("\t\t<!-- variavel criada com jstl-->\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<style type=\"text/css\">\r\n");
      out.write("\t\t\t@IMPORT url(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${path}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/bootstrap/css/bootstrap.min.css\");\r\n");
      out.write("\t\t\t@IMPORT url(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${path}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/bootstrap/css/bootstrap-theme.min.css\");\r\n");
      out.write("\t\t\t#login{\r\n");
      out.write("\t\t\t\twidth: 400px;\r\n");
      out.write("\t\t\t\tmargin:0 auto;\r\n");
      out.write("\t\t\t\tmargint-top: 100px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</style>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${path}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/jquary/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${path}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<nav class=\"navbar navbar-default\">\r\n");
      out.write("\r\n");
      out.write("  <div >\r\n");
      out.write("    <!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("    <div class=\"navbar-header\">\r\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\r\n");
      out.write("        <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("      </button>\r\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">");
      if (_jspx_meth_spring_message_0(_jspx_page_context))
        return;
      out.write("</a>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("\t      <ul class=\"nav navbar-nav\">\r\n");
      out.write("\t     \t    <li><a href=\"ingredientes.jsp\">");
      if (_jspx_meth_spring_message_1(_jspx_page_context))
        return;
      out.write("</a></li>\r\n");
      out.write("\t            <li><a href=\"pizzas.jsp\">");
      if (_jspx_meth_spring_message_2(_jspx_page_context))
        return;
      out.write("</a></li>\r\n");
      out.write("\t      \t\t\r\n");
      out.write("\t      \t\t\r\n");
      out.write("\t      \t\t<li><a href=\"?lang=pt_BR\"><img height=\"25px\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${path}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/image/br.png\"></a></li>\r\n");
      out.write("\t     \t\t<li><a href=\"?lang=en_US\"><img  height=\"25px\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${path}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/image/us.png\"></a></li>\r\n");
      out.write("\t      </ul>\r\n");
      out.write("\t    <form method=\"post\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${path}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/sair\" class=\"navbar-form navbar-left\" >\r\n");
      out.write("\t    \t\t <div class=\"form-group\">\r\n");
      out.write("\t        \t\t<button type=\"submit\" class=\"btn btn-default\">");
      if (_jspx_meth_spring_message_3(_jspx_page_context))
        return;
      out.write("</button>\r\n");
      out.write("\t        \t\t<input type=\"hidden\" name=\"_csrf\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${_csrf.token}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t        \t</div>\r\n");
      out.write("\t      </form>\r\n");
      out.write("\r\n");
      out.write("    </div><!-- /.navbar-collapse -->\r\n");
      out.write("  </div><!-- /.container-fluid -->\r\n");
      out.write("\r\n");
      out.write("</nav>\r\n");
      out.write(" </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("path");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_set_0.setScope("request");
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_spring_message_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_0 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_0.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_0.setParent(null);
    _jspx_th_spring_message_0.setCode("views.menu.pizzaria");
    int[] _jspx_push_body_count_spring_message_0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_0 = _jspx_th_spring_message_0.doStartTag();
      if (_jspx_th_spring_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_0.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_1 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_1.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_1.setParent(null);
    _jspx_th_spring_message_1.setCode("views.menu.ingredientes");
    int[] _jspx_push_body_count_spring_message_1 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_1 = _jspx_th_spring_message_1.doStartTag();
      if (_jspx_th_spring_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_1.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_1);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_2 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_2.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_2.setParent(null);
    _jspx_th_spring_message_2.setCode("views.menu.pizzas");
    int[] _jspx_push_body_count_spring_message_2 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_2 = _jspx_th_spring_message_2.doStartTag();
      if (_jspx_th_spring_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_2.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_2);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_3 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_3.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_3.setParent(null);
    _jspx_th_spring_message_3.setCode("views.menu.sair");
    int[] _jspx_push_body_count_spring_message_3 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_3 = _jspx_th_spring_message_3.doStartTag();
      if (_jspx_th_spring_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_3.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_3);
    }
    return false;
  }
}
