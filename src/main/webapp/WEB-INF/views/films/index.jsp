<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <link type="text/css" rel="stylesheet" href="<c:url value='/css/bootstrap.css'/>"/>
        <title>Films | Stars Wars</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <div class="container">
                <a class="navbar-brand" href="<c:url value='/'/>">Star Wars</a>
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link active" href="<c:url value='/films'/>">Films</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="<c:url value='/people'/>">People</a>
                    </li>
                </ul>
            </div>
        </nav>
        <main class="container my-3">
            <h3>Films</h3>
            <ul class="list-group mb-2">
                <c:forEach var="film" items="${films}">
                    <a class="list-group-item list-group-item-action" href="<c:url value='/films/${film.id}'/>">${film.title}</a>
                </c:forEach>
            </ul>
            <div class="row gx-2 justify-content-center">
                <c:if test="${previousPage != null}">
                    <div class="col-auto">
                        <a class="btn btn-primary" href="<c:url value='/films?page=${previousPage}'/>">Previous</a>
                    </div>
                </c:if>
                <c:if test="${nextPage != null}">
                    <div class="col-auto">
                        <a class="btn btn-primary" href="<c:url value='/films?page=${nextPage}'/>">Next</a>
                    </div>
                </c:if>
            </div>
        </main>
    </body>
</html>
