package com.example.demo.zad1;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.net.SocketException;

@org.springframework.stereotype.Controller
public class Controller {


    @ResponseBody
    @GetMapping("/info")
    public static String printSite(HttpServletRequest request) throws SocketException {



        return "ip: " + request.getRemoteAddr();
    }
}
