<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h2>Dear Employee, please enter your details</h2>
<br>
<br>

<form:form action = "showDetails" modelAttribute = "employee">
    Name <form:input path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <br><br>
    Salary <form:input path="salary"/>
    <br><br>

    Department <form:select path="department">
    <form:option value="Information Tehnology" label="IT"/>
    <form:option value="Human Resources" label="HR"/>
    <form:option value="Sales" label="Sales"/>

    </form:select>
    <br><br>

    Which car do you want?
    <br><br>

    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>


    <br><br>


    <input type="submit" value="ok">

</form:form>

</body>
</html>