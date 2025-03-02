package myServlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.soap.ws.client_jp.MySOAPImplService;
import com.soap.ws.client_jp.MySOAPImpl;

@WebServlet("/IsPrime")
public class Time extends HttpServlet{

	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Time() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String gmt = request.getAttribute("GMT").toString();
		MySOAPImplService soap = new MySOAPImplService();
		MySOAPImpl impl = soap.getMySOAPImplPort();
		String result = impl.time(gmt);
		
		
		PrintWriter out = response.getWriter();
		out.write(result);  
		out.flush();
	    out.close();
		
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		doGet(request,response);
	
	}
	
}