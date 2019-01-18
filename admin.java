

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
 * Servlet implementation class admin
 */
@WebServlet("/admin")
public class admin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public admin() {
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
		
		
		PreparedStatement pstmt=conn.prepareStatement("insert into COURIER(CUS_NAME,CUS_MAIL,CUS_MNO,CUS_SOURCE,R_NAME,R_MNO,R_PIN,R_STATE,R_CITY,R_VIL,R_HNO) values (?,?,?,?,?,?,?,?,?,?,?)");
		
		
		String cname=request.getParameter("cn");
		String cmail=request.getParameter("ce");
		String cmno=request.getParameter("cm");
		String csr=request.getParameter("cs");
		String rname=request.getParameter("rn");
		String rmno=request.getParameter("rm");
		String rpin=request.getParameter("rp");
		String rstate=request.getParameter("rs");
		String rcity=request.getParameter("rc");
		String rvil=request.getParameter("rv");
		String rhno=request.getParameter("rh");
		
		
		
		pstmt.setString(1, cname);
		pstmt.setString(2, cmail);
		pstmt.setString(3, cmno);
		pstmt.setString(4, csr);
		pstmt.setString(5, rname);
		pstmt.setString(6, rmno);
		pstmt.setString(7, rpin);
		pstmt.setString(8, rstate);
		pstmt.setString(9, rcity);
		pstmt.setString(10, rvil);
		pstmt.setString(11, rhno);
		pstmt.executeUpdate();
		
		//response.sendRedirect("login.jsp");
		
	}catch (Exception e) {
		pw.print(e);
	}
	}

}
