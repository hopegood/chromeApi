/*    */ package com.chrome.utils;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.PrintStream;
/*    */ import java.net.URL;
/*    */ import java.util.Hashtable;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ import org.dom4j.Document;
/*    */ import org.dom4j.DocumentException;
/*    */ import org.dom4j.Element;
/*    */ import org.dom4j.io.SAXReader;
/*    */ 
/*    */ public class GlobalConstants
/*    */ {
/* 19 */   private static GlobalConstants self = null;
/*    */ 
/* 21 */   private Hashtable paramTable = null;
/*    */ 
/* 69 */   public static String APP_PATH = getParamValue("APP_PATH");
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/*    */   }
/*    */ 
/*    */   private static void init()
/*    */   {
/* 24 */     self = new GlobalConstants();
/* 25 */     self.paramTable = new Hashtable();
/*    */     try {
/* 27 */       loadParamsConf();
/*    */     } catch (Exception e) {
/* 29 */       e.printStackTrace();
/*    */     }
/*    */   }
/*    */ 
/*    */   private static String getParamValue(String paramName) {
/* 34 */     if (self == null) {
/* 35 */       init();
/*    */     }
/* 37 */     return (String)self.paramTable.get(paramName);
/*    */   }
/*    */ 
/*    */   private static void loadParamsConf() throws DocumentException, IOException
/*    */   {
/* 42 */     InputStream in = new ResourceLoader().getResource("config.xml").openStream();
/* 43 */     SAXReader reader = new SAXReader();
/* 44 */     Document doc = reader.read(in);
/* 45 */     Iterator elementIter = null; Iterator subelementIter = null;
/* 46 */     Element element = null; Element subelement = null;
/* 47 */     String paramName = "";
/* 48 */     String paramValue = "";
/* 49 */     int count = 0;
/*    */ 
/* 51 */     elementIter = doc.selectNodes("/framework/parameter").iterator();
/* 52 */     while (elementIter.hasNext()) {
/* 53 */       element = (Element)elementIter.next();
/* 54 */       paramName = element.attributeValue("name");
/* 55 */       subelementIter = element.elements("value").iterator();
/* 56 */       count = 0;
/* 57 */       paramValue = "";
/* 58 */       while (subelementIter.hasNext()) {
/* 59 */         subelement = (Element)subelementIter.next();
/* 60 */         if (count > 0)
/* 61 */           paramValue = paramValue + ",";
/* 62 */         paramValue = paramValue + subelement.getTextTrim();
/* 63 */         count++;
/*    */       }
/* 65 */       self.paramTable.put(paramName, paramValue);
/*    */     }
/*    */   }
/*    */ }

/* Location:           F:\goodwork\gold\test_exec_path\webapps\chromeApi\WEB-INF\classes\
 * Qualified Name:     com.chrome.utils.GlobalConstants
 * JD-Core Version:    0.6.0
 */