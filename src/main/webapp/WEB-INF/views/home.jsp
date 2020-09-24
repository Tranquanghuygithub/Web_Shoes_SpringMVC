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
			href="https://cdnjs.cloudflare.com/ajax/libs/normalize/8.0.1/normalize.min.css"/>
			<link rel="stylesheet" href="<c:url value='/resources/fonts/fontawesome-free-5.12.1-web/css/all.min.css'/>"/>
			<!-- Font chữ google roboto font -->		
			<link href="https://fonts.googleapis.com/css?family=Roboto:300,300i,400,500,700&display=swap&subset=vietnamese" rel="stylesheet"/>
			<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/bootstrap.min.css'/>"/>
			<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/base.css'/>"/>
			<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/main.css'/>"/>
			<link rel="stylesheet" href="<c:url value='/resources/fonts/fontawesome-free-5.12.1-web/css/all.min.css'/>">
			
			
	</head>
<body>
	<!-- BEM: Block Element Modifier
	header__navabar--success-->
	<div class="app">
		<header class="header">
			<div class="grid">
				<nav class="header__navbar">
					<ul class="header__navbar-list">
						<li class="header__navbar-item header__navbar-item--has-qr header__navbar-item--separate">
							Vào ứng dụng cửa hàng trên H-ShOP
							<!-- Header QR code -->
							<div class="header__qr">
							
								<img src="<c:url value='/resources/images/qr_Code.png'/>" alt="qr_Code" class="header__qr-img">
								<div class="header__qr-apps">
									<a href="" class="header__qr-link">
										<img src="<c:url value='/resources/images/google.png'/>" alt="google" class="header__qr-dowload-img">
									</a>
									<a href="<c:url value='/resources/images/apstore.png'/>" class="header__qr-link">
										<img src="<c:url value='/resources/images/apstore.png'/>" alt="apstore" class="header__qr-dowload-img">
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
								<ul class="header__notify-list">
									<li class="header__notify-item header__notify-item--viewed">
										<p style="color: black">Bạn không có thông báo mới </p>
									</li>
								</ul>
							</div>
						</li>
						<li class="header__navbar-item">
							<a href="" class="header__navbar-item-link">
								<i class="header__navbar-icon far fa-question-circle"></i>
								Trợ giúp
							</a>
							
						</li>
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
						<a href="<c:url value='/home' />" >
							<span> <img src="<c:url value='/resources/images/brand.png'/>" alt="brand.png" class="header__logo-img"></span>
						</a>
						
					</div>
					<div class="header__search">
						<!-- Search History -->
						
						<form action="<c:url value='/search'/>" method="GET" style="flex:1;">
							<div class="header__search-input-wrap">
							 
							 	<input class="header__search-input" style="margin-top:1rem;" name="keyword" placeholder ="Nhập để tìm kiếm sản phẩm">					
								<button  type="submit" class="header__search-btn">
									<i class="header__search-btn-icon fas fa-search"></i>
								</button>
							 
								
							  </div>
						</form>
					</div>
					<!-- Layout Cart -->
					<div class="header__cart">
						<c:choose>
							<c:when test="${!empty sessionScope.cartDTO}">
								 <a href="<c:url value='/view' />">
									<span style="color: white;font-size: 1.4rem;">Giỏ hàng</span>
									
									<div class="header__cart-wrap">
										<i class=" header__cart-icon fas fa-shopping-cart"></i>
										<span class="header__cart-notice">
											<c:out value = "${sessionScope.quantity}"/>
										</span>
									</div>
							     </a>
							</c:when>
							<c:when test="${empty sessionScope.cartDTO}">
									<span style="color: white;font-size: 1.4rem;">Giỏ hàng</span>
									
									<div class="header__cart-wrap">
										<i class=" header__cart-icon fas fa-shopping-cart"></i>
										<span class="header__cart-notice">									
										</span>
									</div>
							</c:when>
						</c:choose>
						
						
					</div>
				</div>
			</div>
		</header>
		<div class="app__container">
			<div class="grid">
				<div class="grid__row app__content">
					<div class="grid__column-2">
						<nav class="category">
							<h3 class="category__heading">Danh Muc</h3>
							<ul class="category-list">
								<li class="category-item">
									
									<a href="<c:url value='/filter?object=Nam'/>" class="category-item__link">Giaỳ Nam</a>
								</li>
								<li class="category-item">
									<a href="<c:url value='/filter?object=Nữ'/>" class="category-item__link">Giaỳ Nữ</a>
								</li>
								<li class="category-item">
									<a href="<c:url value='/filter?object=Bé trai'/>" class="category-item__link">Giaỳ  Bé Trai</a>
								</li>
								<li class="category-item">
									<a href="<c:url value='/filter?object=Bé gái'/>" class="category-item__link">Giày Bé Gái</a>
								</li>
							</ul>
						</nav>
					</div>
					<div class="grid__column-10">
						<!-- start slideer -->
						<div id="carouselId" class="carousel slide" data-ride="carousel">
							<ol class="carousel-indicators">
								<li data-target="#carouselId" data-slide-to="0" class="active"></li>
								<li data-target="#carouselId" data-slide-to="1"></li>
								<li data-target="#carouselId" data-slide-to="2"></li>
							</ol>
							<div class="carousel-inner" role="listbox">
								<div class="carousel-item active">						    
									<img src="<c:url value='/resources/images/banner/banner_1.jpg'/>" style="background-attachment: scroll;height:400px ;"
									alt="First slide">
								</div>
								<div class="carousel-item">
									<img src="<c:url value='/resources/images/banner/banner_2.jpg'/>" style="background-attachment: scroll;height: 400px;"
									alt="Second slide">
								</div>
								<div class="carousel-item">
									<img src="<c:url value='/resources/images/banner/banner_3.jpg'/>" style="background-attachment: scroll;height: 400px;"
									alt="Third slide">
								</div>
							</div>
							<a class="carousel-control-prev" href="#carouselId" role="button" data-slide="prev">
								<span class="carousel-control-prev-icon" aria-hidden="true"></span>
								<span class="sr-only">Previous</span>
							</a>
							<a class="carousel-control-next" href="#carouselId" role="button" data-slide="next">
								<span class="carousel-control-next-icon" aria-hidden="true"></span>
								<span class="sr-only">Next</span>
							</a>
						</div>
						<!-- end slideer -->
						<div class="home-filter">
							<span class="home-filter__label">Sap xep theo :</span>
							<button class="home-filter__btn btn">Pho bien</button>
							<button class="home-filter__btn btn btn--primary">Moi nhat</button>
							<button class="home-filter__btn btn">Ban chay</button>
							<div class="select-input">
								<span class="select-input__label">Gia</span>
								<i class="fas fa-angle-down"></i>
								<div class="select-input__list">
									<a href="" class="select-input__item">
										<span>Gia tu cao den thap</span>
										<i class="fas fa-angle-down"></i>
									</a>
									<a href="" class="select-input__item">
										<span>Gia tu thap den cao</span>
										<i class="fas fa-angle-down"></i>
									</a>
								</div>
							</div>
							<div class="home-filter__page">
								<span class="home-filter__page-next">Next</span>
								<div class="home-filter__page-control">
									<a href="" class="home-filter__page-btn">
										<i class="home-filter__page-icon fas fa-angle-left"></i>
									</a>
									<a href="" class="home-filter__page-btn">
										<i class="home-filter__page-icon fas fa-angle-right"></i>
									</a>
								</div>
							</div>
						</div>
						<div class="home-product ">
							<div class="grid__row">
							
							<c:forEach items="${listProduct}" var="shoes">
								<div class="grid__column-2-4">
									<!-- Product -->
									<a class="home-product-item" href="<c:url value='/detailProduct?id=${shoes.id}'/>">
										<div class="home-product-item-img" style="background-image:url(<c:url value='/upload/${shoes.image}'/>);">
											
										</div>
										<h4 class="home-product-item__name">
									        ${shoes.name}
										</h4>
										<div class="home-product-item__price">
											<span class="home-product-item__price-old">
												1.200.000d
											</span>
											<span class="home-product-item__price-new">
												${shoes.price}								
											</span>
										</div>
										<div class="home-product-item__action">
											<span class="home-product-item__like home-product-item__like--liked">
												<i class="home-product-item__like-icon-empty far fa-heart"></i>
												<i class="home-product-item__like-icon-fill fas fa-heart"></i>
											</span>
											<div class="home-product-item__rating">
												<i class="home-product-item__star--gold fas fa-star"></i>
												<i class="home-product-item__star--gold  fas fa-star"></i>
												<i class="home-product-item__star--gold  fas fa-star"></i>
												<i class="home-product-item__star--gold  fas fa-star"></i>
												<i class="home-product-item__star--gold  fas fa-star"></i>
											</div>
										</div>
										<div class="home-product-item__origin">
											<span class="home-product-item__brand">Who</span>
											<span class="home-product-item__origin-name">Han Quoc</span>
										</div>
										<div class="home-product-item__favourite">
											<i class="fas fa-check"></i>
											<span>Yeu Thich</span>
										</div>
										<div class="home-product-item__sale-off">
											<span class="home-product-item__sale-off-percent">10%</span>
											<span class="home-product-item__sale-off-lable">
												GIẢM
											</span>
										</div>
									</a>
								</div>
							
							</c:forEach>	
								
								
							</div>
							<ul class="pagination home-product__pagination" >
								<li class="pagination-item">
									<a href="" class="pagination-item__link">
										<i class=" pagination-item__icon fas fa-angle-left"></i>
									</a>
								</li>
								<li class="pagination-item pagination-item--active">
									<a href="" class="pagination-item__link">
										1
									</a>
								</li>
								<li class="pagination-item">
									<a href="" class="pagination-item__link">
										2
									</a>
								</li>
							</ul>
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
								<li class="footer-item">
									<a href="" class="footer-item__link">Trung Tâm Trợ Giúp</a>
								</li>
								<li class="footer-item">
									<a href="" class="footer-item__link">Phản Hồi Khách Hàng</a>
								</li>
								<li class="footer-item">
									<a href="" class="footer-item__link">Hướng Dẫn Mua Hàng</a>
								</li>
							</ul>
						</div>
						<div class="grid__column-2-4">
							<h3 class="footer__heading">Gioi thieu</h3>
							<ul class="footer-list">
								<li class="footer-item">
									<a href="" class="footer-item__link">Gioi thieu ve Shop</a>
								</li>
								<li class="footer-item">
									<a href="" class="footer-item__link">Dieu khoan Shop</a>
								</li>
								<li class="footer-item">
									<a href="" class="footer-item__link">Tuyen Dung</a>
								</li>
							</ul>
						</div>
						<div class="grid__column-2-4">
							<h3 class="footer__heading">Danh muc</h3>
							<ul class="footer-list">
								<li class="footer-item">
								</li>
							</ul>
						</div>
						<div class="grid__column-2-4">
							<h3 class="footer__heading">Theo doi</h3>
							<ul class="footer-list">
								<li class="footer-item">
									<a href="" class="footer-item__link">
										<i class="fab fa-facebook-square"></i>
										Facebook
									</a>
								</li>
								<li class="footer-item">
									<a href="" class="footer-item__link">
										<i class="header__navbar-icon fab fa-instagram"></i>
										Instagram
									</a>
								</li>
								<li class="footer-item">
									<a href="" class="footer-item__link">
										<i class="fab fa-linkedin"></i>
										Linked
									</a>
								</li>
							</ul>
						</div>
						<div class="grid__column-2-4">
							<h3 class="footer__heading">Vao cua hang</h3>
							<div class="footer__download">
								<img src="./assets/img/qr_Code.png" alt="" class="footer__download-qr-img">
								<div class="footer__download-apps">
									<img src="./assets/img/apstore.png" alt="" class="footer__download-app-img">
									<img src="./assets/img/google.png" alt="" class="footer__download-app-img">
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="grid__full-grid">
					<p class="footer__copyright">© 2019 Tran Huy JSC. All rights reserved.</p>
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