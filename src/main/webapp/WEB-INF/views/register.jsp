<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel="stylesheet" type="text/css"
			href="https://cdnjs.cloudflare.com/ajax/libs/normalize/8.0.1/normalize.min.css">
			<link rel="stylesheet" href="<c:url value='/resources/fonts/fontawesome-free-5.12.1-web/css/all.min.css'/>">
			<!-- Font chữ google roboto font -->		
			<link href="https://fonts.googleapis.com/css?family=Roboto:300,300i,400,500,700&display=swap&subset=vietnamese" rel="stylesheet">
			<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/bootstrap.min.css'/>">
			<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/base.css'/>">
			<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/main.css'/>">
		</head>
		<body>
			<div class="modal">
				<div class="modal__overlay"></div>
				<div class="modal__body">
					<!-- Nhunng thanh pha rieng se code trong nay -->
					<!-- is form login register.... -->
					<!-- Authen form -->
					<div class="auth-form">
						<div class="auth-form__container">
							<div class="auth-form__header">
								<button class="btn auth-form__heading">
								Đăng kí
								</button>
								<button class="btn auth-form__switch-btn">
								Đăng nhập
								</button>
							</div>
							<div class="auth-form__form">
								<div class="auth-form__group"> 
									<!-- Deer group de  sau nay nhoms cacs ther input vaf label neeus phats sinh <!-->
									<input type="text" class="auth-form__input" placeholder="Email cua ban">
								</div>
								<div class="auth-form__group">
									<input type="text"class="auth-form__input" placeholder="Password cua ban" name="">
								</div>
								<div class="auth-form__group">
									<input type="text"class="auth-form__input" placeholder="Nhap lai Password" name="">
								</div>
							</div>
							<div class="auth-form__controls">
								<button class="btn btn--return">TRỞ LẠI</button>
								<button class="btn btn--register">ĐĂNG KÍ</button>
							</div>
							<div class="auth-form__socials">
								<a href="" class="btn btn--with-icon btn--with-icon-face">
									<i class="fab fa-facebook-square"></i>
									Kết nối với Facebook
								</a>
								<a href="" class="btn btn--with-icon btn--with-icon-google">
									<i class="fab fa-google"></i>
									Kết nối với Google
								</a>
							</div>
						</div>
					</div>
				</div>
			</div>
		<!-- jQuery -->
	<c:url value='/resources/js/bootstrap.min.js'/>
	<script src="<c:url value='/resources/js/jquery-3.5.1.min.js'/>"></script>
	<!-- Bootstrap JavaScript -->
	<script src="<c:url value='/resources/js/bootstrap.min.js'/>" ></script>
		</body>
</html>