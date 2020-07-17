/*    */ package com.chrome.servlet;
/*    */ 
/*    */ import com.chrome.utils.FileUtils;
/*    */ import com.chrome.utils.StringUtils;
/*    */ import java.io.ByteArrayOutputStream;
/*    */ import java.io.IOException;
/*    */ import java.io.OutputStreamWriter;
/*    */ import java.io.PrintWriter;
/*    */ import java.io.UnsupportedEncodingException;
/*    */ import java.net.URLDecoder;
/*    */ import javax.servlet.ServletException;
/*    */ import javax.servlet.http.HttpServlet;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ 
/*    */ public class RefreshDataServlet extends HttpServlet
/*    */ {
/*    */   private static final long serialVersionUID = -1340311711353988698L;
/*    */ 
/*    */   protected void doGet(HttpServletRequest req, HttpServletResponse resp)
/*    */     throws ServletException, IOException
/*    */   {
/* 24 */     doPost(req, resp);
/*    */   }
/*    */ 
/*    */   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
/*    */   {
/* 29 */     String name = getUTF8Value(req, "name");
/* 30 */     String data = FileUtils.readRefreshFile("common", name);
/* 31 */     if (!StringUtils.isNullOrEmpty(data))
/* 32 */       response(resp, data);
/*    */     else
/* 34 */       response(resp, "");
/*    */   }
/*    */ 
/*    */   private static String getDefaultCharSet()
/*    */   {
/* 39 */     OutputStreamWriter writer = new OutputStreamWriter(new ByteArrayOutputStream());
/* 40 */     String enc = writer.getEncoding();
/* 41 */     return enc;
/*    */   }
/*    */ 
/*    */   protected String getUTF8Value(HttpServletRequest req, String parameter)
/*    */   {
/* 52 */     String value = req.getParameter(parameter);
/* 53 */     if (value == null) {
/* 54 */       return null;
/*    */     }
/*    */     try
/*    */     {
/* 58 */       value = URLDecoder.decode(req.getParameter(parameter), "UTF-8");
/*    */     } catch (UnsupportedEncodingException e) {
/* 60 */       value = null;
/*    */     }
/* 62 */     return value;
/*    */   }
/*    */ 
/*    */   protected void response(HttpServletResponse resp, String data)
/*    */     throws IOException
/*    */   {
/* 71 */     resp.setCharacterEncoding("UTF-8");
/* 72 */     PrintWriter out = resp.getWriter();
/* 73 */     out.write(data);
/* 74 */     out.flush();
/* 75 */     out.close();
/*    */   }
/*    */ }

/* Location:           F:\goodwork\gold\test_exec_path\webapps\chromeApi\WEB-INF\classes\
 * Qualified Name:     com.chrome.servlet.RefreshDataServlet
 * JD-Core Version:    0.6.0
 */