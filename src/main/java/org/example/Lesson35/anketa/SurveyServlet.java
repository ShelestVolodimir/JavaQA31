package org.example.Lesson35.anketa;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class SurveyServlet extends HttpServlet {
        private static final long serialVersionUID = 1L;

        protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String fullName = request.getParameter("fullName");
            String phone = request.getParameter("phone");
            String email = request.getParameter("email");
            String age = request.getParameter("age");

            response.setContentType("text/html");
            response.setCharacterEncoding("UTF-8");

            PrintWriter out = response.getWriter();
            out.println("<html><head><title>Анкета</title></head><body>");
            out.println("<h2>Отримана інформація:</h2>");
            out.println("<p>ПІБ: " + fullName + "</p>");
            out.println("<p>Телефон: " + phone + "</p>");
            out.println("<p>Email: " + email + "</p>");
            out.println("<p>Вік: " + age + "</p>");
            out.println("</body></html>");
        }
    }

