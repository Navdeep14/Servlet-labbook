package cg.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cg.bean.Training;
import cg.service.ITrainingService;
import cg.service.TrainingService;

@WebServlet(name = "Details", urlPatterns = { "/Details.show" })
public class TrainingDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ITrainingService service;

	@Override
	public void init() throws ServletException {
		service = new TrainingService();
	}

	public void enroll(String name) {
		service.enroll(name);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Getting referer header to identify source of request
		String referer = request.getHeader("referer");
		if (!(referer.contains("name"))) { // handling details req
			// setting MIME type to response
			response.setContentType("text/html");

			// Getting output Stream of response to write HTML
			PrintWriter out = response.getWriter();
			// Getting list of Training details from datbase
			List<Training> list = service.fetchdetails();
			// Writing HTML on output Stream
			out.println("<center><h1>Training Details</h1></center><hr>");

			out.println("<form><table><tr><th>Training Id</th><th>Training name</th><th>Availabe Seat</th><th></th></tr>");
			for (Training training : list) {
				out.println("<tr><td>" + training.getTrainingId() + "</td><td>"
						+ training.getTrainingName() + "</td><td>"
						+ training.getAvailableSeat()
						+ "</td><td><a href='Details.show?name="
						+ training.getTrainingName() + "'>Enroll</a></td></tr>");
			}
			out.println("</table></form>");
		} else {
			String name = request.getParameter("name");
			response.sendRedirect("success.jsp?name=" + name);
			service.enroll(name);
		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

	}

}
