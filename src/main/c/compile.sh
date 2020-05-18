rm rand.bc 

$HOME/prg/graalvm/jre/lib/llvm/bin/clang -I$HOME/prg/graalvm/jre/languages/llvm/include/  -emit-llvm -O3 -c rand.c -o rand.bc 
