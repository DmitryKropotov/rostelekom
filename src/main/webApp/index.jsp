<%--
  Created by IntelliJ IDEA.
  User: dkropotov
  Date: 12/10/19
  Time: 13:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>Final Project</title>


    <script type="text/javascript" src="jquery-1.8.3.js"></script>

    <script type="text/javascript">
        $(document).ready(
            function() {
                $.getJSON('<spring:url value="findAllColors.json"/>', {<!--spring:url value="activities.json/>"-->
                    ajax : 'true'
                }, function(data){
                    var html = '<option value="">--Please select product--</option>';
                    var len = data.length;
                    debugger;
                    for (var i = 0; i < len; i++) {
                        html += '<option value="' + data[i] + '">'
                            + data[i] + '</option>';
                    }
                    html += '</option>';
                    $('#products').html(html);
                });
            });
    </script>

    <style>
        .error {
            color: #ff0000;
        }

        .errorblock {
            color: #000;
            background-color: #ffEEEE;
            border: 3px solid #ff0000;
            padding: 8px;
            margin: 16px;
        }
    </style>


</head>
<body>

</body>
</html>