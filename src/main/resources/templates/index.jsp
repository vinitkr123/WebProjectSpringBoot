<html xmlns:th="http://www.thymeleaf.org">
  <head th:include="layout :: head(title=~{::title},links=~{})">
    <title>Please Login</title>
  </head>
  <body th:include="layout :: body" th:with="content=~{::content}">
    <div th:fragment="content">
        <form name="f" th:action="@{/login}" method=get>               
            <fieldset>
                <legend>Please Login</legend>
                <div th:if="${param.error}" class="alert alert-error">    
                    Invalid username and password.
                </div>
                <div th:if="${param.logout}" class="alert alert-success"> 
                    You have been logged out.
                </div>
                <label for="username">Username</label>
                <input type="text" id="username" name="username"/>        
                <label for="password">Password</label>
                <input type="password" id="password" name="password"/>    
                <div class="form-actions">
                    <button type="submit" class="btn">Log in</button>
                </div>
            </fieldset>
        </form>
    </div>
  </body>
</html>
