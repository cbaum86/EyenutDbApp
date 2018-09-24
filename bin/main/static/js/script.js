var selected = [];

function toggleAws(source) {
	toggleAll("selectAwsHub", source)	
}
function toggleStar(source) {
	toggleAll("selectStarHub", source)
}
function toggleHub(source) {
	source.classList.toggle("selected");
	manageSelection(source);
}

function toggleAll(serverType, source) {
	var buttons = document.getElementsByName(serverType);
	if (source.classList.contains("selected")) {
		for (button of buttons) {
			button.classList.remove("selected");
			manageSelection(button);
		}
		source.innerHTML = "<i class='fas fa-check'></i>Select All";
	} else {
		for (button of buttons) {
			button.classList.add("selected");
			manageSelection(button);
		}
		source.innerHTML = "<i class='fas fa-times'></i>Deselect All";
	}
	
	source.classList.toggle("selected");
}

function manageSelection(button) {
	var hubName = button.value
	var arrayElement = selected.indexOf(hubName);
	if (arrayElement > -1) {
		selected.splice(arrayElement, 1);
	} else {
		selected.push(hubName);
	}
	
	console.log(selected);
	
	$("#hubList").val(selected);
}