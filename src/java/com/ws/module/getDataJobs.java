/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ws.module;

import LeoLib.utils.DBPrepared;
import static LeoLib.utils.DBPrepared.MYSQL_DRIVER;
import com.ws.controller.ServletBase;
import static com.ws.util.Constants.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author leo
 */
public class getDataJobs{
    public void getUserList(HttpServletRequest request, HttpServletResponse respones) throws Exception {
        String sql = "SELECT * FROM getUser WHERE name=? AND password=?";
        List<String> where = new ArrayList();
        where.add("author1");
        where.add("author1");

        DBPrepared dbp = new DBPrepared(
                MYSQL_DRIVER,
                DBConnStr,
                DBAccount,
                DBPassword);
        ArrayList<HashMap> resultList = (ArrayList<HashMap>)dbp.getDataListCon(sql, where);
        LeoLib.tools.Toolets.printALHM(resultList);
        
        request.setAttribute("resultList", resultList);
    }
}
