#!/bin/bash
clear
echo "          * * * * * * * * * * * * * * * * * * * * * * * * * * * * *";
echo "          *                L-Systèmes application                 *";
echo "          * * * * * * * * * * * * * * * * * * * * * * * * * * * * *";
echo "";

echo "-Choix 1 : Application console";
echo "-Choix 2 : Application GUI";
echo "-Choix 3 : Quitter";
echo "";

read -p "Choisir d'après le menu : " choix
while [ $choix -ne 1 -a $choix -ne 2 -a $choix -ne 3 ]
do
  echo "Attention !! choix invalide veuillez re-saisir (1) ou (2)"
  read -p "Choisir d'après le menu :" choix
done
javac  -Xlint:unchecked -d build -cp lib/*.jar ./src/demoPackage/*.java ./src/framesPackage/*.java ./src/moteurPackage/reecriturePack/*.java ./src/moteurPackage/graphiquePack/*.java
clear
if [ $choix -eq 1 ]; then

  echo "          * * * * * * * * * * * * * * * * * * * * * * * * * * * * *";
  echo "          *                L-Systèmes application                 *";
  echo "          *               -- Application console --               *";
  echo "          * * * * * * * * * * * * * * * * * * * * * * * * * * * * *";
  echo "";
  echo "-Choix 1 : Voir des models prêts";
  echo "-Choix 2 : Personnaliser mon model";
  echo "";

  read -p "Choisir d'après le menu : " choix
  while [ $choix -ne 1 -a $choix -ne 2 ]
  do
    echo "Attention !! choix invalide veuillez re-saisir (1) ou (2)"
    read -p "Choisir d'après le menu :" choix
  done

  mkdir -p build
  find ./src -name "*.java" > sources.txt
clear



  if [ $choix -eq 1 ]; then

       echo "          * * * * * * * * * * * * * * * * * * * * * * * * * * * * *";
       echo "          *                L-Systèmes application                 *";
       echo "          *               -- Application console --               *";
       echo "          *                                                       *";
       echo "          * * * * * * * * * * * * * * * * * * * * * * * * * * * * *";
       echo "          *               --Voir des models prêts--               *";
       echo "          * * * * * * * * * * * * * * * * * * * * * * * * * * * * *";
       echo "";
       echo "Les arbres models :\n";
       ls assets/json | grep  .json
       echo "";
       read -p "Veuillez indiquez le nom : " json
       java -cp build:lib/* demoPackage.Main assets/json/$json.json

  elif [ $choix -eq 2 ]; then


       echo "          * * * * * * * * * * * * * * * * * * * * * * * * * * * * *";
       echo "          *                L-Systèmes application                 *";
       echo "          *               -- Application console --               *";
       echo "          *                                                       *";
       echo "          * * * * * * * * * * * * * * * * * * * * * * * * * * * * *";
       echo "          *              --Personnaliser mon model--              *";
       echo "          * * * * * * * * * * * * * * * * * * * * * * * * * * * * *";

       java -cp build:lib/* demoPackage.Demo

  fi



elif [ $choix -eq 2 ]; then


  java -cp build:lib/* framesPackage.FrameMain

elif [ $choix -eq 3 ]; then
  clear
  echo "Vous avez Quitté l'application. Au revoir.\n"
  exit 1
fi
  rm -f sources.txt
