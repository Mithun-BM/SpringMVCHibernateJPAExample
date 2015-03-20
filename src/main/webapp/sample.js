function test(){
	debugger;
	var jsonobj = [		{"circleID":"1", "msisdn":"5787","id":"1"},
	    				{"circleID":"1", "msisdn":"7678","id":"2"},
	    				{"circleID":"1", "msisdn":"9101","id":"3"}
	    						   ]; 
	    						   
	 $.ajax({
			type: "POST",
			url: "/acceptJSONStringMethod1",
			contentType: "application/json", //"text/plain"
			data: JSON.stringify(jsonobj),
			async: true,
			success: function(html){
				$("#mydiv").html(html);
			}
		});
	
	 $.ajax({
			type: "POST",
			url: "/acceptJSONStringMethod2",
			data: JSON.stringify(jsonobj),
			async: true,
			success: function(html){
				$("#mydiv").html(html);
			}
		});
	
	 $.ajax({
			type: "POST",
			url: "/acceptJSONStringMethod3",
			data: JSON.stringify(jsonobj),
			async: true,
			success: function(html){
				$("#mydiv").html(html);
			}
		});
	
	 $.ajax({
			type: "POST",
			url: "/acceptJSONStringMethod4",
			data: JSON.stringify(jsonobj),
			async: true,
			success: function(html){
				$("#mydiv").html(html);
			}
		});
}