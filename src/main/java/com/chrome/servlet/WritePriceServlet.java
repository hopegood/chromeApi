/*     */ package com.chrome.servlet;
/*     */ 
/*     */

import com.chrome.utils.StringUtils;
import com.chrome.utils.SwitchUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
/*     */ 
/*     */ public class WritePriceServlet extends HttpServlet
/*     */ {
/*     */   private static final long serialVersionUID = -1340311711353988698L;
/*     */ 
/*     */   protected void doGet(HttpServletRequest req, HttpServletResponse resp)
/*     */     throws ServletException, IOException
/*     */   {
/*  24 */     doPost(req, resp);
/*     */   }
/*     */ 
/*     */   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
/*     */   {
/*  29 */     String name = getUTF8Value(req, "name");
/*  30 */     SwitchUtils.switchTo(name);
/*  31 */     String price = req.getParameter("price");
/*  32 */     if (!StringUtils.isNullOrEmpty(price))
/*  33 */       writePrice(Integer.valueOf(Integer.parseInt(price)));
/*     */   }
/*     */ 
/*     */   protected String getUTF8Value(HttpServletRequest req, String parameter)
/*     */   {
/*  46 */     String value = req.getParameter(parameter);
/*  47 */     if (value == null) {
/*  48 */       return null;
/*     */     }
/*     */     try
/*     */     {
/*  52 */       value = URLDecoder.decode(req.getParameter(parameter), "UTF-8");
/*     */     } catch (UnsupportedEncodingException e) {
/*  54 */       value = null;
/*     */     }
/*  56 */     return value;
/*     */   }
/*     */ 
/*     */   public static void writePrice(Integer price) {
/*     */     try {
/*  61 */       String p = price.toString();
/*  62 */       int len = p.length();
/*  63 */       Robot robot = new Robot();
/*  64 */       for (int i = 0; i < len; i++) {
/*  65 */         String n = p.substring(i, i + 1);
/*  66 */         if (n.equals("0")) {
/*  67 */           robot.keyPress(48);
/*  68 */           robot.keyRelease(48);
/*  69 */         } else if (n.equals("1")) {
/*  70 */           robot.keyPress(49);
/*  71 */           robot.keyRelease(49);
/*  72 */         } else if (n.equals("2")) {
/*  73 */           robot.keyPress(50);
/*  74 */           robot.keyRelease(50);
/*  75 */         } else if (n.equals("3")) {
/*  76 */           robot.keyPress(51);
/*  77 */           robot.keyRelease(51);
/*  78 */         } else if (n.equals("4")) {
/*  79 */           robot.keyPress(52);
/*  80 */           robot.keyRelease(52);
/*  81 */         } else if (n.equals("5")) {
/*  82 */           robot.keyPress(53);
/*  83 */           robot.keyRelease(53);
/*  84 */         } else if (n.equals("6")) {
/*  85 */           robot.keyPress(54);
/*  86 */           robot.keyRelease(54);
/*  87 */         } else if (n.equals("7")) {
/*  88 */           robot.keyPress(55);
/*  89 */           robot.keyRelease(55);
/*  90 */         } else if (n.equals("8")) {
/*  91 */           robot.keyPress(56);
/*  92 */           robot.keyRelease(56);
/*  93 */         } else if (n.equals("9")) {
/*  94 */           robot.keyPress(57);
/*  95 */           robot.keyRelease(57);
/*     */         }
/*     */       }
/*  98 */       robot.delay(500);
/*     */     }
/*     */     catch (Exception localException)
/*     */     {
/*     */     }
/*     */   }
/*     */ 
/*     */   protected void response(HttpServletResponse resp, String data)
/*     */     throws IOException
/*     */   {
/* 110 */     resp.setCharacterEncoding("UTF-8");
/* 111 */     PrintWriter out = resp.getWriter();
/* 112 */     out.write(data);
/* 113 */     out.flush();
/* 114 */     out.close();
/*     */   }
/*     */ }

/* Location:           F:\goodwork\gold\test_exec_path\webapps\chromeApi\WEB-INF\classes\
 * Qualified Name:     com.chrome.servlet.WritePriceServlet
 * JD-Core Version:    0.6.0
 */