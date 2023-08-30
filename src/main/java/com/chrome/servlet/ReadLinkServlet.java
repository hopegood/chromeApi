/*    */ package com.chrome.servlet;
/*    */ 
/*    */ import com.chrome.utils.FileUtils;
/*    */ import com.chrome.utils.StringUtils;
/*    */ import java.io.IOException;
/*    */ import java.io.PrintWriter;
/*    */ import java.io.UnsupportedEncodingException;
/*    */ import java.net.URLDecoder;
/*    */ import javax.servlet.ServletException;
/*    */ import javax.servlet.http.HttpServlet;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ 
/*    */ public class ReadLinkServlet extends HttpServlet
/*    */ {
/*    */   private static final long serialVersionUID = -1340311711353988698L;
/*    */ 
/*    */   protected void doGet(HttpServletRequest req, HttpServletResponse resp)
/*    */     throws ServletException, IOException
/*    */   {
/* 22 */     doPost(req, resp);
/*    */   }
/*    */ 
/*    */   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
/*    */   {
/* 27 */     String account = req.getParameter("account");
/* 28 */     String data = FileUtils.readLinkFile(account);
/* 29 */     if (!StringUtils.isNullOrEmpty(data))
/* 30 */       response(resp, data);
/*    */     else
/* 32 */       response(resp, "");
/*    */   }
/*    */ 
/*    */   protected String getUTF8Value(HttpServletRequest req, String parameter)
/*    */   {
/* 44 */     String value = req.getParameter(parameter);
/* 45 */     if (value == null) {
/* 46 */       return null;
/*    */     }
/*    */     try
/*    */     {
/* 50 */       value = URLDecoder.decode(req.getParameter(parameter), "UTF-8");
/*    */     } catch (UnsupportedEncodingException e) {
/* 52 */       value = null;
/*    */     }
/* 54 */     return value;
/*    */   }
/*    */ 
/*    */   protected void response(HttpServletResponse resp, String data)
/*    */     throws IOException
/*    */   {
/* 63 */     PrintWriter out = resp.getWriter();
/* 64 */     out.write(data);
/* 65 */     out.flush();
/* 66 */     out.close();
/*    */   }
/*    */ }

/* Location:           F:\goodwork\gold\test_exec_path\webapps\chromeApi\WEB-INF\classes\
 * Qualified Name:     com.chrome.servlet.ReadLinkServlet
 * JD-Core Version:    0.6.0
 */