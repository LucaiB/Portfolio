
CXX=clang++ $(CXXFLAGS)
CXXFLAGS=-Wall -O2 # Enable all warnings
DEBUG=-g

Huffmandec: huffmandec.o heapNode.o
	$(CXX) $(DEBUG)  heapNode.o huffmandec.o
	@echo "huffmandec is ready for use!"

heapNode.o: heapNode.cpp heapNode.h

huffmandec.o: huffmandec.cpp heapNode.h

.PHONY: clean
clean:
	-rm -f *.o Huffmanenc
