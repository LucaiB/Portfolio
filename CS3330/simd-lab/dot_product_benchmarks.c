#include <stdlib.h>

#include <immintrin.h>

#include "dot_product.h"
/* reference implementation in C */
unsigned int dot_product_C(long size, unsigned short * a, unsigned short *b) {
    unsigned int sum = 0;
    for (int i = 0; i < size; ++i) {
        sum += a[i] * b[i];
    }
    return sum;
}

unsigned int dot_product_AVX(long size, unsigned short * a, unsigned short *b) {
  __m256i sum = _mm256_setzero_si256();
    for (int i = 0; i < size; i+=8) {
      __m128i a_parts = _mm_loadu_si128((__m128i*) &a[i]);
      __m256i a_32 = _mm256_cvtepu16_epi32(a_parts);
      __m128i b_parts = _mm_loadu_si128((__m128i*) &b[i]);
      __m256i b_32 = _mm256_cvtepu16_epi32(b_parts);
      __m256i result = _mm256_mullo_epi32(a_32, b_32);
      sum = _mm256_add_epi32(sum, result);
    }
    unsigned int partial_sums[8];
      _mm256_storeu_si256((__m256i*)&partial_sums, sum);
      int total = 0;
	for(int j = 0; j < 8; j++){
		total += partial_sums[j];
	}
      return total;
}

// add prototypes here!
extern unsigned int dot_product_gcc7_O3(long size, unsigned short * a, unsigned short *b);

/* This is the list of functions to test */
function_info functions[] = {
    {dot_product_C, "C (local)"},
    {dot_product_gcc7_O3, "C (compiled with GCC7.2 -O3 -mavx2)"},
    {dot_product_AVX, "AVX dot product"},
    // add entries here!
    {NULL, NULL},
};
