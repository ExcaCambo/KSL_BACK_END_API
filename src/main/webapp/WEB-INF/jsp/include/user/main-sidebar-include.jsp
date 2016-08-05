<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="user">
	<div id="esp-user-profile" data-percent="100"
		style="height: 130px; width: 130px; line-height: 100px; padding: 15px;"
		class="easy-pie-chart">
		<img
			src="${pageContext.request.contextPath}/resources/static/img/users/21.jpg"
			alt="" class="avatar img-circle"><span
			class="status bg-success"></span>
	</div>
	<h4 class="fs-16 text-muted mt-15 mb-5 fw-300">Jayz Walker</h4>
	<p class="mb-0 text-muted">User</p>
</div>
<ul class="list-unstyled navigation mb-0">
	<li class="sidebar-category pt-0">Main</li>
	<li><a href="index" class="bubble active"><i class="ti-home"></i><span
			class="sidebar-title">ទំព័រដើម</span><span
			class="badge bg-danger">2</span></a></li>
	<li class="panel"><a href="#" ><i class="ti-bookmark-alt"></i><span 
		class="sidebar-title">ឯកសារ</span></a>
	</li>
	<li class="panel"><a href="category"><i class="fa fa-history"></i><span
			class="sidebar-title">ឯកសារដែលធ្លាប់បានអាន</span></a>
	</li>
	<li class="sidebar-category pt-0">Library</li>
	<li class="panel"><a href="save-list"><i class="ti-menu-alt"></i><span
			class="sidebar-title">វិទ្យាសាស្ត្រកុំព្យូទ័រ</span></a>
	</li>
	<li class="panel"><a href="comment"><i class="ti-menu-alt"></i><span
			class="sidebar-title">សុខភាព</span></a>
	</li>
	<li class="sidebar-category">ជំនួយ</li>
	<li><a href="documentation.html"><i class="ti-help-alt"></i><span
			class="sidebar-title">របៀបប្រើប្រាស់ប្រព័ន្ធ</span></a></li>
</ul>
<div class="sidebar-category">Server Status</div>
<div class="sidebar-widget">
	<ul class="list-unstyled pl-25 pr-25">
		<li class="mb-20">
			<div class="block clearfix mb-10">
				<span class="pull-left fs-12 text-muted">CPU Used</span><span
					class="pull-right label label-outline label-warning">65%</span>
			</div>
			<div class="progress progress-xs bg-light mb-0">
				<div role="progressbar" data-transitiongoal="65"
					class="progress-bar progress-bar-warning"></div>
			</div>
		</li>
		<li class="mb-20">
			<div class="block clearfix mb-10">
				<span class="pull-left fs-12 text-muted">Bandwidth</span><span
					class="pull-right label label-outline label-danger">80%</span>
			</div>
			<div class="progress progress-xs bg-light mb-0">
				<div role="progressbar" data-transitiongoal="80"
					class="progress-bar progress-bar-danger"></div>
			</div>
		</li>
	</ul>
</div>