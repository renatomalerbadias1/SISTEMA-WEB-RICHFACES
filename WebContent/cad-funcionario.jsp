<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Funcionario</title>

<link href="css/cad-funcionario.css" rel="stylesheet">
</head>
<body>

	
	
	
	<f:view>
	
	
		<jsp:include page="/menu.jsp" />

		<h:form>


			<div align="center">
			
			
			<h1>Cadastro de Funcionario </h1>
			
			<h:panelGrid columns="1">
				<h:messages />
				</h:panelGrid>



			<h:panelGrid  columns="2">
			
			<h:outputText value="Nome:" />
			<h:inputText value="#{funcionarioBacking.nome }" maxlength="40" size="40"/>
			
			<h:outputText value="CPF:" />
			<h:inputText value="#{funcionarioBacking.cpf }" maxlength="40" size="40"/>
			
			<h:outputText value="Data Nascimento:" />
			<h:inputText value="#{funcionarioBacking.data_nascimento }" maxlength="40" size="40"/>
			
			<h:outputText value="Idade:" />
			<h:inputText value="#{funcionarioBacking.idade }" maxlength="40" size="40"/>
			
			<h:outputText value="Cidade:" />
			<h:selectOneMenu value="#{funcionarioBacking.cidade}">
			<f:selectItem itemValue="" itemLabel="- Selecione Cidade -" />
			</h:selectOneMenu>			
				
			<h:outputText value="Sexo:" />
			<h:selectOneRadio value="#{funcionarioBacking.sexo }">
	     	<f:selectItem itemValue="masculino" itemLabel="Masculino"/>
		    <f:selectItem itemValue="feminino" itemLabel="Feminino"/>	 
			</h:selectOneRadio>
			
			<h:outputText value="Login:" />
			<h:inputText value="#{funcionarioBacking.login }" maxlength="40" size="40"/>
			
			<h:outputText value="Senha:" />
			<h:inputText value="#{funcionarioBacking.senha }" maxlength="40" size="40"/>
			
			<h:outputText value="Perfil:" />
			<h:inputText value="#{funcionarioBacking.perfil }" maxlength="40" size="40"/>
			
			<h:outputText value="Endereço:" />
			<h:inputText value="#{funcionarioBacking.endereco }" maxlength="40" size="40"/>
			
			<h:outputText value="Numero:" />
			<h:inputText value="#{funcionarioBacking.numero }" maxlength="40" size="40"/>
				
			
			<h:outputText value="Complemento:" />
			<h:inputText value="#{funcionarioBacking.complemento }" maxlength="40" size="40"/>
			
			<h:outputText value="Bairro:" />
			<h:inputText value="#{funcionarioBacking.bairro }" maxlength="40" size="40"/>
			
			<h:outputText value="CP:" />
			<h:inputText value="#{funcionarioBacking.cep }" maxlength="40" size="40"/>
			
			<h:outputText value="Telefone:" />
			<h:inputText value="#{funcionarioBacking.telefone }" maxlength="40" size="40"/>
			
			<h:outputText value="Celular:" />
			<h:inputText value="#{funcionarioBacking.celular }" maxlength="40" size="40"/>
			
			<h:outputText value="Email:" />
			<h:inputText value="#{funcionarioBacking.email }" maxlength="40" size="40"/>
			
			
			
			
			
			</h:panelGrid>

				<h:panelGrid columns="3">
				
				<h:commandButton action="#{funcionarioBacking.cadastrar }" value="Cadastrar" />
			    <h:commandButton action="#{funcionarioBacking.cadastrar }" value="Cancelar" />
			    <h:commandButton action="#{funcionarioBacking.sair }" value="Sair" />
			
				
				</h:panelGrid>




		</h:form>


	</f:view>
	
	
	</div>


	


</body>
</html>