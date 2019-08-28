<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<html>
    <body>
        <h2>${name}</h2>
        <h2>Event Booking</h2>
        <form action="add" method="post">
            <label>Event Title: </label>
            <input type="text" name="event-title"><br>

            <label>City: </label>
            <input type="text" name="city"><br>

            <label>Price: </label>
            <input type="text" name="price"><br>

            <label>Type: </label>
            <input type="text" name="type"><br>

            <input type="submit">
        </form>

        <a href="list">Go to Eventlist</a>
    </body>
</html>
