<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
   <head>
      <title>Student Registration Form</title>
   </head>
   <body>
      <form:form action="processForm" modelAttribute="student">
         First name: 
         <form:input path="firstName"/>
         <br>
         Last name: 
         <form:input path="lastName"/>
         <br>
         Country: 
         <form:select path="country">
            <form:options items="${student.countryOptions}"></form:options>
         </form:select>
         <br>
         Favorite language: 
         <form:radiobuttons path="favoriteLanguage" items="${student.languageOptions}"/>
         <br>
         Operation Systems:
         <form:checkboxes items="${student.operatingSystemsOptions}" path="operatingSystems"/>
         <br><br>
         <input type="submit" value="Submit"/>
      </form:form>
   </body>
</html>