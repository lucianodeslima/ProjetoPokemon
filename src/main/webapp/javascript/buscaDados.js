/**
 * 
 */

var app = angular.module('meuApp', []);

app.controller('meuControler', function($scope, $http) {
  $http.get('http://pokeapi.co/api/v2/pokemon').then(successCallback, errorCallback);
  $http.get('http://pokeapi.co/api/v2/ability').then(sucesso, erro);
  $scope.mostrarHabili = false;
  function successCallback(response){	    
	    console.log(response, 'res');
	    //$scope.meuTeste = response.data.name;//quando busca apenas 1 nome
	    $scope.nome = response.data.results;	    

	  } function errorCallback(response){
	  console.log(error, 'Ocorreu um erro!');
	  }

	  function sucesso(response){	
		  console.log(response, 'res');
		  $scope.habilidades = response.data.results;
		  }function erro(response){
			  console.log(error, 'Ocorreu um erro!');
			  }
});