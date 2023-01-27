package com.xworkz.familyMembers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 5,urlPatterns = "/father")
public class Family extends HttpServlet {
	


		@Override
		public void init(ServletConfig config) throws ServletException {
			System.out.println("Running family init .........");
		}

		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("Running family doGet..........");
			System.out.println(Thread.currentThread().getName());
			String name = req.getParameter("name");
			String age = req.getParameter("age");
			String weight = req.getParameter("weight");
			String DOB = req.getParameter("dateofbirth");
			String Height = req.getParameter("Height");
			String Awards = req.getParameter("awards");
			String achievement = req.getParameter("achievement");
			String role = req.getParameter("role");
			String goal = req.getParameter("goal");
			String girlfriend = req.getParameter("girlfriend");
			String boyfriend = req.getParameter("boyfriend");
			String father = req.getParameter("father");
			String mother = req.getParameter("mother");
			String sister = req.getParameter("sister");
			String brother = req.getParameter("brother");
			String sports = req.getParameter("sports");
			String grandfather = req.getParameter("grandfather");
			String grandmother = req.getParameter("grandmother");
			String salary = req.getParameter("salary");
			String career = req.getParameter("career");

			System.out.println("Name"+
					name +"age" +age +"weight"+ weight +"DOB"+ DOB +"Height"+ Height +"Awards"+ Awards +"Achievement"+ achievement + "Role"+role +"Goal"+ goal +"girlfriend"+ girlfriend +"boyfriend"+ boyfriend
							+"father"+ father +"mother"+ mother +"sister"+ sister + "brother"+brother +"sports" +sports +"grandfather"+ grandfather +"grandmother"+ grandmother +"salary" +salary +"career"+ career);

			PrintWriter printWriter = resp.getWriter();
			printWriter.print("<html>");
			printWriter.print("<body>");
			printWriter.print("span");
			printWriter.print(" Name " + name + " is saved succesfuly");
			printWriter.print("</span>");
			printWriter.print("</body>");
			printWriter.print("</html>");
			
			resp.setContentType("text/html");
}
}
