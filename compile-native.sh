
mkdir -p target/classes 
javac -cp . -d target/classes src/main/java/Hello.java 

native-image --no-fallback --no-server -cp target/classes Hello target/hello

