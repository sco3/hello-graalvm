Simple java native executable
---


```
$ ./compile-native.sh
[hello:1006063]    classlist:   1,887.63 ms
[hello:1006063]        (cap):     890.80 ms
[hello:1006063]        setup:   2,460.35 ms
[hello:1006063]   (typeflow):   3,809.92 ms
[hello:1006063]    (objects):   3,107.97 ms
[hello:1006063]   (features):     181.27 ms
[hello:1006063]     analysis:   7,264.14 ms
[hello:1006063]     (clinit):     164.04 ms
[hello:1006063]     universe:     882.61 ms
[hello:1006063]      (parse):     520.00 ms
[hello:1006063]     (inline):   1,068.66 ms
[hello:1006063]    (compile):   5,055.43 ms
[hello:1006063]      compile:   7,022.97 ms
[hello:1006063]        image:     509.89 ms
[hello:1006063]        write:     121.71 ms
[hello:1006063]      [total]:  20,478.41 ms


$./test.sh

native
Substrate VM
Hello, grailvm native image!

real	0m0.004s
user	0m0.002s
sys	0m0.002s

non-native
OpenJDK 64-Bit GraalVM CE 19.3.2
Hello, grailvm native image!

real	0m0.069s
user	0m0.060s
sys	0m0.020s




```

Another test
---

```
$ ./test2.sh

native
Substrate VM
Hello, grailvm native image!
10000000 conversions took 13714 ms.

real	0m13.777s
user	0m12.544s
sys	0m1.200s

non-native
OpenJDK 64-Bit GraalVM CE 19.3.2
Hello, grailvm native image!
10000000 conversions took 10660 ms.

real	0m10.826s
user	0m46.815s
sys	0m0.953s


non-native
OpenJDK 64-Bit Server VM
Hello, grailvm native image!
10000000 conversions took 13809 ms.

real	0m14.005s
user	1m8.484s
sys	0m1.056s

```