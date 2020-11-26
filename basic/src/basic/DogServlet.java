package basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DogServlet
 */
@WebServlet("/DogServlet")
public class DogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		//사용자의 선택 값 가져오기
		String[] dog=request.getParameterValues("dog");
//		System.out.println(Arrays.toString(dog));
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.print("<html><head><title>선호도</title></head>");
		out.print("<body><h3>당신이 선택한 강아지 종류</h3>");
		out.print("<ul>");
		for(String s:dog) {
			out.print("<li>"+s+"</li>");
		}		
		out.print("</ul></body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
