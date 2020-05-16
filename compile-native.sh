
mkdir -p target/classes 
javac -cp . -d target/classes src/main/java/Hello.java 

native-image --no-fallback --no-server --initialize-at-build-time=Hello,java.lang.Double  -cp target/classes Hello target/hello

