Guide déploiment de l'application "Machine à café":

Le projet nécessite les librairies:
	JUnit 5.8.1
	Mockito 4.2.0
	
Pour lancer l'application il suffit de lancer la JVM sur la classe Main dans le package com.project du projet.
L'application émule donc une machine a café permettant à l'utilisateur de choisir une boisson et d'en passé commande en fonction de ces choix (quantité d'eau/sucre et gobelet)

ATTENTION :
Pour que l'application fonctionne correctement, il faut ajouter au projet les fichier .dat founis avec les sources
ou au préalable créer des fichiers contenant les boissons, la quantité d'eau disponible, la quantité de sucre disponible et une liste vide d'historique de commande sérialisés.


RESULTAT DE TEST
Un resultat du coverage est disponible dans le dossier coverageRepport , a noté que le coverage n'a pas l'air de vouloir prendre en compte les tests des controllers
Un resultat de chaque test unitaire est disponible dans le dossier UnitTestResult