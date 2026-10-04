package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.model.Pojo;

public class Daoclass {

    String url = "jdbc:mysql://localhost:3306/nursery";
    String user = "root";
    String password = "root";

    // ---------------- Register ----------------
    public String insert(Pojo p) {

        String id = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/nursery","root","root");

            PreparedStatement ps = c.prepareStatement(
                    "insert into register(Fullname,ReferCode,Mail,Phone,Pass) values(?,?,?,?,?)");

            ps.setString(1, p.getFullname());
            ps.setString(2, p.getReferCode());
            ps.setString(3, p.getMail());
            ps.setString(4, p.getPhone());
            ps.setString(5, p.getPass());

            int n = ps.executeUpdate();

            if (n> 0) {
            	//System.out.println("666666666666666666");
                PreparedStatement ps1 = c.prepareStatement(
                        "select id from register where Phone=? and Mail=?");

                ps1.setString(1, p.getPhone());
                ps1.setString(2, p.getMail());

                ResultSet rs = ps1.executeQuery();

                if (rs.next()) {
                    id = rs.getString("id");
                   // System.out.println("77777777777777777777");
                }

                rs.close();
                ps1.close();
            }

            ps.close();
            c.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return id;
    }

    public String check(Pojo p1) {

        String result =null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/nursery","root","root");

            PreparedStatement ps = c.prepareStatement(
                    "SELECT id FROM register WHERE Id=? AND pass=?");

            ps.setString(1, p1.getId());
            ps.setString(2, p1.getPass());

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
            	result = rs.getString("id");
            }

            rs.close();
            ps.close();
            c.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    // ---------------- Order ----------------
    public String orderinsert(Pojo p) {

        String status = "fail";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection c = DriverManager.getConnection(url, user, password);

            PreparedStatement ps = c.prepareStatement(
                    "insert into ordertable(id,plantname,price,address) values(?,?,?,?)");

            ps.setString(1, p.getId());
            ps.setString(2, p.getPlantname());
            ps.setString(3, p.getPrice());
            ps.setString(4, p.getAddress());

            int n = ps.executeUpdate();

            if (n > 0) {
                status = "true";
            }

            ps.close();
            c.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }

}