/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import absence.entity.Etudiant;
import absence.pack.EtudiantListe;
import absence.pack.Remplissage;
import absence.util.Connecteur;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.Statement;
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
@WebServlet(urlPatterns = {"/resultat"})
public class resultat extends HttpServlet {

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
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet resultat</title>");            
            out.println("</head>");
            out.println("<body>");
            
            String gr=request.getParameter("id_groupe");
            int x=Integer.parseInt(gr);
            
           String mm=request.getParameter("mat");
           int z=Integer.parseInt(mm);
           
            ArrayList<Etudiant> liste1=EtudiantListe.GetEtudiant(x);
            
            String[] values = request.getParameterValues("presence");
         //  ArrayList <Seance> eee=new ArrayList ();
           ArrayList<Integer> listEntier=new ArrayList<>();
           
           for (String s:values)
           {   //out.println(s);
               listEntier.add(Integer.parseInt(s));}
           
           //out.println(listEntier.size());  
            // out.println("iiiiiiiiiiiiii");
            
            Remplissage r;
          Statement st=Connecteur.getConnection();
                
                for(Etudiant var:liste1)
                {
                       
                        if(!(listEntier.contains(var.getCode_etudiant())))
                        {out.println("absent<br>");
                        out.println(""+var.getCode_etudiant()+z+x+0);
                            Remplissage.remplir(var.getCode_etudiant(),0,z,x);
                            
                        }
                        else 
                        {
                            out.println("present<br>");
                            out.println(""+var.getCode_etudiant()+z+x+1);
                            Remplissage.remplir(var.getCode_etudiant(),1,z,x);
                            
                            
                        }
                               
                }
               
           
            
          
           
             /*
              for(int i=0;i<liste1.size();i++)
                {    Etudiant d=liste1.get(i);
                int xx=d.getCode_etudiant();
                        
                        
                        
                   Ajour rr=new Ajour(xx, z, x);
                   
            
                     }
            */
            
            
            
            
            
            
            
            
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
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(resultat.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(resultat.class.getName()).log(Level.SEVERE, null, ex);
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
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(resultat.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(resultat.class.getName()).log(Level.SEVERE, null, ex);
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
