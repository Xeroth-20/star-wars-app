<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <link type="text/css" rel="stylesheet" href="<c:url value='/css/bootstrap.css'/>"/>
        <link rel="apple-touch-icon" sizes="180x180" href="<c:url value='/images/apple-touch-icon.png'/>"/>
        <link rel="icon" type="image/png" sizes="32x32" href="<c:url value='/images/favicon-32x32.png'/>"/>
        <link rel="icon" type="image/png" sizes="16x16" href="<c:url value='/images/favicon-16x16.png'/>"/>
        <link rel="manifest" href="<c:url value='/site.webmanifest'/>"/>
        <title>Home | Stars Wars</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container">
                <a class="navbar-brand active" href="<c:url value='/'/>">
                    <img class="d-inline-block align-top" src="<c:url value="/images/favicon-32x32.png"/>"
                         alt="brand" width="30" height="30"/>
                    Star Wars
                </a>
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link" href="<c:url value='/films'/>">Films</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="<c:url value='/people'/>">People</a>
                    </li>
                </ul>
            </div>
        </nav>
        <main class="container my-4">
            <div class="bg-light p-5 rounded">
                <h1 class="display-4">Hello, Jedis!</h1>
                <p class="lead">
                    This is a simple example of a Star Wars Application.
                </p>
                <hr class="my-4">
                <p>It uses an external Star Wars API for retrieving all films and characters.</p>
                <a class="btn btn-primary" href="<c:url value='/films'/>">Explore films</a>
                <a class="btn btn-primary" href="<c:url value='/people'/>">Explore characters</a>
            </div>
        </main>
    </body>
</html>
