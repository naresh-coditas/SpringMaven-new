<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<body>

<h1>User Details</h1>

<h3>Personal Details</h3>
 <table border="1">
 <tr>
 <td>
 First Name
 </td>
 <td>
 Last Name
 </td>
 <td>
 	Local Address
 </td>
 <td>
 Permenant Address
 </td>
 <td>
 Email ID
 </td>
 <td>
 Facebook ID
 </td>
 </tr>
 <tr>
 <td>
 ${userDetails.firstName}
 </td>
 <td>
 ${userDetails.lastName}
 </td>
 <td>
 ${userDetails.localAddress.details}, ${userDetails.localAddress.streetName},${userDetails.localAddress.city},${userDetails.localAddress.country}
 </td>
 <td>
 ${userDetails.localAddress.details}, ${userDetails.localAddress.streetName},${userDetails.localAddress.city},${userDetails.localAddress.country}
 </td>
 <td>
 ${userDetails.electronicAddress.emailId}
 </td>
 <td>
 ${userDetails.electronicAddress.faceBookId}
 </td>
 </tr>
 </table>
</body>
</html>