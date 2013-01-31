package Challenge1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jenni Burgmeier
 */
public class CalculationForwardController extends HttpServlet {

    private static final String destination = "/result.jsp";
    private String rlegA;
    private String rlegB;
    private String rArea;
    private String radius;
    private double pi = 3.14159265359;
    private String cArea;
    private String tLegA;
    private String tLegB;
    private String tLegC;

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        rlegA = request.getParameter("rlegA");
        rlegB = request.getParameter("rlegB");
        calculateRectangleArea();
        request.setAttribute("rArea", rArea);

        radius = request.getParameter("radius");
        calculateCircleArea();
        request.setAttribute("cArea", cArea);
        
        tLegA = request.getParameter("tLegA");
        tLegB = request.getParameter("tLegB");
        calculateTriangleLeg();
        request.setAttribute("tLegC", tLegC);

        RequestDispatcher dispatcher =
                getServletContext().getRequestDispatcher(destination);
        dispatcher.forward(request, response);
    }

    private void calculateRectangleArea() {
        double area;
        area = Double.parseDouble(rlegA) * Double.parseDouble(rlegB);
        rArea = String.valueOf(area);
    }
    
    private void calculateCircleArea() {
        double area;
        area = Double.parseDouble(radius)* Double.parseDouble(radius) * pi ;
        cArea = String.valueOf(area);
    }
    
    private void calculateTriangleLeg() {
        double length;
        length = Math.sqrt((Double.parseDouble(tLegA) * Double.parseDouble(tLegA) *
                (Double.parseDouble(tLegB) * Double.parseDouble(tLegB))));
        tLegC = String.valueOf(length);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
