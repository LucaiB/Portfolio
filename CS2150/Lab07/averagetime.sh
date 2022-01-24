#!/bin/bash
#Lucas Banerji (lcb5tz) 4/8

echo "enter the exponent for counter.cpp:"

read exp
itr=0
total=0

if [ "${exp}" == "quit" ]
then
    exit 1
fi

while [ $itr -lt 5 ]
do
    itr=$((itr+1))
    echo "Running iteration ${itr}..."
    speed=`./a.out $itr | tail -1`
    total=$((total+speed))
    echo "time taken: ${speed} ms"
done

avg=$((total/5))
echo "5 iterations took ${total} ms"
echo "Average time was ${avg} ms"
