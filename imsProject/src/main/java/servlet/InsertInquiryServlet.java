package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Inquiry;
import dao.inquiryDAO;

@WebServlet("/InsertInquiryServlet")
public class InsertInquiryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String error = "";

		try {
			// 文字エンコーディングの指定
			request.setCharacterEncoding("UTF-8");
			// BookDAOのオブジェクト作成
			inquiryDAO inquirydao = new inquiryDAO();
			
			
			// ③Bookのオブジェクトを生成し、各setterメソッドを利用し、isbn、title、priceを設定する
			Inquiry inquiry = new Inquiry();
			int inquiryid = Integer.parseInt(request.getParameter("inquiryID"));
			inquiry.setName(request.getParameter("name"));
			inquiry.setSex(request.getParameter("sex"));
			int age = Integer.parseInt(request.getParameter("age"));
			inquiry.setEmail(request.getParameter("email"));
			inquiry.setAddress(request.getParameter("address"));
			inquiry.setDate(request.getParameter("date"));
			inquiry.setCategory(request.getParameter("category"));
			inquiry.setDescription(request.getParameter("description"));
			// ④③で生成したBookのオブジェクトを引数として、関連メソッドを呼び出す
			inquirydao.insertInquiry(inquiry);
			//ok
			request.getRequestDispatcher("/confirmInquiry").forward(request, response);
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
