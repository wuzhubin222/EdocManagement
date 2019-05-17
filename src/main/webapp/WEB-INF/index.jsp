<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<html>
<body>
<c:if test="${empty list}">
    <c:redirect url="/edoc/list"></c:redirect>
</c:if>
<form method="post" action="${pageContext.request.contextPath}/edoc/list">
    <div  align="center">
        文档分类
        <select style="widtd: 90px" name="categroyid">
            <option value="0">请选择</option>
            <c:forEach items="${list2}" var="s">
               <%-- <option value=${s.id}>${s.name}</option>--%>
                <option value="${s.id}" <c:if test="${categroyids == s.id}">selected</c:if>>${s.name}</option>
            </c:forEach>
        </select>

        <input type="submit" value="查询">
        <table border="1">
            <tr>
                <th colspan="6"><h1>电子文档类</h1></th>
            </tr>
            <tr>
                <th>文档编号</th>
                <th>文档名称</th>
                <th>文档摘要</th>
                <th>上传人</th>
                <th>上传日期</th>
                <th>操作</th>
            </tr>
            <c:forEach var="s" items="${list}">
                <tr>
                    <td>${s.id}</td>
                    <td>${s.title}</td>

                    <td>${s.summary}</td>
                    <td>${s.uploaduser}</td>
                    <td><fmt:formatDate value="${s.cretedate}" pattern="yyyy-MM-dd"/></td>
                    <td><a href="${pageContext.request.contextPath}/edoc/del?id=${s.id}">删除</a></td>
                </tr>
            </c:forEach>
        <tr>
            <td colspan="6" align="center">     <%--a标签传值不会传整个表单的数据--%>
                <a href="${pageContext.request.contextPath}/edoc/list?currPageNo=1&categroyid=${categroyids}">首页</a>
                <a href="${pageContext.request.contextPath}/edoc/list?currPageNo=${page.pageCurrent-1}&categroyid=${categroyids}">上一页</a>
                <a href="${pageContext.request.contextPath}/edoc/list?currPageNo=${page.pageCurrent+1}&categroyid=${categroyids}">下一页</a>
                <a href="${pageContext.request.contextPath}/edoc/list?currPageNo=${page.getPageCurrentNo}&categroyid=${categroyids}">末页</a>
            </td>
        </tr>
        </table>
    </div>
</form>
</body>
</html>
