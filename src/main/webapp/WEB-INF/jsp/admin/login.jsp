<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
  	<!-- including style from include/admin/css-include.jsp -->
  	<jsp:include page="../include/admin/css-include.jsp"></jsp:include>
    <%-- <%@ include file="../include/css-include.jsp" %> --%>
  </head>
  <body style="background-image: url(../../images/backgrounds/17.jpg)" class="body-bg-full v2">
    <div class="container page-container">
      <div class="page-content">
        <div class="v2">
          <div class="logo"><img src="../../images/logo/logo-iconic-dark.png" alt="" width="100"></div>
          <form action="index.jsp" class="form-horizontal" action="login" id="frmLogin" method="POST">
            <div class="form-group">
              <div class="col-xs-12">
                <input type="text" placeholder="Username" name="username" class="form-control">
              </div>
            </div>
            <div class="form-group">
              <div class="col-xs-12">
                <input type="password" placeholder="Password" name="password" class="form-control">
              </div>
            </div>
            <div class="form-group">
              <div class="col-xs-12">
                <div class="checkbox-inline checkbox-custom pull-left">
                  <input id="exampleCheckboxRemember" type="checkbox" value="remember">
                  <label for="exampleCheckboxRemember" class="checkbox-muted text-muted">Remember me</label>
                </div>
                <div class="pull-right"><a href="forgot-password-v2.html" class="inline-block form-control-static">Forgot a Passowrd?</a></div>
              </div>
            </div>
            <button type="submit" class="btn-lg btn btn-primary btn-rounded btn-block">Sign in</button>
          </form>
          <hr>
          <p class="text-muted">Sign in with your Facebook or Twitter accounts</p>
          <div class="clearfix">
            <div class="pull-left">
              <button type="button" style="width: 130px" class="btn btn-outline btn-rounded btn-primary"><i class="ti-facebook mr-5"></i> Facebook</button>
            </div>
            <div class="pull-right">
              <button type="button" style="width: 130px" class="btn btn-outline btn-rounded btn-info"><i class="ti-twitter-alt mr-5"></i> Twitter</button>
            </div>
          </div>
          <hr>
          <div class="clearfix">
            <p class="text-muted mb-0 pull-left">Want new account?</p><a href="register-v2.html" class="inline-block pull-right">Sign Up</a>
          </div>
        </div>
      </div>
    </div>
    <!-- Demo Settings start-->
<!--     <div class="setting closed"><a href="javascript:;" class="setting-toggle fs-16"><i class="ti-palette text-muted"></i></a>
      <h5 class="fs-16 mt-0 mb-20">Header Colors</h5>
      <ul class="list-inline">
        <li><a href="javascript:;" data-color="header-primary" class="mo-xs bg-primary inline-block img-circle header-color"></a></li>
        <li><a href="javascript:;" data-color="header-green" class="mo-xs bg-success inline-block img-circle header-color"></a></li>
        <li><a href="javascript:;" data-color="header-purple" class="mo-xs bg-purple inline-block img-circle header-color"></a></li>
        <li><a href="javascript:;" data-color="header-yellow" class="mo-xs bg-warning inline-block img-circle header-color"></a></li>
        <li><a href="javascript:;" data-color="header-red" class="mo-xs bg-danger inline-block img-circle header-color"></a></li>
      </ul>
      <h5 class="fs-16 mt-0 mb-20">Sidebar Style</h5>
      <ul class="list-inline">
        <li><a href="javascript:;" data-color="sidebar-dark" class="sidebar-color mo-xs bg-black inline-block img-circle"></a></li>
        <li><a href="javascript:;" data-color="sidebar-light" class="sidebar-color mo-xs bg-default inline-block img-circle"></a></li>
      </ul>
      <form class="form-horizontal mb-20">
        <div class="clearfix">
          <p class="form-control-static pull-left">Background Image</p>
          <div class="switch pull-right">
            <input id="sidebar-bg" type="checkbox" checked="">
            <label for="sidebar-bg" class="switch-success"></label>
          </div>
        </div>
      </form>
      <ul class="list-inline mb-0">
        <li><a href="javascript:;" data-bg="10.jpg" class="inline-block sidebar-bg"><img src="../../images/thumbnails/10.jpg" width="60" alt="" class="img-rounded"></a></li>
        <li><a href="javascript:;" data-bg="11.jpg" class="inline-block sidebar-bg"><img src="../../images/thumbnails/11.jpg" width="60" alt="" class="img-rounded"></a></li>
        <li><a href="javascript:;" data-bg="12.jpg" class="inline-block sidebar-bg"><img src="../../images/thumbnails/12.jpg" width="60" alt="" class="img-rounded"></a></li>
      </ul>
    </div> -->
    <!-- Demo Settings end-->
	
	<!-- including js from include/admin/js-include.jsp -->
	<jsp:include page="../include/admin/js-include.jsp"></jsp:include>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script type="text/javascript">
        
        $(function() {
        	
        	$("#frmLogin").submit(function(e){
       		
       		  e.preventDefault();
       			
       		  $.ajax({
  	            url: "${pageContext.request.contextPath}/login",
  	            type: "POST",
  	            data: $("#frmLogin").serialize(),
//   	            beforeSend: function (xhr) {
//   	                xhr.setRequestHeader("X-Ajax-call", "true");
//   	            },
  	            success: function(data) {
  	            	if(data == "User account is locked"){
  	            		alert(data);
  	            	}else if(data == "User is disabled"){
  	            		alert(data);
  	            	}else if(data == "Bad credentials"){
  	            		alert(data);
  	            	}else{
  	            		alert("Logined success.");
  	            		location.href = "${pageContext.request.contextPath}/"+data;
  	            	}
  	            	
  	            },
  	         	error: function(data){
  	         		console.log(data);
  				}
  	        });
       			
       		});
	      
        	
        	
        	$.ajax({ 
			    url: "http://localhost:9999/api/user?page=3&limit=5", 
			    type: 'GET', 
			    beforeSend: function(xhr) {
                    xhr.setRequestHeader("Accept", "application/json");
                    xhr.setRequestHeader("Content-Type", "application/json");
//                     xhr.setRequestHeader("Authorization" , "Basic ZGV2OiFAI2FwaQ==");
                },
			    success: function(data) { 
					console.log(data);
				  
					
			    },
			    error:function(data,status,er) { 
			        console.log("error: "+data+" status: "+status+" er:"+er);
			    }
			});
        	
        
        });
        </script>
  </body>
</html>
