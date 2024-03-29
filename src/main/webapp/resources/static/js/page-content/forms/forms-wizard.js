$(document).ready(function() {
	$("#form-horizontal").steps({
		headerTag : "h3",
		bodyTag : "fieldset",
		transitionEffect : "slide"
	}), $("#form-vertical").steps({
		headerTag : "h3",
		bodyTag : "fieldset",
		transitionEffect : "slide",
		stepsOrientation : "vertical"
	}), $("#form-tabs").steps({
		headerTag : "h3",
		bodyTag : "fieldset",
		transitionEffect : "slideLeft",
		enableFinishButton : !1,
		enablePagination : !1,
		enableAllSteps : !0,
		titleTemplate : "#title#",
		cssClass : "tabcontrol"
	})
});