n=10000000

/usr/bin/time -v ./target/doubleparser $n
if [ -x ~/prg/graalvm/bin/java ] ; then 
   /usr/bin/time -v ~/prg/graalvm/bin/java -cp target/classes:target/test-classes DoubleParser $n
fi

