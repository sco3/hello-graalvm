n=10000000

echo ""
echo native
time CLASSPATH=target/test-classes ./target/hello $n
echo ""
if [ -x ~/prg/graalvm/bin/java ] ; then 
   echo non-native 
   time ~/prg/graalvm/bin/java -cp target/classes:target/test-classes Hello $n
   echo "" 
fi
echo ""
echo non-native 
time java -cp target/classes  Hello $n
echo "" 
