#include <stdio.h>
#include <stdlib.h>
#include "defs.h"
#include <immintrin.h>

/* 
 * Please fill in the following team struct 
 */
who_t who = {
    "LucaiB123",           /* Scoreboard name */

    "Lucas Banerji",      /* First member full name */
    "lcb5tz@virginia.edu",     /* First member email address */
};

/*** UTILITY FUNCTIONS ***/

/* You are free to use these utility functions, or write your own versions
 * of them. */

/* A struct used to compute averaged pixel value */
typedef struct {
    unsigned short red;
    unsigned short green;
    unsigned short blue;
    unsigned short alpha;
    unsigned short num;
} pixel_sum;

/* Compute min and max of two integers, respectively */
static int min(int a, int b) { return (a < b ? a : b); }
static int max(int a, int b) { return (a > b ? a : b); }

/* 
 * initialize_pixel_sum - Initializes all fields of sum to 0 
 */
static void initialize_pixel_sum(pixel_sum *sum) 
{
    sum->red = sum->green = sum->blue = sum->alpha = 0;
    sum->num = 0;
    return;
}

/* 
 * accumulate_sum - Accumulates field values of p in corresponding 
 * fields of sum 
 */
static void accumulate_sum(pixel_sum *sum, pixel p) 
{
    sum->red += (int) p.red;
    sum->green += (int) p.green;
    sum->blue += (int) p.blue;
    sum->alpha += (int) p.alpha;
    sum->num++;
    return;
}

/* 
 * assign_sum_to_pixel - Computes averaged pixel value in current_pixel 
 */
static void assign_sum_to_pixel(pixel *current_pixel, pixel_sum sum) 
{
    current_pixel->red = (unsigned short) (sum.red/sum.num);
    current_pixel->green = (unsigned short) (sum.green/sum.num);
    current_pixel->blue = (unsigned short) (sum.blue/sum.num);
    current_pixel->alpha = (unsigned short) (sum.alpha/sum.num);
    return;
}

/* 
 * avg - Returns averaged pixel value at (i,j) 
 */
static pixel avg(int dim, int i, int j, pixel *src) 
{
    pixel_sum sum;
    pixel current_pixel;

    initialize_pixel_sum(&sum);
    for(int jj=max(j-1, 0); jj <= min(j+1, dim-1); jj++) 
	for(int ii=max(i-1, 0); ii <= min(i+1, dim-1); ii++) 
	    accumulate_sum(&sum, src[RIDX(ii,jj,dim)]);

    assign_sum_to_pixel(&current_pixel, sum);
 
    return current_pixel;
}



/******************************************************
 * Your different versions of the smooth go here
 ******************************************************/

/* 
 * naive_smooth - The naive baseline version of smooth
 */
char naive_smooth_descr[] = "naive_smooth: Naive baseline implementation";
void naive_smooth(int dim, pixel *src, pixel *dst) 
{
    
    for (int i = 0; i < dim; i++)
	for (int j = 0; j < dim; j++)
            dst[RIDX(i,j, dim)] = avg(dim, i, j, src);
}
/* 
 * smooth - Your current working version of smooth
 *          Our supplied version simply calls naive_smooth
 */
