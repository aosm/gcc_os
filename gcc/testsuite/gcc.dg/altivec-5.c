/* APPLE LOCAL file AltiVec */
/* { dg-do run { target powerpc-apple-darwin* } } */
/* { dg-options "-faltivec -Wall" } */

/* This test checks if AltiVec builtins accept const-qualified
   arguments.  */

int main (int argc, const char * argv[])
{
  int i;
  const float cf = 1.0;
  vector float v;
  const vector float cv = (vector float)(1.0, 2.0, 3.0, 4.0);
  
  vec_dst(&cv, i, 0);
  v = vec_ld(0, &cv);	
  v = vec_lde(0, &cf);
  vec_lvsl(0, &cf);
  
  return 0;
}
