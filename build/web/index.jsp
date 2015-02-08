<%-- 
    Document   : index
    Created on : Dec 8, 2014, 4:10:39 PM
    Author     : aymen
--%>
<%@page import="absence.pack.GroupeListe"%>
<%@page import="absence.entity.demande"%>
<%@page import="java.util.ArrayList"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Index</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <select>
        <%
                ArrayList<demande> liste=GroupeListe.GetGroupe();
                for(int i=0;i<liste.size();i++)
                {
                    demande d=liste.get(i);%>
        
        
            <option>
                <%=d.lib_groupe%>
                
            </option><%   }
            %>
        </select>
                 
    </body>
</html>

