<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
   <head>
      <title>Student Registration Confirmation</title>
   </head>
   <body>
      Student registered successfully!
      <br><br>
      Welcome <strong>${student.firstName} ${student.lastName}</strong>!
      <br>
      It's good to see a student from <strong>${student.country}</strong>.
      <br>
      Here, you're going to learn a lot of <strong>${student.favoriteLanguage}</strong>
      <br>
      Look's like you have experience using:
      <ul>
         <c:forEach var="temp" items="${student.operatingSystems}">
            <li>${temp}</li>
         </c:forEach>
      </ul>
      <br>
      Nice!
      </form:form>
   </body>
</html>