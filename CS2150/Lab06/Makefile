
CXX=clang++ $(CXXFLAGS)
CXXFLAGS=-Wall -O2 # Enable all warnings
DEBUG=-g

HashTable: wordPuzzle.o hashTable.o
	$(CXX) $(DEBUG)  wordPuzzle.o hashTable.o
	@echo "HashTable  is ready for use!"

wordPuzzle.o: wordPuzzle.cpp primenumber.cpp getWordInGrid.cpp timer.cpp hashTable.h

hashTable.o: hashTable.cpp hashTable.h

.PHONY: clean
clean:
	-rm -f *.o HashTable
