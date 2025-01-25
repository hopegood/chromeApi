//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.chrome.utils;

import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.User32;
import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.platform.win32.WinUser;
import java.util.ArrayList;
import java.util.List;

public class SwitchUtils {
	private static String BROWSER_GOOGLE = "Google Chrome";
	private static String BROWSER_360 = "360极速浏览器 11.0";

	public SwitchUtils() {
	}

	public static synchronized void switchTo(String code) {
		WinDef.HWND hwnd;
		if (code.equals("ysb")) {
			hwnd = findWindowGoogleOr360("易胜博体育");
			User32.INSTANCE.SetForegroundWindow(hwnd);
		} else if (code.equals("cmd")) {
			hwnd = findWindowGoogleOr360("CMD体育");
			User32.INSTANCE.SetForegroundWindow(hwnd);
		} else {
			WinDef.HWND hwnd1;
			String label;
			if (code.contains("e365===")) {
				label = code.replaceAll("e365===", "");
				label = label + "===e365";
				hwnd1 = findWindowGoogleOr360(label);
				if (hwnd1 != null) {
					User32.INSTANCE.SetForegroundWindow(hwnd1);
				} else {
					hwnd1 = findWindowGoogleOr360("365电竞");
					if (hwnd1 != null) {
						User32.INSTANCE.SetForegroundWindow(hwnd1);
					}
				}
			} else if (code.contains("ebb===")) {
				label = code.replaceAll("ebb===", "");
				label = label + "===ebb";
				hwnd1 = findWindowGoogleOr360(label);
				if (hwnd1 != null) {
					User32.INSTANCE.SetForegroundWindow(hwnd1);
				} else {
					hwnd1 = findWindowGoogleOr360("NewBB电竞");
					if (hwnd1 != null) {
						User32.INSTANCE.SetForegroundWindow(hwnd1);
					}
				}
			} else if (code.contains("eim===")) {
				label = code.replaceAll("eim===", "");
				label = label + "===eim";
				hwnd1 = findWindowGoogleOr360(label);
				if (hwnd1 != null) {
					User32.INSTANCE.SetForegroundWindow(hwnd1);
				} else {
					hwnd1 = findWindowGoogleOr360("im电竞");
					if (hwnd1 != null) {
						User32.INSTANCE.SetForegroundWindow(hwnd1);
					}
				}
			} else if (code.contains("im")) {
				hwnd = findWindowGoogleOr360("Sunflower 2.0");
				User32.INSTANCE.SetForegroundWindow(hwnd);
			} else if (code.contains("bet3656")) {
				hwnd = findWindowGoogleOr360("bet3656 - 在线体育投注");
				User32.INSTANCE.SetForegroundWindow(hwnd);
			} else if (code.contains("bet3655")) {
				hwnd = findWindowGoogleOr360("bet3655 - 在线体育投注");
				User32.INSTANCE.SetForegroundWindow(hwnd);
			} else if (code.contains("bet3654")) {
				hwnd = findWindowGoogleOr360("bet3654 - 在线体育投注");
				User32.INSTANCE.SetForegroundWindow(hwnd);
			} else if (code.contains("bet3653")) {
				hwnd = findWindowGoogleOr360("bet3653 - 在线体育投注");
				User32.INSTANCE.SetForegroundWindow(hwnd);
			} else if (code.contains("bet3652")) {
				hwnd = findWindowGoogleOr360("bet3652 - 在线体育投注");
				User32.INSTANCE.SetForegroundWindow(hwnd);
			} else if (code.contains("bet3651")) {
				hwnd = findWindowGoogleOr360("bet3651 - 在线体育投注");
				User32.INSTANCE.SetForegroundWindow(hwnd);
			} else {
				WinDef.HWND hwnd2;
				WinDef.HWND hwnd3;
				if (!code.contains("bet365x1") && !"tennis365x1".equals(code)) {
					if (!code.contains("bet365x2") && !"tennis365x2".equals(code)) {
						if (!code.contains("bet365x3") && !"tennis365x3".equals(code)) {
							if (code.contains("bet365x4")) {
								hwnd = findWindowGoogleOr360("365x4");
								if (hwnd != null) {
									User32.INSTANCE.SetForegroundWindow(hwnd);
									return;
								}

								hwnd1 = findWindowGoogleOr360("365x1");
								if (hwnd1 != null) {
									User32.INSTANCE.SetForegroundWindow(hwnd1);
									return;
								}

								hwnd2 = findWindowGoogleOr360("365x2");
								if (hwnd2 != null) {
									User32.INSTANCE.SetForegroundWindow(hwnd2);
									return;
								}

								hwnd3 = findWindowGoogleOr360("365x3");
								if (hwnd3 != null) {
									User32.INSTANCE.SetForegroundWindow(hwnd3);
									return;
								}
							} else {
								String windowTitle;
								if (code.contains("Ext365===") && code.contains("_share")) {
									windowTitle = code.replaceAll("Ext365===", "").replaceAll("_share", "") + "===365Share";
									hwnd3 = findWindowGoogleOr360(windowTitle);
									if (hwnd3 != null) {
										User32.INSTANCE.SetForegroundWindow(hwnd3);
										return;
									}
								} else if (code.contains("Ext365===")) {
									windowTitle = code.replaceAll("Ext365===", "") + "===365Ext";
									hwnd3 = findWindowGoogleOr360(windowTitle);
									if (hwnd3 != null) {
										User32.INSTANCE.SetForegroundWindow(hwnd3);
										return;
									}
								} else if (code.contains("bb")) {
									hwnd = findWindow("NewBB==上半场");
									if (hwnd != null) {
										User32.INSTANCE.SetForegroundWindow(hwnd);
									} else {
										hwnd = findWindow("NewBB==全场");
										if (hwnd != null) {
											User32.INSTANCE.SetForegroundWindow(hwnd);
										} else {
											hwnd = findWindow("NewBB体育");
											if (hwnd != null) {
												User32.INSTANCE.SetForegroundWindow(hwnd);
											}
										}
									}
								} else if (code.contains("sb")) {
									hwnd = findWindowGoogleOr360("沙巴体育");
									User32.INSTANCE.SetForegroundWindow(hwnd);
								} else if (code.contains("ob")) {
									hwnd = findWindowGoogleOr360("欧巴体育");
									User32.INSTANCE.SetForegroundWindow(hwnd);
								} else if (code.contains("fb")) {
									hwnd = findWindowGoogleOr360("FB体育");
									User32.INSTANCE.SetForegroundWindow(hwnd);
								} else if (code.contains("pb")) {
									hwnd = findWindowGoogleOr360("平博体育");
									User32.INSTANCE.SetForegroundWindow(hwnd);
								} else if (code.contains("l88")) {
									hwnd = findWindowGoogleOr360("188体育");
									User32.INSTANCE.SetForegroundWindow(hwnd);
								} else if (code.contains("df")) {
									hwnd = findWindowGoogleOr360("大发体育");
									User32.INSTANCE.SetForegroundWindow(hwnd);
								} else if (code.contains("bti")) {
									hwnd = findWindowGoogleOr360("BTI体育");
									User32.INSTANCE.SetForegroundWindow(hwnd);
								} else if (code.contains("boin")) {
									hwnd = findWindowGoogleOr360("BBIN体育");
									User32.INSTANCE.SetForegroundWindow(hwnd);
								} else if (code.contains("hg")) {
									hwnd = findWindowGoogleOr360("皇冠体育");
									User32.INSTANCE.SetForegroundWindow(hwnd);
								}else if (code.contains("fakeHg")) {
									hwnd = findWindowGoogleOr360("仿皇冠体育");
									User32.INSTANCE.SetForegroundWindow(hwnd);
								} else if (code.contains("lj")) {
									hwnd = findWindowGoogleOr360("利记体育");
									User32.INSTANCE.SetForegroundWindow(hwnd);
								}
							}
						} else {
							hwnd = findWindowGoogleOr360("365x3");
							if (hwnd != null) {
								User32.INSTANCE.SetForegroundWindow(hwnd);
								return;
							}

							hwnd1 = findWindowGoogleOr360("365x1");
							if (hwnd1 != null) {
								User32.INSTANCE.SetForegroundWindow(hwnd1);
								return;
							}

							hwnd2 = findWindowGoogleOr360("365x2");
							if (hwnd2 != null) {
								User32.INSTANCE.SetForegroundWindow(hwnd2);
								return;
							}

							hwnd3 = findWindowGoogleOr360("365x4");
							if (hwnd3 != null) {
								User32.INSTANCE.SetForegroundWindow(hwnd3);
								return;
							}
						}
					} else {
						hwnd = findWindowGoogleOr360("365x2");
						if (hwnd != null) {
							User32.INSTANCE.SetForegroundWindow(hwnd);
							return;
						}

						hwnd1 = findWindowGoogleOr360("365x1");
						if (hwnd1 != null) {
							User32.INSTANCE.SetForegroundWindow(hwnd1);
							return;
						}

						hwnd2 = findWindowGoogleOr360("365x3");
						if (hwnd2 != null) {
							User32.INSTANCE.SetForegroundWindow(hwnd2);
							return;
						}

						hwnd3 = findWindowGoogleOr360("365x4");
						if (hwnd3 != null) {
							User32.INSTANCE.SetForegroundWindow(hwnd3);
							return;
						}
					}
				} else {
					hwnd = findWindowGoogleOr360("365x1");
					if (hwnd != null) {
						User32.INSTANCE.SetForegroundWindow(hwnd);
						return;
					}

					hwnd1 = findWindowGoogleOr360("365x2");
					if (hwnd1 != null) {
						User32.INSTANCE.SetForegroundWindow(hwnd1);
						return;
					}

					hwnd2 = findWindowGoogleOr360("365x3");
					if (hwnd2 != null) {
						User32.INSTANCE.SetForegroundWindow(hwnd2);
						return;
					}

					hwnd3 = findWindowGoogleOr360("365x4");
					if (hwnd3 != null) {
						User32.INSTANCE.SetForegroundWindow(hwnd3);
						return;
					}
				}
			}
		}

	}

