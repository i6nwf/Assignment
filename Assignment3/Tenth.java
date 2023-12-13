public class Tenth {
//Give examples of values for a and b in the pseudorandom generator
// given on page 113 of this chapter such that the result is
// not very random looking, for n = 1000.
//1. a is a multiple of n:
//   - If a is a multiple of n, the generator effectively reduces
//   to X_(n+1) = b  n, which can result in a repeating pattern
//   with a period of 1 for any value of b. For instance,
//   if n = 1000 and a = 1000, the sequence will generate the
//   same number repeatedly when b is not zero. This would not
//   appear very random.
//
//2. Small prime number values for a:
//   - When a small prime number is used for a,
//   and b is relatively small as well, the resulting
//   sequence might not exhibit a fully random distribution.
//   For example, if a = 7 and b = 3, the generated sequence
//   might exhibit a discernible pattern or clustering if n
//   is relatively small
}
