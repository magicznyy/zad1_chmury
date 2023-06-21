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

      try (java.util.Scanner s = new java.util.Scanner(new java.net.URL("https://api.ip2location.io/?key=F662197B9997A4BE246F0111A25FFFA1&ip=2a01:118f:642:1400:ece3:240:e605:9fd&format=json&lang=en").openStream(), "UTF-8").useDelimiter("\\A")) {
           System.out.println(s.next());
      } catch (java.io.IOException e) {
         e.printStackTrace();
       }

        return "ip: " + request.getRemoteAddr();
    }
}
