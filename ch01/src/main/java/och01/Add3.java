package och01;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Add3
 */
public class Add3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Add3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet Start...");		
		// 받아온 파라미터 중 num을 받아서 int num에 넣는다
		// 넘어오면 다 String이라 parstInt를 이용하여 형 변환
		int num = Integer.parseInt(request.getParameter("num"));
		String han = request.getParameter("han");
		
		// num의 누적 합계를 return 하는 것이 목표
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		// 브라우저에 Display 하기 위한 방법
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		//out.println("<h1>1부터 " + num + "까지 합계</h1>");
		out.printf("<h1>han Test : %s</h1>", han);
		out.printf("<h1>1부터 %d까지 합계</h1>", num);
		out.println(sum);
		out.println("</body></html>");
		out.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//System.out.println("doPost Start... ");
		doGet(request, response);
	}

}
