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
        <title>${film.title} | Star Wars</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container">
                <a class="navbar-brand" href="<c:url value='/'/>">
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
