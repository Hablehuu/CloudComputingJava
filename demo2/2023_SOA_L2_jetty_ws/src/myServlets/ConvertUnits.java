package myServlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import main.java.com.soap.ws.client_jp.MySOAPImplService;
import main.java.com.soap.ws.client_jp.MySOAPImpl;

@WebServlet("/IsPrime")
public class ConvertUnits extends HttpServlet{

	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConvertUnits() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String units = request.getAttribute("units").toString();
		int number = Integer.parseInt(request.getAttribute("number").toString());
		MySOAPImplService soap = new MySOAPImplService();
		MySOAPImpl impl = soap.getMySOAPImplPort();
		int result = 0;
		
		switch(units) {
		  case "poundsToKilos":
			  result = impl.poundsTokilograms(number);
		    break;
		  case "kilosToPounds":
			  result = impl.kilogramsToPounds(number);
		    break;
		  case "kilometersToMiles":
			  result = impl.kilometersToMiles(number);
			    break;
		  case "milesToKilometers":
			  result = impl.milesToKilometers(number);
			    break;
		  case "inchesToCentimeters":
			  result = impl.inchesToCentimeters(number);
				break;
		  case "centimetersToInches":
			  result = impl.centimetersToInches(number);
				break;
		  case "feetToMeters":
			  result = impl.feetToMeters(number);
				break;
		  case "metersToFeet":
			  result = impl.metersToFeet(number);
				break;
		  default:
		    // code block
		}

		
		
		
		
		
		
		
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
