window.addEventListener("load", function(){
	
	// Open the modal based on the data-target value of the button
	var modalOpenBttns = document.getElementsByClassName("modalBttn");
	for(let i = 0; i < modalOpenBttns.length; i++) {
		modalOpenBttns[i].addEventListener("click", function() {
			var target = this.dataset.target;
			document.getElementById(target).classList.add("open");
			document.getElementsByTagName("body")[0].style.overflow = "hidden";
			document.getElementsByTagName("body")[0].classList.add("modalOpen");
		})
	}	
	
	// Close the modal if the surround is clicked
	var modalCloseArea = document.getElementsByClassName("modal");
	for(let i = 0; i < modalCloseArea.length; i++) {
		modalCloseArea[i].addEventListener("click", function(e) {
			if(e.target == this) {
				this.classList.remove("open");
				document.getElementsByTagName("body")[0].style.overflow = "auto";
				document.getElementsByTagName("body")[0].classList.remove("modalOpen");
			} 
		})
	}
	
	// Close the modal if any element with modalClose class is clicked
	var modalCloseBttns = document.getElementsByClassName("modalClose");
	for(let i = 0; i < modalCloseBttns.length; i++) {
		modalCloseBttns[i].addEventListener("click", function() {
			var target = this.dataset.target;
			document.getElementById(target).classList.remove("open");
			document.getElementsByTagName("body")[0].style.overflow = "auto";
			document.getElementsByTagName("body")[0].classList.remove("modalOpen");
		})
	}

})