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
			<div class="app">
				<header class="header">
					<div class="grid">
						<nav class="header__navbar">
							<ul class="header__navbar-list">
								<li class="header__navbar-item header__navbar-item--has-qr header__navbar-item--separate">
									Vào ứng dụng cửa hàng trên H-ShOP
									<!-- Header QR code -->
									<div class="header__qr">
										<img src="./assets/img/qr_Code.png" alt="qr_Code" class="header__qr-img">
										<div class="header__qr-apps">
											<a href="" class="header__qr-link">
												<img src="./assets/img/google.png" alt="google" class="header__qr-dowload-img">
											</a>
											<a href="" class="header__qr-link">
												<img src="./assets/img/apstore.png" alt="apstore" class="header__qr-dowload-img">
											</a>
										</div>
									</div>
								</li>
								<li class="header__navbar-item">
									<span class="header__navbar-title--no-pointer">Kết nối</span>
									<a href="" class="header__navbar-icon-link">
										<i class="header__navbar-icon fab fa-facebook"></i>
									</a>
									<a href="" class="header__navbar-icon-link">
										<i class="header__navbar-icon fab fa-instagram"></i>
									</a>
								</li>
							</ul>
							<ul class="header__navbar-list">
								<li class="header__navbar-item header__navbar-item--has-notify">
									<a href="" class="header__navbar-item-link ">
										<i class="header__navbar-icon fas fa-bell"></i>
										Thông báo
									</a>
									<div class="header__notify">
										<header class="header__notify-header">
											<h3>Thông báo mới nhận</h3>
										</header>
										<h2>Không có thông báo mới </h2>
										
									</div>
								</li>
								<li class="header__navbar-item">
									<a href="" class="header__navbar-item-link">
										<i class="header__navbar-icon far fa-question-circle"></i>
										Trợ giúp
									</a>
								</li>
								<!-- 				<li class="header__navbar-item header__navbar-item--bold header__navbar-item--separate">Đăng kí</li>
								<li class="header__navbar-item header__navbar-item--bold">Đăng nhập</li> -->
								<li class="header__navbar-item header__navbar-user">
									<i class="fas fa-user-circle header__navbar-user-avatar"></i>
									<span class="header__navbar-user-name">Tran Huy</span>
									<div class="header__navbar-user-menu">
										<a href="">
											<p class="header__navbar-user-menu-item">Don hang cua toi</p>
										</a>
										<a href="">
											<p class="header__navbar-user-menu-item">Dia chi cua toi</p>
										</a>
										<a href="">
											<p class="header__navbar-user-menu-item">Don mua cua toi</p>
										</a>
										<a href="">
											<p class="header__navbar-user-menu-item">Dang xuat</p>
										</a>
									</div>
								</li>
							</ul>
						</nav>
						<!-- Header with search -->
						<div class="header-with-search">
							<div class="header__logo">
								<span> <img src="./assets/img/brand.png" alt="brand.png" class="header__logo-img"></span>
							</div>
							<div class="header__search">
								<!-- Search History -->
								<div class="header__search-input-wrap">
									<input class="header__search-input" placeholder ="Nhập để tìm kiếm sản phẩm">
									<div class="header__search-history">
										<h3 class="header__search-history-heading">Lich su tim kiem</h3>
										<ul class="header__search-history-list">
											<li class="header__search-history-item">
												<a href=""> kem duong da</a>
											</li>
											<li class="header__search-history-item">
												<a href=""> kem tri mun</a>
											</li>
										</ul>
									</div>
									<div class="header__search-select">
										<span class="header__search-select-lable">
											Trong Shop
											<!-- deo eo lam nuwa -->
										</span>
										<i class=" header__search-select-icon fas fa-angle-down"></i>
										
									</div>
									<button class="header__search-btn">
									<i class="header__search-btn-icon fas fa-search"></i>
									</button>
								</div>
							</div>
							<!-- Layout Cart -->
							<div class="header__cart">
								<div class="header__cart-wrap">
									<i class=" header__cart-icon fas fa-shopping-cart"></i>
									<span class="header__cart-notice">
										3
									</span>
								</div>
							</div>
						</div>
					</div>
				</header>
				<div class="app__container">
					<div class="grid">
						<div class="grid__row app__content">
							<div class="grid__column-4">
								<div class="image__detail">
									<div class="home-product-item-img" style="background-image:url(<c:url value='/upload/${itemDTO.productDTO.image}'/>);">
										
									</div>
								</div>
								
							</div>
							<div class="grid__column-8">
							  <c:url var="addToCartUrl" value="/addToCart"></c:url>
							  <form:form modelAttribute="itemDTO" action="${addToCartUrl}" method="POST">
							  		<div class="information__detail">
									<div class="information__detail-name">
										<h1>${itemDTO.productDTO.name}</h1>
									 <form:hidden path="id"/>
										<p>Thuương hiệu: ${itemDTO.productDTO.brand} </p>
										<p style="color: red; font-size: 2.5rem"> ${itemDTO.unitPrice} vnd</p>
										<form:hidden path="unitPrice"/>
										<p>Mau sac: ${ itemDTO.productDTO.color}</p>
										<p>The loai: ${itemDTO.productDTO.category} </p>
									</div>
									<div class="option">
										<div class="size">
											<p class="lable__size">Kich cỡ: </p>
											<form:select path="tmp" items="${itemDTO.productDTO.sizes}"/>									
										</div>
										<div class="quantity">
											<p class="lable__quantity">Số lượng </p>
											<form:input type="number" min="1" path="quantity"  />

										</div>
										<button  type="submit" class="btn btn--primary" style="margin-top: 2rem">
											Chon Mua
										</button>
										
									</div>
								</div>
							  </form:form>
								
							</div>
							
						</div>
					</div>
				</div>
			</div>
			<!-- jQuery -->
	<script src="<c:url value='/resources/js/jquery-3.5.1.min.js'/>"></script>
	<!-- Bootstrap JavaScript -->
	<script src="<c:url value='/resources/js/bootstrap.min.js'/>" ></script>
				
			</body>
			
		</html>