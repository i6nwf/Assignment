public class Third {
// Explain the changes that would have to be made to the program of
// Code Fragment 3.8 so that it could perform the Caesar cipher
// for messages that are written in an alphabet-based language
// other than English, such as Greek, Russian, or Hebrew.




//To adapt a program to perform a Caesar Cipher in a non-English
// language, you would need to redefine the alphabet,
// shift characters based on their index in the new alphabet
// instead of their ASCII value and adjust the modulus operator
// depending on the number of characters in the new alphabet.
//The algorithm of shifting remains the same, but you change
// the reference from ASCII to the index in the defined alphabet.
//
//Also note that other languages may have more or fewer characters
// than the English 26, and some may even include distinct upper
// and lowercase characters or special characters, therefore,
// the modulus operator value may be different.
}
