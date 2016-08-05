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
      <aside data-mcs-theme="minimal-dark" style="background-image: url(${pageContext.request.contextPath}/resources/static/img/backgrounds/11.jpg)" class="main-sidebar mCustomScrollbar">
		<!-- including Main Sidebar from include/admin/main-sidebar-include.jsp -->
		<jsp:include page="../include/admin/main-sidebar-include.jsp"></jsp:include>
      </aside>
      <!-- Main Sidebar end-->
      <div class="page-container">
        <div class="page-header clearfix">
          <div class="row">
            <div class="col-sm-12">
              <h4 class="mt-0 mb-5">សូមស្វាគមន៍ការមកកាន់គេហទំព័រ Khmer Slide</h4>
              <!-- <p class="text-muted mb-0">Responsive Web App Kit</p> -->
            </div>
<!--             <div class="col-sm-6">
              <div class="btn-group mt-5">
                <button type="button" class="btn btn-default btn-outline"><i class="flag-icon flag-icon-us mr-5"></i> English</button>
                <button type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" class="btn btn-default btn-outline dropdown-toggle"><span class="caret"></span><span class="sr-only">Toggle Dropdown</span></button>
                <ul class="dropdown-menu dropdown-menu-right animated fadeInDown">
                  <li><a href="#"><i class="flag-icon flag-icon-de mr-5"></i> Khmer</a></li>
                </ul>
              </div>
            </div> -->
          </div>
        </div>
        <div class="page-content container-fluid">
          <div class="row">
            <div class="col-lg-4">
               <div class="row">
                <div class="col-lg-12 col-md-4">
                  <div class="mb-30">
                    <div class="media">
                      <div class="media-body">
                        <h5 class="media-heading">ចំនួនអ្នកប្រើប្រាស់ថ្មីក្នុងថ្ងៃនេះ</h5>
                        <div class="fs-30 fw-600 counter">៦៥០ នាក់</div>
                      </div>
                      <div class="media-right"><i class="fs-30 ti-user"></i></div>
                    </div>
                    <ul class="list-unstyled">
                      <li>
                        <div class="block clearfix mb-5"><span class="pull-left fs-12">ថ្ងៃនេះ</span><span class="pull-right label label-outline label-primary">៦៥០ នាក់</span></div>
                        <div class="progress progress-striped progress-striped progress-xs active">
                          <div role="progressbar" data-transitiongoal="65" class="progress-bar"></div>
                        </div>
                      </li>
                      <li>
                        <div class="block clearfix mb-5"><span class="pull-left fs-12">ថ្ងៃម្សិលមិញ</span><span class="pull-right label label-outline label-success">៨០ នាក់</span></div>
                        <div class="progress progress-striped progress-xs">
                          <div role="progressbar" data-transitiongoal="80" class="progress-bar progress-bar-success"></div>
                        </div>
                      </li>
                      <li>
                        <div class="block clearfix mb-5"><span class="pull-left fs-12">សប្តាហ៍នេះ</span><span class="pull-right label label-outline label-info">៥៨០ នាក់</span></div>
                        <div class="progress progress-striped progress-xs">
                          <div role="progressbar" data-transitiongoal="80" class="progress-bar progress-bar-info"></div>
                        </div>
                      </li>
                      <li>
                        <div class="block clearfix mb-5"><span class="pull-left fs-12">សប្តាហ៍មុន</span><span class="pull-right label label-outline label-warning">៣៨០ នាក់</span></div>
                        <div class="progress progress-striped progress-xs">
                          <div role="progressbar" data-transitiongoal="80" class="progress-bar progress-bar-warning"></div>
                        </div>
                      </li>
                      <li>
                        <div class="block clearfix mb-5"><span class="pull-left fs-12">ក្នុងខែនេះ</span><span class="pull-right label label-outline label-danger">២៨០ នាក់</span></div>
                        <div class="progress progress-striped progress-xs">
                          <div role="progressbar" data-transitiongoal="80" class="progress-bar progress-bar-danger"></div>
                        </div>
                      </li>
                    </ul>
                    <div id="flot-order" style="height: 74px"></div>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-lg-4">
               <div class="row">
               	<div class="col-lg-12 col-md-4">
                  <div class="mb-30">
                    <div class="media">
                      <div class="media-body">
                        <h5 class="media-heading">ឯកសារដែលមានចំនួនអ្នកចូលមើលច្រើនជាងគេ</h5>
                        <div class="fs-30 fw-600 counter">២០,៣២០ នាក់</div>
                      </div>
                      <div class="media-right"><i class="fs-30 ti-bar-chart"></i></div>
                    </div>
                    <ul class="list-unstyled">
                      <li>
                        <div class="block clearfix mb-5"><span class="pull-left fs-12">ថ្ងៃនេះ</span><span class="pull-right label label-outline label-primary">២០,៣២០ នាក់</span></div>
                        <div class="progress progress-striped progress-xs">
                          <div role="progressbar" data-transitiongoal="65" class="progress-bar"></div>
                        </div>
                      </li>
                      <li>
                        <div class="block clearfix mb-5"><span class="pull-left fs-12">ថ្ងៃម្សិលមិញ</span><span class="pull-right label label-outline label-success">៨០ នាក់</span></div>
                        <div class="progress progress-striped progress-xs">
                          <div role="progressbar" data-transitiongoal="80" class="progress-bar progress-bar-success"></div>
                        </div>
                      </li>
                      <li>
                        <div class="block clearfix mb-5"><span class="pull-left fs-12">សប្តាហ៍នេះ</span><span class="pull-right label label-outline label-info">៥៨០ នាក់</span></div>
                        <div class="progress progress-striped progress-xs">
                          <div role="progressbar" data-transitiongoal="80" class="progress-bar progress-bar-info"></div>
                        </div>
                      </li>
                      <li>
                        <div class="block clearfix mb-5"><span class="pull-left fs-12">សប្តាហ៍មុន</span><span class="pull-right label label-outline label-warning">៣៨០ នាក់</span></div>
                        <div class="progress progress-striped progress-xs">
                          <div role="progressbar" data-transitiongoal="80" class="progress-bar progress-bar-warning"></div>
                        </div>
                      </li>
                      <li>
                        <div class="block clearfix mb-5"><span class="pull-left fs-12">ក្នុងខែនេះ</span><span class="pull-right label label-outline label-danger">២៨០ នាក់</span></div>
                        <div class="progress progress-striped progress-xs">
                          <div role="progressbar" data-transitiongoal="80" class="progress-bar progress-bar-danger"></div>
                        </div>
                      </li>
                    </ul>
                    <div id="flot-revenue" style="height: 74px"></div>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-lg-4">
              <div class="row">
                <div class="col-lg-12 col-md-4">
                  <div class="mb-30">
                    <div class="media">
                      <div class="media-body">
                        <h5 class="media-heading">ចំនួនឯកសារដែលបានបញ្ចូលថ្ងៃនេះ</h5>
                        <div class="fs-30 fw-600 counter">២៧៨ ច្បាប់</div>
                      </div>
                      <div class="media-right"><i class="fs-30 ti-bookmark-alt"></i></div>
                    </div>
                    <ul class="list-unstyled">
                      <li>
                        <div class="block clearfix mb-5"><span class="pull-left fs-12">ថ្ងៃនេះ</span><span class="pull-right label label-outline label-primary">២៧៨ ច្បាប់</span></div>
                        <div class="progress progress-striped progress-xs">
                          <div role="progressbar" data-transitiongoal="65" class="progress-bar"></div>
                        </div>
                      </li>
                      <li>
                        <div class="block clearfix mb-5"><span class="pull-left fs-12">ថ្ងៃម្សិលមិញ</span><span class="pull-right label label-outline label-success">៨០ ច្បាប់</span></div>
                        <div class="progress progress-striped progress-xs">
                          <div role="progressbar" data-transitiongoal="80" class="progress-bar progress-bar-success"></div>
                        </div>
                      </li>
                      <li>
                        <div class="block clearfix mb-5"><span class="pull-left fs-12">សប្តាហ៍នេះ</span><span class="pull-right label label-outline label-info">៥៨០ ច្បាប់</span></div>
                        <div class="progress progress-striped progress-xs">
                          <div role="progressbar" data-transitiongoal="80" class="progress-bar progress-bar-info"></div>
                        </div>
                      </li>
                      <li>
                        <div class="block clearfix mb-5"><span class="pull-left fs-12">សប្តាហ៍មុន</span><span class="pull-right label label-outline label-warning">៣៨០ ច្បាប់</span></div>
                        <div class="progress progress-striped progress-xs">
                          <div role="progressbar" data-transitiongoal="80" class="progress-bar progress-bar-warning"></div>
                        </div>
                      </li>
                      <li>
                        <div class="block clearfix mb-5"><span class="pull-left fs-12">ក្នុងខែនេះ</span><span class="pull-right label label-outline label-danger">២៨០ ច្បាប់</span></div>
                        <div class="progress progress-striped progress-xs">
                          <div role="progressbar" data-transitiongoal="80" class="progress-bar progress-bar-danger"></div>
                        </div>
                      </li>
                    </ul>
                  </div>
                </div>
              </div>
            </div>
          </div>
          <div class="row">
            <div class="col-md-3 col-sm-6">
              <div class="widget text-center">
                <div class="widget-body">
                  <div class="clearfix">
                    <div class="pull-left"><a href="javascript:;" class="widget-reload"><i class="ti-control-record text-muted"></i></a></div>
                    <div class="pull-right"><a href="javascript:;" class="widget-remove"><i class="ti-trash text-muted"></i></a></div>
                  </div>
                  <h5 class="mb-5">ចំនួន Slide ថ្មី</h5>
                  <div class="fs-36 fw-600 mb-20 counter">៣៥០ ច្បាប់</div>
                  <div id="esp-comment" data-percent="75" style="height: 140px; width: 140px; line-height: 120px; padding: 10px;" class="easy-pie-chart fs-36"><i class="fa fa-file-powerpoint-o text-muted"></i></div>
                  <div class="clearfix mt-20">
                    <div class="pull-left">
                      <div class="fs-12">ថ្ងៃនេះ</div>
                      <div class="text-success">+២.៤៣%</div>
                    </div>
                    <div class="pull-right">
                      <div class="fs-12">ថ្ងៃម្សិលមិញ</div>
                      <div class="text-danger">-១.០២%</div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-3 col-sm-6">
              <div class="widget text-center">
                <div class="widget-body">
                  <div class="clearfix">
                    <div class="pull-left"><a href="javascript:;" class="widget-reload"><i class="ti-control-record text-muted"></i></a></div>
                    <div class="pull-right"><a href="javascript:;" class="widget-remove"><i class="ti-trash text-muted"></i></a></div>
                  </div>
                  <h5 class="mb-5">ចំនួន Ms-Word ថ្មី</h5>
                  <div class="fs-36 fw-600 mb-20 counter">១៥០ ច្បាប់</div>
                  <div id="esp-photo" data-percent="55" style="height: 140px; width: 140px; line-height: 120px; padding: 10px;" class="easy-pie-chart fs-36"><i class="fa fa-file-word-o text-muted"></i></div>
                  <div class="clearfix mt-20">
                    <div class="pull-left">
                      <div class="fs-12">ថ្ងៃនេះ</div>
                      <div class="text-danger">-០.២៣%</div>
                    </div>
                    <div class="pull-right">
                      <div class="fs-12">ថ្ងៃម្សិលមិញ</div>
                      <div class="text-success">+១.០២%</div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-3 col-sm-6">
              <div class="widget text-center">
                <div class="widget-body">
                  <div class="clearfix">
                    <div class="pull-left"><a href="javascript:;" class="widget-reload"><i class="ti-control-record text-muted"></i></a></div>
                    <div class="pull-right"><a href="javascript:;" class="widget-remove"><i class="ti-trash text-muted"></i></a></div>
                  </div>
                  <h5 class="mb-5">ចំនួន Ebooks ថ្មី</h5>
                  <div class="fs-36 fw-600 mb-20 counter">២៥០ ច្បាប់</div>
                  <div id="esp-feedback" data-percent="20" style="height: 140px; width: 140px; line-height: 120px; padding: 10px;" class="easy-pie-chart fs-36"><i class="fa fa-file-pdf-o text-muted"></i></div>
                  <div class="clearfix mt-20">
                    <div class="pull-left">
                      <div class="fs-12">ថ្ងៃនេះ</div>
                      <div class="text-success">+៣.២៩%</div>
                    </div>
                    <div class="pull-right">
                      <div class="fs-12">ថ្ងៃម្សិលមិញ</div>
                      <div class="text-success">+២.៣២%</div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-3 col-sm-6">
              <div class="widget text-center">
                <div class="widget-body">
                  <div class="clearfix">
                    <div class="pull-left"><a href="javascript:;" class="widget-reload"><i class="ti-control-record text-muted"></i></a></div>
                    <div class="pull-right"><a href="javascript:;" class="widget-remove"><i class="ti-trash text-muted"></i></a></div>
                  </div>
                  <h5 class="mb-5">ចំនួនអ្នកប្រើប្រាស់សរុប</h5>
                  <div class="fs-36 fw-600 mb-20 counter">៨៩០ នាក់</div>
                  <div id="esp-user" data-percent="30" style="height: 140px; width: 140px; line-height: 120px; padding: 10px;" class="easy-pie-chart fs-36"><i class="ti-user text-muted"></i></div>
                  <div class="clearfix mt-20">
                    <div class="pull-left">
                      <div class="fs-12">ថ្ងៃនេះ</div>
                      <div class="text-success">+០.០៩%</div>
                    </div>
                    <div class="pull-right">
                      <div class="fs-12">ថ្ងៃម្សិលមិញ</div>
                      <div class="text-danger">-០.០២%</div>
                    </div>
                  </div>
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
	<jsp:include page="../include/admin/dashboard-js-include.jsp"></jsp:include>
  </body>
</html>
