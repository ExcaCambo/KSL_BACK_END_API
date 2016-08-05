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
			style="background-image: url(${pageContext.request.contextPath}/resources/static/img/backgrounds/11.jpg)"
			class="main-sidebar mCustomScrollbar">
			<!-- including Main Sidebar from include/admin/main-sidebar-include.jsp -->
			<jsp:include page="../include/admin/main-sidebar-include.jsp"></jsp:include>
		</aside>
		<!-- Main Sidebar end-->
		<div class="page-container">
			<div class="page-header clearfix">
				<div class="row">
					<div class="col-sm-12">
						<h4 class="mt-0 mb-5">តារាងមីនុយ</h4>
						<br>
						<ol class="breadcrumb mb-0">
							<li><a href="index">Khmer Slide</a></li>
							<li><a id="dropdownMenu2" href="#" data-toggle="dropdown"
								role="button">មីនុយ</a>
								<ul aria-labelledby="dropdownMenu2"
									class="dropdown-menu fs-12 animated fadeInDown">
									<li><a data-toggle="modal" data-target=".modalAdd" ><i class="ti-plus mr-5"></i>
											បញ្ចួលថ្មី</a></li>
									<li><a data-toggle="modal" data-target=".modalEdit"><i class="ti-pencil mr-5"></i>
											កំណែប្រែថ្មី</a></li>
								</ul></li>
							<li class="active">តារាង</li>
						</ol>
					</div>
				</div>
			</div>
			<div class="page-content container-fluid">
				<div class="row">
					<div class="col-md-12">
						<div class="widget">
							<div class="widget-heading">
								<button type="button" class="btn btn-outline btn-success"
									data-toggle="modal" data-target=".modalAdd">
									<i class="ti-plus"></i> បញ្ចូលថ្មី
								</button>
								<h3 class="widget-title text-center">តារាងមីនុយ</h3>
							</div>
							<div class="widget-body">
								<table id="cat-list-table" style="width: 100%"
									class="table table-hover dt-responsive nowrap">
									<thead>
										<tr>
											<th style="width: 16%">លេខរៀង</th>
											<th style="width: 30%">ឈ្មោះមីនុយ</th>
											<th style="width: 5%">ស្ថិតក្រោមមីនុយ</th>
											<th style="width: 12%">បញ្ចុលដោយ</th>
											<th style="width: 10%">ស្ថានភាព</th>
											<th style="width: 15%">សកម្មភាព</th>
											<th style="width: 5%">ពត៌មានបន្ថែម</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>#6546</td>
											<td>
												<div class="media">
													<div class="media-body">
														<h5 class="media-heading">វិទ្យាសាស្ត្រកុំព្យូទ័រ</h5>
														<p class="text-muted mb-0">បញ្ចូលថ្ងៃទី: 31 July, 2016</p>
													</div>
												</div>
											</td>
											<td>វិទ្យាសាស្ត្រកុំព្យូទ័រ</td>
											<td>ចាន់ ឧត្តម</td>
											<td class="text-center text-success"><i class="ti-check"></i></td>
											<td>
												<div role="toolbar" aria-label="Toolbar with button groups"
													class="btn-toolbar">
													<div role="group" aria-label="First group"
														class="btn-group">
														<button type="button" class="btn btn-outline btn-warning"
															data-toggle="modal" data-target=".modalEdit">
															<i class="ti-pencil"></i>
														</button>
														<button type="button" class="btn btn-outline btn-danger">
															<i class="ti-trash"></i>
														</button>
													</div>
												</div>
											</td>
											<td>I got something to talk to you if you want me too!</td>
										</tr>
										<tr>
											<td>#6941</td>
											<td>
												<div class="media">
													<div class="media-body">
														<h5 class="media-heading">វិទ្យាសាស្ត្រកុំព្យូទ័រ</h5>
														<p class="text-muted mb-0">បញ្ចូលថ្ងៃទី: 31 July, 2016</p>
													</div>
												</div>
											</td>
											<td>វិទ្យាសាស្ត្រកុំព្យូទ័រ</td>
											<td>ចាន់ ឧត្តម</td>
											<td class="text-center text-success"><i class="ti-check"></i></td>
											<td>
												<div role="toolbar" aria-label="Toolbar with button groups"
													class="btn-toolbar">
													<div role="group" aria-label="First group"
														class="btn-group">
														<button type="button" class="btn btn-outline btn-warning">
															<i class="ti-pencil"></i>
														</button>
														<button type="button" class="btn btn-outline btn-danger">
															<i class="ti-trash"></i>
														</button>
													</div>
												</div>
											</td>
											<td></td>
										</tr>
									</tbody>
								</table>
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

	<!-- Add Modal -->
	<jsp:include page="../include/admin/modal/category/category-add-include.jsp"></jsp:include>
	<!-- Edit Modal -->
	<jsp:include page="../include/admin/modal/category/category-edit-include.jsp"></jsp:include>
	
</body>
</html>
