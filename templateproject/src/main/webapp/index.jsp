<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" lang="pt-br">
<head>
	<title></title>
</head>


<body>

<h1>Test Servlet</h1>
<br />
<%
	String path_= request.getContextPath();

    String remoteAddr = request.getRemoteAddr();
    
    String host = request.getRemoteHost();
    
    String serverName = request.getServerName();
    
    int porta = request.getServerPort();
    
    String localName = request.getLocalName();
    
    String localAddr = request.getLocalAddr();
    
    int portaLocal = request.getLocalPort();
%>

<form action="<%=path_%>/project">
  	<input type="hidden" name="acao" value="cons">
  	<input type="submit" name="Enviar">
  	
  	<!-- 
  	<br>remoteAddr:&nbsp; <%=remoteAddr%>
  	<br>host:&nbsp; <%=host%>
  	<br>serverName:&nbsp; <%=serverName%>
  	<br>porta:&nbsp; <%=porta%>
  	<br>localName:&nbsp; <%=localName%>
  	<br>localAddr:&nbsp; <%=localAddr%>
  	<br>portaLocal:&nbsp; <%=portaLocal%>
  	 -->
  	<br><br>
	
	<ul> 
        <li><a href='http://<%=serverName%>:<%=porta%><%=path_%>/ns/rest/servicos/seguranca/autenticar?nuCpf=51964149754&senha=123456'> Autenticar </a></li> 
        <li><a href='http://<%=serverName%>:<%=porta%><%=path_%>/ns/rest/servicos/aditamento/disponivel?nuCpf=51964149754'> Aditamento Disponivel </a></li>
        <li><a href='http://<%=serverName%>:<%=porta%><%=path_%>/ns/rest/servicos/aditamento/historico?nuCpf=51964149754'> Historico Aditamento </a></li> 
        <li><a href='http://<%=serverName%>:<%=porta%><%=path_%>/ns/rest/servicos/aditamento/consultarreabertura?nuCpf=51964149754&coAditamento=1'> Consultar Reabertura </a></li>
        <li><a href='http://<%=serverName%>:<%=porta%><%=path_%>/index.html'> Outros Servicos </a></li>
    </ul>
  	
</form>
</body>
</html>