echo ""
echo native
time ./target/hello -Djava.vm.name=dz 1000
echo ""
if [ -x ~/prg/graalvm/bin/java ] ; then 
   echo non-native 
   time ~/prg/graalvm/bin/java -cp target/classes Hello
   echo "" 
fi
echo ""
echo non-native 
time java -cp target/classes  Hello
echo "" 
