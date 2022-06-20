/**
 * 
 */
function fetchData() {
	var requestObject = new XMLHttpRequest();
	let endpoint ="http://"+ window.location.host.concat("/aplicativo/api/post")
	requestObject.open("GET", endpoint, "true");
	requestObject.onreadystatechange = function() { // Call a function when the state changes.
		if (this.readyState === XMLHttpRequest.DONE) {
			let post = JSON.parse(requestObject.response)[0];
			document.getElementById("created_at").innerHTML=post.createdAt;
			document.getElementById("title").innerHTML=post.title;
			document.getElementById("content").innerHTML=post.content;

		}
	};

	requestObject.send();
}
fetchData();
console.log(window.location.host)