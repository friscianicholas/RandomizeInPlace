# RandomizeInPlace
This project is a short java program that randomizes an array in place. The array has 10 elements, each numbered from 0 through 9. In the randomize method, a location in the array is randomly selected using Math.random(); , and this location in the array has its value swapped with the value at the ith location. As the for-loop traverses the array, the random location is only selected from i to max (where i is the current location on the array, and max is one less than the number of elements in the array).

This method of randomizing an array is considered a random permutation. At each iteration, the current state of the array is printed along with which elements were swapped.
