<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="description" content="Fake storefront">
  <meta name="keywords" content="distrubted java">
  <meta name="author" content="Chris Frahm">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Storefront FROM JSP| Welcome</title>
  <link rel="stylesheet" href="./css/styles.css">
</head>

<body>
<header>
  <div class="container">
    <div id="branding">
      <h1><span class="highlight">Frahm</span>Stores</h1>
    </div>
    <nav>
      <ul>
        <li class="current">
          <a href="index.jsp">Home</a>
        </li>
        <li>
          <a href="productList.do">Product List</a>
        </li>
        <li>
          <a href="cart.go">Cart</a>
        </li>
      </ul>
    </nav>
  </div>
</header>

<h1>Search!</h1>
<form action="ProductController" method="GET">
  <input type="text" name="search"/>
  <input type="submit" value="Search" />
</form>

<section id="showcase">
  <div class="container">
    <h1>Affordable Foods</h1>
    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras at pulvinar leo. Vivamus et finibus orci. Ut lacinia
      leo velit, vel viverra lectus lobortis eget.</p>
  </div>
</section>
<section id="newsletter">
  <div class="container">
    <h1>Subscribe to our newsletter</h1>
    <form>
      <input type="email" placeholder="Enter email...">
      <button type="submit" class="button_1">Subscribe</button>
    </form>
  </div>
</section>

<section id="boxes">
  <div class="container">
    <div class="box">
      <img src="./img/fruit.jpg" alt="fruit">
      <h3>Fruits</h3>
      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras at pulvinar leo. Vivamus et finibus orci. Ut
        lacinia leo velit, vel viverra lectus lobortis eget.</p>
    </div>
    <div class="box">
      <img src="./img/meat.jpg" alt="meat">
      <h3>Meats</h3>
      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras at pulvinar leo. Vivamus et finibus orci. Ut
        lacinia leo velit, vel viverra lectus lobortis eget.</p>
    </div>
    <div class="box">
      <img src="./img/bread.jpg" alt="bread">
      <h3>Bread</h3>
      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras at pulvinar leo. Vivamus et finibus orci. Ut
        lacinia leo velit, vel viverra lectus lobortis eget.</p>
    </div>
  </div>

</section>
<footer>
  <p>Frahm Stores, Copyright &copy; 2018</p>
</footer>
</body>

</html>