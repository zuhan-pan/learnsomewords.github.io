/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import src.Artist;
import src.Artworks;

/**
 *
 * @author Harry
 */
@WebServlet(urlPatterns = {"/getArtist"})
public class getArtist extends HttpServlet {

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
            throws ServletException, IOException
    {
        
       List<Artist> artists = new ArrayList<>();
       List<Artworks> artworks = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(getArtist.class.getName()).log(Level.SEVERE, null, ex);
        }
        try
        {
            String dbURL = "jdbc:mysql://mysql1.it.nuigalway.ie:3306/mydb5013";
            String username = "mydb5013pz";
            String password = "vi9tuf";
            
          
            Connection connection = (Connection) DriverManager.getConnection(
                    dbURL, username, password);
            System.out.println("connecction = " + connection.toString());
            
            Statement statement = (Statement) connection.createStatement();            
            ResultSet rs = statement.executeQuery("select * from artists");
            System.out.println("rs = " + rs.toString());
            
            Statement statement2 = (Statement) connection.createStatement();
            ResultSet rs2 = statement2.executeQuery("select * from artworks");
            System.out.println("rs2 = " + rs2.toString());
            
            while (rs.next())
            {
                int id = rs.getInt("artistid");
                System.out.println(id);
                String firstname = rs.getString("first_name");
                String surname = rs.getString("surname");
                String nationality = rs.getString("nationality");
                int birthyear = rs.getInt("birthyear");
                String biography = rs.getString("biography");
                String photograph = rs.getString("photograph");

                Artist p = new Artist(id,firstname, surname,nationality,biography,photograph,birthyear);
                artists.add(p);
                
            }
            
            while (rs2.next())
            {
                int artistid = rs2.getInt("artistid");
                System.out.println(artistid);
                int artworkid = rs2.getInt("artworkid");
                String image = rs2.getString("image");
                String title = rs2.getString("title");              
                Artworks p = new Artworks(artistid, artworkid, image, title);
                artworks.add(p);
                
            }
            connection.close();
        } 
        
        catch (SQLException e)
        {
                System.out.println("SQLException: " + e.toString());
        }
        
        
        
        HttpSession session = request.getSession();
        session.setAttribute("artists", artists);
        
        HttpSession session2 = request.getSession();
        session2.setAttribute("artworks", artworks);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("artistSum.jsp");
        dispatcher.forward(request, response);
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
        processRequest(request, response);
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
