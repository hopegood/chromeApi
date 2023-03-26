/*    */ package com.chrome.servlet;
/*    */ 
/*    */ import java.io.BufferedWriter;
/*    */ import java.io.File;
/*    */ import java.io.FileWriter;
/*    */ import java.io.IOException;
/*    */ import java.io.PrintWriter;
/*    */ import java.io.UnsupportedEncodingException;
/*    */ import java.net.URLDecoder;
/*    */ import javax.servlet.ServletException;
/*    */ import javax.servlet.http.HttpServlet;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;

import com.chrome.utils.FileUtils;
/*    */ 
/*    */ public class TeamDataServlet extends HttpServlet
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
/* 27 */     String name = getUTF8Value(req, "name");
/* 28 */     String data = getUTF8Value(req, "data");
/* 29 */     FileUtils.writeFile("common",name, data);
/* 30 */     response(resp, "success");
/*    */   }
/*    */ 
/*    */   public static void writeFile(String name, String content) {
/*    */     try {
/* 35 */       File file = new File("c:/temp/" + name + ".html");
/* 36 */       if (file.exists()) {
/* 37 */         file.delete();
/*    */       }
/* 39 */       file.createNewFile();
/* 40 */       FileWriter fileWriter = new FileWriter(file.getAbsoluteFile());
/* 41 */       BufferedWriter bw = new BufferedWriter(fileWriter);
/* 42 */       bw.write(content);
/* 43 */       bw.close();
/*    */     } catch (IOException e) {
/* 45 */       e.printStackTrace();
/*    */     }
/*    */   }
/*    */ 
/*    */   protected String getUTF8Value(HttpServletRequest req, String parameter)
/*    */   {
/* 57 */     String value = req.getParameter(parameter);
/* 58 */     if (value == null) {
/* 59 */       return null;
/*    */     }
/*    */     try
/*    */     {
/* 63 */       value = URLDecoder.decode(req.getParameter(parameter), "UTF-8");
/*    */     } catch (UnsupportedEncodingException e) {
/* 65 */       value = null;
/*    */     }
/* 67 */     return value;
/*    */   }
/*    */ 
/*    */   protected void response(HttpServletResponse resp, String data)
/*    */     throws IOException
/*    */   {
/* 76 */     PrintWriter out = resp.getWriter();
/* 77 */     out.write(data);
/* 78 */     out.flush();
/* 79 */     out.close();
/*    */   }
/*    */ }

/* Location:           F:\goodwork\gold\test_exec_path\webapps\chromeApi\WEB-INF\classes\
 * Qualified Name:     com.chrome.servlet.TeamDataServlet
 * JD-Core Version:    0.6.0
 */