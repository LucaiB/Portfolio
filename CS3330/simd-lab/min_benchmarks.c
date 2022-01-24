#include <stdlib.h>
#include <limits.h>  /* for USHRT_MAX */

#include <immintrin.h>

#include "min.h"
/* reference implementation in C */
short min_C(long size, short * a) {
    short result = SHRT_MAX;
    for (int i = 0; i < size; ++i) {
        if (a[i] < result)
            result = a[i];
    }
    return result;
}

short min_AVX(long size, short * a) {
   __m256i elements = _mm256_set1_epi16(32767);
  // __m256i result = _mm256_setzero_si256();
    for (int i = 0; i < size; i += 16) {
 	__m256i a_part = _mm256_setr_epi16(a[i],a[i+1],a[i+2],a[i+3],a[i+4],a[i+5],a[i+6], a[i+7],a[i+8],a[i+9],a[i+10],a[i+11],a[i+12], a[i+13],a[i+14],a[i+15]);
 	elements = _mm256_min_epi16(a_part, elements);
    }
    
    unsigned short extracted_elements[16];
     _mm256_storeu_si256((__m256i*) &extracted_elements, elements);
     short res = extracted_elements[0];
    for(int j = 1; j < 16; j++){
    	if(extracted_elements[j] < res)
    		res = extracted_elements[j];
    }  	
    	
    return res;
}



/* This is the list of functions to test */
function_info functions[] = {
    {min_C, "C (local)"},
    {min_AVX, "AVX min"},
    // add entries here!
    {NULL, NULL},
};
