
import java.sql.*;
import java.io.*;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class track
 */
@WebServlet("/track")
public class track extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public track() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","root");
		
		
		Statement stmt=conn.createStatement();
		
		String tid=request.getParameter("tid");
		
		
		String sq="select * from status where c_id='"+tid+"' ";
		
		ResultSet rs=stmt.executeQuery(sq);
		
		if(rs.next())
		{
			HttpSession ss=request.getSession();
			ss.setAttribute("cid", rs.getString("C_ID"));
			ss.setAttribute("cloc", rs.getString("CUR_LOC"));
			ss.setAttribute("cdate", rs.getString("CUR_DATE"));
			ss.setAttribute("ctime", rs.getString("CUR_TIME"));
			ss.setAttribute("cstatus", rs.getString("CUR_STATUS"));
		
			response.sendRedirect("track_details.jsp");
			
		}else
		{
			response.sendRedirect("login.jsp");
			
		}
		
		
		
		conn.close();
	}catch (Exception e) {
		pw.print(e);
	}

	}

}
