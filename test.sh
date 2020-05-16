echo ""
echo native
time ./hello 
echo ""
echo non-native 
time ~/prg/graalvm/bin/java -cp . Hello
echo "" 
