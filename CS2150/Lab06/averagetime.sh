read allWords
read puzzle

runTime1=`./a.out $allWords $puzzle | tail -1`
time=$runTime
runTime2=`./a.out $allWords $puzzle | tail -1`
time=$((runTime2+time))
runTime3=`./a.out $allWords $puzzle | tail -1`
time=$((runTime3+time))
runTime4=`./a.out $allWords $puzzle | tail -1`
time=$((runTime4+time))
runTime5=`./a.out $allWords $puzzle | tail -1`
time=$((runTime5+time))
time=$((time/5))
echo $time
