

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class branch
 */
@WebServlet("/branch")
public class branch extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public branch() {
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
		
		
		PreparedStatement pstmt=conn.prepareStatement("insert into STATUS(C_ID,CUR_LOC,CUR_DATE,CUR_TIME,CUR_STATUS) values (?,?,?,?,?)");
		
		
		String cusid=request.getParameter("cid");
		String curloc=request.getParameter("cl");
		String dte=request.getParameter("dt");
		String tme=request.getParameter("tm");
		String sts=request.getParameter("st");
				
		pstmt.setString(1, cusid);
		pstmt.setString(2, curloc);
		pstmt.setString(3, dte);
		pstmt.setString(4, tme);
		pstmt.setString(5, sts);
		pstmt.executeUpdate();
		
		//response.sendRedirect("login.jsp");
		
	}catch (Exception e) {
		pw.print(e);
	}
	}

}
