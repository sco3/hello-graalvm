echo ""
echo native
time ./hello 
echo ""
echo non-native 
time ~/prg/graalvm/bin/java -cp . Hello
echo "" 
echo ""
echo non-native 
time java -cp . Hello
echo "" 
