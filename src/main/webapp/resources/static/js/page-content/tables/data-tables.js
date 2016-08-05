$(document).ready(
		function() {
			$("#example-1").dataTable();
			var e = $("#example-2").DataTable({
				lengthChange : !1,
				buttons : [ "copy", "excel", "pdf", "print" ]
			});
			e.buttons().container().appendTo(
					"#example-2_wrapper .col-sm-6:eq(0)"), $("#example-3")
					.DataTable({
						colReorder : !0
					}), $("#example-5").DataTable({
				keys : !0
			}), $("#example-6").DataTable({
				select : {
					style : "os"
				}
			}), $("#example-7").DataTable(), $("#example-8").DataTable({
				scrollX : !0,
				scrollCollapse : !0,
				fixedColumns : !0
			}), $("#example-9").DataTable({
				fixedHeader : !0
			})
		});