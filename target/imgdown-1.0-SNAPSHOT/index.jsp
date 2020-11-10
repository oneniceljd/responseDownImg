<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%--<script type="text/javascript">
    function downImg(){
        document.getElementById("img").src="${pageContext.request.contextPath}/img";
    }
</script>--%>
<body>
<a href="${pageContext.request.contextPath}/img"><img src="${pageContext.request.contextPath}/test"></a>
<%--<input type="button" src="${pageContext.request.contextPath}/img" value="下载图片">--%>
</body>
</html>
