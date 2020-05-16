n=10000000

echo ""
echo native
time ./hello $n
echo ""
echo non-native 
time ~/prg/graalvm/bin/java -cp . Hello $n
echo "" 
echo ""
echo non-native 
time java -cp . Hello $n
echo "" 
