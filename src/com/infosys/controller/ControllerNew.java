package com.infosys.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.infosys.insert.InsertManager;

/**
 * Servlet implementation class ControllerNew
 */
public class ControllerNew extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerNew() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		        System.out.println("doPOST");
				String requests=request.getParameter("argument");
				List<String>dataList=new ArrayList<String>(); 
				
				String temp="data";
				//String temp_data;
				for(int i=0;i<8;i++)
				{
					int j=i+1;
					temp=temp+j;
				  dataList.add(request.getParameter(temp));
				  temp=temp.substring(0,4);
					
				}
				
				
				String name=System.getProperty("user.name");
				System.out.println(name);
				dataList.add(name);
				
				for(int i=0;i<dataList.size();i++)
				{
					System.out.println(dataList.get(i));
				}
				InsertManager insMang=new InsertManager();
				insMang.insertToExcel(dataList);
				
	}

}
