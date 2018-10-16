<%--
  Created by IntelliJ IDEA.
  User: ouryoushi
  Date: 2018/10/11
  Time: 下午10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/anno/showresult" method="post">
    <input name="firstName" value="张" type="text"/>
    <input name="lastName" value="三" type="text"/>
    <input type="submit"/>
</form>
<form action="/anno/showparamresult" method="post">
    <input name="firstName" value="张" type="text"/>
    <input name="lastName" value="三" type="text"/>
    <input type="submit"/>
</form>
<form action="/anno/testrequestparam" method="post">
    <input name="firstName" value="张" type="text"/>
    <input name="lastName" value="三" type="text"/>
    <input type="submit"/>
</form>
<form action="/anno/testdefaultparam" method="post">
    <input name="firstName" value="张" type="text"/>
    <input name="lastName"  type="text"/>
    <input type="submit"/>
</form>
<input type="button" value="test" id="test" />
<input type="button" value="test" id="testJson" />


<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
<script type="text/javascript">
    $(function(){
        $("#test").click(function(){
            test();
        });
        function test(){
            $.get("/anno/getjson", { name: "John", time: "2pm" },
                function(data){
                    alert("Data Loaded: " + data);
                });
        }
        $("#testJson").click(function(){
            testJson();
        });
        function testJson(){
            $.get("/anno/testjson", { name: "John", time: "2pm" },
                function(data){
                    alert("Data Loaded: " + data);
                });
        }
    });
</script>
</body>
</html>
