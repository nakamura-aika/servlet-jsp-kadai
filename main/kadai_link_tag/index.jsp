<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>リンク送信課題</title>
</head>
<body>
    <h2>Servletへのリンク</h2>
    <!-- Servletへのリンク。nameパラメータを付加 -->
    <a href="link?name=侍太郎">名前「侍太郎」を]Servletに送信</a>

    <br>
    <% String message = (String) request.getAttribute("message"); %>
    <% if (message != null) { %>
        <p>Servletからデータを受信しました：<strong><%= message %></strong></p>
    <% } %>
</body>
</html>
