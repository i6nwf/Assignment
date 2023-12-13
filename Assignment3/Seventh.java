public class Seventh {
//    Let A be an array of size n ≥ 2 containing integers from
//    1 to n−1 inclusive, one of which is repeated.
//    Describe an algorithm for finding the integer in A that is repeated.
//1.Create a set S to store the distinct elements encountered so far.
// Initialize S to an empty set.
//2.Iterate through the array A: a. For each element a in A: i.
// If a is not in S, add a to S. This indicates that the element a has
// been seen once. ii. If a is already in S, then b is a repeated element.
// Add b to a list of repeated elements.
//    1. Floyd's Tortoise and Hare Algorithm Approach*:
//   - Initialize two pointers, slow (tortoise) and fast (hare), to the first element of the array.
//   - Set slow to A[slow] and fast to A[A[fast]] repeatedly until slow and fast pointers meet at some index.
//   - Once they meet, reset the slow pointer to the first element and start moving it one step at a time.
//   - Additionally, move the fast pointer one step at a time as well.
//   - The point at which slow and fast meet again is the start of the cycle,
//   which represents the repeated value in the array.
}
