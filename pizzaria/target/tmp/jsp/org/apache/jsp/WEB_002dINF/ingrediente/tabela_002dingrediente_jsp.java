package org.apache.jsp.WEB_002dINF.ingrediente;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tabela_002dingrediente_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_message_code_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_spring_message_code_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\r\n");
      out.write("<table\r\n");
      out.write("\tclass=\"table table-hover table-condensed table-striped table-bordered\">\r\n");
      out.write("\t<thead>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td style=\"width: 10%\">#</td>\r\n");
      out.write("\t\t\t<td style=\"width: 50%\">");
      if (_jspx_meth_spring_message_0(_jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("\t\t\t<td style=\"width: 20%\">");
      if (_jspx_meth_spring_message_1(_jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("\t\t\t<td style=\"width: 20%\">");
      if (_jspx_meth_spring_message_2(_jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</thead>\r\n");
      out.write("\t<tbody>\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t</tbody>\r\n");
      out.write("\t<tfoot>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=\"5\">");
      if (_jspx_meth_spring_message_5(_jspx_page_context))
        return;
      out.write(": <span id=\"quantidade-ingredientes\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ingredientes.size()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=\"5\">\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-primary btn-lg\" data-toggle=\"modal\" data-target=\"#modal-ingrediente\">\r\n");
      out.write("\t\t\t\t \t");
      if (_jspx_meth_spring_message_6(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</tfoot>\r\n");
      out.write("</table>");
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

  private boolean _jspx_meth_spring_message_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_0 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_0.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_0.setParent(null);
    _jspx_th_spring_message_0.setCode("views.pizzas.tabela.nome");
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
    _jspx_th_spring_message_1.setCode("views.pizzas.tabela.categoria");
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
    _jspx_th_spring_message_2.setCode("views.pizzas.tabela.editar");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ingredientes}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("ingrediente");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t<tr data-id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ingrediente.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ingrediente.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ingrediente.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ingrediente.categoria}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\t\t\t\t<td colspan=\"2\">\r\n");
          out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-warning btn-editar\">");
          if (_jspx_meth_spring_message_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</button>\r\n");
          out.write("\t\t\t\t\t<button type=\"button\" class=\"btn-deletar btn btn-danger \">");
          if (_jspx_meth_spring_message_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</button> \r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_3 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_3.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_spring_message_3.setCode("views.pizzas.tabela.editar");
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

  private boolean _jspx_meth_spring_message_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_4 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_4.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_spring_message_4.setCode("views.pizzas.tabela.remover");
    int[] _jspx_push_body_count_spring_message_4 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_4 = _jspx_th_spring_message_4.doStartTag();
      if (_jspx_th_spring_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_4.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_4);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_5 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_5.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_5.setParent(null);
    _jspx_th_spring_message_5.setCode("views.pizzas.tabela.ingredientes_cadastradas");
    int[] _jspx_push_body_count_spring_message_5 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_5 = _jspx_th_spring_message_5.doStartTag();
      if (_jspx_th_spring_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_5.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_5);
    }
    return false;
  }

  private boolean _jspx_meth_spring_message_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_message_6 = (org.springframework.web.servlet.tags.MessageTag) _jspx_tagPool_spring_message_code_nobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_message_6.setPageContext(_jspx_page_context);
    _jspx_th_spring_message_6.setParent(null);
    _jspx_th_spring_message_6.setCode("views.pizzas.tabela.adicionar");
    int[] _jspx_push_body_count_spring_message_6 = new int[] { 0 };
    try {
      int _jspx_eval_spring_message_6 = _jspx_th_spring_message_6.doStartTag();
      if (_jspx_th_spring_message_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_message_6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_message_6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_message_6.doFinally();
      _jspx_tagPool_spring_message_code_nobody.reuse(_jspx_th_spring_message_6);
    }
    return false;
  }
}
