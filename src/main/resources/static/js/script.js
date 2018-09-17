var selected = [];
	
$("button.selectHub").click(function() {
	
	var hubName = $(this).val();
	selected.push(hubName);
	
	document.getElementById($(this).val()).classList.toggle('selected');
	
	$("#hubList").val(selected);

});