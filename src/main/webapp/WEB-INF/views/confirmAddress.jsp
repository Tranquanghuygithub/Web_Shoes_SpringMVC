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
				<header class="header_address">
					<div class="grid " style="display: flex;">

						<div class="header__logo">						
								<span> <img src="./assets/img/brand.png" alt="brand.png" class="header__logo-img"></span>
						</div>
						<div class="header-name" style="margin-top: 2rem; margin-left: 10rem;">
							<h2> Địa Chỉ Giao Hàng </h2>
						</div>
					</div>
				</header>
				<div class="app__container">
					
					<div class="grid">
						<h2>Địa chỉ</h2>
						<div class="address-content">
							<div class="address-body">
								<h3>Tran Quang Huy</h3>
								<p> Số điện thoại: 0383144400 </p>
								<p>Thôn Đẽn, xã Sơn Đông, huyện Lập Thạch tỉnh Vĩnh Phúc, Xã Sơn Đông, Huyện Lập Thạch, Vĩnh Phúc Việt Nam
								</p>	
							</div>
							<div class="action">
								<button class="btn__continue">Giao đến địa chỉ này</button>
								<button class="btn__update" data-toggle="collapse" data-target="#collapseExample">Sửa</button>
							</div>
							
						</div>
						<div class="collapse address--change" id="collapseExample">
							<label> Họ tên </label>
							<input type="text" name="Nhập họ tên">
							<label> Số điện thoại </label>
							<input type="text" name="Nhập số điện thoại">
							<label> Tỉnh/Thành Phố </label>
							<input type="text" name="Nhập tỉnh/thành phố">
							<label> Quận/Huyện </label>
							<input type="text" name="Nhập họ quận/huyện">
							<label> Phường/Xã </label>
							<input type="text" name="Nhập họ phường/xã">
							<label> Mô tả địa chỉ</label>
							<textarea placeholder="Nhập mô tả địa chỉ"></textarea>
							<div class="btn__address-change">
								<button class="btn__change--cancel "data-toggle="collapse" data-target="#collapseExample">Hủy bỏ </button>
							    <button class="btn__change--update">Cập nhập</button>
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