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

@WebServlet("/Register")
public class Register extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String Fullname = req.getParameter("Fullname");
        String ReferCode = req.getParameter("ReferCode");
        String Mail = req.getParameter("mail");
        String Phone = req.getParameter("phone");
        String pass = req.getParameter("pass");

       // System.out.println("888888888888888888");
        System.out.println("Fullname : " + Fullname);
        System.out.println("ReferCode : " + ReferCode);
        System.out.println("Mail : " + Mail);
        System.out.println("Phone : " + Phone);
        System.out.println("Pass : " + pass);

        String code = "plant@11";

        if (ReferCode == null || !ReferCode.equals(code)) {

            req.setAttribute("error", "Invalid referral code");

            RequestDispatcher rd = req.getRequestDispatcher("Register.html");
            rd.forward(req, resp);
            return;
        }

        Pojo p = new Pojo();

        p.setFullname(Fullname);
        p.setReferCode(ReferCode);
        p.setMail(Mail);
        p.setPhone(Phone);
        p.setPass(pass);

        System.out.println(p);

        Daoclass d = new Daoclass();

        String id = d.insert(p);
       

       System.out.println("Registration id : " + id);

        if (id != null) {
req.setAttribute("id1", id);
            // Redirect to Login page after successful registration
        	
           RequestDispatcher ds=req.getRequestDispatcher("success.jsp");
           ds.forward(req, resp);


        } else {

            req.setAttribute("error", "Registration Failed");

            RequestDispatcher rd = req.getRequestDispatcher("Register.html");
            rd.forward(req, resp);
        }
    }
}