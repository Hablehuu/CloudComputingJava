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
public class Prime extends HttpServlet{

	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Prime() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		int number = Integer.parseInt(request.getAttribute("number").toString());
		MySOAPImplService soap = new MySOAPImplService();
		MySOAPImpl impl = soap.getMySOAPImplPort();
		String result = impl.isPrime(number);
		
		
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
		/*
		StringBuffer request_body = new StringBuffer();
		String line = null;
		try {
		  BufferedReader reader = request.getReader();
		  while ((line = reader.readLine()) != null)
			  request_body.append(line);
		} catch (Exception e) { /*report an error }
        
        
        if(!request_body.toString().equals("")){
        	    		
        	
        	
        	JSONObject json;
        	try {
        		JSONParser parser = new JSONParser();
            	json = (JSONObject) parser.parse(request_body.toString());
        	} catch (ParseException e) {
        		// crash and burn
        		throw new IOException("Error parsing JSON request string");
        	}
		
	
        	Map<String, String> options = new LinkedHashMap<>();
	    	options.put("message", "Bad Request: body of the request message is empty or incomplete...");
		    String json = new Gson().toJson(options);
			
	    	 	
			response.setContentType("application/json");
		    response.setCharacterEncoding("UTF-8");
        	response.setStatus(302);
        	response.getWriter().write(json.toString());
        				
			
		}else{
			
			Map<String, String> options = new LinkedHashMap<>();
	    	options.put("message", "Bad Request: body of the request message is empty or incomplete...");
		    String json = new Gson().toJson(options);
			
	    	 	
			response.setContentType("application/json");
		    response.setCharacterEncoding("UTF-8");
		    response.setStatus(400);
		    response.getWriter().write(json.toString());
			
		}  
		*/
		
		
		
		
	}
	
}