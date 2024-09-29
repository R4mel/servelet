package hello.servelet.web.frontcontroller.v5;

import hello.servelet.web.frontcontroller.ModelView;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public interface MyHandlerAdapter {
    boolean support(Object handler);

    ModelView handle(HttpServletResponse response, HttpServletRequest request, Object handler) throws ServletException, IOException;
}
