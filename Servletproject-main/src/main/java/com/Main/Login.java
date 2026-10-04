package com.Main;

import java.io.IOException;

import com.dao.Daoclass;
import com.model.Pojo;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

    	String id = req.getParameter("id");
    	String pass = req.getParameter("pass");

    	Pojo p1 = new Pojo();
    	
		p1.setId(id);
    	p1.setPass(pass);

    	Daoclass d1 = new Daoclass();
    	String identity = d1.check(p1);
    	boolean result;
    	if(identity!=null) {
    		result =true;
    	}else {
    		result = false;
    	}
    	System.out.println("result = " + result);

    	if (result) {

    	    HttpSession session = req.getSession();
    	    session.setAttribute("id", id);
    	    System.out.println("Session ID = " + session.getAttribute("id"));

    	    RequestDispatcher rd = req.getRequestDispatcher("final.html");
    	    rd.forward(req, res);

    	} else {

    	    req.setAttribute("msg", "Invalid Email or Password");

    	    RequestDispatcher rd = req.getRequestDispatcher("Login.html");
    	    rd.forward(req, res);
    	}
    }
}