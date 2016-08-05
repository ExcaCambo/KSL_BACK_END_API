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
      <aside data-mcs-theme="minimal-dark" style="background-image: url(../../images/backgrounds/11.jpg)" class="main-sidebar mCustomScrollbar">
        <div class="user">
          <div id="esp-user-profile" data-percent="65" style="height: 130px; width: 130px; line-height: 100px; padding: 15px;" class="easy-pie-chart"><img src="${pageContext.request.contextPath}/resources/static/img/logo/chivon.jpg" alt="" class="avatar img-circle"><span class="status bg-success"></span></div>
          <h4 class="fs-16 text-muted mt-15 mb-5 fw-300">Chhai Chivon</h4>
          <p class="mb-0 text-muted">Programmer</p>
        </div>
        <ul class="list-unstyled navigation mb-0">
          <li class="sidebar-category pt-0">Main</li>
          <li><a href="index.html" class="bubble"><i class="ti-home"></i><span class="sidebar-title">Dashboard</span><span class="badge bg-danger">2</span></a></li>
          <li><a href="widgets.html"><i class="ti-panel"></i><span class="sidebar-title">Widgets </span><span class="label label-outline label-danger">New</span></a></li>
          <li class="panel"><a role="button" data-toggle="collapse" data-parent=".navigation" href="#collapse2" aria-expanded="false" aria-controls="collapse2" class="collapsed"><i class="ti-shopping-cart"></i><span class="sidebar-title">E-commerce</span></a>
            <ul id="collapse2" class="list-unstyled collapse">
              <li><a href="product-list.html">Product list</a></li>
              <li><a href="edit-product.html">Edit product</a></li>
              <li><a href="order-list.html">Order list</a></li>
              <li><a href="edit-order.html">Edit order</a></li>
              <li><a href="customer-list.html">Customer list</a></li>
              <li><a href="edit-customer.html">Edit customer</a></li>
            </ul>
          </li>
          <li class="panel"><a role="button" data-toggle="collapse" data-parent=".navigation" href="#collapse3" aria-expanded="false" aria-controls="collapse3" class="collapsed"><i class="ti-paint-bucket"></i><span class="sidebar-title">Color system</span></a>
            <ul id="collapse3" class="list-unstyled collapse">
              <li><a href="green-system.html">Green</a></li>
              <li><a href="blue-system.html">Blue</a></li>
              <li><a href="purple-system.html">Purple</a></li>
              <li><a href="red-system.html">Red</a></li>
              <li><a href="yellow-system.html">Yellow</a></li>
            </ul>
          </li>
          <li class="panel"><a role="button" data-toggle="collapse" data-parent=".navigation" href="#collapse4" aria-expanded="false" aria-controls="collapse4" class="collapsed"><i class="ti-brush-alt"></i><span class="sidebar-title">Skins</span></a>
            <ul id="collapse4" class="list-unstyled collapse">
              <li><a href="green-dashboard.html">Green</a></li>
              <li><a href="blue-dashboard.html">Blue</a></li>
              <li><a href="purple-dashboard.html">Purple</a></li>
              <li><a href="red-dashboard.html">Red</a></li>
              <li><a href="yellow-dashboard.html">Yellow</a></li>
            </ul>
          </li>
          <li class="sidebar-category">Components</li>
          <li class="panel"><a role="button" data-toggle="collapse" data-parent=".navigation" href="#collapse5" aria-expanded="false" aria-controls="collapse5" class="collapsed"><i class="ti-receipt"></i><span class="sidebar-title">Basic</span></a>
            <ul id="collapse5" class="list-unstyled collapse">
              <li><a href="buttons.html">Buttons</a></li>
              <li><a href="carousels.html">Carousels</a></li>
              <li><a href="containers.html">Containers</a></li>
              <li><a href="dialogs.html">Dialogs</a></li>
              <li><a href="basic-inputs.html">Inputs</a></li>
              <li><a href="navigations.html">Navigations</a></li>
              <li><a href="progress-bars.html">Progress bars</a></li>
              <li><a href="typography.html">Typography</a></li>
            </ul>
          </li>
          <li class="panel"><a role="button" data-toggle="collapse" data-parent=".navigation" href="#collapse6" aria-expanded="false" aria-controls="collapse6" class="collapsed"><i class="ti-ruler-pencil"></i><span class="sidebar-title">Editors</span></a>
            <ul id="collapse6" class="list-unstyled collapse">
              <li><a href="summernote.html">Summernote</a></li>
              <li><a href="bootstrap-markdown.html">Bootstrap markdown</a></li>
              <li><a href="code-prettify.html">Code prettify</a></li>
              <li><a href="ckeditor.html">CKEditor</a></li>
            </ul>
          </li>
          <li class="panel"><a role="button" data-toggle="collapse" data-parent=".navigation" href="#collapse7" aria-expanded="false" aria-controls="collapse7" class="collapsed"><i class="ti-location-arrow"></i><span class="sidebar-title">Pickers</span></a>
            <ul id="collapse7" class="list-unstyled collapse">
              <li><a href="color-picker.html">Color picker</a></li>
              <li><a href="datetime-picker.html">Datetime picker</a></li>
              <li><a href="clock-picker.html">Clock picker</a></li>
              <li><a href="date-range-picker.html">Date range picker</a></li>
              <li><a href="multi-select.html">Multi select</a></li>
            </ul>
          </li>
          <li class="panel"><a role="button" data-toggle="collapse" data-parent=".navigation" href="#collapse8" aria-expanded="false" aria-controls="collapse8" class="collapsed"><i class="ti-layers-alt"></i><span class="sidebar-title">Forms</span></a>
            <ul id="collapse8" class="list-unstyled collapse">
              <li><a href="forms-layouts.html">Layouts</a></li>
              <li><a href="forms-validation.html">Validation</a></li>
              <li><a href="forms-wizard.html">Wizard</a></li>
              <li><a href="other-plugins.html">Other plugins</a></li>
            </ul>
          </li>
          <li class="panel"><a role="button" data-toggle="collapse" data-parent=".navigation" href="#collapse9" aria-expanded="false" aria-controls="collapse9" class="collapsed"><i class="ti-face-smile"></i><span class="sidebar-title">Icons </span><span class="label label-outline label-success">Updated</span></a>
            <ul id="collapse9" class="list-unstyled collapse">
              <li><a href="glyphicons.html">Glyphicons</a></li>
              <li><a href="font-awesome.html">Font awesome</a></li>
              <li><a href="material-design.html">Material design</a></li>
              <li><a href="themify.html">Themify</a></li>
              <li><a href="weather-icons.html">Weather</a></li>
              <li><a href="flag-icons.html">Flag</a></li>
            </ul>
          </li>
          <li class="panel"><a role="button" data-toggle="collapse" data-parent=".navigation" href="#collapse10" aria-expanded="false" aria-controls="collapse10" class="collapsed"><i class="ti-layout-grid2"></i><span class="sidebar-title">Tables</span></a>
            <ul id="collapse10" class="list-unstyled collapse">
              <li><a href="basic-tables.html">Basic tables</a></li>
              <li><a href="data-tables.html">Data tables</a></li>
              <li><a href="pricing-tables.html">Pricing tables</a></li>
            </ul>
          </li>
          <li class="panel"><a role="button" data-toggle="collapse" data-parent=".navigation" href="#collapse11" aria-expanded="false" aria-controls="collapse11" class="collapsed"><i class="ti-control-forward"></i><span class="sidebar-title">Animations</span></a>
            <ul id="collapse11" class="list-unstyled collapse">
              <li><a href="basic-animations.html">Basic</a></li>
              <li><a href="loading-animations.html">Loading</a></li>
            </ul>
          </li>
          <li class="panel"><a role="button" data-toggle="collapse" data-parent=".navigation" href="#collapse12" aria-expanded="false" aria-controls="collapse12" class="collapsed"><i class="ti-upload"></i><span class="sidebar-title">File uploads</span></a>
            <ul id="collapse12" class="list-unstyled collapse">
              <li><a href="dropzone-js.html">Dropzone</a></li>
              <li><a href="bootstrap-file-input.html">Bootstrap file input</a></li>
            </ul>
          </li>
          <li class="panel"><a role="button" data-toggle="collapse" data-parent=".navigation" href="#collapse13" aria-expanded="false" aria-controls="collapse13" class="collapsed"><i class="ti-info-alt"></i><span class="sidebar-title">Indicators</span></a>
            <ul id="collapse13" class="list-unstyled collapse">
              <li><a href="toastr.html">Toastr</a></li>
              <li><a href="sweet-alert.html">Sweet alert</a></li>
            </ul>
          </li>
          <li class="sidebar-category">Data visualization</li>
          <li class="panel"><a role="button" data-toggle="collapse" data-parent=".navigation" href="#collapse14" aria-expanded="false" aria-controls="collapse14" class="collapsed"><i class="ti-bar-chart"></i><span class="sidebar-title">Charts </span><span class="label label-outline label-success">Updated</span></a>
            <ul id="collapse14" class="list-unstyled collapse">
              <li><a href="flot-charts.html">Flot charts</a></li>
              <li><a href="morris-charts.html">Morris charts</a></li>
              <li><a href="chart-js.html">Chart.js</a></li>
              <li><a href="chartist.html">Chartist</a></li>
              <li><a href="other-charts.html">Other charts</a></li>
            </ul>
          </li>
          <li class="panel"><a role="button" data-toggle="collapse" data-parent=".navigation" href="#collapse15" aria-expanded="false" aria-controls="collapse15" class="collapsed"><i class="ti-location-pin"></i><span class="sidebar-title">Maps</span></a>
            <ul id="collapse15" class="list-unstyled collapse">
              <li><a href="vector-maps.html">Vector maps</a></li>
              <li><a href="google-maps.html">Google maps</a></li>
            </ul>
          </li>
          <li class="sidebar-category">Page kits</li>
          <li class="panel"><a role="button" data-toggle="collapse" data-parent=".navigation" href="#collapse16" aria-expanded="false" aria-controls="collapse16" class="collapsed"><i class="ti-alert"></i><span class="sidebar-title">Error pages </span><span class="label label-outline label-success">Updated</span></a>
            <ul id="collapse16" class="list-unstyled collapse">
              <li><a href="error-400.html">Error 400</a></li>
              <li><a href="error-400-v2.html">Error 400 v2</a></li>
              <li><a href="error-401.html">Error 401</a></li>
              <li><a href="error-401-v2.html">Error 401 v2</a></li>
              <li><a href="error-403.html">Error 403</a></li>
              <li><a href="error-403-v2.html">Error 403 v2</a></li>
              <li><a href="error-404.html">Error 404</a></li>
              <li><a href="error-404-v2.html">Error 404 v2</a></li>
              <li><a href="error-500.html">Error 500</a></li>
              <li><a href="error-500-v2.html">Error 500 v2</a></li>
              <li><a href="error-503.html">Error 503</a></li>
              <li><a href="error-503-v2.html">Error 503 v2</a></li>
            </ul>
          </li>
          <li class="panel"><a role="button" data-toggle="collapse" data-parent=".navigation" href="#collapse17" aria-expanded="true" aria-controls="collapse17" class="active"><i class="ti-user"></i><span class="sidebar-title">User pages </span><span class="label label-outline label-success">Updated</span></a>
            <ul id="collapse17" class="list-unstyled collapse in">
              <li><a href="login.html">Login</a></li>
              <li><a href="login-v2.html">Login v2</a></li>
              <li><a href="register.html">Register</a></li>
              <li><a href="register-v2.html">Register v2</a></li>
              <li><a href="forgot-password.html">Forgot password</a></li>
              <li><a href="forgot-password-v2.html">Forgot password v2</a></li>
              <li><a href="lock-screen.html">Lock screen</a></li>
              <li><a href="lock-screen-v2.html">Lock screen v2</a></li>
              <li><a href="profile.html" class="active">Profile</a></li>
            </ul>
          </li>
          <li class="panel"><a role="button" data-toggle="collapse" data-parent=".navigation" href="#collapse18" aria-expanded="false" aria-controls="collapse18" class="collapsed"><i class="ti-panel"></i><span class="sidebar-title">Apps</span></a>
            <ul id="collapse18" class="list-unstyled collapse">
              <li><a href="mailbox.html">Mailbox</a></li>
              <li><a href="calendar.html">Calendar</a></li>
              <li><a href="image-cropper.html">Image cropper</a></li>
            </ul>
          </li>
          <li class="panel"><a role="button" data-toggle="collapse" data-parent=".navigation" href="#collapse19" aria-expanded="false" aria-controls="collapse19" class="collapsed"><i class="ti-blackboard"></i><span class="sidebar-title">Extra pages</span></a>
            <ul id="collapse19" class="list-unstyled collapse">
              <li><a href="invoice.html">Invoice</a></li>
              <li><a href="search-results.html">Search results</a></li>
              <li><a href="blank-template.html">Blank template</a></li>
            </ul>
          </li>
          <li class="sidebar-category">Help</li>
          <li><a href="documentation.html"><i class="ti-help-alt"></i><span class="sidebar-title">Documentation</span></a></li>
          <li class="sidebar-category">Menu Levels</li>
          <li class="panel"><a role="button" data-toggle="collapse" data-parent=".navigation" href="#collapse20" aria-expanded="false" aria-controls="collapse20" class="collapsed"><i class="ti-folder"></i><span class="sidebar-title">Menu levels</span></a>
            <ul id="collapse20" class="list-unstyled collapse">
              <li><a href="#">Menu level 2.1</a></li>
              <li class="panel"><a role="button" data-toggle="collapse" data-parent="#collapse20" href="#collapse22" aria-expanded="false" aria-controls="collapse22" class="collapsed">Menu level 2.2</a>
                <ul id="collapse22" class="list-unstyled collapse">
                  <li><a href="#">Menu level 3.1</a></li>
                  <li class="panel"><a role="button" data-toggle="collapse" data-parent="#collapse22" href="#collapse32" aria-expanded="false" aria-controls="collapse32" class="collapsed">Menu level 3.2</a>
                    <ul id="collapse32" class="list-unstyled collapse">
                      <li><a href="#">Menu level 4.1</a></li>
                      <li class="panel"><a role="button" data-toggle="collapse" data-parent="#collapse32" href="#collapse42" aria-expanded="false" aria-controls="collapse42" class="collapsed">Menu level 4.2</a>
                        <ul id="collapse42" class="list-unstyled collapse">
                          <li><a href="#">Menu level 5.1</a></li>
                          <li><a href="#">Menu level 5.2</a></li>
                        </ul>
                      </li>
                    </ul>
                  </li>
                </ul>
              </li>
            </ul>
          </li>
        </ul>
        <div class="sidebar-category">Server Status</div>
        <div class="sidebar-widget">
          <ul class="list-unstyled pl-25 pr-25">
            <li class="mb-20">
              <div class="block clearfix mb-10"><span class="pull-left fs-12 text-muted">CPU Used</span><span class="pull-right label label-outline label-warning">65%</span></div>
              <div class="progress progress-xs bg-light mb-0">
                <div role="progressbar" data-transitiongoal="65" class="progress-bar progress-bar-warning"></div>
              </div>
            </li>
            <li class="mb-20">
              <div class="block clearfix mb-10"><span class="pull-left fs-12 text-muted">Bandwidth</span><span class="pull-right label label-outline label-danger">80%</span></div>
              <div class="progress progress-xs bg-light mb-0">
                <div role="progressbar" data-transitiongoal="80" class="progress-bar progress-bar-danger"></div>
              </div>
            </li>
          </ul>
        </div>
      </aside>
      <!-- Main Sidebar end-->
      <div class="page-container">
        <div class="page-header clearfix">
          <div class="row">
            <div class="col-sm-6">
              <h4 class="mt-0 mb-5">Profile</h4>
              <ol class="breadcrumb mb-0">
                <li><a href="#">Umega</a></li>
                <li><a href="#">User Pages</a></li>
                <li class="active">Profile</li>
              </ol>
            </div>
            <div class="col-sm-6">
              <div class="btn-group mt-5">
                <button type="button" class="btn btn-default btn-outline"><i class="flag-icon flag-icon-us mr-5"></i> English</button>
                <button type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" class="btn btn-default btn-outline dropdown-toggle"><span class="caret"></span><span class="sr-only">Toggle Dropdown</span></button>
                <ul class="dropdown-menu dropdown-menu-right animated fadeInDown">
                  <li><a href="#"><i class="flag-icon flag-icon-de mr-5"></i> German</a></li>
                  <li><a href="#"><i class="flag-icon flag-icon-fr mr-5"></i> French</a></li>
                  <li><a href="#"><i class="flag-icon flag-icon-es mr-5"></i> Spanish</a></li>
                  <li><a href="#"><i class="flag-icon flag-icon-it mr-5"></i> Italian</a></li>
                  <li><a href="#"><i class="flag-icon flag-icon-jp mr-5"></i> Japanese</a></li>
                </ul>
              </div>
            </div>
          </div>
        </div>
        <div class="page-content container-fluid p-0">
          <div class="row row-0">
            <div class="col-lg-12">
              <div style="height: 260px; padding-top: 130px; background-image: url(../../images/backgrounds/profile.png)" class="bg-overlay pl-30 pr-30 clearfix text-white">
                <div class="pull-left media">
                  <div class="media-left"><a href="javascript:void(0)" style="display: inline-block; border-radius: 50%; padding: 3px; background-color: #fff;"><img src="../../images/users/06.jpg" width="100" alt="" class="media-object img-circle"></a></div>
                  <div style="width: auto" class="media-body media-middle">
                    <h2 class="media-heading">Steven Cook</h2>
                    <div class="fs-20">Software Developer</div>
                  </div>
                </div>
                <div class="pull-right text-center">
                  <ul class="list-inline">
                    <li>
                      <div class="fs-24 fw-500">208</div>
                      <p>Followers</p>
                    </li>
                    <li>
                      <div class="fs-24 fw-500">560</div>
                      <p>Likes</p>
                    </li>
                    <li>
                      <div class="fs-24 fw-500">95</div>
                      <p>Photos</p>
                    </li>
                  </ul>
                  <button type="button" class="btn btn-raised btn-block btn-primary">Follow</button>
                </div>
              </div>
            </div>
          </div>
          <div class="row ml-10 mr-10 pt-10">
            <div class="col-md-3">
              <div class="widget clear">
                <div class="widget-heading">
                  <h3 class="widget-title">About me</h3>
                </div>
                <div class="widget-body">
                  <ul class="media-list mb-0">
                    <li class="media">
                      <div class="media-left"><i class="ti-briefcase text-info"></i></div>
                      <div class="media-body">
                        <p>Software Developer</p>
                      </div>
                    </li>
                    <li class="media">
                      <div class="media-left"><i class="ti-gift text-info"></i></div>
                      <div class="media-body">
                        <p>20 October 1990</p>
                      </div>
                    </li>
                    <li class="media">
                      <div class="media-left"><i class="ti-email text-info"></i></div>
                      <div class="media-body">
                        <p>lethemes@gmail.com</p>
                      </div>
                    </li>
                    <li class="media">
                      <div class="media-left"><i class="ti-home text-info"></i></div>
                      <div class="media-body">
                        <p>4270 Cottage Hill Road</p>
                      </div>
                    </li>
                    <li class="media">
                      <div class="media-left"><i class="ti-mobile text-info"></i></div>
                      <div class="media-body">
                        <p>(251) 300-2770</p>
                      </div>
                    </li>
                    <li class="media">
                      <div class="media-left"><i class="ti-world text-info"></i></div>
                      <div class="media-body">
                        <p>www.lethemes.net</p>
                      </div>
                    </li>
                  </ul>
                </div>
              </div>
              <div class="widget clear">
                <div class="widget-heading">
                  <h3 class="widget-title">Biography</h3>
                </div>
                <div class="widget-body">
                  <p>I am an Java, Android and Python software developer and teacher with 5 years of development experience! Whats more I reveal all my knowledge and secrets in my courses!</p>
                  <p>I've been using Java since all the way back in 2006 !</p>
                </div>
              </div>
              <div class="widget clear">
                <div class="widget-heading">
                  <h3 class="widget-title">Skills</h3>
                </div>
                <div class="widget-body">
                  <ul class="list-unstyled mb-0">
                    <li>
                      <div class="block clearfix mb-5"><span class="pull-left fs-12">HTML5</span><span class="pull-right label label-outline label-primary">95%</span></div>
                      <div class="progress progress-xs">
                        <div role="progressbar" data-transitiongoal="85" class="progress-bar"></div>
                      </div>
                    </li>
                    <li>
                      <div class="block clearfix mb-5"><span class="pull-left fs-12">CSS</span><span class="pull-right label label-outline label-success">98%</span></div>
                      <div class="progress progress-xs">
                        <div role="progressbar" data-transitiongoal="98" class="progress-bar progress-bar-success"></div>
                      </div>
                    </li>
                    <li>
                      <div class="block clearfix mb-5"><span class="pull-left fs-12">Javascript</span><span class="pull-right label label-outline label-purple">85%</span></div>
                      <div class="progress progress-xs">
                        <div role="progressbar" data-transitiongoal="85" class="progress-bar progress-bar-purple"></div>
                      </div>
                    </li>
                  </ul>
                </div>
              </div>
            </div>
            <div class="col-md-6">
              <div class="widget clear">
                <div class="widget-heading">
                  <div class="media">
                    <div class="media-left"><img src="../../images/users/10.jpg" alt="" class="media-object mo-lg img-circle"></div>
                    <div class="media-body media-middle">
                      <p class="mb-0"><span class="fw-500">Philip Fernandez</span> uploaded a new photo</p>
                      <time datetime="2015-12-10T20:50:48+07:00" class="text-muted fs-12">20 Jan 2016 <i class="ti-time"></i> 12:03 PM</time>
                    </div>
                  </div>
                </div>
                <div class="widget-body">
                  <p>
                    Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
                    tempor incididunt ut labore et dolore magna aliqua.
                  </p>
                  <div class="thumbnail"><img src="../../images/backgrounds/02.jpg" alt="">
                    <div class="text-right caption">
                      <ul class="list-inline mb-0">
                        <li><i class="ti-comment text-info"></i> 239</li>
                        <li><i class="ti-heart text-danger"></i> 4325</li>
                        <li><i class="ti-share text-success"></i> 3654</li>
                      </ul>
                    </div>
                  </div>
                  <ul class="media-list">
                    <li class="media">
                      <div class="media-left avatar"><img alt="" src="../../images/users/01.jpg" class="media-object img-circle"><span class="status bg-success"></span></div>
                      <div class="media-body">
                        <h5 class="media-heading inline-block">Philip Fernandez</h5>
                        <time datetime="2015-12-10T20:50:48+07:00" class="text-muted fs-12">20 Jan 2016 <i class="ti-time"></i> 12:12 PM</time>
                        <p>Mission accomplished. It's revolutionary.</p>
                        <div class="media">
                          <div class="media-left avatar"><img alt="" src="../../images/users/12.jpg" class="media-object img-circle"><span class="status bg-success"></span></div>
                          <div class="media-body">
                            <h5 class="media-heading inline-block">Carolyn Hernandez</h5>
                            <time datetime="2015-12-10T20:50:48+07:00" class="text-muted fs-12">20 Jan 2016 <i class="ti-time"></i> 12:14 PM</time>
                            <p>Vastly thought out! Found myself staring at it for minutes.</p>
                            <div class="media">
                              <div class="media-left avatar"><img alt="" src="../../images/users/11.jpg" class="media-object img-circle"><span class="status bg-success"></span></div>
                              <div class="media-body">
                                <h5 class="media-heading inline-block">Johnny Shaw</h5>
                                <time datetime="2015-12-10T20:50:48+07:00" class="text-muted fs-12">20 Jan 2016 <i class="ti-time"></i> 12:15 PM</time>
                                <p>Let me take a nap... great colour palette, anyway.</p>
                              </div>
                            </div>
                          </div>
                        </div>
                        <div class="media">
                          <div class="media-left avatar"><img alt="" src="../../images/users/14.jpg" class="media-object img-circle"><span class="status bg-success"></span></div>
                          <div class="media-body">
                            <h5 class="media-heading inline-block">Jean Boyd</h5>
                            <time datetime="2015-12-10T20:50:48+07:00" class="text-muted fs-12">20 Jan 2016 <i class="ti-time"></i> 12:14 PM</time>
                            <p>
                              This camera angle has navigated right into my heart.
                              My 32 year old parent rates this icons very cool :)
                            </p>
                          </div>
                        </div>
                      </div>
                    </li>
                  </ul>
                </div>
              </div>
              <div class="widget clear">
                <div class="widget-heading">
                  <div class="media">
                    <div class="media-left"><img src="../../images/users/12.jpg" alt="" class="media-object mo-lg img-circle"></div>
                    <div class="media-body media-middle">
                      <p class="mb-0"><span class="fw-500">Pamela Day</span> at <span class="fw-500">Los Angeles</span></p>
                      <time datetime="2015-12-10T20:50:48+07:00" class="text-muted fs-12">20 Jan 2016 <i class="ti-time"></i> 9:29 PM</time>
                    </div>
                  </div>
                </div>
                <div class="widget-body">
                  <p>Looks fun and good :-)</p>
                  <div class="thumbnail">
                    <div id="simpleMap" style="height:350px;"></div>
                    <div class="text-right caption">
                      <ul class="list-inline mb-0">
                        <li><i class="ti-comment text-info"></i> 43</li>
                        <li><i class="ti-heart text-danger"></i> 437</li>
                        <li><i class="ti-share text-success"></i> 651</li>
                      </ul>
                    </div>
                  </div>
                  <ul class="media-list">
                    <li class="media">
                      <div class="media-left avatar"><img alt="" src="../../images/users/01.jpg" class="media-object img-circle"><span class="status bg-success"></span></div>
                      <div class="media-body">
                        <h5 class="media-heading inline-block">Philip Fernandez</h5>
                        <time datetime="2015-12-10T20:50:48+07:00" class="text-muted fs-12">20 Jan 2016 <i class="ti-time"></i> 12:12 PM</time>
                        <p>Mission accomplished. It's revolutionary.</p>
                        <div class="media">
                          <div class="media-left avatar"><img alt="" src="../../images/users/12.jpg" class="media-object img-circle"><span class="status bg-success"></span></div>
                          <div class="media-body">
                            <h5 class="media-heading inline-block">Carolyn Hernandez</h5>
                            <time datetime="2015-12-10T20:50:48+07:00" class="text-muted fs-12">20 Jan 2016 <i class="ti-time"></i> 12:14 PM</time>
                            <p>Vastly thought out! Found myself staring at it for minutes.</p>
                            <div class="media">
                              <div class="media-left avatar"><img alt="" src="../../images/users/11.jpg" class="media-object img-circle"><span class="status bg-success"></span></div>
                              <div class="media-body">
                                <h5 class="media-heading inline-block">Johnny Shaw</h5>
                                <time datetime="2015-12-10T20:50:48+07:00" class="text-muted fs-12">20 Jan 2016 <i class="ti-time"></i> 12:15 PM</time>
                                <p>Let me take a nap... great colour palette, anyway.</p>
                              </div>
                            </div>
                          </div>
                        </div>
                        <div class="media">
                          <div class="media-left avatar"><img alt="" src="../../images/users/14.jpg" class="media-object img-circle"><span class="status bg-success"></span></div>
                          <div class="media-body">
                            <h5 class="media-heading inline-block">Jean Boyd</h5>
                            <time datetime="2015-12-10T20:50:48+07:00" class="text-muted fs-12">20 Jan 2016 <i class="ti-time"></i> 12:14 PM</time>
                            <p>
                              This camera angle has navigated right into my heart.
                              My 32 year old parent rates this icons very cool :)
                            </p>
                          </div>
                        </div>
                      </div>
                    </li>
                  </ul>
                </div>
              </div>
            </div>
            <div class="col-md-3">
              <div class="widget clear">
                <div class="widget-heading">
                  <h3 class="widget-title">Team member</h3>
                </div>
                <div class="widget-body">
                  <ul class="media-list mb-0">
                    <li class="media"><a href="javascript:;" class="conversation-toggle">
                        <div class="media-left avatar"><img src="../../images/users/10.jpg" alt="" class="media-object img-circle"><span class="status bg-success"></span></div>
                        <div class="media-body">
                          <h5 class="media-heading">Philip Fernandez</h5>
                          <p class="text-muted mb-0">489 Rhapsody Street</p>
                        </div></a></li>
                    <li class="media"><a href="javascript:;" class="conversation-toggle">
                        <div class="media-left avatar"><img src="../../images/users/20.jpg" alt="" class="media-object img-circle"><span class="status bg-success"></span></div>
                        <div class="media-body">
                          <h5 class="media-heading">Mary Carr</h5>
                          <p class="text-muted mb-0">3611 West Fork Drive</p>
                        </div></a></li>
                    <li class="media"><a href="javascript:;" class="conversation-toggle">
                        <div class="media-left avatar"><img src="../../images/users/11.jpg" alt="" class="media-object img-circle"><span class="status bg-danger"></span></div>
                        <div class="media-body">
                          <h5 class="media-heading">Joseph Salazar</h5>
                          <p class="text-muted mb-0">4489 Hart Ridge Road</p>
                        </div></a></li>
                    <li class="media"><a href="javascript:;" class="conversation-toggle">
                        <div class="media-left avatar"><img src="../../images/users/06.jpg" alt="" class="media-object img-circle"><span class="status bg-warning"></span></div>
                        <div class="media-body">
                          <h5 class="media-heading">John Cruz</h5>
                          <p class="text-muted mb-0">3274 Lyndon Street</p>
                        </div></a></li>
                    <li class="media"><a href="javascript:;" class="conversation-toggle">
                        <div class="media-left avatar"><img src="../../images/users/19.jpg" alt="" class="media-object img-circle"><span class="status bg-success"></span></div>
                        <div class="media-body">
                          <h5 class="media-heading">Jacqueline Rios</h5>
                          <p class="text-muted mb-0">559 Holly Street</p>
                        </div></a></li>
                  </ul>
                </div>
              </div>
              <div class="widget clear">
                <div class="widget-heading">
                  <h3 class="widget-title">Activities</h3>
                </div>
                <div class="widget-body">
                  <ul class="media-list mb-0">
                    <li class="media">
                      <div class="media-left"><i class="ti-control-record text-info"></i></div>
                      <div class="media-body">
                        <p>Recommended Karen Ortega</p>
                      </div>
                    </li>
                    <li class="media">
                      <div class="media-left"><i class="ti-control-record text-danger"></i></div>
                      <div class="media-body">
                        <p>Retweeted George Lewis</p>
                      </div>
                    </li>
                    <li class="media">
                      <div class="media-left"><i class="ti-control-record text-warning"></i></div>
                      <div class="media-body">
                        <p>Followed Olivia Williamson</p>
                      </div>
                    </li>
                    <li class="media">
                      <div class="media-left"><i class="ti-control-record text-success"></i></div>
                      <div class="media-body">
                        <p>Replied to Janice Davis</p>
                      </div>
                    </li>
                    <li class="media">
                      <div class="media-left"><i class="ti-control-record text-primary"></i></div>
                      <div class="media-body">
                        <p>Favorited Arthur Gomez</p>
                      </div>
                    </li>
                  </ul>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      <!-- Right Sidebar start-->
      <aside class="right-sidebar closed">
        <ul role="tablist" class="nav nav-tabs nav-justified nav-sidebar">
          <li role="presentation" class="active"><a href="#chat" aria-controls="chat" role="tab" data-toggle="tab"><i class="ti-comment-alt"></i></a></li>
          <li role="presentation"><a href="#announcement" aria-controls="announcement" role="tab" data-toggle="tab"><i class="ti-announcement"></i></a></li>
          <li role="presentation"><a href="#ticket" aria-controls="ticket" role="tab" data-toggle="tab"><i class="ti-bookmark-alt"></i></a></li>
          <li role="presentation"><a href="#setting" aria-controls="setting" role="tab" data-toggle="tab"><i class="ti-settings"></i></a></li>
        </ul>
        <div data-mcs-theme="minimal-dark" class="tab-content nav-sidebar-content mCustomScrollbar">
          <div id="chat" role="tabpanel" class="tab-pane fade in active">
            <form>
              <div class="form-group has-feedback">
                <input type="text" aria-describedby="inputChatSearch" placeholder="Chat with..." class="form-control rounded"><span aria-hidden="true" class="ti-search form-control-feedback"></span><span id="inputChatSearch" class="sr-only">(default)</span>
              </div>
            </form>
            <ul class="chat-list mb-0 fs-12 media-list">
              <li class="media"><a href="javascript:;" class="conversation-toggle">
                  <div class="media-left avatar"><img src="../../images/users/20.jpg" alt="" class="media-object img-circle"><span class="status bg-success"></span></div>
                  <div class="media-body">
                    <h6 class="media-heading">Jane Curtis</h6>
                    <p class="text-muted mb-0">Where are you from?</p>
                  </div>
                  <div class="media-right"><span class="badge bg-danger">2</span></div></a></li>
              <li class="media"><a href="javascript:;" class="conversation-toggle">
                  <div class="media-left avatar"><img src="../../images/users/01.jpg" alt="" class="media-object img-circle"><span class="status bg-success"></span></div>
                  <div class="media-body">
                    <h6 class="media-heading">Edward Garcia</h6>
                    <p class="text-muted mb-0">Nice to meet you.</p>
                  </div></a></li>
              <li class="media"><a href="javascript:;" class="conversation-toggle">
                  <div class="media-left avatar"><img src="../../images/users/02.jpg" alt="" class="media-object img-circle"><span class="status bg-success"></span></div>
                  <div class="media-body">
                    <h6 class="media-heading">Bruce Olson</h6>
                    <p class="text-muted mb-0">What do you want to do?</p>
                  </div></a></li>
              <li class="media"><a href="javascript:;" class="conversation-toggle">
                  <div class="media-left avatar"><img src="../../images/users/03.jpg" alt="" class="media-object img-circle"><span class="status bg-warning"></span></div>
                  <div class="media-body">
                    <h6 class="media-heading">Martha Rodriguez</h6>
                    <p class="text-muted mb-0">I'm hungry.</p>
                  </div>
                  <div class="media-right"><span class="badge bg-danger">1</span></div></a></li>
              <li class="media"><a href="javascript:;" class="conversation-toggle">
                  <div class="media-left avatar"><img src="../../images/users/05.jpg" alt="" class="media-object img-circle"><span class="status bg-success"></span></div>
                  <div class="media-body">
                    <h6 class="media-heading">Hannah Williamson</h6>
                    <p class="text-muted mb-0">Do you know the address?</p>
                  </div></a></li>
              <li class="media"><a href="javascript:;" class="conversation-toggle">
                  <div class="media-left avatar"><img src="../../images/users/06.jpg" alt="" class="media-object img-circle"><span class="status bg-success"></span></div>
                  <div class="media-body">
                    <h6 class="media-heading">Anthony Mills</h6>
                    <p class="text-muted mb-0">No problem.</p>
                  </div></a></li>
              <li class="media"><a href="javascript:;" class="conversation-toggle">
                  <div class="media-left avatar"><img src="../../images/users/07.jpg" alt="" class="media-object img-circle"><span class="status bg-warning"></span></div>
                  <div class="media-body">
                    <h6 class="media-heading">Ethan Stanley</h6>
                    <p class="text-muted mb-0">Hello?</p>
                  </div></a></li>
              <li class="media"><a href="javascript:;" class="conversation-toggle">
                  <div class="media-left avatar"><img src="../../images/users/08.jpg" alt="" class="media-object img-circle"><span class="status bg-success"></span></div>
                  <div class="media-body">
                    <h6 class="media-heading">Jonathan Castro</h6>
                    <p class="text-muted mb-0">OK. Thanks.</p>
                  </div>
                  <div class="media-right"><span class="badge bg-danger">1</span></div></a></li>
              <li class="media"><a href="javascript:;" class="conversation-toggle">
                  <div class="media-left avatar"><img src="../../images/users/09.jpg" alt="" class="media-object img-circle"><span class="status bg-success"></span></div>
                  <div class="media-body">
                    <h6 class="media-heading">Denise Rose</h6>
                    <p class="text-muted mb-0">Bye bye.</p>
                  </div></a></li>
              <li class="media"><a href="javascript:;" class="conversation-toggle">
                  <div class="media-left avatar"><img src="../../images/users/10.jpg" alt="" class="media-object img-circle"><span class="status bg-danger"></span></div>
                  <div class="media-body">
                    <h6 class="media-heading">Eugene Meyer</h6>
                    <p class="text-muted mb-0">How are you?</p>
                  </div></a></li>
            </ul>
          </div>
          <div id="announcement" role="tabpanel" class="tab-pane fade">
            <ul class="media-list mb-0 fs-12">
              <li class="media">
                <div class="media-left"><i class="ti-bar-chart-alt media-object mo-xs img-circle bg-primary text-center"></i></div>
                <div class="media-body">
                  <h6 class="media-heading">Market Trend Data</h6>
                  <p class="text-muted mb-0">Mattis nam fringilla dui nostra, ad fames fusce venenatis massa.</p>
                </div>
              </li>
              <li class="media">
                <div class="media-left"><i class="ti-package media-object mo-xs img-circle bg-success text-center"></i></div>
                <div class="media-body">
                  <h6 class="media-heading">Change Your Password!</h6>
                  <p class="text-muted mb-0">Varius dolor condimentum hendrerit eleifend est urna neque fames faucibus?</p>
                </div>
              </li>
              <li class="media">
                <div class="media-left"><i class="ti-gift media-object mo-xs img-circle bg-warning text-center"></i></div>
                <div class="media-body">
                  <h6 class="media-heading">We Apologize</h6>
                  <p class="text-muted mb-0">Justo at mauris ridiculus conubia penatibus dis varius proin porttitor!</p>
                </div>
              </li>
              <li class="media">
                <div class="media-left"><i class="ti-harddrives media-object mo-xs img-circle bg-info text-center"></i></div>
                <div class="media-body">
                  <h6 class="media-heading">Content Policy Update</h6>
                  <p class="text-muted mb-0">Quis ante imperdiet a volutpat quam tellus condimentum blandit elementum.</p>
                </div>
              </li>
              <li class="media">
                <div class="media-left"><i class="ti-mobile media-object mo-xs img-circle bg-purple text-center"></i></div>
                <div class="media-body">
                  <h6 class="media-heading">Mobile Apps</h6>
                  <p class="text-muted mb-0">Ad iaculis at feugiat integer lobortis vivamus hac egestas venenatis.</p>
                </div>
              </li>
              <li class="media">
                <div class="media-left"><i class="ti-alarm-clock media-object mo-xs img-circle bg-danger text-center"></i></div>
                <div class="media-body">
                  <h6 class="media-heading">New Features</h6>
                  <p class="text-muted mb-0">Primis elementum facilisi tristique faucibus feugiat enim rutrum id himenaeos.</p>
                </div>
              </li>
            </ul>
          </div>
          <div id="ticket" role="tabpanel" class="tab-pane fade">
            <form>
              <div class="form-group">
                <input type="text" placeholder="Username" class="form-control">
              </div>
              <div class="form-group">
                <input type="text" placeholder="Email" class="form-control">
              </div>
              <div class="form-group">
                <input type="text" placeholder="Subject" class="form-control">
              </div>
              <div class="form-group">
                <textarea rows="6" placeholder="Description" class="form-control"></textarea>
              </div>
              <button type="submit" class="btn btn-block btn-success">Create Ticket</button>
            </form>
          </div>
          <div id="setting" role="tabpanel" class="tab-pane fade">
            <form class="form-horizontal fs-12">
              <div class="clearfix">
                <h6 class="pull-left">Maintenance Mode</h6>
                <div class="switch pull-right">
                  <input id="setting-1" type="checkbox" checked="">
                  <label for="setting-1" class="switch-success"></label>
                </div>
              </div>
              <p class="text-muted">Ipsum non tempor non nullam nisi congue nisi amet enim.</p>
              <div class="clearfix">
                <h6 class="pull-left">Location Services</h6>
                <div class="switch pull-right">
                  <input id="setting-2" type="checkbox" checked="">
                  <label for="setting-2" class="switch-success"></label>
                </div>
              </div>
              <p class="text-muted">Eleifend suscipit erat cursus viverra commodo nostra sit commodo mollis.</p>
              <div class="clearfix">
                <h6 class="pull-left">Display Errors</h6>
                <div class="switch pull-right">
                  <input id="setting-3" type="checkbox" checked="">
                  <label for="setting-3" class="switch-success"></label>
                </div>
              </div>
              <p class="text-muted">Amet per tortor adipiscing risus dolor orci diam curabitur senectus.</p>
              <div class="clearfix">
                <h6 class="pull-left">Use SEO URLs</h6>
                <div class="switch pull-right">
                  <input id="setting-4" type="checkbox" checked="">
                  <label for="setting-4" class="switch-success"></label>
                </div>
              </div>
              <p class="text-muted">Ullamcorper dignissim facilisis fames proin a leo diam amet urna.</p>
              <div class="clearfix">
                <h6 class="pull-left">Enable History</h6>
                <div class="switch pull-right">
                  <input id="setting-5" type="checkbox" checked="">
                  <label for="setting-5" class="switch-success"></label>
                </div>
              </div>
              <p class="text-muted">Consectetur cubilia varius vulputate fermentum non dolor cubilia torquent risus.</p>
            </form>
          </div>
        </div>
      </aside>
      <aside class="conversation closed">
        <h5 class="text-center m-0 p-20">Edward Garcia<a href="javascript:;" class="conversation-toggle pull-left"><i class="ti-arrow-left text-muted"></i></a><a href="javascript:;" class="pull-right"><i class="ti-pencil text-muted"></i></a></h5>
        <ul data-mcs-theme="minimal-dark" class="media-list chat-content fs-12 pl-20 pr-20 mCustomScrollbar">
          <li class="media">
            <div class="media-left avatar"><img src="../../images/users/04.jpg" alt="" class="media-object img-circle"><span class="status bg-success"></span></div>
            <div class="media-body">
              <p>Hello.</p>
              <time datetime="2015-12-10T20:50:48+07:00" class="fs-11 text-muted">09:45 PM <i class="ti-check text-success"></i></time>
            </div>
          </li>
          <li class="media other">
            <div class="media-body">
              <p>Hi.</p>
              <time datetime="2015-12-10T20:50:48+07:00" class="fs-11 text-muted pull-right">09:46 PM <i class="ti-check text-success"></i></time>
            </div>
            <div class="media-right avatar"><img src="../../images/users/18.jpg" alt="" class="media-object img-circle"><span class="status bg-success"></span></div>
          </li>
          <li class="media">
            <div class="media-left avatar"><img src="../../images/users/04.jpg" alt="" class="media-object img-circle"><span class="status bg-success"></span></div>
            <div class="media-body">
              <p>How are you?</p>
              <time datetime="2015-12-10T20:50:48+07:00" class="fs-11 text-muted">09:47 PM <i class="ti-check text-success"></i></time>
            </div>
          </li>
          <li class="media other">
            <div class="media-body">
              <p>I'm good. How are you?</p>
              <time datetime="2015-12-10T20:50:48+07:00" class="fs-11 text-muted pull-right">09:50 PM <i class="ti-check text-success"></i></time>
            </div>
            <div class="media-right avatar"><img src="../../images/users/18.jpg" alt="" class="media-object img-circle"><span class="status bg-success"></span></div>
          </li>
          <li class="media">
            <div class="media-left avatar"><img src="../../images/users/04.jpg" alt="" class="media-object img-circle"><span class="status bg-success"></span></div>
            <div class="media-body">
              <p>Good. Do you speak English?</p>
              <time datetime="2015-12-10T20:50:48+07:00" class="fs-11 text-muted">09:55 PM <i class="ti-check text-success"></i></time>
            </div>
          </li>
          <li class="media other">
            <div class="media-body">
              <p>A little. Are you American?</p>
              <time datetime="2015-12-10T20:50:48+07:00" class="fs-11 text-muted pull-right">09:56 PM <i class="ti-check text-success"></i></time>
            </div>
            <div class="media-right avatar"><img src="../../images/users/18.jpg" alt="" class="media-object img-circle"><span class="status bg-success"></span></div>
          </li>
          <li class="media">
            <div class="media-left avatar"><img src="../../images/users/04.jpg" alt="" class="media-object img-circle"><span class="status bg-success"></span></div>
            <div class="media-body">
              <p>Yes.</p>
              <time datetime="2015-12-10T20:50:48+07:00" class="fs-11 text-muted">10:00 PM <i class="ti-check text-success"></i></time>
            </div>
          </li>
          <li class="media other">
            <div class="media-body">
              <p>Where are you from?</p>
              <time datetime="2015-12-10T20:50:48+07:00" class="fs-11 text-muted pull-right">10:01 PM <i class="ti-check text-success"></i></time>
            </div>
            <div class="media-right avatar"><img src="../../images/users/18.jpg" alt="" class="media-object img-circle"><span class="status bg-success"></span></div>
          </li>
          <li class="media">
            <div class="media-left avatar"><img src="../../images/users/04.jpg" alt="" class="media-object img-circle"><span class="status bg-success"></span></div>
            <div class="media-body">
              <p>I'm from California.</p>
              <time datetime="2015-12-10T20:50:48+07:00" class="fs-11 text-muted">10:03 PM <i class="ti-check text-success"></i></time>
            </div>
          </li>
          <li class="media other">
            <div class="media-body">
              <p>Nice to meet you.</p>
              <time datetime="2015-12-10T20:50:48+07:00" class="fs-11 text-muted pull-right">10:04 PM <i class="ti-check text-success"></i></time>
            </div>
            <div class="media-right avatar"><img src="../../images/users/18.jpg" alt="" class="media-object img-circle"><span class="status bg-success"></span></div>
          </li>
          <li class="media">
            <div class="media-left avatar"><img src="../../images/users/04.jpg" alt="" class="media-object img-circle"><span class="status bg-success"></span></div>
            <div class="media-body">
              <p>Nice to meet you too.</p>
              <time datetime="2015-12-10T20:50:48+07:00" class="fs-11 text-muted">10:05 PM <i class="ti-check text-success"></i></time>
            </div>
          </li>
        </ul>
        <form class="pl-20 pr-20">
          <div class="form-group has-feedback mb-0">
            <input type="text" aria-describedby="inputSendMessage" placeholder="Sent a message" class="form-control rounded"><span aria-hidden="true" class="ti-pencil-alt form-control-feedback"></span><span id="inputSendMessage" class="sr-only">(default)</span>
          </div>
        </form>
      </aside>
      <!-- Right Sidebar end-->
    </div>
	
	<!-- including js from include/admin/js-include.jsp -->
	<jsp:include page="../include/admin/js-include.jsp"></jsp:include>
  </body>
</html>
