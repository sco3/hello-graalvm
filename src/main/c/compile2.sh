rm rand.bc 

clang -emit-llvm -O3 -c rand.c -o rand.bc 
