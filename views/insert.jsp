<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %> 
<%@ page import="java.io.*" %> 

<HTML>
    <HEAD>
        <TITLE>Feedback</TITLE>
    </HEAD>

    <BODY>
         <%
	String qa;
            if(request.getParameter("q1") != null) 
	  {
                if(request.getParameter("q1").equals("q1")) {
		qa="Yes";
                    out.println("Radio button 1 was selected.<BR>");
                }
                else {
		    qa="No";
                    out.println("Radio button 1 was not selected.<BR>");
                }
          }
	%>
	<%
	    String qb;
           if(request.getParameter("q2") != null) 
	  {
                if(request.getParameter("q2").equals("q2")) {
		    qb="Yes";
                  
                }
                else {
		    qb="No";
                    
                }
          }
	%>
	<%
	    String qc;
	    if(request.getParameter("q3") != null) 
	  {
                if(request.getParameter("q3").equals("q3")) {
		    qc="Yes";
                   
                }
                else {
		    qc="No";
                   
                }
          }
	%>
	<%
  	   String qd;
	   if(request.getParameter("q4") != null) 
	  {
                if(request.getParameter("q4").equals("q4")) {
		    qd="Yes";
                    
                }
                else {
		    qd="No";
                   
                }
          }
	%>
	<%
	    String qe;
	   if(request.getParameter("q5") != null) 
	  {
                if(request.getParameter("q5").equals("q5")) {
		    qe="Yes";
                   
                }
                else {
		    qe="No";
                   
                }
          }
	%>
	<%
	   String qf;
	   if(request.getParameter("q6") != null) 
	  {
                if(request.getParameter("q6").equals("q6")) {
		    qf="Yes";
                   
                }
                else {
		    qf="No";
                    
                }
          }
	%>
	<%
	   String qg;
	   if(request.getParameter("q7") != null) 
	  {
                if(request.getParameter("q7").equals("q7")) {
		    qg="Yes";
                  
                }

                else {
		    qg="No";
                   
                }
          }
	%>
	<%
	   String qh;
	   if(request.getParameter("q8") != null) 
	  {
                if(request.getParameter("q8").equals("q8")) {
		    qh="Yes";
                    
                }
                else {
		    qh="No";
                    
                }
          }
	%>
	<%
	   String qi;
	   if(request.getParameter("q9") != null) 
	  {
                if(request.getParameter("q9").equals("q9")) {
		    qi="Yes";
                    
                }
                else {
		    qi="No";
                    
                }
          }

	%>
	<%
	   String qj;
	   if(request.getParameter("q10") != null) 
	  {
                if(request.getParameter("q10").equals("q10")) {
		    qj="Yes";
                    
                }
                else {
		    qj="No";
                    
                }
          }

        %>

	<%

Class.forName("com.mysql.jdbc.Driver");
Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/warfana?"+"user=root&password=seecsnust");
Statement st=conn.createStatement();
		 
		 String sql= "insert into feedback7 values('"+qa+"','"+qb+"','"+qc+"','"+qd+"','"+qe+"','"+qf+"','"+qg+"','"+qh+"','"+qi+"','"+qj+"')";
		st.executeUpdate(sql);



	%>


  </BODY>
</HTML>