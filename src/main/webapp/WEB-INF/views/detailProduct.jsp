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
	href="<c:url value='/resources/css/main.css'/>">
</head>
<body>
	<div class="app">
		<header class="header">
			<div class="grid">
				<nav class="header__navbar">
					<ul class="header__navbar-list">
						<li
							class="header__navbar-item header__navbar-item--has-qr header__navbar-item--separate">
							Vào ứng dụng cửa hàng trên H-ShOP <!-- Header QR code -->
							<div class="header__qr">
								<img src="./assets/img/qr_Code.png" alt="qr_Code"
									class="header__qr-img">
								<div class="header__qr-apps">
									<a href="" class="header__qr-link"> <img
										src="./assets/img/google.png" alt="google"
										class="header__qr-dowload-img">
									</a> <a href="" class="header__qr-link"> <img
										src="./assets/img/apstore.png" alt="apstore"
										class="header__qr-dowload-img">
									</a>
								</div>
							</div>
						</li>
						<li class="header__navbar-item"><span
							class="header__navbar-title--no-pointer">Kết nối</span> <a
							href="" class="header__navbar-icon-link"> <i
								class="header__navbar-icon fab fa-facebook"></i>
						</a> <a href="" class="header__navbar-icon-link"> <i
								class="header__navbar-icon fab fa-instagram"></i>
						</a></li>
					</ul>
					<ul class="header__navbar-list">
						<li class="header__navbar-item header__navbar-item--has-notify">
							<a href="" class="header__navbar-item-link "> <i
								class="header__navbar-icon fas fa-bell"></i> Thông báo
						</a>
							<div class="header__notify">
								<header class="header__notify-header">
									<h3>Thông báo mới nhận</h3>
								</header>
								<h2>Không có thông báo mới</h2>

							</div>
						</li>
						<li class="header__navbar-item"><a href=""
							class="header__navbar-item-link"> <i
								class="header__navbar-icon far fa-question-circle"></i> Trợ giúp
						</a></li>
						<!-- 				<li class="header__navbar-item header__navbar-item--bold header__navbar-item--separate">Đăng kí</li>
								<li class="header__navbar-item header__navbar-item--bold">Đăng nhập</li> -->
						<li class="header__navbar-item header__navbar-user"><i
							class="fas fa-user-circle header__navbar-user-avatar"></i> 
						   <c:choose>
								<c:when test="${empty sessionScope.account }">
									<a href="<c:url value='/login'/>"
										class="header__navbar-user-name">Đăng nhập</a>
								</c:when>
								<c:when test="${!empty sessionScope.account }">
									<span class="header__navbar-user-name"> <c:out
											value="${sessionScope.account.username}" />
									</span>
									<div class="header__navbar-user-menu">
										<a href="#">
											<p class="header__navbar-user-menu-item">Don hang cua toi</p>
										</a> <a href="#">
											<p class="header__navbar-user-menu-item">Dia chi cua toi</p>
										</a> <a href="#">
											<p class="header__navbar-user-menu-item">Don mua cua toi</p>
										</a> <a href="<c:url value='/logout'/>">
											<p class="header__navbar-user-menu-item">Dang xuat</p>
										</a>
									</div>
								</c:when>
							</c:choose></li>
					</ul>
				</nav>
				<!-- Header with search -->
				<div class="header-with-search">
					<div class="header__logo">
						<a href="<c:url value='/home' />"> <span> <img
								src="<c:url value='/resources/images/brand.png'/>"
								alt="brand.png" class="header__logo-img"></span>
						</a>
					</div>
					<div class="header__search">
						<form action="<c:url value='/search'/>" method="GET"
							style="flex: 1;">
							<div class="header__search-input-wrap">

								<input class="header__search-input" style="margin-top: 1rem;"
									name="keyword" placeholder="Nhập để tìm kiếm sản phẩm">
								<button type="submit" class="header__search-btn">
									<i class="header__search-btn-icon fas fa-search"></i>
								</button>
							</div>
						</form>
					</div>
					<!-- Layout Cart -->
					<div class="header__cart">
						<c:choose>
							<c:when test="${!empty sessionScope.cartDTO}">
								<a href="<c:url value='/view' />"> <span
									style="color: white; font-size: 1.4rem;">Giỏ hàng</span>

									<div class="header__cart-wrap">
										<i class=" header__cart-icon fas fa-shopping-cart"></i> <span
											class="header__cart-notice"> <c:out
												value="${sessionScope.quantity}" />
										</span>
									</div>
								</a>
							</c:when>
							<c:when test="${empty sessionScope.cartDTO}">
								<span style="color: white; font-size: 1.4rem;">Giỏ hàng</span>

								<div class="header__cart-wrap">
									<i class=" header__cart-icon fas fa-shopping-cart"></i> <span
										class="header__cart-notice"> </span>
								</div>
							</c:when>
						</c:choose>
					</div>
				</div>
			</div>
		</header>
		<div class="app__container">
			<div class="grid" style="min-height: 80rem;">
				<div class="grid__row app__content">
					<div class="grid__column-4">
						<div class="image__detail">
							<div class="home-product-item-img"
								style="background-image:url(<c:url value='/upload/${itemDTO.productDTO.image}'/>);">

							</div>
						</div>

					</div>
					<div class="grid__column-8">
						<c:url var="addToCartUrl" value="/addToCart"></c:url>
						<form:form modelAttribute="itemDTO" action="${addToCartUrl}"
							method="POST">
							<div class="information__detail">
								<div class="information__detail-name">
									<h1>${itemDTO.productDTO.name}</h1>
									<form:hidden path="id" />
									<p>Thuương hiệu: ${itemDTO.productDTO.brand}</p>
									<p style="color: red; font-size: 2.5rem">
										${itemDTO.unitPrice} vnd</p>
									<form:hidden path="unitPrice" />
									<p>Mau sac: ${ itemDTO.productDTO.color}</p>
									<p>The loai: ${itemDTO.productDTO.category}</p>
								</div>
								<div class="option">
									<div class="size">
										<p class="lable__size">Kich cỡ:</p>
										<form:select path="tmp" items="${itemDTO.productDTO.sizes}" />
									</div>
									<div class="quantity">
										<p class="lable__quantity">Số lượng</p>
										<form:input type="number" min="1" path="quantity" />

									</div>
									<button type="submit" class="btn btn--primary"
										style="margin-top: 2rem">Chon Mua</button>

								</div>
							</div>
						</form:form>

					</div>

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