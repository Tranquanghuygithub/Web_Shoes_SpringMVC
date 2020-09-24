<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css"
	href="https://cdnjs.cloudflare.com/ajax/libs/normalize/8.0.1/normalize.min.css">
<link rel="stylesheet"
	href="<c:url value='/resources/fonts/fontawesome-free-5.12.1-web/css/all.min.css'/>">
<!-- Font chữ google roboto font -->
<link
	href="https://fonts.googleapis.com/css?family=Roboto:300,300i,400,500,700&display=swap&subset=vietnamese"
	rel="stylesheet">
<link rel="stylesheet" type="text/css"
	href="<c:url value='/resources/css/bootstrap.min.css'/>">
<link rel="stylesheet" type="text/css"
	href="<c:url value='/resources/css/base.css'/>">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/main.css">
<!-- ${pageContext.request.contextPath}/resources/css/main.css -->
</head>
<body>
	<div class="app">
		<header class="header_address">
			<div class="grid " style="display: flex;">

				<div class="header__logo">
					<a href="<c:url value='/home' />"> <span> <img
							src="<c:url value='/resources/images/brand.png'/>"
							alt="brand.png" class="header__logo-img"></span>
					</a>
				</div>
				<div class="header-name"
					style="margin-top: 2rem; margin-left: 10rem;">
					<h2>Địa Chỉ Giao Hàng</h2>
				</div>
			</div>
		</header>
		<div class="app__container">

			<div class="grid" style="min-height: 80rem;" >
				<h2>Địa chỉ</h2>
				<div class="address-content">
					<div class="address-body">
						<h3>${sessionScope.address.name}</h3>
						<p>Số điện thoại : ${sessionScope.address.phone}</p>
						<p>${sessionScope.address.description},
							${sessionScope.address.ward}, ${sessionScope.address.district},
							${sessionScope.address.city}</p>
					</div>
					<div class="action">
						<button
							onclick="window.location.href='${pageContext.request.contextPath}/payment'"
							class="btn__continue">Giao đến địa chỉ này</button>
						<button class="btn__update" data-toggle="collapse"
							data-target="#collapseExample">Sửa</button>
					</div>

				</div>
				<div class="collapse address--change" id="collapseExample">

					<form:form
						action="${pageContext.servletContext.contextPath}/changeAddress"
						modelAttribute="address" method="POST">
						<label> Họ tên </label>
						<form:input path="name" class="form-control" />

						<label> Số điện thoại </label>

						<form:input path="phone" class="form-control" />

						<label> Tỉnh/Thành Phố </label>

						<form:input path="city" class="form-control" />

						<label> Quận/Huyện </label>

						<form:input path="district" class="form-control" />

						<label> Phường/Xã </label>

						<form:input path="ward" class="form-control" />

						<label> Mô tả địa chỉ</label>

						<form:textarea path="description" class="form-control" />

						<div class="btn__address-change">
							<button class="btn__change--cancel " data-toggle="collapse"
								data-target="#collapseExample">Hủy bỏ</button>
							<form:button class="btn__change--update">Cập nhập</form:button>
						</div>
					</form:form>


				</div>
			</div>
			<div class="footer">
				<div class="grid">
					<div class="grid__row grid__footer">
						<div class="grid__column-2-4">
							<h3 class="footer__heading">Cham soc khac khang</h3>
							<ul class="footer-list">
								<li class="footer-item"><a href=""
									class="footer-item__link">Trung Tâm Trợ Giúp</a></li>
								<li class="footer-item"><a href=""
									class="footer-item__link">Phản Hồi Khách Hàng</a></li>
								<li class="footer-item"><a href=""
									class="footer-item__link">Hướng Dẫn Mua Hàng</a></li>
							</ul>
						</div>
						<div class="grid__column-2-4">
							<h3 class="footer__heading">Gioi thieu</h3>
							<ul class="footer-list">
								<li class="footer-item"><a href=""
									class="footer-item__link">Gioi thieu ve Shop</a></li>
								<li class="footer-item"><a href=""
									class="footer-item__link">Dieu khoan Shop</a></li>
								<li class="footer-item"><a href=""
									class="footer-item__link">Tuyen Dung</a></li>
							</ul>
						</div>
						<div class="grid__column-2-4">
							<h3 class="footer__heading">Danh muc</h3>
							<ul class="footer-list">
								<li class="footer-item"></li>
							</ul>
						</div>
						<div class="grid__column-2-4">
							<h3 class="footer__heading">Theo doi</h3>
							<ul class="footer-list">
								<li class="footer-item"><a href=""
									class="footer-item__link"> <i
										class="fab fa-facebook-square"></i> Facebook
								</a></li>
								<li class="footer-item"><a href=""
									class="footer-item__link"> <i
										class="header__navbar-icon fab fa-instagram"></i> Instagram
								</a></li>
								<li class="footer-item"><a href=""
									class="footer-item__link"> <i class="fab fa-linkedin"></i>
										Linked
								</a></li>
							</ul>
						</div>
						<div class="grid__column-2-4">
							<h3 class="footer__heading">Vao cua hang</h3>
							<div class="footer__download">
								<img src="./assets/img/qr_Code.png" alt=""
									class="footer__download-qr-img">
								<div class="footer__download-apps">
									<img src="./assets/img/apstore.png" alt=""
										class="footer__download-app-img"> <img
										src="./assets/img/google.png" alt=""
										class="footer__download-app-img">
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="grid__full-grid">
					<p class="footer__copyright">© 2019 Tran Huy JSC. All rights
						reserved.</p>
				</div>
			</div>
		</div>
	</div>
	<!-- jQuery -->
	<script src="<c:url value='/resources/js/jquery-3.5.1.min.js'/>"></script>
	<!-- Bootstrap JavaScript -->
	<script src="<c:url value='/resources/js/bootstrap.min.js'/>"></script>
</body>
</html>