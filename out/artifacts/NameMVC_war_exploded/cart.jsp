<%@ page import="us.mattgreen.model.Product" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %><%--
  Created by IntelliJ IDEA.
  User: tech
  Date: 9/24/2018
  Time: 9:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%
    Cookie items = new Cookie("items", request.getParameter("products"));
    items.setMaxAge(60*60*24);
    response.addCookie(items);
%>--%>
<html>
<head>
    <title>Shopping Cart</title>
    <link rel="stylesheet" href="./css/styles.css">
</head>

<header>
    <div class="container">
        <div id="branding">
            <h1><span class="highlight">Frahm</span>Stores</h1>
        </div>
        <nav>
            <ul>
                <li >
                    <a href="index.jsp">Home</a>
                </li>
                <li >
                    <a href="productList.do">Pricing</a>
                </li>
                <li class="current">
                    <a href="cart.go">Cart</a>
                </li>
            </ul>
        </nav>
    </div>
</header>
<section id="newsletter">
    <div class="container">
        <h1>Subscribe to our newsletter</h1>
        <form>
            <input type="email" placeholder="Enter email...">
            <button type="submit" class="button_1">Subscribe</button>
        </form>
    </div>
</section>
<body>
<h3>Shopping Cart</h3>
<form action="bill.go">
    <table>
        <%
            List recs = (List) request.getAttribute("products");
            Iterator it = recs.iterator();
            double total = 0;
            while (it.hasNext()) {
                Product product = (Product) it.next();
                out.print("<tr class='purch'><td> " + product.getProductName() + " </td><td>" +
                        String.format("$%3.2f",product.getPrice()) + "</td></tr>");
                total+=product.getPrice();
            }
            out.print("<tr class='total' ><td>Total:</td><td>" +
                    String.format("$%3.2f",total) + "</td></tr>");
        %>
    </table>
    <input type="submit" value="Complete Order">
</form>
</body>
</html>
