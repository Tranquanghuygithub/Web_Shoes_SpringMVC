<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html >

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>ÄÄng nháº­p</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
        integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
    <link rel="shotrcut icon" href="/resources/images/LG.png">
    <link rel="stylesheet" href="/resources/css/bootstrap.min.css">

</head>

<body>
    <div class="container" >
        <div class="row" style="margin-top: 90px;" >
            <div class="col-md-4"></div>
            <div class="col-md-4 col-md-push-4" style="background-image: url('/images/b2.jpg'); min-height: 500px;">
                <form action="login" method="post"  role="form">
                    <legend>ÄÄng nháº­p</legend>
                    <div class="form-group">
                        <label for="">TÃªn ÄÄng nháº­p</label>
                        <input type="text" class="form-control" name="user_login" id=""
                            placeholder="Nháº­p tÃªn tÃ i khoáº£n">
                    </div>
                    <div class="form-group">
                        <label for="">Máº­t kháº©u</label>
                        <input type="password" class="form-control" name="password_login" id=""
                            placeholder="Nháº­p máº­t kháº©u">
                    </div>
                    <div style="text-align: center;">
                        <!-- <button type="submit" class="btn btn-primary" style="width: 250px;height: 38px; background-color: #034ea1; border: none;color: aliceblue;">ÄÄng nháº­p</button> -->
                        <button type="submit" class="btn btn-primary" >ÄÄng nháº­p</button>
                    </div>
                    
                </form>
            </div>
            <div class="col-md-4"></div>
        </div>
    </div>
<!-- jQuery -->
	<c:url value='/resources/js/bootstrap.min.js'/>
	<script src="<c:url value='/resources/js/jquery-3.5.1.min.js'/>"></script>
	<!-- Bootstrap JavaScript -->
	<script src="<c:url value='/resources/js/bootstrap.min.js'/>" ></script>
</body>

</html>