char another_smooth_descr[] = "another_smooth: Another version of smooth";
void another_smooth(int dim, pixel *src, pixel *dst) 
{
//taking care of edge cases
  dst[RIDX(0,0, dim) ] = avg(dim, 0, 0, src);
  dst[RIDX(0,dim-1, dim)] = avg(dim, 0, dim-1, src);
  dst[RIDX(dim-1,0, dim)] = avg(dim, dim-1, 0, src);
  dst[RIDX(dim-1,dim-1, dim)] = avg(dim, dim-1, dim-1, src);
	
  for (int j = 1; j < dim-1;j+=2) {
    dst[RIDX(0, j+1, dim)] = avg(dim, 0, j+1, src);
    dst[RIDX(0, j, dim)] = avg(dim, 0, j, src);
  }

  for (int j = 1; j < dim-1;j+=2) {
    dst[RIDX(dim-1, j, dim)] = avg(dim, dim-1, j, src);
    dst[RIDX(dim-1, j+1, dim)] = avg(dim, dim-1, j+1, src);
  }

  for (int i = 1; i < dim-1;i++) {
    dst[RIDX(i, 0, dim)] = avg(dim, i, 0, src);
    dst[RIDX(i, dim-1, dim)] = avg(dim, i, dim-1, src);
  }
  //end of edge cases
//middle cases
    for (int i = 1; i < dim-1; i++)
	for (int j = 1; j < dim-1; j+=4){
pixel pixel_1,pixel_2, pixel_3, pixel_4;

    __m128i p_1 = _mm_loadu_si128((__m128i*) &src[RIDX(i-1,j-1,dim)]);
    __m128i p_2 = _mm_loadu_si128((__m128i*) &src[RIDX(i-1,j,dim)]);
    __m128i p_3 = _mm_loadu_si128((__m128i*) &src[RIDX(i-1,j+1,dim)]);
    __m128i p_4 = _mm_loadu_si128((__m128i*) &src[RIDX(i,j-1,dim)]);
    __m128i p_5 = _mm_loadu_si128((__m128i*) &src[RIDX(i,j,dim)]);
    __m128i p_6 = _mm_loadu_si128((__m128i*) &src[RIDX(i,j+1,dim)]);
    __m128i p_7 = _mm_loadu_si128((__m128i*) &src[RIDX(i+1,j-1,dim)]);
    __m128i p_8 = _mm_loadu_si128((__m128i*) &src[RIDX(i+1,j,dim)]);
    __m128i p_9 = _mm_loadu_si128((__m128i*) &src[RIDX(i+1,j+1,dim)]);
    __m256i pixel1 = _mm256_cvtepu8_epi16(p_1);
    __m256i pixel2 = _mm256_cvtepu8_epi16(p_2);
    __m256i pixel3 = _mm256_cvtepu8_epi16(p_3);
    __m256i pixel4 = _mm256_cvtepu8_epi16(p_4);
    __m256i pixel5 = _mm256_cvtepu8_epi16(p_5);
    __m256i pixel6 = _mm256_cvtepu8_epi16(p_6);
    __m256i pixel7 = _mm256_cvtepu8_epi16(p_7);
    __m256i pixel8 = _mm256_cvtepu8_epi16(p_8);
    __m256i pixel9 = _mm256_cvtepu8_epi16(p_9);
    __m256i pixels12 = _mm256_add_epi16(pixel1, pixel2);
    __m256i pixels34 = _mm256_add_epi16(pixel3, pixel4);
    __m256i pixels56 = _mm256_add_epi16(pixel5, pixel6);
    __m256i pixels78 = _mm256_add_epi16(pixel7, pixel8);
    __m256i pixels1234 = _mm256_add_epi16(pixels12, pixels34);
    __m256i pixels5678 = _mm256_add_epi16(pixels56, pixels78);
    __m256i pixels18 = _mm256_add_epi16(pixels1234, pixels5678);
    __m256i pixelsum = _mm256_add_epi16(pixels18, pixel9);

   unsigned short pixel_array[16];
   _mm256_storeu_si256((__m256i*) pixel_array, pixelsum);

   pixel_1.red = pixel_array[0]*7282>>16;
   pixel_1.green = pixel_array[1]*7282>>16;
   pixel_1.blue = pixel_array[2]*7282>>16;
   pixel_1.alpha = pixel_array[3]*7282>>16;

   dst[RIDX(i,j, dim)] = pixel_1;
   
   if (j+1 < dim-1) {
     pixel_2.red = pixel_array[4]*7282>>16;
     pixel_2.green = pixel_array[5]*7282>>16;
     pixel_2.blue = pixel_array[6]*7282>>16;
     pixel_2.alpha = pixel_array[7]*7282>>16;

     dst[RIDX(i,j+1, dim)] = pixel_2;
   }

   if (j+2 < dim-1) {
     pixel_3.red = pixel_array[8]*7282>>16;
     pixel_3.green = pixel_array[9]*7282>>16;
     pixel_3.blue = pixel_array[10]*7282>>16;
     pixel_3.alpha = pixel_array[11]*7282>>16;

     dst[RIDX(i,j+2, dim)] = pixel_3;
   }

   if (j+3 < dim-1) {
     pixel_4.red = pixel_array[12]*7282>>16;
     pixel_4.green = pixel_array[13]*7282>>16;
     pixel_4.blue = pixel_array[14]*7282>>16;
     pixel_4.alpha = pixel_array[15]*7282>>16;

     dst[RIDX(i,j+3, dim)] = pixel_4;
   }
        } 
        
  
}


/*********************************************************************
 * register_smooth_functions - Register all of your different versions
 *     of the smooth function by calling the add_smooth_function() for
 *     each test function. When you run the benchmark program, it will
 *     test and report the performance of each registered test
 *     function.  
 *********************************************************************/

void register_smooth_functions() {
    add_smooth_function(&naive_smooth, naive_smooth_descr);
    add_smooth_function(&another_smooth, another_smooth_descr);
}
