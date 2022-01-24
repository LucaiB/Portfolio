CXX=clang++ $(CXXFLAGS)
CXXFLAGS=-Wall -O2 # Enable all warnings
DEBUG=-g

Traveling: traveling-skeleton.o middleearth.o
	$(CXX) $(DEBUG)  traveling-skeleton.o middleearth.o
	@doxygen
	@echo "Ready to explore middle earth!"

traveling-skeleton.o: traveling-skeleton.cpp middleearth.h

middleearth.o: middleearth.cpp middleearth.h


.PHONY: clean
clean:
	-rm -f *.o Huffmanenc
