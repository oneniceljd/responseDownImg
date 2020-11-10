package com.dong.imgdown.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

public class ImgDownServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取图片路径
        String realPath = "D:\\ideajavaprojec\\imgdown\\target\\classes\\1.png";
        System.out.println("路径为：" + realPath);
        //获取文件名
        String fileName = realPath.substring(realPath.lastIndexOf("\\")+1);
        //设置响应头
        resp.setHeader("Content-Disposition", "attachment;filename=" + fileName);
        //获取下载文件的输入流
        InputStream in = new FileInputStream(realPath);
        //创建缓冲区
        byte[] buffer = new byte[1024];
        int len = 0 ;
        //获取OutputStream对象
        OutputStream out = resp.getOutputStream();
        //将FileInputStream流写入buffer缓冲区，使用OutputStream将buffer输出到客户端
        while((len=in.read(buffer))!=-1){
            out.write(buffer,0,len);
        }
        in.close();
        out.close();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
