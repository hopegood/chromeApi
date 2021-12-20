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
/*    */ public class ResDataServlet extends HttpServlet
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
	         try{
/* 29 */     String name = getUTF8Value(req, "name");
/* 30 */     Integer isPrice = Integer.valueOf(Integer.parseInt(req.getParameter("isPrice")));
/* 31 */     String data = FileUtils.readFile("common", name);
/* 32 */     if (!StringUtils.isNullOrEmpty(data)) {
/* 33 */       response(resp, data);
/*    */     } else {
/* 35 */       if (isPrice.intValue() == 1) {
/* 36 */         data = FileUtils.readPriceFile("common", name);
/*    */       }
/* 38 */       if (!StringUtils.isNullOrEmpty(data)) {
/* 39 */         response(resp, data);
/*    */       } else {
/* 41 */         data = FileUtils.readRefreshFile("common", name);
/* 42 */         response(resp, data);
/*    */       }
/*    */     }}catch(Exception e){
	            e.printStackTrace();
}
/*    */   }
/*    */ 
/*    */   protected String getUTF8Value(HttpServletRequest req, String parameter)
/*    */   {
/* 55 */     String value = req.getParameter(parameter);
/* 56 */     if (value == null) {
/* 57 */       return null;
/*    */     }
/*    */     try
/*    */     {
/* 61 */       value = URLDecoder.decode(req.getParameter(parameter), "UTF-8");
/*    */     } catch (UnsupportedEncodingException e) {
/* 63 */       value = null;
/*    */     }
/* 65 */     return value;
/*    */   }
/*    */ 
/*    */   protected void response(HttpServletResponse resp, String data)
/*    */     throws IOException
/*    */   {
/* 74 */     resp.setCharacterEncoding("UTF-8");
/* 75 */     PrintWriter out = resp.getWriter();
/* 76 */     out.write(data);
/* 77 */     out.flush();
/* 78 */     out.close();
/*    */   }
/*    */ }

/* Location:           F:\goodwork\gold\test_exec_path\webapps\chromeApi\WEB-INF\classes\
 * Qualified Name:     com.chrome.servlet.ResDataServlet
 * JD-Core Version:    0.6.0
 */