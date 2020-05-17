#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <string.h>
#include <math.h>

int main(int argc, char **argv) {

  int n = 1;
  if (argc > 1) {
     n = atol (argv[1]);
  }
  double random_value;
  char str[64];
  char **err;

  srand(time(NULL));
  
  for (int i = 0; i < n; i++ ) {

  random_value = (double)rand() / RAND_MAX * 2.0 - 1.0; 
  
  sprintf(str,"%lf", random_value); 
  random_value=  strtod (str, err);

  }
  printf("%s %lf\n", str, random_value);

  return 0;
}

double parseDouble (const char s[] ) {
   char *err;
   //printf ("String in c: [%s]\n", s);

   double d = strtod (s, &err);
   if (*err) {
      d = NAN;
   }
   
   //printf ("Double in c: [%lf]\n", d);

   return d;
   
}