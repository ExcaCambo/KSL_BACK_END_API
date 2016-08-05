<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<!-- including style from include/admin/css-include.jsp -->
<jsp:include page="../include/admin/css-include.jsp"></jsp:include>
<%-- <%@ include file="../include/css-include.jsp" %> --%>
</head>
<body data-sidebar-color="sidebar-light" class="sidebar-light">
	<!-- Header start-->
	<header>
		<!-- including header from include/admin/header.jsp -->
		<jsp:include page="../include/admin/header.jsp"></jsp:include>
	</header>
	<!-- Header end-->
	<div class="main-container">
		<!-- Main Sidebar start-->
		<aside data-mcs-theme="minimal-dark"
			style="background-image: url( ${pageContext.request.contextPath}/resources/static/img/backgrounds/11.jpg)"
			class="main-sidebar mCustomScrollbar">
			<!-- including Main Sidebar from include/admin/main-sidebar-include.jsp -->
			<jsp:include page="../include/admin/main-sidebar-include.jsp"></jsp:include>
		</aside>
		<!-- Main Sidebar end-->
		<div class="page-container">
			<div class="page-header clearfix">
				<div class="row">
					<div class="col-sm-12">
						<h4 class="mt-0 mb-5">កំណែប្រែពត៌មានរបស់អ្នកប្រើប្រាស់</h4>
						<br>
						<ol class="breadcrumb mb-0">
							<li><a href="index">Khmer Slide</a></li>
							<li><a id="dropdownMenu2" href="#" data-toggle="dropdown"
								role="button">អ្នកប្រើប្រាស់</a>
								<ul aria-labelledby="dropdownMenu2"
									class="dropdown-menu fs-12 animated fadeInDown">
									<li><a href="user-list"><i class="fa fa-table mr-5"></i>
											តារាង</a></li>
									<li><a href="add-user"><i class="fa fa-user-plus mr-5"></i>
											បញ្ចូលថ្មី្មី</a></li>
								</ul></li>
							<li class="active">កំណែប្រែថ្មី</li>
						</ol>
					</div>
				</div>
			</div>
			<div class="page-content container-fluid">
				<!-- including user-board from include/admin/user-board-include.jsp -->
				<jsp:include page="../include/admin/user-board-include.jsp"></jsp:include>

				<div class="row">
					<div class="widget">
						<div class="widget-heading text-center">
							<h3 class="widget-title">កំណែប្រែពត៌មានរបស់អ្នកប្រើប្រាស់</h3>
						</div>
						<div class="widget-body">
							<form id="form-vertical" method="post" novalidate="novalidate">
								<div class="col-md-6">
									<div class="form-group">
										<label for="txtName">ឈ្មោះអ្នកប្រើប្រាស់</label><label
											class="text-danger"> *</label> <input id="txtName"
											type="text" name="txtName" placeholder="Enter name"
											data-rule-required="true" data-rule-rangelength="[3,15]"
											class="form-control">
									</div>
									<div class="form-group">
										<label for="txtEmail">អីុមែល</label><label class="text-danger">
											*</label> <input id="txtEmail" type="text" name="txtEmail"
											placeholder="Enter email" data-rule-required="true"
											data-rule-rangelength="[10,30]" data-rule-email="true"
											class="form-control">
									</div>
									<div class="form-group">
										<label for="txtPassword">លេខសម្ងាត់</label><label
											class="text-danger"> *</label> <input id="txtPassword"
											type="password" name="txtPassword"
											placeholder="Enter password" data-rule-required="true"
											data-rule-rangelength="[5,30]" class="form-control">
									</div>

								</div>

								<div class="col-md-6">
									<div class="form-group">
										<label for="ddlGender">ភេទ</label><label class="text-danger">
											*</label> <select id="ddlGender" name="ddlGender"
											data-rule-required="true" class="form-control">
											<option value="">-- សូមធ្វើការជ្រើសរើស --</option>
											<option value="male">ប្រុស</option>
											<option value="female">ស្រី</option>
										</select>
									</div>
									<div class="form-group">
										<label for="ddlRole">តួនាទី</label><label class="text-danger">
											*</label> <select id="ddlRole" name="ddlRole"
											data-rule-required="true" class="form-control">
											<option value="">-- សូមធ្វើការជ្រើសរើស --</option>
											<option value="admin">អ្នកគ្រប់គ្រងប្រព័ន្ធ</option>
											<option value="subscriber">អ្នកប្រើប្រាស់</option>
										</select>
									</div>
									<div class="form-group">
										<label for="txtConfirmPassword">បំពេញលេខសម្ងាត់ម្តងទៀត</label>
										<input id="txtConfirmPassword" type="password"
											name="txtConfirmPassword"
											placeholder="Re-enter confirm password"
											data-rule-required="true" data-rule-equalto="#txtPassword"
											class="form-control">
									</div>
								</div>
								<div class="text-right">
									<a href="user-list" class="btn btn-raised btn-danger"><i
										class="ti-close"></i> បោះបង់</a>
									<button type="submit" name="btnSubmit"
										class="btn btn-raised btn-success">
										<i class="ti-pencil"></i> កែប្រែ
									</button>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Right Sidebar start-->
	<jsp:include page="../include/admin/right-side-bar.jsp"></jsp:include>
	<!-- Right Sidebar end-->
	</div>

	<!-- including js from include/admin/js-include.jsp -->
	<jsp:include page="../include/admin/js-include.jsp"></jsp:include>
</body>
</html>
