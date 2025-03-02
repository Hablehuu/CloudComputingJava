package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import myClass.CurrencyConverter;
/**
 * Servlet implementation class Demo1servlet
 */
@WebServlet("/Demo1servlet")
public class Demo1servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Demo1servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		CurrencyConverter client = new CurrencyConverter();

		String from = request.getParameter("from").toString();
		String to = request.getParameter("to").toString();
		double amount = Double.parseDouble(request.getParameter("amount"));
		double amount2 = Double.parseDouble(request.getParameter("amount2"));
		PrintWriter out = response.getWriter();
		if(from.equals("") || amount <= 0 || to.equals("") || amount2 <= 0){
			out.write("error: Please, provide a value!");  
		}else{
			String result = "";
			result = client.convert(from, to, amount,amount2);
			out.write(result); 			
		}
					 
		out.flush();
	    out.close();
		
		
		
	}

}
