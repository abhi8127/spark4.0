package service;

import config.DbConfig;
import entity.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    public void addCustomer(Customer customer) throws SQLException {
        Connection con= DbConfig.getConnection();
        PreparedStatement ps=
                con.prepareStatement("INSERT INTO customers(name,phone) VALUES(?,?)");
        ps.setString(1, customer.getName());
        ps.setString(2, customer.getPhone());
        ps.executeUpdate();
        ps.close();
        con.close();

    }

    public List<Customer> getAllCustomer() throws SQLException{
        List<Customer> list=new ArrayList<>();
        Connection conn=DbConfig.getConnection();
        Statement st= conn.createStatement();
        ResultSet rs= st.executeQuery("select * from customers");
        while(rs.next())
        {
            list.add(new Customer(rs.getString("name"),
                    rs.getString("phone"),rs.getInt("id")));
        }
        return list;
    }
}
