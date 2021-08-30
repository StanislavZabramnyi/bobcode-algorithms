|                                                  | Insertion sort                                                       | Merge Sort                                                            |   |
|--------------------------------------------------|----------------------------------------------------------------------|-----------------------------------------------------------------------|---|
| Average complexity (big O)                               | O(n^2)                                                               | O(n*log(n))                                                           |   |
| Memory usage                                     | Modifies the input array, allocating additional memory is not needed | may allocate additional space for each division of into two subarrays |   |
| Complexity when array is partially sorted        | O(n^2)                                                               | O(n*log(n))                                                           |   |
| Complexity when array is sorted                  | O(n)                                                                 | O(n*log(n))                                                           |   |
| Complexity when array is sorted in reverse order | O(n^2)                                                               | O(n*log(n))                                                           |   |


***Conclusion:***
In the average case, the merge sort is faster, but if we have bounded memory resources it would be better to use an insertion sorting algorithm.
Also insertion sorting algorithm should work better for sorting of almost sorted arrays, and for small arrays