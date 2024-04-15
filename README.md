# MowerPositionManagement
## Analyse:
Le sujet peut être traité en utilisant la programmation par contraint mais il n'est pas assez complexe pour l'utiliser.

De coup, j'ai opté pour traitement classique, en utilisant le TDD. 

D'abord et après lecture de l'énoncé, je vais cree une classe model de base nommée **MowerPosition** ayant comme attribut **x** et **y** ainsi la **direction**, en suite je commence par le premier test pour commencer la résolution de problème.

## Commit : "Initial commit"
Création d'un projet vide

## Commit : "Create Model"
Création de model de base

## Test : testMoveNorth
Ce test est composé de plusieurs commits 

## Test : testMoveSouth
Aussi, ce test est composé de plusieurs commits, de coup, on va creer un test qui échoue ensuite on le corrige

## Tests: testMoveEast and testMoveWest
à l'instar des deux tests d'avants, on suit le meme sénario pour les tests testMoveEast et testMoveWest 

## Tests: testTurnLeft and testTurnRight
Création les deux tests avec les méthodes testTurnLeft() et turnTurnRight()

## Amélioration:
Création de la méthode getCurrentMowerPosition() qui doit recuperer des valeus comme : "1 3 N" et "5 1 E"

## Cas extremes:
Si x = 0 et la direction vers le Sud, 
ou x= xMaxValue et direction = 'N', 
ou y= 0 et direction = 'W' 
ou y= yMaxValue et direction = 'E' 
==> la tondeuse doit rester à ça place sans changer de direction, dans ce cas, on améliore la méthode move et on cree les tests qui vot avec

## Test des scénarios :
Pour ce faire, on a choisi de creer une nouvelle classe MowerPositionService qui contient la méthode executeActions(...), pour jouer nos scénario d'une manière générique sans surchargé la classe model des méthodes de traitements.

En parallèle, on crée un test qui échoue ensuite en le corrige et par la suite en ajoutant un deuxième test avec le deuxième scénario.

Ensuite, on récupère les données depuis d'un fichier par scenario toute en réalisant les tests.

## Création de l'application principale
On crée une classe App.class dont l'objectif est de lire depuis un fichier les données, et lance pour chaque scénario le jeu d'exécutions d'actions toute en affichant pour chacun la position finale de tondeuse.

