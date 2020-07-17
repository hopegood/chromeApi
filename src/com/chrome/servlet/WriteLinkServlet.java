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
/*    */ public class WriteLinkServlet extends HttpServlet
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
/* 27 */     String accountStr = req.getParameter("accountStr");
/* 28 */     String content = req.getParameter("content");
/* 29 */     if (!StringUtils.isNullOrEmpty(accountStr)) {
/* 30 */       String[] accountArr = accountStr.split(",");
/* 31 */       for (int i = 0; i < accountArr.length; i++) {
/* 32 */         String account = accountArr[i];
/* 33 */         FileUtils.writeLinkFile(account, content);
/*    */       }
/*    */     }
/* 36 */     response(resp, "success");
/*    */   }
/*    */ 
/*    */   protected String getUTF8Value(HttpServletRequest req, String parameter)
/*    */   {
/* 47 */     String value = req.getParameter(parameter);
/* 48 */     if (value == null) {
/* 49 */       return null;
/*    */     }
/*    */     try
/*    */     {
/* 53 */       value = URLDecoder.decode(req.getParameter(parameter), "UTF-8");
/*    */     } catch (UnsupportedEncodingException e) {
/* 55 */       value = null;
/*    */     }
/* 57 */     return value;
/*    */   }
/*    */ 
/*    */   protected void response(HttpServletResponse resp, String data)
/*    */     throws IOException
/*    */   {
/* 66 */     PrintWriter out = resp.getWriter();
/* 67 */     out.write(data);
/* 68 */     out.flush();
/* 69 */     out.close();
/*    */   }
/*    */ }

/* Location:           F:\goodwork\gold\test_exec_path\webapps\chromeApi\WEB-INF\classes\
 * Qualified Name:     com.chrome.servlet.WriteLinkServlet
 * JD-Core Version:    0.6.0
 */