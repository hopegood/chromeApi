/*     */ package com.chrome.utils;
/*     */ 
/*     */ import java.io.BufferedWriter;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.FileNotFoundException;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.FileWriter;
/*     */ import java.io.IOException;
/*     */ import java.io.OutputStreamWriter;
/*     */ import java.io.PrintStream;
/*     */ import java.io.UnsupportedEncodingException;
/*     */ 
/*     */ public class FileUtils
/*     */ {
/*     */   public static void main(String[] args)
/*     */   {
/*  16 */     String data = readLinkFile("1");
/*     */   }
/*     */ 
/*     */   private static void initDir(String account) {
/*  21 */     String path = GlobalConstants.APP_PATH;
/*  22 */     File file = new File(path + "/" + account);
/*  23 */     if (!file.exists())
/*  24 */       file.mkdir();
/*     */   }
/*     */ 
/*     */   public static String readLinkFile(String account)
/*     */   {
/*     */     try {
/*  30 */       String path = System.getProperty("catalina.home");
/*  31 */       if (StringUtils.isNullOrEmpty(path)) {
/*  32 */         path = GlobalConstants.APP_PATH;
/*     */       }
/*  34 */       File file = new File(path + "/common/" + account + ".txt");
/*  35 */       if (!file.exists()) {
/*  36 */         return "";
/*     */       }
/*  38 */       String rst = readToString(file);
/*  39 */       file.delete();
/*  40 */       return rst; } catch (Exception e) {
/*     */     }
/*  42 */     return "";
/*     */   }
/*     */ 
/*     */   public static void writeLinkFile(String account, String content)
/*     */   {
/*     */     try {
/*  48 */       String path = GlobalConstants.APP_PATH;
/*  49 */       File file = new File(path + "/" + account + ".txt");
/*  50 */       if (file.exists()) {
/*  51 */         file.delete();
/*     */       }
/*  53 */       file.createNewFile();
/*  54 */       FileWriter fileWriter = new FileWriter(file.getAbsoluteFile());
/*  55 */       BufferedWriter bw = new BufferedWriter(fileWriter);
/*  56 */       bw.write(content);
/*  57 */       bw.close();
/*     */     } catch (IOException e) {
/*  59 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */ 
/*     */   public static String readFile(String account, String name) {
/*     */     try {
/*  65 */       String path = System.getProperty("catalina.home");
/*  66 */       if (StringUtils.isNullOrEmpty(path)) {
/*  67 */         path = GlobalConstants.APP_PATH;
/*     */       }
/*  69 */       File file = new File(path + "/" + account + "/" + name + ".txt");
/*  70 */       if (!file.exists()) {
/*  71 */         return "";
/*     */       }
/*  73 */       String rst = readToString(file);
                if (rst.length() == 0) return "";
/*  74 */       file.delete();
/*  75 */       return rst; } catch (Exception e) {
/*     */     }
/*  77 */     return "";
/*     */   }
/*     */ 
/*     */   public static String readRefreshFile(String account, String name)
/*     */   {
/*     */     try {
/*  83 */       String path = System.getProperty("catalina.home");
/*  84 */       if (StringUtils.isNullOrEmpty(path)) {
/*  85 */         path = GlobalConstants.APP_PATH;
/*     */       }
/*  87 */       File file = new File(path + "/" + account + "/refresh_" + name + ".txt");
/*  88 */       if (!file.exists()) {
/*  89 */         return "";
/*     */       }
/*  91 */       String rst = readToString(file);
/*  92 */       file.delete();
/*  93 */       return rst; } catch (Exception e) {
/*     */     }
/*  95 */     return "";
/*     */   }
/*     */ 
/*     */   public static String readPriceFile(String account, String name)
/*     */   {
/*     */     try {
/* 101 */       String path = System.getProperty("catalina.home");
/* 102 */       if (StringUtils.isNullOrEmpty(path)) {
/* 103 */         path = GlobalConstants.APP_PATH;
/*     */       }
/* 105 */       File file = new File(path + "/" + account + "/price_" + name + ".txt");
/* 106 */       if (!file.exists()) {
/* 107 */         return "";
/*     */       }
/* 109 */       String rst = readToString(file);
/* 110 */       file.delete();
/* 111 */       return rst; } catch (Exception e) {
/*     */     }
/* 113 */     return "";
/*     */   }
/*     */   public static String readBetFile(String account, String name)
/*     */   {
/*     */     try {
/* 101 */       String path = System.getProperty("catalina.home");
/* 102 */       if (StringUtils.isNullOrEmpty(path)) {
/* 103 */         path = GlobalConstants.APP_PATH;
/*     */       }
/* 105 */       File file = new File(path + "/" + account + "/bet_" + name + ".txt");
/* 106 */       if (!file.exists()) {
/* 107 */         return "";
/*     */       }
/* 109 */       String rst = readToString(file);
/* 110 */       file.delete();
/* 111 */       return rst; } catch (Exception e) {
/*     */     }
/* 113 */     return "";
/*     */   }
/*     */ 
/*     */   public static void writeFile(String account, String name, String content)
/*     */   {
/*     */     try {
/* 119 */       String path = System.getProperty("catalina.home");
/* 120 */       if (StringUtils.isNullOrEmpty(path)) {
/* 121 */         path = GlobalConstants.APP_PATH;
/*     */       }
/* 123 */       File file = new File(path + "/" + account + "/" + name + ".html");
/* 124 */       if (file.exists()) {
/* 125 */         file.delete();
/*     */       }
/* 127 */       file.createNewFile();
/* 128 */       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path + "/" + account + "/" + name + ".html", true), "UTF-8"));
/* 129 */       bw.write(content);
/* 130 */       bw.close();
/*     */     } catch (IOException e) {
/* 132 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */ 
/*     */   public static String readToString(File file) {
/* 137 */     if (!file.exists()) {
/* 138 */       return "";
/*     */     }
/* 140 */     String encoding = "UTF-8";
/* 141 */     Long filelength = Long.valueOf(file.length());
/* 142 */     byte[] filecontent = new byte[filelength.intValue()];
/*     */     try {
/* 144 */       FileInputStream in = new FileInputStream(file);
/* 145 */       in.read(filecontent);
/* 146 */       in.close();
/*     */     } catch (FileNotFoundException e) {
/* 148 */       e.printStackTrace();
/*     */     } catch (IOException e) {
/* 150 */       e.printStackTrace();
/*     */     }
/*     */     try {
/* 153 */       return new String(filecontent, encoding);
/*     */     } catch (UnsupportedEncodingException e) {
/* 156 */       e.printStackTrace();
/* 157 */     }return null;
/*     */   }
/*     */ 
/*     */   public static String readToString2(File file)
/*     */   {
/* 162 */     if (!file.exists()) {
/* 163 */       return "";
/*     */     }
/* 165 */     String encoding = "GBK";
/* 166 */     Long filelength = Long.valueOf(file.length());
/* 167 */     byte[] filecontent = new byte[filelength.intValue()];
/*     */     try {
/* 169 */       FileInputStream in = new FileInputStream(file);
/* 170 */       in.read(filecontent);
/* 171 */       in.close();
/*     */     } catch (FileNotFoundException e) {
/* 173 */       e.printStackTrace();
/*     */     } catch (IOException e) {
/* 175 */       e.printStackTrace();
/*     */     }
/*     */     try {
/* 178 */       return new String(filecontent, encoding);
/*     */     } catch (UnsupportedEncodingException e) {
/* 181 */       e.printStackTrace();
/* 182 */     }return null;
/*     */   }
/*     */ }

/* Location:           F:\goodwork\gold\test_exec_path\webapps\chromeApi\WEB-INF\classes\
 * Qualified Name:     com.chrome.utils.FileUtils
 * JD-Core Version:    0.6.0
 */