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
native
Substrate VM
Hello, grailvm native image!
Resource: null
10000000 conversions took 7746 ms. 83926049.49582605 8.392604949582605E7

real	0m8.315s
user	0m7.659s
sys	0m0.092s

non-native
Java HotSpot(TM) 64-Bit GraalVM EE 19.3.2
Hello, grailvm native image!
Resource: file:/home/dz/prj/hello-graalvm/target/test-classes/test.txt
10000000 conversions took 5850 ms. 69122566.90133667 6.912256690133667E7

real	0m6.470s
user	0m7.225s
sys	0m0.251s


non-native
OpenJDK 64-Bit Server VM
Hello, grailvm native image!
Resource: null
10000000 conversions took 6438 ms. 52839529.81717260 5.28395298171726E7

real	0m7.064s
user	0m6.621s
sys	0m0.252s

```