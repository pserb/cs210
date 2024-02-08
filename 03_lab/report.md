# Debugging Steps

## Method call 1
- I ran the code and got an `ArrayIndexOutOfBoundsException` at line 7 in `ArrayOps.sum`.
- My fix: I changed the for loop to start at `i = 0` and go until `i < arr.length`, this ensures that the for loop iterates through every element of the array. 

## Method call 2 
- The `average` method returns a double, but performs integer division.
- My fix: typecast the sum variable to double during the division step.

## Method call 3
- The `find` method should return `true` if the value is found, but returns false.
- My fix: change the code inside `if(arr[i] == val)` to set `found = true` instead of returning `found`. Additionally, change the method to return `found` at the end (instead of `!found`).

## Method call 4 
- Another `ArrayIndexOutOfBoundsException`, this time at line 21 in `ArrayOps.find`.
- My fix: add the condition `&& i < arr.length` inside the while loop so that if the code iterates through the entire array and does not find the value, it exits out of the while loop. `boolean found` was initialized as `false` in the beginning, so returning `found` after the while loop ends will correctly return `false`.
