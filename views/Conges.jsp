<%@ page import="java.sql.*" %>
<% Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); %>

<HTML>
    <HEAD>
        <TITLE>Road Information</TITLE>
    </HEAD>

    <BODY>
        <p> Road Information </p>
        <% 
Class.forName("com.mysql.jdbc.Driver");
Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/warfana?"+"user=root&password=seecsnust");
Statement st=conn.createStatement();


String id = request.getParameter("id"); 

ResultSet resultset = st.executeQuery("select * from RoadCongestion where road_id= '" + id + "'") ;  

ResultSet resultset1 = st.executeQuery("select * from VehicleOwners where road_id= '" + id + "'") ;  


ResultSet resultset2 = st.executeQuery("select * from Links where road_id= '" + id + "'") ;  

ResultSet resultset3 = st.executeQuery("select * from Police where road_id= '" + id + "'") ;  


ResultSet resultset4 = st.executeQuery("select * from Complains where road_id= '" + id + "'") ;  

ResultSet resultset5 = st.executeQuery("select * from Suggestions where road_id= '" + id + "'") ;  


           

            if(!resultset.next()) {
                out.println("Sorry, could not find that publisher. ");
            } else {
        %>

<p> Road Information </p>

        <TABLE BORDER="1">
            <TR>
               <TH>ID</TH>
               <TH>Name</TH>
		     <TH>NoofLanes</TH>
               <TH>Total Cars</TH>
               <TH>Segments</TH>
               <TH>Complains</TH>
               <TH>Suggestions</TH>
               <TH>Police</TH>
               <TH>Parking</TH>
               <TH>Emergency</TH>

           </TR>
           <TR>

               <TD> <%= resultset.getString(1) %> </TD>
               <TD> <%= resultset.getString(2) %> </TD>
               <TD> <%= resultset.getString(3) %> </TD>
               <TD> <%= resultset.getString(7) %> </TD>
               <TD> <%= resultset2.getString(4) %> </TD>
               <TD> <%= resultset4.getString(3) %> </TD>
               <TD> <%= resultset5.getString(4) %> </TD>
               <TD> <%= resultset3.getString(4) %> </TD>
		    <TD> <%= resultset1.getString(9) %> </TD>
               <TD> <%= resultset1.getString(7) %> </TD>



           </TR>
       </TABLE



       <BR>
       <% 
           } 
       %>
    </BODY>
</HTML>