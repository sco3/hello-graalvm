rm rand.bc 

$HOME/prg/graalvm/jre/lib/llvm/bin/clang -emit-llvm -O3 -c rand.c -o rand.bc 
