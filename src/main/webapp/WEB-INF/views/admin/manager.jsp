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
    <title>Kho hàng</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
        
    <link rel="shotrcut icon" href=" <c:url value='/resources/images/LG.png'></c:url>">  
    
    <link rel="stylesheet" href="<c:url value='/resources/css/bootstrap.min.css'></c:url>">

</head>
<body>
      
    
    <div class="container-fluid">
        <div class="container-fluid" style="background-color:black; color:white ;">
            <div class="row">
                <div class="col-md-4">
                    <nav class="nav justify-content-center">
                        <a class="nav-link disabled" style="color: white; " >Hotline:0972.898.888</a>
                    </nav>
                </div>
                <div class="col-md-4"></div>
                <div class="col-md-4" style="color: white;">
                    <nav class="nav align-content-end">
                        <a class="nav-link active" style="color: white;" href=" login.html">Đăng nhập</a>
                        <!-- <a class="nav-link active" style="color: white;" href="/view/signUp.html">Đăng ký</a> -->
                        <a class="nav-link active" style="color: white;"  href="account.html">Tài khoản</a>
                    </nav>
                </div>

            </div>
        </div>
        <!-- start menu -->
        <div class="container">
            <div class="row">
                <div class="col-md-3">
                    <a href="admin_index.html"><img src="/images/logo_dhct.png" alt=""></a>
                </div>
                <div class="col-md-3"></div>
                <div class="cod-md-3 modal-footer">
                    <form action="search" class="align-content-sm-end" method="post">
                        <div class="form-group">
                            <label for="">Tìm kiếm</label>
                            <input type="text" name="search" id="" class="form-control" placeholder="nhập sản phẩm"
                                aria-describedby="helpId">

                        </div>
                        <button type="submit" style="border-radius: 10%; background-color: #65CCE6"
                            class="btn btn-default" name="search_btn" id="search_btn">Tìm
                            kiếm</button>
                    </form>
                </div>
            </div>

        </div>
        <!-- end menu -->
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <ul class="nav justify-content-start" style="background-color:cornflowerblue;">
                        <li class="nav-item">
                            <a class="nav-link active" style="color: black" href="<c:url value='/admin/managerProduct' />">Quản lý sản phẩm</a>
                        </li>
                        <!-- <li class="nav-item">
                            <a class="nav-link active" style="color: black" href="admin_store.html">Quản lý sản phẩm</a>
                        </li> -->
                        
                    </ul>
                </div>
            </div>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-md-12" style="margin: 10px;">
                    <ul class="nav justify-content-start" >
                        <li class="nav-item">
                            <h3><i class="fa fa-star" style="font-size: 24px; color: gold;" aria-hidden="true"></i>Danh sách các mặt hàng trong kho</h3>
                        </li>
                        <li class="nav-item" >                                  
                            <a href="<c:url value='/admin/addProduct'/>" style="margin-left: 20px;" class="btn btn-primary">Thêm sản phẩm</a>
                        </li>
                    </ul>
                    
                    
                </div>
                
                <div class="table-responsive" style="margin-top: 20px;">
                    <table class="table table-striped table-inverse table-responsive">
                        <thead class="thead-inverse">
                            <tr>   
                                <th> <spring:message code="product.name"/> </th>
                                <th><spring:message code="product.name"/> </th>
                                <th><spring:message code="product.image"/> </th>
                                <th><spring:message code="product.brand"/> </th>
                                <th> <spring:message code="product.price"/> (đơn vị: vnđ)</th>
                                <th><spring:message code="product.category"/> </th>
                                <th><spring:message code="product.object"/> </th>
                                <th><spring:message code="product.size"/> </th>
                                <!-- <th>Giá bán(đơn vị: vnđ)</th> -->
                                <!-- <th>Kích thước</th> -->
                                <!-- <th>Số lượng còn trong kho</th>
                                <th>Số lượng đã bán</th> -->
                                <th>Chỉnh sửa</th>
                                <th>Xóa</th>
                            </tr>
                       </thead>
                            <tbody>
                             <c:forEach items="${listProduct}" var="shoes"> 
                             	<tr> 
                             	      <td>${shoes.id}</td>
                             	      <td>${shoes.name}</td>	            
                            		  <td> 
                            				<img alt="" src="<c:url value = "/upload/${shoes.image }"/>" width="100px" height="100px">
                            		  </td>
                             		 <td>${shoes.brand}</td> 
                               		 <td>${shoes.price}</td> 
                              		 <td>${shoes.category}</td> 
                             		 <td>${shoes.object}</td> 
                              		 <td>${shoes.size} </td>
                             		 <td><a href="<c:url value="/admin/editProduct?id=${shoes.id}"/>" class="btn btn-danger">Sửa</a></td>
                             		 <td><a href="<c:url value='/admin/deleteProduct?id=${shoes.id}'/>" classs="btn btn-danger" onclick="return confirm('Bạn thực sự muốn xóa sản phẩm');">Xoa</a> </td>
                              		 <!-- <td><button type="submit" class="btn btn-danger" onclick="return confirm('Bạn thực sự muốn xóa sản phẩm');">Xóa</button></td> -->
                               </tr>
                              </c:forEach> 
                           
                   
                            </tbody>
                    </table>
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