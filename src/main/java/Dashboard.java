import java.io.*;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;

/**
* Servlet implementation class Dashboard
*/
@WebServlet("/Dashboard")
public class Dashboard extends HttpServlet {
        private static final long serialVersionUID = 1L;
       
    /**
* @see HttpServlet#HttpServlet()
*/
    public Dashboard() {
        super();
        // TODO Auto-generated constructor stub
    }

        /**
         * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                  PrintWriter out = response.getWriter();
                    out.println("<html><body>");
                   
                    //HttpSession session=request.getSession(false);  
                    String userId = request.getParameter("username");
                   
                    if (userId.equals("Rohini Chavhan") || userId.equals("Mugdha Kapure") || userId.equals("Sanjana Deore") || userId.equals("Pooja Kude")) {
                    out.println("Successfully Logged In!");
                        out.println("<br>");
                    out.println("  Your Username is: " + userId + "<br>");
                        out.println("<br>");
                        out.println("  <a href='logout'>Logout of session</a><br>");
                    } else {
                    out.println("Error: Invalid Login.<br>");
                        out.println("<br>");
                        out.println("<a href='http://localhost:8080/ValidationLogin/'>Login</a><br>");
                    }
                    out.println("</body></html>");
        }

        /**
         * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                doGet(request, response);
        }

}

