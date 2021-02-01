import java.io.IOException;
import java.io.PrintWriter;

@javax.servlet.annotation.WebServlet(name = "DiscountServlet", urlPatterns = "/display-discount")
public class DiscountServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        double price = Double.parseDouble(request.getParameter("price"));
        double percent = Double.parseDouble(request.getParameter("percent"));
        double discount = price * percent * 0.01;
        double totalPrice = price - discount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("Original price : " + price + "<br>");
        writer.println("Discount price : " + discount + "<br>");
        writer.println("Price must to pay (After discount): " + totalPrice);
        writer.println("</html>");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
