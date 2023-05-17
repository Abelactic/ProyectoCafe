$(document).ready(function () {
    $("td #btndelete").click(function () {
        var idp = $(this).find("#idp").val();
        eliminar(idp);

    });
    function eliminar(idp) {
        var url = "controlador?accion=Delete";
        $.ajax({
            type: 'POST',
            url: url,
            data: "idp="+idp,
            success: function (data, textStatus, jqXHR) {
                alert("Se ha eliminado el producto");
}
            


        });
    }
});

