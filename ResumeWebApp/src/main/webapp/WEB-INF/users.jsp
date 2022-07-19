
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix = "co" uri = "http://java.sun.com/jstl/core"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<link rel="stylesheet" href="static/css/users.css">
<script src="https://kit.fontawesome.com/eead799839.js" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">


<script>
    function setIdForDelete(id){
        var elem = document.getElementById("idForDelete");
        elem.value = id;
    }
</script>

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<head>
    <title>Users</title>
</head>
<body>


<div class="container mycontainer">

    <div>
    <%--@elvariable id="user" type="com.company."--%>
    <form:form  action="usersm" method="GET" modelAttribute="user">
       <div class="form-group">
           <label>Name:</label>

           <form:input
                  path="name"
                  placeholder="Enter name"
                  class="form-control"/>
           <form:errors path="name"/>
       </div>

        <div class="form-group">
            <label>Surname:</label>
            <form:input
                   path="surname"
                   placeholder="Enter surname"
                   class="form-control"/>
            <form:errors path="surname"/>
        </div>

        <form:button class="btn btn-primary" type="submit" id="btnsearch">Search</form:button>

    </form:form>
</div>
    <div>
        <table class="table">
            <thead>
            <tr>
                <th>Name</th>
                <th>Surname</th>
                <th>Nationality</th>
                <th></th>
            </tr>
            </thead>
            <tbody>
        <c:forEach items="${users}" var="u">
            <tr>
                <td>${u.name}</td >
                <td>${u.surname}</td >
                <td>${u.nationality.name}</td>
                <%--<td><%=countryDaoInter.getById(u.getNationality().getId()).getNationality()==null?"N/A":countryDaoInter.getById(u.getNationality().getId()).getNationality()%></td>--%>
                <td style="padding-left: 5px">
                        <input type="hidden" name="id" value="${u.id}">
                        <input type="hidden" name="action" value="delete">
                        <button class="btn btn-danger" type="submit" value="delete"
                                data-toggle="modal" data-target="#exampleModal"
                        onclick="setIdForDelete(${u.id})">
                            <i class="fas fa-trash-alt"></i>
                        </button>
                </td>
                <td>
                    <form action="userDetail" method="GET">
                        <input type="hidden" name="id" value="${u.id}">
                        <input type="hidden" name="action" value="update">
                        <button class="btn btn-secondary" type="submit" value="update">
                            <i class="fas fa-edit"></i>
                        </button>
                    </form>
                </td>
            </tr >
            </c:forEach>
            </tbody>
        </table>

    </div>

</div>

<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Delete</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                Are you sure?
            </div>
            <div class="modal-footer">
                <form action="userDelete" method="GET">
                    <input type="hidden" name="id" value="" id="idForDelete"/>
                    <input type="hidden" name="action" value="delete">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    <input type="submit" class="btn btn-danger" value="Delete">
                </form>
            </div>
        </div>
    </div>
</div>

</body>
</html>
