/*    */ package com.chrome.utils;
/*    */ 
/*    */ import java.lang.reflect.InvocationTargetException;
/*    */ import java.lang.reflect.Method;
/*    */ import java.net.URL;
/*    */ 
/*    */ public class ResourceLoader
/*    */ {
/*    */   private static ClassLoader getTCL()
/*    */     throws IllegalAccessException, InvocationTargetException
/*    */   {
/* 17 */     Method method = null;
/*    */     try {
/* 19 */       method = Thread.class.getMethod("getContextClassLoader", null);
/*    */     }
/*    */     catch (NoSuchMethodException e) {
/* 22 */       return null;
/*    */     }
/* 24 */     return (ClassLoader)method.invoke(Thread.currentThread(), null);
/*    */   }
/*    */ 
/*    */   public URL getResource(String resource)
/*    */   {
/* 35 */     ClassLoader classLoader = null;
/* 36 */     URL url = null;
/*    */     try
/*    */     {
/* 39 */       classLoader = getTCL();
/* 40 */       if (classLoader != null) {
/* 41 */         url = classLoader.getResource(resource);
/* 42 */         if (url != null) {
/* 43 */           return url;
/*    */         }
/*    */       }
/*    */ 
/* 47 */       classLoader = getClass().getClassLoader();
/* 48 */       if (classLoader != null) {
/* 49 */         url = classLoader.getResource(resource);
/* 50 */         if (url != null)
/* 51 */           return url;
/*    */       }
/*    */     } catch (Throwable localThrowable) {
/*    */     }
/* 55 */     return ClassLoader.getSystemResource(resource);
/*    */   }
/*    */ }

/* Location:           F:\goodwork\gold\test_exec_path\webapps\chromeApi\WEB-INF\classes\
 * Qualified Name:     com.chrome.utils.ResourceLoader
 * JD-Core Version:    0.6.0
 */