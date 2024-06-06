package pandey;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class om
 */
public class om extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private  String []Jokes  = {
	 "whole world is a garbage"," today is hag day "," 2 june ki roti"," vidya ki arthi vdyaarthi wahh...wa. "	, 
	 "sunday is monday in Exam time " ,"sunday is the holiday this is  real truth ","Mango is a juicy fruite ","Study time is equals to war with books and phones   "
	 };

    /**
     * Default constructor. 
     */
    public om() {
        // TODO Auto-generated constructor stub
    }
    static int fact(int n ) {
     int facto =0;
    	if (n ==1 || n==0)
    		return 1;
    	else 
    	facto = n*fact(n-1);
    	return facto ;
    	
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String str1 =request.getParameter("num1");
		String str2 =request.getParameter("num2");
		String str3 =request.getParameter("bit");
		int ans = 0 ;
		
		int a = Integer.parseInt(str1);
		int b= Integer.parseInt(str2);
		if(str3.equals("1")) ans =a+b;
		else if  (str3.equals("2")) ans =a-b;
		else if  (str3.equals("3")) ans =a*b;
		else if  (str3.equals("4")) ans =a/b;
		else if  (str3.equals("5")) ans =a%b;
		else if  (str3.equals("6")) ans =a*a ;
		else if   (str3.equals("7")) 
			ans = fact(a);
		
		
	
		
		
		
		
		
		
		int  randomindex =(int)(Math.random() * Jokes.length);
		String randomjoke = Jokes[randomindex];
		response.sendRedirect("result.jsp?ans="+ans+"&joke="+randomjoke);
	
		}
	

		// TODO Auto-generated method stub
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
