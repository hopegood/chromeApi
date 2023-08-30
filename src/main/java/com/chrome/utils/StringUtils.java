/*     */ package com.chrome.utils;
/*     */ 
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import org.apache.commons.codec.binary.Base64;
/*     */ 
/*     */ public class StringUtils
/*     */ {
/*     */   public static String[] split(String paStr_Source, char paCha_seq, boolean paBoo_SeqTrim)
/*     */   {
/*  21 */     if (paStr_Source == null)
/*  22 */       return null;
/*  23 */     if (paStr_Source.equals("")) {
/*  24 */       return null;
/*     */     }
/*     */     do
/*  27 */       paStr_Source = paStr_Source.substring(1);
/*  26 */     while (paStr_Source.charAt(0) == paCha_seq);
/*     */ 
/*  30 */     while (paStr_Source.charAt(paStr_Source.length() - 1) == paCha_seq) {
/*  31 */       paStr_Source = paStr_Source.substring(0, paStr_Source.length() - 1);
/*     */     }
/*     */ 
/*  34 */     return split(paStr_Source, paCha_seq);
/*     */   }
/*     */ 
/*     */   public static String[] split(String paStr_Source, String paStr_seq, boolean paBoo_SeqTrim)
/*     */   {
/*  49 */     if ((paStr_Source == null) || (paStr_seq == null)) {
/*  50 */       return null;
/*     */     }
/*     */     do
/*  53 */       paStr_Source = paStr_Source.substring(paStr_seq.length());
/*  52 */     while (paStr_Source.indexOf(paStr_seq) == 0);
/*     */ 
/*  56 */     while (paStr_Source.indexOf(paStr_seq, paStr_Source.length() - paStr_seq.length()) > -1) {
/*  57 */       paStr_Source = paStr_Source.substring(0, paStr_Source.length() - paStr_seq.length());
/*     */     }
/*     */ 
/*  60 */     if ((paStr_Source.equals("")) || (paStr_seq.equals("")))
/*  61 */       return null;
/*  62 */     return split(paStr_Source, paStr_seq);
/*     */   }
/*     */ 
/*     */   public static String[] split(String paStr_Source, char paCha_seq)
/*     */   {
/*  75 */     return split(paStr_Source, paCha_seq);
/*     */   }
/*     */ 
/*     */   public static String[] split(String paStr_Source, String paStr_seq)
/*     */   {
/*  88 */     if ((paStr_seq == null) || (paStr_seq == null)) {
/*  89 */       return new String[0];
/*     */     }
/*  91 */     if ((paStr_seq.equals("")) || (paStr_seq.equals(""))) {
/*  92 */       return new String[0];
/*     */     }
/*  94 */     int int_ArraySize = subStringCount(paStr_Source, paStr_seq);
/*     */ 
/*  96 */     if (int_ArraySize == -1) {
/*  97 */       return new String[0];
/*     */     }
/*  99 */     paStr_Source = paStr_Source + paStr_seq;
/*     */ 
/* 101 */     String[] str_RetArr = new String[int_ArraySize + 1];
/* 102 */     int int_pos = paStr_Source.indexOf(paStr_seq);
/* 103 */     int int_ArrayPos = 0;
/* 104 */     while (int_pos != -1) {
/* 105 */       str_RetArr[(int_ArrayPos++)] = paStr_Source.substring(0, int_pos);
/* 106 */       paStr_Source = paStr_Source.substring(int_pos + paStr_seq.length());
/* 107 */       int_pos = paStr_Source.indexOf(paStr_seq);
/*     */     }
/*     */ 
/* 110 */     return str_RetArr;
/*     */   }
/*     */ 
/*     */   public static int subStringCount(String paStr_Source, char paCha_seq)
/*     */   {
/* 124 */     if (paStr_Source == null)
/* 125 */       return -1;
/* 126 */     if ((paStr_Source.equals("")) || (paCha_seq == ' ') || (paCha_seq == 0)) {
/* 127 */       return -1;
/*     */     }
/* 129 */     int int_ret = 0;
/* 130 */     int int_pos = paStr_Source.indexOf(paCha_seq);
/* 131 */     while (int_pos != -1) {
/* 132 */       int_ret++;
/* 133 */       int_pos = paStr_Source.indexOf(paCha_seq, int_pos + 1);
/*     */     }
/*     */ 
/* 136 */     return int_ret;
/*     */   }
/*     */ 
/*     */   public static int subStringCount(String paStr_Source, String paStr_seq)
/*     */   {
/* 150 */     if ((paStr_Source == null) || (paStr_seq == null))
/* 151 */       return -1;
/* 152 */     if ((paStr_Source.equals("")) || (paStr_seq.equals(""))) {
/* 153 */       return -1;
/*     */     }
/* 155 */     int int_ret = 0;
/* 156 */     int int_pos = paStr_Source.toUpperCase().indexOf(paStr_seq.toUpperCase());
/* 157 */     while (int_pos != -1) {
/* 158 */       int_ret++;
/* 159 */       int_pos = paStr_Source.toUpperCase().indexOf(paStr_seq.toUpperCase(), int_pos + paStr_seq.length());
/*     */     }
/*     */ 
/* 162 */     return int_ret;
/*     */   }
/*     */ 
/*     */   public static int subStringCount(String paStr_Source, String paStr_seq, boolean paBoo_case)
/*     */   {
/* 178 */     if ((paStr_Source == null) || (paStr_seq == null))
/* 179 */       return -1;
/* 180 */     if ((paStr_Source.equals("")) || (paStr_seq.equals(""))) {
/* 181 */       return -1;
/*     */     }
/* 183 */     int int_ret = 0;
/* 184 */     int int_pos = paStr_Source.indexOf(paStr_seq);
/* 185 */     while (int_pos != -1) {
/* 186 */       int_ret++;
/* 187 */       int_pos = paStr_Source.indexOf(paStr_seq, int_pos + paStr_seq.length());
/*     */     }
/* 189 */     return int_ret;
/*     */   }
/*     */ 
/*     */   public static String toLowerCaseInitial(String srcString, boolean flag)
/*     */   {
/* 202 */     StringBuilder sb = new StringBuilder();
/* 203 */     if (flag)
/* 204 */       sb.append(Character.toLowerCase(srcString.charAt(0)));
/*     */     else {
/* 206 */       sb.append(Character.toUpperCase(srcString.charAt(0)));
/*     */     }
/* 208 */     sb.append(srcString.substring(1));
/* 209 */     return sb.toString();
/*     */   }
/*     */ 
/*     */   public static String transferNumToBool(String num)
/*     */   {
/* 220 */     if (num.equals("1")) {
/* 221 */       return "true";
/*     */     }
/* 223 */     return "false";
/*     */   }
/*     */ 
/*     */   public static String getMinMaxValue(String str, String type)
/*     */   {
/* 235 */     if (str.equals("0")) {
/* 236 */       return "0";
/*     */     }
/* 238 */     String[] vals = str.split("-");
/* 239 */     if (type.equals("min"))
/* 240 */       return vals[0];
/* 241 */     if (type.equals("max")) {
/* 242 */       return vals[1];
/*     */     }
/* 244 */     return "";
/*     */   }
/*     */ 
/*     */   public static String renderStrName(String val)
/*     */   {
/* 255 */     int length = val.length();
/* 256 */     return val.substring(0, length - 4) + "Id";
/*     */   }
/*     */ 
/*     */   public static boolean isInteger(String value)
/*     */   {
/*     */     try {
/* 262 */       Integer.parseInt(value);
/* 263 */       return true; } catch (NumberFormatException e) {
/*     */     }
/* 265 */     return false;
/*     */   }
/*     */ 
/*     */   public static Map<String, Object> transferFromStr(String parameters)
/*     */   {
/* 277 */     Map params = new HashMap();
/* 278 */     if ((parameters != null) && (!parameters.equals("")) && (!parameters.equals("null"))) {
/* 279 */       String[] arrs = parameters.split("&");
/* 280 */       for (int i = 0; i < arrs.length; i++) {
/* 281 */         String parameter = arrs[i];
/* 282 */         String[] pars = parameter.split("=");
/* 283 */         if (pars.length != 2)
/*     */           continue;
/* 285 */         if (pars[0].equals("menuText"))
/*     */         {
/*     */           continue;
/*     */         }
/* 289 */         if (isInteger(pars[1]))
/* 290 */           params.put(pars[0], Integer.valueOf(Integer.parseInt(pars[1])));
/*     */         else {
/* 292 */           params.put(pars[0], pars[1]);
/*     */         }
/*     */       }
/*     */     }
/*     */ 
/* 297 */     return params;
/*     */   }
/*     */ 
/*     */   public static Map<String, Object> transferFromStrExt(String parameters)
/*     */   {
/* 308 */     Map params = new HashMap();
/* 309 */     if ((parameters != null) && (!parameters.equals("")) && (!parameters.equals("null"))) {
/* 310 */       String[] arrs = parameters.split("&");
/* 311 */       for (int i = 0; i < arrs.length; i++) {
/* 312 */         String parameter = arrs[i];
/* 313 */         String[] pars = parameter.split("=");
/* 314 */         if (pars.length != 2)
/*     */           continue;
/* 316 */         if (!pars[0].equals("menuText")) {
/*     */           continue;
/*     */         }
/* 319 */         params.put(pars[0], pars[1]);
/*     */       }
/*     */     }
/* 322 */     return params;
/*     */   }
/*     */ 
/*     */   public static boolean isNullOrEmpty(String str)
/*     */   {
/* 332 */     boolean bool = false;
/*     */ 
/* 334 */     if (str == null) {
/* 335 */       bool = true;
/*     */     }
/* 337 */     else if (str.trim().equals("")) {
/* 338 */       bool = true;
/*     */     }
/*     */ 
/* 342 */     return bool;
/*     */   }
/*     */ 
/*     */   public static String escape(String src)
/*     */   {
/* 348 */     StringBuffer tmp = new StringBuffer();
/* 349 */     tmp.ensureCapacity(src.length() * 6);
/* 350 */     for (int i = 0; i < src.length(); i++) {
/* 351 */       char j = src.charAt(i);
/* 352 */       if ((Character.isDigit(j)) || (Character.isLowerCase(j)) || (Character.isUpperCase(j))) {
/* 353 */         tmp.append(j);
/* 354 */       } else if (j < '\u0100') {
/* 355 */         tmp.append("%");
/* 356 */         if (j < '\020')
/* 357 */           tmp.append("0");
/* 358 */         tmp.append(Integer.toString(j, 16));
/*     */       } else {
/* 360 */         tmp.append("%u");
/* 361 */         tmp.append(Integer.toString(j, 16));
/*     */       }
/*     */     }
/* 364 */     return tmp.toString();
/*     */   }
/*     */ 
/*     */   public static String unescape(String src) {
/* 368 */     StringBuffer tmp = new StringBuffer();
/* 369 */     tmp.ensureCapacity(src.length());
/* 370 */     int lastPos = 0; int pos = 0;
/*     */ 
/* 372 */     while (lastPos < src.length()) {
/* 373 */       pos = src.indexOf("%", lastPos);
/* 374 */       if (pos == lastPos) {
/* 375 */         if (src.charAt(pos + 1) == 'u') {
/* 376 */           char ch = (char)Integer.parseInt(src.substring(pos + 2, pos + 6), 16);
/* 377 */           tmp.append(ch);
/* 378 */           lastPos = pos + 6;
/*     */         } else {
/* 380 */           char ch = (char)Integer.parseInt(src.substring(pos + 1, pos + 3), 16);
/* 381 */           tmp.append(ch);
/* 382 */           lastPos = pos + 3;
/*     */         }
/*     */       }
/* 385 */       else if (pos == -1) {
/* 386 */         tmp.append(src.substring(lastPos));
/* 387 */         lastPos = src.length();
/*     */       } else {
/* 389 */         tmp.append(src.substring(lastPos, pos));
/* 390 */         lastPos = pos;
/*     */       }
/*     */     }
/*     */ 
/* 394 */     return tmp.toString();
/*     */   }
/*     */ 
/*     */   public static String encodeBase64(String value)
/*     */   {
/*     */     try {
/* 400 */       value = new String(Base64.encodeBase64(value.getBytes("utf-8")), "utf-8");
/*     */     } catch (Exception e) {
/* 402 */       e.printStackTrace();
/*     */     }
/* 404 */     return value;
/*     */   }
/*     */ 
/*     */   public static String decodeBase64(String value)
/*     */   {
/*     */     try {
/* 410 */       value = new String(Base64.decodeBase64(value.getBytes("utf-8")), "utf-8");
/*     */     } catch (Exception localException) {
/*     */     }
/* 413 */     return value;
/*     */   }
/*     */ }

/* Location:           F:\goodwork\gold\test_exec_path\webapps\chromeApi\WEB-INF\classes\
 * Qualified Name:     com.chrome.utils.StringUtils
 * JD-Core Version:    0.6.0
 */