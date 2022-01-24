/** @file middleearth.h
 *  @brief Function prototypes for middle earth
 *  @author Lucas Banerji (lcb5tz)
 *  @bug No known bugs.
 *  @date 5/3/2021
 */

#ifndef MIDDLEEARTH_H
/** @def MIDDLEEARTH_H
 * defines the header file for middle earth if not previously defined
 */ 
#define MIDDLEEARTH_H

#include <iostream>
#include <vector>
#include <string>
#include <unordered_map>
#include <random>

// \namespace <std>
using namespace std;

// see the comments in the lab11 write-up, or in middleearth.cpp

class MiddleEarth {
public:
  /** @fn MiddleEarth (int xsize, int ysize, int num_cities, int seed)
   *@brief Constructor for MiddleEarth
   * @param xsize: width
   * @param ysize: height
   * @param num_cities: the number of cities
   * @param seed: a random seed
   */
  MiddleEarth(int xsize, int ysize, int num_cities, int seed);
  // @fn print()
  void print();
  void printTable();
  float getDistance(const string& city1, const string& city2);
  vector<string> getItinerary(unsigned int length);

private:
  int num_city_names, xsize, ysize;
  unordered_map<string, float> xpos, ypos;
  vector<string> cities;
  unordered_map<string, unordered_map<string, float>> distances;
  
  mt19937 gen; // Mersenne-Twister random number engine
};

#endif
