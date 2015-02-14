<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>로그인</title>
	<link href="/resources/css/join.css" rel="stylesheet">
</head>
<body>
<form action="/login">
  <div>
    <label class="desc" id="title1" for="Field1">이름</label>
    <div>
      <input id="Field1" name="name" type="text" class="field text fn" value="" size="8" tabindex="1">
    </div>
  </div>

  <div>
    <label class="desc" id="title3" for="Field3">Email</label>
    <div>
      <input id="Field3" name="email" type="email" spellcheck="false" value="" maxlength="255" tabindex="3">
   </div>
  </div>

  <div>
          <div>
            <input id="saveForm" name="saveForm" type="submit" value="Submit">
    </div>
     </div>

</form>
</body>
</html>