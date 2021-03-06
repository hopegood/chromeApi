/*   */ package com.chrome.utils;
/*   */ 
/*   */ import com.sun.jna.platform.win32.User32;
import com.sun.jna.platform.win32.WinDef;
/*   */ import com.sun.jna.platform.win32.WinDef.HWND;
/*   */ 
/*   */ public class SwitchUtils
/*   */ {
/*   */   public static synchronized void switchTo(String code)
/*   */   {
	        System.out.println("code=" + code);
/* 9 */     if (code.equals("ysb")) {
/* 10 */       WinDef.HWND hwnd = User32.INSTANCE.FindWindow(null, "\u6613\u80DC\u535A\u4F53\u80B2 - 360\u6781\u901F\u6D4F\u89C8\u5668 11.0");
/* 11 */       User32.INSTANCE.SetForegroundWindow(hwnd);
/* 12 */     } else if (code.equals("cmd")) {
/* 13 */       WinDef.HWND hwnd = User32.INSTANCE.FindWindow(null, "CMD\u4F53\u80B2 - 360\u6781\u901F\u6D4F\u89C8\u5668 11.0");
/* 14 */       User32.INSTANCE.SetForegroundWindow(hwnd);
/* 15 */     } else if (code.contains("e365===")) {
/* 16 */       String label = code.replaceAll("e365===", "");
/* 17 */       label = label + "===e365";
/* 18 */       WinDef.HWND hwnd = User32.INSTANCE.FindWindow(null, label + " - 360\u6781\u901F\u6D4F\u89C8\u5668 11.0");
/* 19 */       if (hwnd != null) {
/* 20 */         User32.INSTANCE.SetForegroundWindow(hwnd);
/*   */       } else {
/* 22 */         hwnd = User32.INSTANCE.FindWindow(null, "365\u7535\u7ADE - 360\u6781\u901F\u6D4F\u89C8\u5668 11.0");
/* 23 */         if (hwnd != null)
/* 24 */           User32.INSTANCE.SetForegroundWindow(hwnd);
/*   */       }
/*   */     }
/* 27 */     else if (code.contains("ebb===")) {
/* 28 */       String label = code.replaceAll("ebb===", "");
/* 29 */       label = label + "===ebb";
/* 30 */       WinDef.HWND hwnd = User32.INSTANCE.FindWindow(null, label + " - 360\u6781\u901F\u6D4F\u89C8\u5668 11.0");
/* 31 */       if (hwnd != null) {
/* 32 */         User32.INSTANCE.SetForegroundWindow(hwnd);
/*   */       } else {
/* 34 */         hwnd = User32.INSTANCE.FindWindow(null, "NewBB\u7535\u7ADE - 360\u6781\u901F\u6D4F\u89C8\u5668 11.0");
/* 35 */         if (hwnd != null)
/* 36 */           User32.INSTANCE.SetForegroundWindow(hwnd);
/*   */       }
/*   */     }
/* 39 */     else if (code.contains("eim===")) {
/* 40 */       String label = code.replaceAll("eim===", "");
/* 41 */       label = label + "===eim";
/* 42 */       WinDef.HWND hwnd = User32.INSTANCE.FindWindow(null, label + " - 360\u6781\u901F\u6D4F\u89C8\u5668 11.0");
/* 43 */       if (hwnd != null) {
/* 44 */         User32.INSTANCE.SetForegroundWindow(hwnd);
/*   */       } else {
/* 46 */         hwnd = User32.INSTANCE.FindWindow(null, "im\u7535\u7ADE - 360\u6781\u901F\u6D4F\u89C8\u5668 11.0");
/* 47 */         if (hwnd != null)
/* 48 */           User32.INSTANCE.SetForegroundWindow(hwnd);
/*   */       }
/*   */     }
/* 51 */     else if (code.contains("im")) {
/* 52 */       WinDef.HWND hwnd = User32.INSTANCE.FindWindow(null, "Sunflower 2.0 - 360\u6781\u901F\u6D4F\u89C8\u5668 11.0");
/* 53 */       User32.INSTANCE.SetForegroundWindow(hwnd);
/* 54 */     } else if (code.contains("bet3656")) {
/* 55 */       WinDef.HWND hwnd = User32.INSTANCE.FindWindow(null, "bet3656 - \u5728\u7EBF\u4F53\u80B2\u6295\u6CE8 - 360\u6781\u901F\u6D4F\u89C8\u5668 11.0");
/* 56 */       User32.INSTANCE.SetForegroundWindow(hwnd);
/* 57 */     } else if (code.contains("bet3655")) {
/* 58 */       WinDef.HWND hwnd = User32.INSTANCE.FindWindow(null, "bet3655 - \u5728\u7EBF\u4F53\u80B2\u6295\u6CE8 - 360\u6781\u901F\u6D4F\u89C8\u5668 11.0");
/* 59 */       User32.INSTANCE.SetForegroundWindow(hwnd);
/* 60 */     } else if (code.contains("bet3654")) {
/* 61 */       WinDef.HWND hwnd = User32.INSTANCE.FindWindow(null, "bet3654 - \u5728\u7EBF\u4F53\u80B2\u6295\u6CE8 - 360\u6781\u901F\u6D4F\u89C8\u5668 11.0");
/* 62 */       User32.INSTANCE.SetForegroundWindow(hwnd);
/* 63 */     } else if (code.contains("bet3653")) {
/* 64 */       WinDef.HWND hwnd = User32.INSTANCE.FindWindow(null, "bet3653 - \u5728\u7EBF\u4F53\u80B2\u6295\u6CE8 - 360\u6781\u901F\u6D4F\u89C8\u5668 11.0");
/* 65 */       User32.INSTANCE.SetForegroundWindow(hwnd);
/* 66 */     } else if (code.contains("bet3652")) {
/* 67 */       WinDef.HWND hwnd = User32.INSTANCE.FindWindow(null, "bet3652 - \u5728\u7EBF\u4F53\u80B2\u6295\u6CE8 - 360\u6781\u901F\u6D4F\u89C8\u5668 11.0");
/* 68 */       User32.INSTANCE.SetForegroundWindow(hwnd);
/* 69 */     } else if (code.contains("bet3651")) {
/* 70 */       WinDef.HWND hwnd = User32.INSTANCE.FindWindow(null, "bet3651 - \u5728\u7EBF\u4F53\u80B2\u6295\u6CE8 - 360\u6781\u901F\u6D4F\u89C8\u5668 11.0");
/* 71 */       User32.INSTANCE.SetForegroundWindow(hwnd);
/* 72 */     } else if (code.contains("bet365x1")) {
/* 73 */       WinDef.HWND hwnd1 = User32.INSTANCE.FindWindow(null, "365x1 - 360\u6781\u901F\u6D4F\u89C8\u5668 11.0");
/* 74 */       if (hwnd1 != null) {
/* 75 */         User32.INSTANCE.SetForegroundWindow(hwnd1);
/* 76 */         return;
/*   */       }
/* 78 */       WinDef.HWND hwnd2 = User32.INSTANCE.FindWindow(null, "365x2 - 360\u6781\u901F\u6D4F\u89C8\u5668 11.0");
/* 79 */       if (hwnd2 != null) {
/* 80 */         User32.INSTANCE.SetForegroundWindow(hwnd2);
/* 81 */         return;
/*   */       }
/* 83 */       WinDef.HWND hwnd3 = User32.INSTANCE.FindWindow(null, "365x3 - 360\u6781\u901F\u6D4F\u89C8\u5668 11.0");
/* 84 */       if (hwnd3 != null) {
/* 85 */         User32.INSTANCE.SetForegroundWindow(hwnd3);
/* 86 */         return;
/*   */       }
/* 88 */       WinDef.HWND hwnd4 = User32.INSTANCE.FindWindow(null, "365x4 - 360\u6781\u901F\u6D4F\u89C8\u5668 11.0");
/* 89 */       if (hwnd4 != null) {
/* 90 */         User32.INSTANCE.SetForegroundWindow(hwnd4);
/* 91 */         return;
/*   */       }
/* 93 */     } else if (code.contains("bet365x2")) {
/* 94 */       WinDef.HWND hwnd2 = User32.INSTANCE.FindWindow(null, "365x2 - 360\u6781\u901F\u6D4F\u89C8\u5668 11.0");
/* 95 */       if (hwnd2 != null) {
/* 96 */         User32.INSTANCE.SetForegroundWindow(hwnd2);
/* 97 */         return;
/*   */       }
/* 99 */       WinDef.HWND hwnd1 = User32.INSTANCE.FindWindow(null, "365x1 - 360\u6781\u901F\u6D4F\u89C8\u5668 11.0");
/* 100 */       if (hwnd1 != null) {
/* 101 */         User32.INSTANCE.SetForegroundWindow(hwnd1);
/* 102 */         return;
/*   */       }
/* 104 */       WinDef.HWND hwnd3 = User32.INSTANCE.FindWindow(null, "365x3 - 360\u6781\u901F\u6D4F\u89C8\u5668 11.0");
/* 105 */       if (hwnd3 != null) {
/* 106 */         User32.INSTANCE.SetForegroundWindow(hwnd3);
/* 107 */         return;
/*   */       }
/* 109 */       WinDef.HWND hwnd4 = User32.INSTANCE.FindWindow(null, "365x4 - 360\u6781\u901F\u6D4F\u89C8\u5668 11.0");
/* 110 */       if (hwnd4 != null) {
/* 111 */         User32.INSTANCE.SetForegroundWindow(hwnd4);
/* 112 */         return;
/*   */       }
/* 114 */     } else if (code.contains("bet365x3")) {
/* 115 */       WinDef.HWND hwnd3 = User32.INSTANCE.FindWindow(null, "365x3 - 360\u6781\u901F\u6D4F\u89C8\u5668 11.0");
/* 116 */       if (hwnd3 != null) {
/* 117 */         User32.INSTANCE.SetForegroundWindow(hwnd3);
/* 118 */         return;
/*   */       }
/* 120 */       WinDef.HWND hwnd1 = User32.INSTANCE.FindWindow(null, "365x1 - 360\u6781\u901F\u6D4F\u89C8\u5668 11.0");
/* 121 */       if (hwnd1 != null) {
/* 122 */         User32.INSTANCE.SetForegroundWindow(hwnd1);
/* 123 */         return;
/*   */       }
/* 125 */       WinDef.HWND hwnd2 = User32.INSTANCE.FindWindow(null, "365x2 - 360\u6781\u901F\u6D4F\u89C8\u5668 11.0");
/* 126 */       if (hwnd2 != null) {
/* 127 */         User32.INSTANCE.SetForegroundWindow(hwnd2);
/* 128 */         return;
/*   */       }
/* 130 */       WinDef.HWND hwnd4 = User32.INSTANCE.FindWindow(null, "365x4 - 360\u6781\u901F\u6D4F\u89C8\u5668 11.0");
/* 131 */       if (hwnd4 != null) {
/* 132 */         User32.INSTANCE.SetForegroundWindow(hwnd4);
/* 133 */         return;
/*   */       }
/* 135 */     } else if (code.contains("bet365x4")) {
/* 136 */       WinDef.HWND hwnd4 = User32.INSTANCE.FindWindow(null, "365x4 - 360\u6781\u901F\u6D4F\u89C8\u5668 11.0");
/* 137 */       if (hwnd4 != null) {
/* 138 */         User32.INSTANCE.SetForegroundWindow(hwnd4);
/* 139 */         return;
/*   */       }
/* 141 */       WinDef.HWND hwnd1 = User32.INSTANCE.FindWindow(null, "365x1 - 360\u6781\u901F\u6D4F\u89C8\u5668 11.0");
/* 142 */       if (hwnd1 != null) {
/* 143 */         User32.INSTANCE.SetForegroundWindow(hwnd1);
/* 144 */         return;
/*   */       }
/* 146 */       WinDef.HWND hwnd2 = User32.INSTANCE.FindWindow(null, "365x2 - 360\u6781\u901F\u6D4F\u89C8\u5668 11.0");
/* 147 */       if (hwnd2 != null) {
/* 148 */         User32.INSTANCE.SetForegroundWindow(hwnd2);
/* 149 */         return;
/*   */       }
/* 151 */       WinDef.HWND hwnd3 = User32.INSTANCE.FindWindow(null, "365x3 - 360\u6781\u901F\u6D4F\u89C8\u5668 11.0");
/* 152 */       if (hwnd3 != null) {
/* 153 */         User32.INSTANCE.SetForegroundWindow(hwnd3);
/* 154 */         return;
/*   */       }
/* 156 */     } else if (code.contains("bb")) {
/* 157 */       WinDef.HWND hwnd = User32.INSTANCE.FindWindow(null, "NewBB\u4F53\u80B2 - 360\u6781\u901F\u6D4F\u89C8\u5668 11.0");
/* 158 */       User32.INSTANCE.SetForegroundWindow(hwnd);
/* 159 */     } else if (code.contains("sb")) {
/* 160 */       WinDef.HWND hwnd = User32.INSTANCE.FindWindow(null, "\u6C99\u5DF4\u4F53\u80B2 - 360\u6781\u901F\u6D4F\u89C8\u5668 11.0");
/* 161 */       User32.INSTANCE.SetForegroundWindow(hwnd);
/* 162 */     } else if (code.contains("pb")) {
/* 163 */       WinDef.HWND hwnd = User32.INSTANCE.FindWindow(null, "\u5E73\u535A\u4F53\u80B2 - 360\u6781\u901F\u6D4F\u89C8\u5668 11.0");
/* 164 */       User32.INSTANCE.SetForegroundWindow(hwnd);
/* 165 */     } else if (code.contains("l88")) {
/* 166 */       WinDef.HWND hwnd = User32.INSTANCE.FindWindow(null, "188\u4F53\u80B2 - 360\u6781\u901F\u6D4F\u89C8\u5668 11.0");
/* 167 */       User32.INSTANCE.SetForegroundWindow(hwnd);
/* 168 */     } else if (code.contains("df")) {
/* 169 */       WinDef.HWND hwnd = User32.INSTANCE.FindWindow(null, "\u5927\u53D1\u4F53\u80B2 - 360\u6781\u901F\u6D4F\u89C8\u5668 11.0");
/* 170 */       User32.INSTANCE.SetForegroundWindow(hwnd);
/* 171 */     } else if (code.contains("bti")) {
/* 172 */       WinDef.HWND hwnd = User32.INSTANCE.FindWindow(null, "BTI\u4F53\u80B2 - 360\u6781\u901F\u6D4F\u89C8\u5668 11.0");
/* 173 */       User32.INSTANCE.SetForegroundWindow(hwnd);
/* 174 */     } else if (code.contains("boin")) {
/* 175 */       WinDef.HWND hwnd = User32.INSTANCE.FindWindow(null, "BBIN\u4F53\u80B2 - 360\u6781\u901F\u6D4F\u89C8\u5668 11.0");
/* 176 */       User32.INSTANCE.SetForegroundWindow(hwnd);
/*   */       } else if (code.contains("hg")) {
	            WinDef.HWND hwnd = User32.INSTANCE.FindWindow(null, "皇冠体育 - 360极速浏览器 11.0");
	            System.out.println("hg-hwnd=" + hwnd);
	            User32.INSTANCE.SetForegroundWindow(hwnd);
	          
}
/*   */   }
/*   */ }

/* Location:           F:\goodwork\gold\test_exec_path\webapps\chromeApi\WEB-INF\classes\
 * Qualified Name:     com.chrome.utils.SwitchUtils
 * JD-Core Version:    0.6.0
 */