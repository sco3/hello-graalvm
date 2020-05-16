n=10000000

echo ""
echo native
time ./hello $n
echo ""
if [ -x ~/prg/graalvm/bin/java ] ; then 
   echo non-native 
   time ~/prg/graalvm/bin/java -cp . Hello $n
   echo "" 
fi
echo ""
echo non-native 
time java -cp . Hello $n
echo "" 
