package sj;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LinkServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // JSPから送られたパラメータ「name」を取得
        String name = request.getParameter("name");

        // メッセージを作成してリクエストスコープに格納
        String message = "こんにちは、" + name + " さん！";
        request.setAttribute("message", message);

        // index.jsp へフォワード
        RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
        dispatcher.forward(request, response);
    }
}
