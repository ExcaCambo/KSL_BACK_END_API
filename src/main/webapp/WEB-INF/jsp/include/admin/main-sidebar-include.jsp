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
	<p class="mb-0 text-muted">Admin</p>
</div>
<ul class="list-unstyled navigation mb-0">
	<li class="sidebar-category pt-0">Main</li>
	<li><a href="index" class="bubble active"><i class="ti-home"></i><span
			class="sidebar-title">ផ្ទាំងពត៌មាន</span><span
			class="badge bg-danger">2</span></a></li>
	<li class="panel"><a role="button" data-toggle="collapse"
		data-parent=".navigation" href="#collapseUser" aria-expanded="false"
		aria-controls="collapseUser" class="collapsed"><i class="ti-user"></i><span
			class="sidebar-title">អ្នកប្រើប្រាស់</span></a>
		<ul id="collapseUser" class="list-unstyled collapse">
			<li><a href="${pageContext.request.contextPath}/user-list">តារាង</a></li>
			<li><a href="${pageContext.request.contextPath}/add-user">បញ្ចូលថ្មី</a></li>
			<li><a href="${pageContext.request.contextPath}/edit-user">កំណែប្រែថ្មី</a></li>
		</ul></li>
	<li class="panel"><a role="button" data-toggle="collapse"
		data-parent=".navigation" href="#collapseDoc" aria-expanded="false"
		aria-controls="collapseDoc" class="collapsed"><i
			class="ti-bookmark-alt"></i><span class="sidebar-title">ឯកសារ</span></a>
		<ul id="collapseDoc" class="list-unstyled collapse">
			<li><a href="${pageContext.request.contextPath}/doc-list">តារាង</a></li>
			<li><a href="${pageContext.request.contextPath}/add-doc">បញ្ចូលថ្មី</a></li>
			<li><a href="${pageContext.request.contextPath}/edit-doc">កំណែប្រែថ្មី</a></li>
			<li><a href="${pageContext.request.contextPath}/confirm-doc">យល់ព្រម</a></li>
			<!-- <li class="panel"><a role="button" data-toggle="collapse" data-parent="#collapseSlide" href="#collapseSlide" aria-expanded="false" aria-controls="collapseSlide" class="collapsed">Slide</a>
                <ul id="collapseSlide" class="list-unstyled collapse">
                	<li><a href="slide-list">តារាង</a></li>
					<li><a href="#">បញ្ចូលថ្មី</a></li>
					<li><a href="#">កំណែប្រែថ្មី</a></li>
					<li><a href="confirm-slide">យល់ព្រម</a></li>
                </ul>
              </li>
              <li class="panel"><a role="button" data-toggle="collapse" data-parent="#collapseEbook" href="#collapseEbook" aria-expanded="false" aria-controls="collapseEbook" class="collapsed">Ebook</a>
                <ul id="collapseEbook" class="list-unstyled collapse">
                	<li><a href="pdf-list">តារាង</a></li>
					<li><a href="#">បញ្ចូលថ្មី</a></li>
					<li><a href="#">កំណែប្រែថ្មី</a></li>
					<li><a href="confirm-pdf">យល់ព្រម</a></li>
                </ul>
              </li>
              <li class="panel"><a role="button" data-toggle="collapse" data-parent="#collapseWord" href="#collapseWord" aria-expanded="false" aria-controls="collapseWord" class="collapsed">Ms Office Word</a>
                <ul id="collapseWord" class="list-unstyled collapse">
                	<li><a href="word-list">តារាង</a></li>
					<li><a href="#">បញ្ចូលថ្មី</a></li>
					<li><a href="#">កំណែប្រែថ្មី</a></li>
					<li><a href="confirm-word">យល់ព្រម</a></li>
                </ul>
              </li> -->
		</ul></li>
	<li class="panel"><a href="${pageContext.request.contextPath}/category"><i class="ti-menu-alt"></i><span
			class="sidebar-title">មីនុយ</span></a>
	</li>
	<li class="panel"><a href="${pageContext.request.contextPath}/save-list"><i class="ti-folder"></i><span
			class="sidebar-title">បញ្ជីររក្សាទុករបស់អ្នកប្រើប្រាស់</span></a>
	</li>
	<li class="panel"><a href="${pageContext.request.contextPath}/comment"><i class="ti-comments"></i><span
			class="sidebar-title">យោបល់របស់អ្នកប្រើប្រាស់</span></a>
	</li>
	<li class="sidebar-category">ជំនួយ</li>
	<li><a href="documentation.html"><i class="ti-help-alt"></i><span
			class="sidebar-title">របៀបប្រើប្រាស់ប្រព័ន្ធ</span></a></li>
</ul>
<!-- <div class="sidebar-category">Server Status</div>
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
</div> -->