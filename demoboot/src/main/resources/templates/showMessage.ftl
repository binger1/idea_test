<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <title>showMes</title>
</head>
<body>
<table border="1" align="center" width="50%">
    <tr>
        <th>Name</th>
        <th>age</th>
        <th>sex</th>
    </tr>
    <#list list as user>
    <tr>
        <td>${user.name}</td>
        <td>${user.age}</td>
        <td>${user.sex}</td>
    </tr>
    </#list>
</table>
</body>
</html>