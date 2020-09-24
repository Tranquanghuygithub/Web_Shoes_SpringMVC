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
	href="https://cdnjs.cloudflare.com/ajax/libs/normalize/8.0.1/normalize.min.css" />
<!-- Font chữ google roboto font -->
<link
	href="https://fonts.googleapis.com/css?family=Roboto:300,300i,400,500,700&display=swap&subset=vietnamese"
	rel="stylesheet" />
<link rel="stylesheet" type="text/css"
	href="<c:url value='/resources/css/bootstrap.min.css'/>" />
<link rel="stylesheet" type="text/css"
	href="<c:url value='/resources/css/base.css'/>" />
<link rel="stylesheet" type="text/css"
	href="<c:url value='/resources/css/main.css'/>" />
<link rel="stylesheet"
	href="<c:url value='/resources/fonts/fontawesome-free-5.12.1-web/css/all.min.css'/>">
</head>
<body>
	<div class="app">
		<header class="header">
			<div class="grid">
				<nav class="header__navbar">
					<ul class="header__navbar-list">
						<li
							class="header__navbar-item header__navbar-item--has-qr header__navbar-item--separate">
							Vào ứng dụng cửa hàng trên F8-ShOP <!-- Header QR code -->
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
								<h3>Không có thông báo mới</h3>
							</div>
						</li>
						<li class="header__navbar-item"><a href=""
							class="header__navbar-item-link"> <i
								class="header__navbar-icon far fa-question-circle"></i> Trợ giúp
						</a></li>
						<!-- 				<li class="header__navbar-item header__navbar-item--bold header__navbar-item--separate">Đăng kí</li>
								<li class="header__navbar-item header__navbar-item--bold">Đăng nhập</li> -->
						<li class="header__navbar-item header__navbar-user">
						    <i class="fas fa-user-circle header__navbar-user-avatar"></i>
						    <c:choose>
								<c:when test="${empty sessionScope.account }">
								 	<a href="<c:url value='/login'/>" class="header__navbar-user-name" >Đăng nhập</a>
								</c:when>
								<c:when test="${!empty sessionScope.account }">
									<span class="header__navbar-user-name">
									    <c:out value = "${sessionScope.account.username}"/>
									</span>
									<div class="header__navbar-user-menu">
										<a href="#">
											<p class="header__navbar-user-menu-item">Don hang cua toi</p>
										</a>
										<a href="#">
											<p class="header__navbar-user-menu-item">Dia chi cua toi</p>
										</a>
										<a href="#">
											<p class="header__navbar-user-menu-item">Don mua cua toi</p>
										</a>
										<a href="<c:url value='/logout'/>">
											<p class="header__navbar-user-menu-item">Dang xuat</p>
										</a>
									</div>
								</c:when>
							</c:choose>
						</li>
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
						<!-- Search History -->
						<div class="header__search-input-wrap">
							<input class="header__search-input"
								placeholder="Nhập để tìm kiếm sản phẩm">
							<div class="header__search-history">
								<h3 class="header__search-history-heading">Lich su tim kiem</h3>
								<ul class="header__search-history-list">
									<li class="header__search-history-item"><a href="">
											kem duong da</a></li>
									<li class="header__search-history-item"><a href="">
											kem tri mun</a></li>
								</ul>
							</div>
							<div class="header__search-select">
								<span class="header__search-select-lable"> Trong Shop <!-- deo eo lam nuwa -->
								</span> <i class=" header__search-select-icon fas fa-angle-down"></i>
								<!--
										<ul class="header__search-option">
																		<li class="header__search-item">
																										
																		</li>
										</ul>
										-->
							</div>
							<button class="header__search-btn">
								<i class="header__search-btn-icon fas fa-search"></i>
							</button>
						</div>
					</div>
					<!-- Layout Cart -->
					<div class="header__cart">
						<div class="header__cart-wrap">
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
			</div>
		</header>
		<div class="app__container">

			<div class="grid" style="min-height: 80rem;">
				<div class="grid__row app__content">
					<div class="grid__column-10">
						<h2 clas="lable">GIỎ HÀNG</h2>
						<div class="table-responsive">
							<table class="table table-hover">
								<thead>
									<tr>
										<th>Hình ảnh</th>
										<th>Tên sản phẩm</th>
										<th>Giá</th>
										<th>Số lượng</th>

									</tr>
								</thead>
								<tbody>
									<c:forEach items="${sessionScope.cartDTO.itemList}" var="item">
										<tr>
											<td><img class="cart__product-img"
												src="<c:url value='/upload/${item.productDTO.image}'/>">
											</td>
											<td>
												<div class="name__product">
													<span> ${item.productDTO.name} (Size: ${item.size} )

													</span> <a
														href="<c:url value='/deleteProductCart/${item.size}/${item.productDTO.id}'/>">
														Xoa </a>
												</div>

											</td>
											<td>${item.productDTO.price}</td>
											<td><c:url var="updateCart" value="/updateProductCart">
												</c:url>
												<form action="${updateCart}" method="GET"">
													<input type="hidden" name="productId"
														value="${item.productDTO.id}"> <input
														type="number" name="quantity" value="${item.quantity}"
														min="1"> <input type="hidden" name="size"
														value="${item.size}">
													<button type="submit">Submit</button>
												</form></td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>

					</div>
					<div class="grid__column-2 cart__column-2">
						<p class="lable" style="margin: 3rem 4rem 0;">THANH TOÁN</p>
						<div class="total__price">
							<p>Tổng tiền: ${sessionScope.cartDTO.totalPrice} vnđ</p>

							<a class="btn btn--primary" href="<c:url  value="/checkout"/>">Tiến
								hành đặt hàng</a>
						</div>

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