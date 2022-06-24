<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <link type="text/css" rel="stylesheet" href="<c:url value='/css/bootstrap.css'/>"/>
        <title>${person.name} | Stars Wars</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <div class="container">
                <a class="navbar-brand" href="<c:url value='/'/>">Star Wars</a>
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
        <main class="container my-3">
            <a class="btn btn-outline-primary mb-3" href="<c:url value='/people'/> ">Go back</a>
            <h3 class="text-primary">${person.name}</h3>
            <p><span class="fw-bold">Gender: </span>${person.gender}</p>
            <p><span class="fw-bold">Height: </span>${person.height}</p>
            <p><span class="fw-bold">Birth year: </span>${person.birthYear}</p>
            <h4>Films</h4>
            <ul class="list-group">
                <c:forEach var="film" items="${person.films}">
                    <a class="list-group-item list-group-item-action" href="<c:url value='/films/${film.id}'/>">${film.title}</a>
                </c:forEach>
            </ul>
        </main>
    </body>
</html>
