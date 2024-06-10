package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import app1code.BillLogic;

/**
 * Servlet implementation class ConsumerServlet
 */
public class ConsumerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ConsumerServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		
		String consumerno = request.getParameter("consumerno");
		String consumername = request.getParameter("consumername");
		String previous = request.getParameter("pmonthreading");
		String current = request.getParameter("cmonthreading");
		String typeofcon = request.getParameter("connection");

		Long preLong = Long.parseLong(previous);
		Long currLong = Long.parseLong(current);

		BillLogic ecbill = new BillLogic();
		

		float totalAmount = 0;



		switch (typeofcon) {
		case "domestic":
			long unitConsume1 = ecbill.calculateUnitCnsume(currLong, preLong);
			totalAmount = ecbill.domesticBillAmount(unitConsume1);
			break;
		case "commercial":
			long unitConsume2 = ecbill.calculateUnitCnsume(currLong, preLong);
			totalAmount = ecbill.commercialBillAmount(unitConsume2);
			break;
		}

		HttpSession session = request.getSession();
		session.setAttribute("consumerno", consumerno);
		session.setAttribute("consumername", consumername);
		session.setAttribute("billAmt", totalAmount);
		response.sendRedirect("billdisplay.jsp");
	}

}
