package user;

import java.io.IOException;
import loginda.model.user;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class userservlert extends HttpServlet {

	managementUser manage;
    
    public void init() throws ServletException{
        manage = new managementUser();

    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    request.getRequestDispatcher("login.jsp").forward(request , response);
    }
  
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         String name= request.getParameter("name");
         String email =  request.getParameter("email");
         String password =request.getParameter("password");

         manage.signUp(new user(name,email,password));

        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
