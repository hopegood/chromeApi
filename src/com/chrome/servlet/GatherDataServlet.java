/*    */ package com.chrome.servlet;
/*    */ 
/*    */ import com.chrome.utils.FileUtils;

import java.io.BufferedReader;
/*    */ import java.io.IOException;
/*    */ import java.io.PrintWriter;
/*    */ import java.io.UnsupportedEncodingException;
/*    */ import java.net.URLDecoder;
/*    */ import javax.servlet.ServletException;
/*    */ import javax.servlet.http.HttpServlet;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ 
/*    */ public class GatherDataServlet extends HttpServlet
/*    */ {
/*    */   private static final long serialVersionUID = -1340311711353988698L;
/*    */ 
/*    */   protected void doGet(HttpServletRequest req, HttpServletResponse resp)
/*    */     throws ServletException, IOException
/*    */   {
/* 20 */     doPost(req, resp);
/*    */   }
/*    */ 
/*    */   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
/*    */   {
	   try{
		   String name = req.getParameter("name");
		   String data = "";
		   if (name == null) {
	            StringBuilder sb = new StringBuilder();
	            try  {
	            	BufferedReader reader = req.getReader();
	                char[] buff = new char[1024*1024];
	                int len;
	                while ((len = reader.read(buff)) != -1) {
	                    sb.append(buff, 0, len);
	                }
		            name = this.splitString(sb.toString(), "name=");
		            name = URLDecoder.decode(name,"UTF-8");
		            data = this.splitString(sb.toString(), "data=");
		            data = URLDecoder.decode(data,"UTF-8");
		            data = URLDecoder.decode(data,"UTF-8");
	            } catch (IOException e) {
	                //e.printStackTrace();
	            }
	        }else {
	        	name = getUTF8Value(req, "name");
	        	data = getUTF8Value(req, "data");
	        }
		   
		   
		   
/* 27 */     FileUtils.writeFile("common", name, data);
/* 28 */     response(resp, "success");
	   }catch(Exception e){
		   e.printStackTrace();
	   }
/*    */   }
/*    */ 
private String splitString(String str, String temp) {
    String result = null;
    if (str.indexOf(temp) != -1) {
        if (str.substring(str.indexOf(temp)).indexOf("&") != -1) {
            result = str.substring(str.indexOf(temp)).substring(str.substring(str.indexOf(temp)).indexOf("=") + 1,
                    str.substring(str.indexOf(temp)).indexOf("&"));

        } else {
            result = str.substring(str.indexOf(temp)).substring(str.substring(str.indexOf(temp)).indexOf("=") + 1);

        }
    }
    return result;
}
/*    */   protected String getUTF8Value(HttpServletRequest req, String parameter)
/*    */   {
/* 39 */     String value = req.getParameter(parameter);
/* 40 */     if (value == null) {
/* 41 */       return null;
/*    */     }
/*    */     try
/*    */     {
/* 45 */       value = URLDecoder.decode(req.getParameter(parameter), "UTF-8");
/*    */     } catch (UnsupportedEncodingException e) {
/* 47 */       value = null;
/*    */     }
/* 49 */     return value;
/*    */   }
/*    */ 
/*    */   protected String getGBKValue(HttpServletRequest req, String parameter)
/*    */   {
/* 54 */     String value = req.getParameter(parameter);
/* 55 */     if (value == null) {
/* 56 */       return null;
/*    */     }
/*    */     try
/*    */     {
/* 60 */       value = URLDecoder.decode(req.getParameter(parameter), "GBK");
/*    */     } catch (UnsupportedEncodingException e) {
/* 62 */       value = null;
/*    */     }
/* 64 */     return value;
/*    */   }
/*    */ 
/*    */   protected void response(HttpServletResponse resp, String data)
/*    */     throws IOException
/*    */   {
/* 73 */     PrintWriter out = resp.getWriter();
/* 74 */     out.write(data);
/* 75 */     out.flush();
/* 76 */     out.close();
/*    */   }
/*    */ }

/* Location:           F:\goodwork\gold\test_exec_path\webapps\chromeApi\WEB-INF\classes\
 * Qualified Name:     com.chrome.servlet.GatherDataServlet
 * JD-Core Version:    0.6.0
 */