import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

@WebServlet(urlPatterns = {"/getForm3"})
public class Form3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String page = req.getParameter("page");
        if (Objects.nonNull(page)) {
            int liczba = Integer.valueOf(page);
            System.out.println(page);
            for (int i = liczba; i >0; i--) {
                if (liczba % i == 0 ) {
                    resp.getWriter().println(String.valueOf(i));
                }
            }

        }
    }
}
