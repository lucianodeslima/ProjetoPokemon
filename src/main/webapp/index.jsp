<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Criar Equipe</title>
<script src="javascript/angular.min.js"></script>
<script src="javascript/buscaDados.js"></script>
<link href="css/form_dados.css" type="text/css" rel="stylesheet" />
</head>
<body >

<div id="divDados" ng-app="meuApp" ng-controller="meuControler"> 

   <form name="formAtributos" id="idFormAtributos" method="post" action="ServletCriarEquipe">

	<fieldset id="Nomequipe"><legend>Digite um nome</legend>
		<label name="lbEquipe" id="idEquipe">Equipe: </label>
		<input type="text" name=inEquipe" id="inIdEquipe" required="required"/>
	</fieldset>

	<fieldset id="PokemoNome"><legend>Escolha um nome</legend>
		<select name="selNome" id="idSelNome" ng-model="mostrarHabili">
			<option value={{ x.name }} ng-repeat="x in nome">  {{ x.name }} </option>
		</select>
	</fieldset>	
	<fieldset id="PokHabilidades"  ng-show="mostrarHabili"><legend>Escolha as habilidades</legend>
		<select name="selHabilidade" id="idselHabilidade">			
			<option value={{ x.name }} ng-repeat="x in habilidades">  {{ x.name }} </option>
		</select>	
	</fieldset>	
	<input type="submit" name="enviar" id="enviar" value="Gravar"/>
   </form>	
   <p >${variavelRequestMsgErro}</p>	
</div>

</body>
</html>