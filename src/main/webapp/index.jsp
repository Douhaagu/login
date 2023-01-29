<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@page import="java.sql.Connection"%>
<%@ include file="include/header.jsp" %>
<title>Welcome to SuperMarché</title>
</head>
<body>

<nav class="navbar navbar-expand-lg  bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">SuperMarché</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse justify-content-end" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">HOME</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Pricing</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="login.jsp">Login in</a>
        </li>
      </ul>
    </div>
  </div>
</nav>

<%@ include file="include/Footer.jsp" %>
</body>
</html>