package com.webserver.servlet;

import com.webserver.http.HttpRequest;
import com.webserver.http.HttpResponse;

/**
 * Servlet是JAVAEE标准中的一个接口，意思是运行在服务端的小程序
 * 我们用它来处理某个具体的请求
 *
 * 当前Servlet用于处理用户注册业务
 */
public class RegServlet {
    public void service(HttpRequest request, HttpResponse httpResponse){
        System.out.println("RegServlet:开始处理用户注册....");

        /**
         *    1：通过request获取用户在注册页面上输入的注册信息（表单上的信息）
         *    2：将用户的注册信息写入文件user.dat中
         *    3：设置response给客户端响应注册结果页面
         */

        System.out.println("RegServlet:用户注册处理完毕....");
    }

}
