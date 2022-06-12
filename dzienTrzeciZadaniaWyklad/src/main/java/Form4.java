import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/psot4"})
public class Form4 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String a = req.getParameter("a");
        String b = req.getParameter("b");
        String c = req.getParameter("c");

        int aInt = Integer.parseInt(a);
        int bInt = Integer.parseInt(b);
        int cInt = Integer.parseInt(c);

        int delta = bInt * bInt - 4 * aInt *cInt;

        if (delta > 0) {
            resp.getWriter().println((-bInt - delta) / 2 * aInt);
            resp.getWriter().println((-bInt + delta) / 2 * aInt);
        } else if (delta == 0) {
            resp.getWriter().println(-bInt / 2 * aInt);
        }
    }
}
