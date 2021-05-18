/*   */ package com.chrome.utils;
import java.util.ArrayList;
import java.util.List;

import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.User32;
import com.sun.jna.platform.win32.WinDef;
/*   */ import com.sun.jna.platform.win32.WinDef.HWND;
import com.sun.jna.platform.win32.WinUser.WNDENUMPROC;

/*   */ 
/*   */ public class SwitchUtils
/*   */ {
	      private static String BROWSER_GOOGLE = "Google Chrome";
	      private static String BROWSER_360 = "360\u6781\u901F\u6D4F\u89C8\u5668 11.0";
	      
/*   */   public static synchronized void switchTo(String code)
/*   */   {
/* 9 */     if (code.equals("ysb")) {
               WinDef.HWND hwnd = findWindowGoogleOr360("\u6613\u80DC\u535A\u4F53\u80B2"); 
               User32.INSTANCE.SetForegroundWindow(hwnd);
/* 12 */     } else if (code.equals("cmd")) {
               WinDef.HWND hwnd = findWindowGoogleOr360("CMD\u4F53\u80B2");
/* 14 */       User32.INSTANCE.SetForegroundWindow(hwnd);
/* 15 */     } else if (code.contains("e365===")) {
/* 16 */       String label = code.replaceAll("e365===", "");
/* 17 */       label = label + "===e365";
               WinDef.HWND hwnd = findWindowGoogleOr360(label);
/* 19 */       if (hwnd != null) {
/* 20 */         User32.INSTANCE.SetForegroundWindow(hwnd);
/*   */       } else {
/* 23 */         hwnd = findWindowGoogleOr360("365\u7535\u7ADE");
                 if (hwnd != null)
/* 24 */           User32.INSTANCE.SetForegroundWindow(hwnd);
/*   */       }
/*   */     }
/* 27 */     else if (code.contains("ebb===")) {
/* 28 */       String label = code.replaceAll("ebb===", "");
/* 29 */       label = label + "===ebb";
/* 30 */       WinDef.HWND hwnd = findWindowGoogleOr360(label);
/* 31 */       if (hwnd != null) {
/* 32 */         User32.INSTANCE.SetForegroundWindow(hwnd);
/*   */       } else {
/* 34 */         hwnd = findWindowGoogleOr360("NewBB\u7535\u7ADE");
/* 35 */         if (hwnd != null)
/* 36 */           User32.INSTANCE.SetForegroundWindow(hwnd);
/*   */       }
/*   */     }
/* 39 */     else if (code.contains("eim===")) {
/* 40 */       String label = code.replaceAll("eim===", "");
/* 41 */       label = label + "===eim";
/* 42 */       WinDef.HWND hwnd = findWindowGoogleOr360(label);
/* 43 */       if (hwnd != null) {
/* 44 */         User32.INSTANCE.SetForegroundWindow(hwnd);
/*   */       } else {
/* 46 */         hwnd = findWindowGoogleOr360("im\u7535\u7ADE");
/* 47 */         if (hwnd != null)
/* 48 */           User32.INSTANCE.SetForegroundWindow(hwnd);
/*   */       }
/*   */     }
/* 51 */     else if (code.contains("im")) {
/* 52 */       WinDef.HWND hwnd = findWindowGoogleOr360("Sunflower 2.0");
/* 53 */       User32.INSTANCE.SetForegroundWindow(hwnd);
/* 54 */     } else if (code.contains("bet3656")) {
/* 55 */       WinDef.HWND hwnd = findWindowGoogleOr360("bet3656 - \u5728\u7EBF\u4F53\u80B2\u6295\u6CE8");
/* 56 */       User32.INSTANCE.SetForegroundWindow(hwnd);
/* 57 */     } else if (code.contains("bet3655")) {
/* 58 */       WinDef.HWND hwnd = findWindowGoogleOr360("bet3655 - \u5728\u7EBF\u4F53\u80B2\u6295\u6CE8");
/* 59 */       User32.INSTANCE.SetForegroundWindow(hwnd);
/* 60 */     } else if (code.contains("bet3654")) {
/* 61 */       WinDef.HWND hwnd = findWindowGoogleOr360("bet3654 - \u5728\u7EBF\u4F53\u80B2\u6295\u6CE8");
/* 62 */       User32.INSTANCE.SetForegroundWindow(hwnd);
/* 63 */     } else if (code.contains("bet3653")) {
/* 64 */       WinDef.HWND hwnd = findWindowGoogleOr360("bet3653 - \u5728\u7EBF\u4F53\u80B2\u6295\u6CE8");
/* 65 */       User32.INSTANCE.SetForegroundWindow(hwnd);
/* 66 */     } else if (code.contains("bet3652")) {
/* 67 */       WinDef.HWND hwnd = findWindowGoogleOr360("bet3652 - \u5728\u7EBF\u4F53\u80B2\u6295\u6CE8");
/* 68 */       User32.INSTANCE.SetForegroundWindow(hwnd);
/* 69 */     } else if (code.contains("bet3651")) {
/* 70 */       WinDef.HWND hwnd = findWindowGoogleOr360("bet3651 - \u5728\u7EBF\u4F53\u80B2\u6295\u6CE8");
/* 71 */       User32.INSTANCE.SetForegroundWindow(hwnd);
/* 72 */     } else if (code.contains("bet365x1")) {
/* 73 */       WinDef.HWND hwnd1 = findWindowGoogleOr360("365x1");
/* 74 */       if (hwnd1 != null) {
/* 75 */         User32.INSTANCE.SetForegroundWindow(hwnd1);
/* 76 */         return;
/*   */       }
/* 78 */       WinDef.HWND hwnd2 = findWindowGoogleOr360("365x2");
/* 79 */       if (hwnd2 != null) {
/* 80 */         User32.INSTANCE.SetForegroundWindow(hwnd2);
/* 81 */         return;
/*   */       }
/* 83 */       WinDef.HWND hwnd3 = findWindowGoogleOr360("365x3");
/* 84 */       if (hwnd3 != null) {
/* 85 */         User32.INSTANCE.SetForegroundWindow(hwnd3);
/* 86 */         return;
/*   */       }
/* 88 */       WinDef.HWND hwnd4 = findWindowGoogleOr360("365x4");
/* 89 */       if (hwnd4 != null) {
/* 90 */         User32.INSTANCE.SetForegroundWindow(hwnd4);
/* 91 */         return;
/*   */       }
/* 93 */     } else if (code.contains("bet365x2")) {
/* 94 */       WinDef.HWND hwnd2 = findWindowGoogleOr360("365x2");
/* 95 */       if (hwnd2 != null) {
/* 96 */         User32.INSTANCE.SetForegroundWindow(hwnd2);
/* 97 */         return;
/*   */       }
/* 99 */       WinDef.HWND hwnd1 = findWindowGoogleOr360("365x1");
/* 100 */       if (hwnd1 != null) {
/* 101 */         User32.INSTANCE.SetForegroundWindow(hwnd1);
/* 102 */         return;
/*   */       }
/* 104 */       WinDef.HWND hwnd3 = findWindowGoogleOr360("365x3");
/* 105 */       if (hwnd3 != null) {
/* 106 */         User32.INSTANCE.SetForegroundWindow(hwnd3);
/* 107 */         return;
/*   */       }
/* 109 */       WinDef.HWND hwnd4 = findWindowGoogleOr360("365x4");
/* 110 */       if (hwnd4 != null) {
/* 111 */         User32.INSTANCE.SetForegroundWindow(hwnd4);
/* 112 */         return;
/*   */       }
/* 114 */     } else if (code.contains("bet365x3")) {
/* 115 */       WinDef.HWND hwnd3 = findWindowGoogleOr360("365x3");
/* 116 */       if (hwnd3 != null) {
/* 117 */         User32.INSTANCE.SetForegroundWindow(hwnd3);
/* 118 */         return;
/*   */       }
/* 120 */       WinDef.HWND hwnd1 = findWindowGoogleOr360("365x1");
/* 121 */       if (hwnd1 != null) {
/* 122 */         User32.INSTANCE.SetForegroundWindow(hwnd1);
/* 123 */         return;
/*   */       }
/* 125 */       WinDef.HWND hwnd2 = findWindowGoogleOr360("365x2");
/* 126 */       if (hwnd2 != null) {
/* 127 */         User32.INSTANCE.SetForegroundWindow(hwnd2);
/* 128 */         return;
/*   */       }
/* 130 */       WinDef.HWND hwnd4 = findWindowGoogleOr360("365x4");
/* 131 */       if (hwnd4 != null) {
/* 132 */         User32.INSTANCE.SetForegroundWindow(hwnd4);
/* 133 */         return;
/*   */       }
/* 135 */     } else if (code.contains("bet365x4")) {
/* 136 */       WinDef.HWND hwnd4 = findWindowGoogleOr360("365x4");
/* 137 */       if (hwnd4 != null) {
/* 138 */         User32.INSTANCE.SetForegroundWindow(hwnd4);
/* 139 */         return;
/*   */       }
/* 141 */       WinDef.HWND hwnd1 = findWindowGoogleOr360("365x1");
/* 142 */       if (hwnd1 != null) {
/* 143 */         User32.INSTANCE.SetForegroundWindow(hwnd1);
/* 144 */         return;
/*   */       }
/* 146 */       WinDef.HWND hwnd2 = findWindowGoogleOr360("365x2");
/* 147 */       if (hwnd2 != null) {
/* 148 */         User32.INSTANCE.SetForegroundWindow(hwnd2);
/* 149 */         return;
/*   */       }
/* 151 */       WinDef.HWND hwnd3 = findWindowGoogleOr360("365x3");
/* 152 */       if (hwnd3 != null) {
/* 153 */         User32.INSTANCE.SetForegroundWindow(hwnd3);
/* 154 */         return;
/*   */       }
/* 156 */     }else if (code.contains("Ext365===") && code.contains("_share")) {
	 
	final WinDef.HWND findWindow;
	final boolean setForegroundWindow;
	String windowTitle = new StringBuilder(code.replaceAll("Ext365===", "").replaceAll("_share","")).append("===365Share").toString();
	final WinDef.HWND findWindow2 = findWindowGoogleOr360(windowTitle);
	if (findWindow2 != null){
	User32.INSTANCE.SetForegroundWindow(findWindow2);
	return;


	}
	}else if(code.contains("Ext365===")){
	              // System.out.println("code=" + code);
    final WinDef.HWND findWindow;
    final boolean setForegroundWindow;
    String windowTitle = new StringBuilder(code.replaceAll("Ext365===", "")).append("===365Ext").toString();
    final WinDef.HWND findWindow2 = findWindowGoogleOr360(windowTitle);
    if (findWindow2 != null){
    	User32.INSTANCE.SetForegroundWindow(findWindow2);
    	return;
    
    	
    }

}


else if (code.contains("bb")) {
	   WinDef.HWND hwnd = SwitchUtils.findWindow("NewBB==上半场");
	   if (hwnd != null) User32.INSTANCE.SetForegroundWindow(hwnd);
	   else {
		  hwnd = SwitchUtils.findWindow("NewBB==全场"); 
		  if (hwnd != null) User32.INSTANCE.SetForegroundWindow(hwnd);
		  else {
			  hwnd = SwitchUtils.findWindow("NewBB体育");
			  if (hwnd != null) User32.INSTANCE.SetForegroundWindow(hwnd);
		  }
	   }
     } else if (code.contains("sb")) {
       WinDef.HWND hwnd = findWindowGoogleOr360("\u6C99\u5DF4\u4F53\u80B2");
       User32.INSTANCE.SetForegroundWindow(hwnd);
     } else if (code.contains("pb")) {
    	 //平博体育 - 360极速浏览器 11.0
       WinDef.HWND hwnd = findWindowGoogleOr360("\u5E73\u535A\u4F53\u80B2");
       User32.INSTANCE.SetForegroundWindow(hwnd);
     } else if (code.contains("l88")) {
       WinDef.HWND hwnd = findWindowGoogleOr360("188\u4F53\u80B2");
       User32.INSTANCE.SetForegroundWindow(hwnd);
     } else if (code.contains("df")) {
       WinDef.HWND hwnd = findWindowGoogleOr360("\u5927\u53D1\u4F53\u80B2");
       User32.INSTANCE.SetForegroundWindow(hwnd);
     } else if (code.contains("bti")) {
       WinDef.HWND hwnd = findWindowGoogleOr360("BTI\u4F53\u80B2");
       User32.INSTANCE.SetForegroundWindow(hwnd);
     } else if (code.contains("boin")) {
       WinDef.HWND hwnd = findWindowGoogleOr360("BBIN\u4F53\u80B2");
       User32.INSTANCE.SetForegroundWindow(hwnd);
       } else if (code.contains("hg")) {
	            WinDef.HWND hwnd = findWindowGoogleOr360("皇冠体育");
	            User32.INSTANCE.SetForegroundWindow(hwnd);
	          
}else if (code.contains("lj")) {
    WinDef.HWND hwnd = findWindowGoogleOr360("利记体育");
    User32.INSTANCE.SetForegroundWindow(hwnd);
	
}
   }

       private static WinDef.HWND findWindowGoogleOr360(final String  title){
    	   final String  title1 = title.concat(" - ").concat(BROWSER_360);
    	   System.out.println("title1=" + title1);
    	   WinDef.HWND hwnd = User32.INSTANCE.FindWindow(null, title1);
    	   if (hwnd != null) System.out.println("title1=" + title + " is founded");
    	   if (hwnd == null) hwnd = User32.INSTANCE.FindWindow(null, title.concat(" - ").concat(BROWSER_GOOGLE));
    	   return hwnd;
       }
       private static WinDef.HWND findWindow(final String partialTitle){
    	   final User32 user32 = User32.INSTANCE;
    	   //final String windownTitle = "向日葵远程控制";
    	   final List<WinDef.HWND> hwndList = new ArrayList<WinDef.HWND>();
    	   user32.EnumWindows(new WNDENUMPROC() {
    	         @Override
    	         public boolean callback(HWND hWnd, Pointer arg1) {
    	            char[] windowText = new char[512];
    	            user32.GetWindowText(hWnd, windowText, 512);
    	            String wText = Native.toString(windowText);
    	            if (!wText.isEmpty()) {
    	            	if (wText.contains(partialTitle)) {
    	            		hwndList.add(hWnd);
    	            		return false;
    	            	}
    	               return true;
    	            }
    	            return true;
    	         };
    	      }, null);   
    	   if (hwndList.size() == 1) return hwndList.get(0);
    	   return null;
    	   
       }
       
       public static void main(String[] args) {
    	   final User32 user32 = User32.INSTANCE;
    	   final String windownTitle = "向日葵远程控制";
    	   final List<WinDef.HWND> hwndList = new ArrayList<WinDef.HWND>();
    	   user32.EnumWindows(new WNDENUMPROC() {
    		     int count;
    	         
    	         @Override
    	         public boolean callback(HWND hWnd, Pointer arg1) {
    	            char[] windowText = new char[512];
    	            user32.GetWindowText(hWnd, windowText, 512);
    	            String wText = Native.toString(windowText);

    	            // get rid of this if block if you want all windows regardless of whether
    	            // or not they have text
    	            if (!wText.isEmpty()) {
    	            	if (wText.contains(windownTitle)) {
    	            		//okHWND = hWnd;
    	            		hwndList.add(hWnd);
    	            		//count++;
    	            		//System.out.println("count=" + count);
    	            		//break;
    	            		return false;
    	            	}
    	               //System.out.println(wText);
    	            	count++;
    	               return true;
    	            }

    	            
    	            return true;
    	         };
    	         //System.out.println("count=" + count);
    	      }, null);   	
    	   System.out.println(hwndList.size());
    	   
    	   
       }
 }

