<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: User
  Date: 11/20/2020
  Time: 3:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<head>
    <title>userDetail</title>
</head>
<body>

    Hello Nijat Salmanov


    <div style="width: 900px;height:100px;margin:15px 0px 0px 30px ;">
<%--        <c:forEach items="${users}" var="u">--%>
        <c:forEach items="${userObject}" var="u">
        <form:form action="userDetailUpdate" method="POST" modelAttribute="userData" >
            <input type="hidden" name="id" value="${u.id}"/>
            <input type="hidden" name="action" value="update"/>

           <div class="form-group row">
               <label class="col-2 col-form-label">Name</label>
              <div class="col-10">
                  <input type="text" class="form-control" name="name" value="${u.name}"/>
              </div>
           </div>

            <div class="form-group row">
                <label class="col-2 col-form-label">Surname</label>
                <div class="col-10">
                    <input type="text" class="form-control" name="surname" value="${u.surname}"/>
                </div>
            </div>

            <div class="form-group row">
                <label class="col-2 col-form-label">Address</label>
                <div class="col-10">
                    <input type="text" class="form-control" id="inputAddress" name="address" placeholder="Baku.Azerbaijan" value="${u.address}">
                </div>
            </div>

            <div class="form-group row">
                <label class="col-2 col-form-label">Email</label>
                <div class="col-10">
                    <input type="email" class="form-control" name="email" id="inputEmail4" placeholder="Email" value="${u.email}">
                </div>
            </div>

            <div class="form-group row">
                <label class="col-2 col-form-label">Phone-number</label>
                <div class="col-10">
                    <input class="form-control" type="tel" name="phone" value="${u.phone}" id="example-tel-input" >
                </div>
            </div>

            <div class="form-group row">
                <label for="example-date-input" class="col-2 col-form-label">Date</label>
                <div class="col-10">
                    <input class="form-control" type="date" name="birthdate" value="${u.birthDate}" id="example-date-input">
                </div>
            </div>

            <div class="form-group row">
                <label class="col-2 col-form-label">Profile Description</label>
                <div class="col-10">
                    <textarea class="form-control" name="profileDescription"  id="exampleFormControlTextarea1" rows="5">${u.profileDescription}</textarea>
                </div>
            </div>

            <div class="form-group row">
                <label class="col-2 col-form-label">Nationality</label>
                <div class="col-10">
                    <select class="form-control" name="nationalityId" path="nationalityId">

                        <option value="${u.nationality.id}">${u.nationality.nationality}</option>

                <c:forEach items="${countryObject}" var="country">

                    <c:if test="${u.nationality.id!=country.id}">
                        <option value="${country.id}">${country.nationality}</option>
                    </c:if>
                </c:forEach>
                    </select>
                </div>
            </div>

            <div class="form-group row">
                <label class="col-2 col-form-label">Country</label>
                <div class="col-10">
                    <select class="form-control" name="birthplaceId" path="birthplaceId">
            <option value="${u.birthPlace.id}">${u.birthPlace.name}</option>

            <c:forEach items="${countryObject}" var="country">

                <c:if test="${u.birthPlace.id!=country.id}">
                    <option value="${country.id}">${country.name}</option>
                </c:if>
            </c:forEach>
                    </select>
                </div>
            </div>

            <input type="submit" name="save" value="Save"/>
        </form:form>
        </c:forEach>
    </div>

</body>
</html>
