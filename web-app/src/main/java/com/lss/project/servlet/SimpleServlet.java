package com.lss.project.servlet;

import com.lss.project.service.SimpleService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by lssemail on 2017/10/12.
 */

public class SimpleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out = resp.getWriter();
        String serviceDesc = SimpleService.ServiceDesc();
        out.println(serviceDesc);
        out.flush();
        out.close();
    }
}
