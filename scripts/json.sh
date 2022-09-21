
cd lib/

LOAD="http://www.java2s.com/Code/JarDownload/json-simple/json-simple-1.1.1.jar.zip"
ZIP="json-simple-1.1.1.jar.zip"
FILE="json-simple-1.1.1.jar"

if [ -f $FILE ]; then
  # Verifier si la direction $DIR existe. #
  echo "${FILE} existe déjà."
else
  echo "Téléchargement de fichiers JSON ${FILE}..."
  wget $LOAD
  unzip $ZIP
  rm $ZIP
fi
