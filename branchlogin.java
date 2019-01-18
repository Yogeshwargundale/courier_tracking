

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class branchlogin
 */
@WebServlet("/branchlogin")
public class branchlogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public branchlogin() {
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
		
		
		
		String uname=request.getParameter("un");
		String pass=request.getParameter("ps");
		
		String sq="select * from login where uname='"+uname+"' and password='"+pass+"'";
		
		ResultSet rs=stmt.executeQuery(sq);
		
		if(rs.next())
		{
			HttpSession ss=request.getSession();
			ss.setAttribute("unm", rs.getString("UNAME"));
			ss.setAttribute("psw", rs.getString("PASSWORD"));
			
		
			response.sendRedirect("branch.jsp");
			
		}else
		{
			response.sendRedirect("branchlogin.jsp");
			
		}
		
		
		
		conn.close();
	}catch (Exception e) {
		pw.print(e);
	}


	}

}
