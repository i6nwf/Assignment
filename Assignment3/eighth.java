public class eighth {
// Let B be an array of size n ≥ 6 containing integers from 1 to n−5
// inclusive, five of which are repeated.
// Describe an algorithm for finding the five integers in B
// that are repeated.
//
//
//Algorithm:
//1.Create a set S to store the distinct elements encountered so far.
// Initialize S to an empty set.
//2.Iterate through the array B: a. For each element b in B: i.
// If b is not in S, add b to S. This indicates that the element b has
// been seen once. ii. If b is already in S, then b is a repeated element.
// Add b to a list of repeated elements.
//3.Since there are five repeated elements,
// continue iterating through B until you find five distinct
// elements that are repeated.
//4.The list of repeated elements contains the five repeated integers in B.
//Analysis:
//Time Complexity: O(n), where n is the size of the array B.
// This is because the algorithm iterates through the array B only once,
// and each operation takes constant time.
//Space Complexity: O(n-5), where n-5 is the size of the set S. This is
}
