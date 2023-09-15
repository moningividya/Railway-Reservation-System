package khirodh;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ReservationServlet")
public class ReservationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReservationServlet() {
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
		// Retrieve form data
        String source = request.getParameter("source");
        String destination = request.getParameter("destination");
        String date = request.getParameter("date");
        String travelClass = request.getParameter("class");

        // Process the data (you can perform any actions you need here)

        // Display the selected options (you can replace this with your own logic)
        response.setContentType("text/html");
        response.getWriter().println("<html><head><title>Reservation Details</title></head><body>");
        response.getWriter().println("<h2>Reservation Succesfull with the Following Details Below</h2>");
        response.getWriter().println("<p>Source: " + source + "</p>");
        response.getWriter().println("<p>Destination: " + destination + "</p>");
        response.getWriter().println("<p>Date of Travel: " + date + "</p>");
        response.getWriter().println("<p>Class: " + travelClass + "</p>");
        response.getWriter().println("</body></html>");
    }
	}


