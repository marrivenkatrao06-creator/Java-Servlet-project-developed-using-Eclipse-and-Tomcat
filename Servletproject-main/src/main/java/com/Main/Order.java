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

@WebServlet("/Order")
public class Order extends HttpServlet {

    protected void doPost(HttpServletRequest req,HttpServletResponse resp)
            throws ServletException,IOException{

        String id=req.getParameter("id");
        String Plantname=req.getParameter("Plantname");
        String Price=req.getParameter("Price");
        String Address=req.getParameter("Address");

        Pojo p2=new Pojo();

        p2.setId(id);
        p2.setPlantname(Plantname);
        p2.setPrice(Price);
        p2.setAddress(Address);

        Daoclass d=new Daoclass();

        String status=d.orderinsert(p2);

        if(status.equalsIgnoreCase("true")){

            RequestDispatcher rd=req.getRequestDispatcher("ordersuccess.html");
            rd.forward(req, resp);

        }else{

            RequestDispatcher rd=req.getRequestDispatcher("failorder.html");
            rd.forward(req, resp);

        }

    }

}