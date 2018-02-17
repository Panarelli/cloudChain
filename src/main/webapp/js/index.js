function autenticazioneLogin(){
	var username = $("#username").val();
	var password = $("#password").val();
	
	debugger
	var data = { "username": "francesco","password": "francesco"}
    $.ajax({
        data: JSON.stringify(data),
        dataType: 'json',
        url : "http://localhost:8080/cloudChain/login/controlUsers/",
        type : 'POST',
        success : function(data) {
            console.log("success post!");
        },
        error : function(e) {
            console.log("error: " + e);
        }
    });     
	
	
	
//	var users = "francesco";
//	var passwords = "francesco";
//
//	if(username !="" && password != ""){
//		if(users == username.toLowerCase() && passwords == password.toLowerCase()){
//			$("#accedi").css("display","none");
//			$("#menuLogging").css("display","block");
//			$("#erroreDatiSbagliati").hide();
//			$("#erroreCampiVuoti").hide();
//		}else{
//			$("#erroreDatiSbagliati").show();
//			$("#erroreCampiVuoti").hide();
//		}
//	}else{
//		$("#username").addClass('has-error');
//		$("#password").addClass('has-error');
//		$("#erroreCampiVuoti").show();
//		$("#erroreDatiSbagliati").hide();
//	}
	
	// Count dati 
	var start = 0;
	var end = 200;
	var speed = 110;
	$(document).ready(function () {
	    var interval = setInterval(function () {
	        if (start >= end) {
	            clearInterval(interval);
	        }
	        $("#counter").html(start);
	        start++;
	    }, speed);
	});
	
	var modal = document.getElementById('id01');

	// When the user clicks anywhere outside of the modal, close it
	window.onclick = function(event) {
	    if (event.target == modal) {
	        modal.style.display = "none";
	    }
	}
		
}