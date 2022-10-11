package com.kainos.ea.dao;

import com.kainos.ea.db.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDao {

    public Employee getEmp (int EmployeeID, Connection conn) throws SQLException {

        String selectEmployeeQuery = "Select EmployeeID, EmployeeName, Salary from Employee where EmployeeID = ?;";

        PreparedStatement empStmt = conn.prepareStatement(selectEmployeeQuery);
        empStmt.setInt(1, EmployeeID);
        empStmt.executeUpdate();
        ResultSet empRes = empStmt.getResultSet();
        Employee dbEmp = null;
        while (empRes.next()) {
            dbEmp = new Employee(empRes.getShort("EmployeeID"),
                    empRes.getString("EmployeeName"), empRes.getInt("Salary"));
        }
        return dbEmp;
    }

    }

