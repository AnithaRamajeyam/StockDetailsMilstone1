<%@ page language="java" contentType="text/html; charset=UTF-8"
 import="java.util.*,com.demo.stockExchange.model.Company"    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Display Company Details</title>
  <link rel="stylesheet" href="/css/style.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</head>
<body>
 <header>
        <div id="image">
            <p><img src="images/logo.jpg" alt="no image" width="70px" height="70px;"></p>
        </div>
        <div id="text">
            <p>Stock Market</p>
        </div>
    </header>
    <nav class="navbar navbar-expand-lg  bg-dark">

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="import-stock.html" id="navitem">Import Data
                    </a>
                </li>
                <li class="nav-item dropdown bg-dark">
                    <a class="nav-link dropdown-toggle bg-dark" href="#" id="navbarDropdown" role="button"
                        data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" id="navitem">Manage Company
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="insert-company.html">Insert New Company</a>
                        <a class="dropdown-item" href="update-company.html">Update Company Details</a>
                    </div>
                </li>
                <li class="nav-item dropdown bg-dark">
                    <a class="nav-link dropdown-toggle bg-dark" href="#" id="navbarDropdown" role="button"
                        data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" id="navitem">Manage Exchange
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="add-stockdetail.html">Add Stock Details</a>
                        <a class="dropdown-item" href="list-stockdetails.html">List All Stock Details</a>
                    </div>
                </li>
                <li class="nav-item">
                    <a class="nav-link " href="update-ipodetail.html" id="navitem">Update IPO Details</a>
                </li>
            </ul>

            <ul class="navbar-nav ml-auto">
                <li class="nav-item">
                    <a class="nav-link " href="#" id="navitem">Logout</a>
                </li>
            </ul>
        </div>
    </nav>
<%
List companyList=(List)request.getAttribute("companyList");
System.out.println(companyList);
%>


<table border="1">
<tr>
<td>code</td>
<td>name</td>
<td>ceo</td>
<td>Board of Directory</td>
<td>BriefWriteUP</td>

</tr>

<% for(int i=0;i<companyList.size();i++){
	Company company=(Company)companyList.get(i);
	%>
<tr>
<td><%= company.getCompanyCode() %></td>
<td><%=company.getCompanyName() %></td>
<td><%=company.getCeo() %></td>
<td><%= company.getBoardOfDirectors() %></td>
<td><%=company.getBriefWriteup() %></td>

</tr>
<% }%>

</table>
.
</table>
 <footer>
        <p id="ftext">Copyright&copy; 2019</p>
    </footer>
</body>
</html>