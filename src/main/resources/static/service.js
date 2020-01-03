
$(document).ready(function() {

    $( "#submitBtn" ).click(function() {

        var nameA = $("#nameA").val();
        var nameB = $("#nameB").val();

        if(nameA && nameB) {

            $.ajax({
                type: "POST",
                url: "http://localhost:8089/save/" + nameA +  "/" + nameB
            }).always(function (data) {

                alert(data.responseText);
            });

        } else{
            alert("Please fill the requested fields");
        }
    });


});