	private static WinDef.HWND findWindowGoogleOr360(String title) {
		String title1 = title.concat(" - ").concat(BROWSER_360);
		WinDef.HWND hwnd = User32.INSTANCE.FindWindow((String)null, title1);
		if (hwnd == null) {
			hwnd = User32.INSTANCE.FindWindow((String)null, title.concat(" - ").concat(BROWSER_GOOGLE));
		}

		return hwnd;
	}

	private static WinDef.HWND findWindow(final String partialTitle) {
		final User32 user32 = User32.INSTANCE;
		final List<WinDef.HWND> hwndList = new ArrayList();
		user32.EnumWindows(new WinUser.WNDENUMPROC() {
			public boolean callback(WinDef.HWND hWnd, Pointer arg1) {
				char[] windowText = new char[512];
				user32.GetWindowText(hWnd, windowText, 512);
				String wText = Native.toString(windowText);
				if (!wText.isEmpty()) {
					if (wText.contains(partialTitle)) {
						hwndList.add(hWnd);
						return false;
					} else {
						return true;
					}
				} else {
					return true;
				}
			}
		}, (Pointer)null);
		return hwndList.size() == 1 ? (WinDef.HWND)hwndList.get(0) : null;
	}

	public static void main(String[] args) {
		final User32 user32 = User32.INSTANCE;
		String windownTitle = "向日葵远程控制";
		final List<WinDef.HWND> hwndList = new ArrayList();
		user32.EnumWindows(new WinUser.WNDENUMPROC() {
			int count;

			public boolean callback(WinDef.HWND hWnd, Pointer arg1) {
				char[] windowText = new char[512];
				user32.GetWindowText(hWnd, windowText, 512);
				String wText = Native.toString(windowText);
				if (!wText.isEmpty()) {
					if (wText.contains("向日葵远程控制")) {
						hwndList.add(hWnd);
						return false;
					} else {
						++this.count;
						return true;
					}
				} else {
					return true;
				}
			}
		}, (Pointer)null);
	}
}
