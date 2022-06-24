<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <link type="text/css" rel="stylesheet" href="<c:url value='/css/bootstrap.css'/>"/>
        <title>${film.title} | Stars Wars</title>
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
            <a class="btn btn-outline-primary mb-3" href="<c:url value='/films'/> ">Go back</a>
            <h3 class="text-primary mb-0">${film.title}</h3>
            <p class="text-muted">Episodio ${film.episodeId}</p>
            <p>${film.summary}</p>
            <p><span class="fw-bold">Director: </span>${film.director}</p>
            <p><span class="fw-bold">Producer: </span>${film.producer}</p>
            <p><span class="fw-bold">Release date: </span>${film.releaseDate}</p>
        </main>
    </body>
</html>
