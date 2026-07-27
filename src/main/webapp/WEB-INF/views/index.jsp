<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>QueryDSL</title>
</head>
<body>
<section>
  <form method="post">
      <input name="title" placeholder="제목">
      <input name="content" placeholder="내용">
      <button>생성</button>
  </form>
</section>
<section>
  <c:forEach items="${boards}" var="board">
    <p>
      ${board.id} ${board.title} ${board.content}<br>
              ${board.createdAt} ${board.updatedAt}
    </p>
  </c:forEach>
</section>
</body>
</html>
