#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>



double parseDouble(const char s[]) {
  char *err;

  double d = strtod(s, &err);
  if (*err) {
    d = NAN;
  }

  return d;
}


int main(int argc, char **argv) {

  int n = 1;
  if (argc > 1) {
    n = atol(argv[1]);
  }
  double random_value;
  char str[64];
  char *err;

  srand(time(NULL));

  for (int i = 0; i < n; i++) {

    random_value = (double)rand() / RAND_MAX * 2.0 - 1.0;

    sprintf(str, "%lf", random_value);
    random_value = parseDouble(str);
  }
  printf("%s %lf\n", str, random_value);

  return 0;
}

