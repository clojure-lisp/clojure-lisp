package net.clojure_lisp;

import java.io.IOException;
import javax.servlet.http.*;

public class ClojureLispServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        resp.setContentType("text/plain");
        resp.getWriter().println("This is an About page");
    }
}