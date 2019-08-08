<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <title>Insert a new company</title>
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
                        <a class="dropdown-item" href="insertCompany.jsp">Insert New Company</a>
                        <a class="dropdown-item" href="updateCompany.jsp">Update Company Details</a>
                    </div>
                </li>
                <li class="nav-item dropdown bg-dark">
                    <a class="nav-link dropdown-toggle bg-dark" href="#" id="navbarDropdown" role="button"
                        data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" id="navitem">Manage Exchange
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="addStockDetail.jsp">Add Stock Details</a>
                        <a class="dropdown-item" href="listStockdetails.jsp">List All Stock Details</a>
                    </div>
                </li>
                <li class="nav-item">
                    <a class="nav-link " href="updateIpodetail.jsp" id="navitem">Update IPO Details</a>
                </li>
            </ul>

            <ul class="navbar-nav ml-auto">
                <li class="nav-item">
                    <a class="nav-link " href="#" id="navitem">Logout</a>
                </li>
            </ul>
        </div>
    </nav>
    <article>
        <form action="insert" method="post">
            <p id="body-text">Create a new company</p>
            <table>
                <tr>
                    <td><label>Companyname</label></td>
                    <td><input type="text" name="companyname" id="comapnyname" required /></td>
                </tr>
                <tr>
                    <td><label>CEO Name</label></td>
                    <td><input type="text" name="ceo" id="ceo" required /></td>
                </tr>
                <tr>
                    <td><label>Board Memebers</label></td>
                    <td><input type="text" name="boardofdirectors" id="boardofdirectors" required /></td>
                </tr>
                <tr>
                    <td><label>TurnOver</label></td>
                    <td><input type="text" name="turnover" id="turnover" required /></td>
                </tr>
                <tr>
                    <td><label>Brief Description</label></td>
                    <td><input type="text" name="briefdescription" id="briefdescription" required /></td>
                </tr>
                <tr>
                    <td><label>IPO Date</label></td>
                    <td><input type="date" name="ipodate" id="ipodate" required /></td>
                </tr>
            </table>
            <input type="submit" name="submit" value="save" class="btn" />
        </form>
    </article>
    <footer>
        <p id="ftext">Copyright&copy; 2019</p>
    </footer>
</body>
</html>