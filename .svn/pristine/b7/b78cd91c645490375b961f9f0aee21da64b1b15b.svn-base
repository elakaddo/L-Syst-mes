
cd lib/

DIR="javafx-sdk-17.0.2"
LOAD="https://download2.gluonhq.com/openjfx/17.0.2/openjfx-17.0.2_linux-x64_bin-sdk.zip"
FILE="openjfx-17.0.2_linux-x64_bin-sdk.zip"

if [ -d $DIR ]; then
  #Take action if $DIR exists. #
  echo "JavaFX is already in ${DIR}..."
else
  if [ -f $FILE ]; then
    echo "Zip file ${FILE} is already here."
  else
    echo "Downloadding JavaFX files in ${DIR}..."
    wget $LOAD
  fi
  echo "Installing JavaFX files in ${DIR}..."
  unzip $FILE
fi
