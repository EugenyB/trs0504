package server;

import dao.StudentDAO;
import tables.Student;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by eugen on 05.04.2017.
 */
@WebServlet(name = "TRSServlet", urlPatterns = {"*.html"})
public class TRSServlet extends HttpServlet {
    @EJB
    StudentDAO studentDAO;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Student> students = studentDAO.findAll();
        request.setAttribute("students", students);
        request.getRequestDispatcher("/students.jsp").forward(request,response);
    }
}
