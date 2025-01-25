//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.chrome.servlet;

import com.chrome.utils.FileUtils;
import com.chrome.utils.StringUtils;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResDataServlet extends HttpServlet {
	private static final long serialVersionUID = -1340311711353988698L;

	public ResDataServlet() {
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String name = this.getUTF8Value(req, "name");
			Integer isPrice = Integer.parseInt(req.getParameter("isPrice"));
			Integer isBet = Integer.parseInt(req.getParameter("isBet"));
			String data = FileUtils.readFile("common", name);
			if (!StringUtils.isNullOrEmpty(data)) {
				this.response(resp, data);
			} else {
				if (isPrice == 1) {
					data = FileUtils.readPriceFile("common", name);
				} else if (isBet == 1) {
					data = FileUtils.readBetFile("common", name);
				}

				if (!StringUtils.isNullOrEmpty(data)) {
					this.response(resp, data);
				} else {
					data = FileUtils.readRefreshFile("common", name);
					this.response(resp, data);
				}
			}
		} catch (Exception var7) {
			var7.printStackTrace();
		}

	}

	protected String getUTF8Value(HttpServletRequest req, String parameter) {
		String value = req.getParameter(parameter);
		if (value == null) {
			return null;
		} else {
			try {
				value = URLDecoder.decode(req.getParameter(parameter), "UTF-8");
			} catch (UnsupportedEncodingException var5) {
				value = null;
			}

			return value;
		}
	}

	protected void response(HttpServletResponse resp, String data) throws IOException {
		resp.setCharacterEncoding("UTF-8");
		PrintWriter out = resp.getWriter();
		out.write(data);
		out.flush();
		out.close();
	}
}
