//Here is an example of how to use a bean in a JSP page:

<jsp:useBean id="user" class="com.example.UserBean" scope="session"/>

<%
  String name = user.getName();
  int age = user.getAge();
%>

<p>Name: <%= name %></p>
<p>Age: <%= age %></p>
//In this example, the jsp:useBean action tag creates a new instance of the UserBean class and stores it in a session-scoped variable called "user". The scriptlets then retrieve the name and age properties from the bean and display them on the page.

//Note that the jsp:useBean action tag can also be used to reference an existing bean rather than create a new one. In this case, you would specify the beanName attribute instead of the class attribute.

<jsp:useBean id="user" beanName="userBean" scope="session"/>
//You can also use the <jsp:setProperty> action tag to set the properties of a bean in a JSP page. For example:

<jsp:useBean id="user" class="com.example.UserBean" scope="session"/>
<jsp:setProperty name="user" property="name" value="John Smith"/>
<jsp:setProperty name="user" property="age" value="30"/>
//In this example, the jsp:setProperty action tags set the name and age properties of the UserBean to "John Smith" and 30, respectively.