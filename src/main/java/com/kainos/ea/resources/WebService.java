package com.kainos.ea.resources;

import com.kainos.ea.dao.EmployeeDao;
import com.kainos.ea.db.Employee;
import io.swagger.annotations.Api;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import java.sql.SQLException;

import static com.kainos.ea.db.dbConection.getConnection;

@Path("/api")
@Api("Engineering Academy Dropwizard API")
public class WebService {


    @GET
    @Path("/print/{emp}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getMsg(@PathParam("EmployeeID:") int employeeID) throws SQLException {
         EmployeeDao emp1 = new EmployeeDao();
         emp1.getEmp(employeeID, getConnection());
        return Response.ok(emp1).build();
    }


        //read employee id from path
        //get employee from db
        //map db fields to employee instance
        //return employee in response body





    @POST
    @Path("/print")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String sendMsg(Message message) {
        return "Hello from a RESTful Web service: " + message.getText();
    }





}
