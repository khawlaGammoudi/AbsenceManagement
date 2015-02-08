/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import absence.entity.Etudiant;
import absence.entity.Matiere;
import absence.pack.EtudiantListe;
import absence.pack.MatiereListe;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author aymen
 */
@WebServlet(urlPatterns = {"/Liste_mat"})
public class Liste_mat extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Liste_mat</title>");   
            //out.println("<script language='text/javascript' src='gestion_absences/js/functions.js'>");
            out.println("</head>");
            out.println("<body>");
             out.println(" <form name=ff method=get action=resultat>");
            
             String y=request.getParameter("groupe"); 
             
             out.println(" <input type=hidden name='id_groupe' value="+y+">");
             int x=Integer.parseInt(y);
             out.println(" <select name='mat'>");
             ArrayList<Matiere> liste=MatiereListe.GetMatiere(x);
                out.println(" <option></option>");
               
                for(int i=0;i<liste.size();i++)
                {
                    Matiere d=liste.get(i);
                    out.println(" <option value="+d.getCode_mat()+">");
                    out.println(d.getLib_mat());
                    out.println("</option>");
                }
               out.println(" </select>");
            ArrayList<Etudiant> liste1=EtudiantListe.GetEtudiant(x);
            
  
             out.println("<table border=1>");
             out.println("<tr>");
                    
                   
                    out.println("<td>");
                    out.println("Nom");
                    out.println("</td>");
                    out.println("<td>");
                    out.println("Prenom");
                    out.println("</td>");
                    out.println("<td>");
                    out.println("Presence");
                    out.println("</td>");
                    out.println("</tr>");
             
             
             
             
             
             for(int i=0;i<liste1.size();i++)
                {
                    out.println("<tr>");
                    
                    Etudiant d=liste1.get(i);
                    out.println("<td>");
                    out.println(d.getNom());
                    out.println("</td>");
                    out.println("<td>");
                    out.println(d.getPrenom());
                    out.println("</td>");
                    out.println("<td>");
                    out.println("<input type=checkbox name='presence' value="+d.getCode_etudiant()+" >");
                    out.println("</td>");
                    out.println("</tr>");
                }
             
             
             out.println("</table>");
             
             
              out.println(" <input type=submit value=valider  >");
               
               
            out.println(" </form>");
                
          
               
               
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Liste_mat.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Liste_mat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Liste_mat.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Liste_mat.class.getName()).log(Level.SEVERE, null, ex);
        }
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
