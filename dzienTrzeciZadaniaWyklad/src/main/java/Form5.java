import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

@WebServlet(urlPatterns = {"/post5"})
public class Form5 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String celcToFahr = req.getParameter("celcToFahr");
        String fahrToCelc = req.getParameter("fahrToCelc");
        double degrees = Integer.valueOf(req.getParameter("degrees"));
        if (Objects.nonNull(fahrToCelc)) {
            resp.getWriter().append(String.valueOf(9/5*(degrees-32)));
        } else {
            resp.getWriter().append(String.valueOf(32 + (9/5*degrees)));
        }
    }
}
