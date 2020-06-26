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
    <title>Thêm sản phẩm</title>
    <!-- <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"> -->
    <link rel="shotrcut icon" href="/resources/images/LG.png">
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/bootstrap.min.css'/>">
</head>

<body>
    <div class="container">
        <div class="row" style="margin-top: 30px;">
            <div class="col-md-7 ">
                <div>
                    <a href="<c:url value='/admin/managerProduct'/>" class="btn btn-danger" style="margin-bottom: 30px;">Trở về kho</a>

                </div>
                <h3>Thêm sản phẩm</h3>
                 <c:url var="themsp" value="/admin/addProduct"></c:url>
                <form:form action="${themsp}" modelAttribute="product" method="POST" enctype="multipart/form-data">
                     <form:hidden path="id"/>
                     <p>Tên sản phẩm</p>
                     <form:input path="name" class="form-control" placeholder="Nhap ten san pham"  /><br>
                     <p style="color:red" > <form:errors path="name"/> </p>
                     
                     <p>Thể loại</p>
                     <%-- <form:input path="category" class="form-control" placeholder="Nhap ten loaị san pham"  /><br>         --%>     
                     <form:select path="category" class="form-control" >
                     	<form:option value="Giày thể thao">Giày thể thao</form:option>
                     	<form:option value="Giày thời trang"> Giày thời trang </form:option>
                     	<form:option value="Giày Unisex">Giày Unisex</form:option>
                     </form:select><br>
                     <p style="color:red" ><form:errors path="name"/></p>
                     
                     <p>Ten nhan hàng</p>                 
                     <form:select path="brand" class="form-control" >
                     	<form:option value="Biti's Hunter">Biti's Hunter</form:option>
                     	<form:option value="Nike">Nike</form:option>
                     	<form:option value="Adidas">Adidas</form:option>
                     	<form:option value="Puma">Puma</form:option>
                     </form:select><br>
                     <p style="color:red" ><form:errors path="brand"/></p>
                     
                     <p>Màu săc</p>
                     <form:input path="color"  class="form-control" placeholder="Nhap màu sắc" /><br>
                     <p style="color:red" ><form:errors path="color"/></p>
                     
                    <div class="form-group"> 
                     <p> Đối tượng </p>
                     <%-- <form:input path="object"  class="form-control" placeholder="Nhap đối tượng người dùng" /><br> --%>
                     <form:select path="object" class="form-control" >
                     	<form:option value="Nam">Nam</form:option>
                     	<form:option value="Nữ">Nữ</form:option>
                     	<form:option value="Nữ">Bé trai</form:option>
                     	<form:option value="Nữ">Bé gái</form:option>
                     </form:select><br>
                     <p style="color:red" ><form:errors path="object"/></p>
                    </div>
                     
           <%--           <form:input path="quantity"/> --%>
           
                     <p>Giá sản phẩm</p>
                     <form:input path="price"  class="form-control" placeholder="Nhap giá san pham" /><br>
                     <p style="color:red" ><form:errors path="price"/></p>
                     
                     <p>Kích cỡ</p>
                         <p>   
                            <form:checkbox path="sizes"  value="30" label="30" />
                            <form:checkbox path="sizes" value="31" label="31" />
                            <form:checkbox path="sizes" value="32" label="32" />
                            <form:checkbox path="sizes" value="33" label="33" />
                            <form:checkbox path="sizes" value="34" label="34" />
                            <form:checkbox path="sizes" value="35" label="35" />
                            <form:checkbox path="sizes" value="36" label="36" />
                            <form:checkbox path="sizes" value="37" label="37" />
                            <form:checkbox path="sizes" value="38" label="38" />
                            <form:checkbox path="sizes" value="39" label="39" />
                            <form:checkbox path="sizes" value="40" label="40" />
                            <form:checkbox path="sizes" value="41" label="41" />
                            <form:checkbox path="sizes" value="42" label="42" />
                            <form:checkbox path="sizes" value="43" label="43"/>
                             
                         </p>
                         <p style="color:red" ><form:errors path="sizes"/></p>
                         
                         <p>Số lượng sản phẩm </p>
                         <form:input path="quantity" class="form-control" placeholder="Nhap số lượng sản phẩm " />
                         <p style="color:red" ><form:errors path="quantity"/></p>
                         
                         <p>Mô tả</p>
                         <form:textarea path="description" class="form-control" placeholder="Nhap mô tả sản phẩm" /><br>
                         <p style="color:red" ><form:errors path="description"/></p>
                        
                         <div class="form-group">
                             <p>Ảnh</p>
                              <form:input path="fileData" type="file" accept="image/*" onchange="loadFile(event)" /><br><br>
                             
		                        <img id="output" width="50%" height="50%"/>
		                        <!-- js hiển thị file lên khi chọn -->
		                        <script>
		                            var loadFile = function (event) {
		                                var output = document.getElementById('output');
		                                output.src = URL.createObjectURL(event.target.files[0]);
		                                output.onload = function () {
		                                    URL.revokeObjectURL(output.src) // free memory
		                                }
		                            };
                           	  </script>
                           	  <p style="color:red" ><form:errors path="fileData"/></p>
                    </div>                       
                        <button type="submit"  class="btn btn-primary"> Them san pham </button>       
                </form:form>
                <!-- kiểm tra thêm thành công thì hiển thị thêm nút tiếp tục thêm và làm mới lại form -->
                <button type="reset" class="btn btn-primary" style="margin-top: 30px;">Tiếp tục thêm</button>
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