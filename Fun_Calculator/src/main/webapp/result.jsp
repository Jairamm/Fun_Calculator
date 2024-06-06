<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculator World </title>
<style>
img {
height  :18%;
width : 18% 
}
body{
text-align :center ;
background :linear-gradient(to right ,red,blue);
line-height :3px ;
}
button{
background-color: blue ;
font-size :15px;
text-align :center ;
font-size :30px ;

}
h1{
color:white ;
line-height :1
}


input{
font-size :30px;
background-color : yellow  ;

}


</style>
</head>
<body>
<img src ="image/smile.gif" class="rounded">
<h1> !! joke of calculation  !! </h1>

<h1><%=request.getParameter("joke")%></h1>
<form action ="om">
<input name ="num1" placeholder ="first number"></input>
<input name ="num2" placeholder ="second number" ></input>

<br>

<button name="bit" value ="1"> add + </button>
<button name="bit" value ="2"> sub - </button>
<button name="bit" value ="3"> mul * </button>
<button name="bit" value ="4"> div / </button>
<button name="bit" value ="5"> mod % </button>
<button name="bit" value ="6"> square </button>
<button name="bit" value ="7"> factorial </button>

<br>

</form>
<h1>Ans=<%=request.getParameter("ans")%></h1>
</body>
</html>