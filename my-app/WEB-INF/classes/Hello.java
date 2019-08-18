import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Hello extends HttpServlet {
   private String message;
   public void init() throws ServletException {
      message = "Hello";
   }
   public void service(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      PrintWriter out = response.getWriter();
      out.println(message);
   }
   public void destroy() {
   }
}
