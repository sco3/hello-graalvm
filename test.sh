echo ""
echo native
time ./hello 
echo ""
if [ -x ~/prg/graalvm/bin/java ] ; then 
   echo non-native 
   time ~/prg/graalvm/bin/java -cp . Hello
   echo "" 
fi
echo ""
echo non-native 
time java -cp . Hello
echo "" 
