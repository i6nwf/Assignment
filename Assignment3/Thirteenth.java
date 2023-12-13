public class Thirteenth {
//Suppose you are designing a multiplayer game that has n ≥ 1000 players,
// numbered 1 to n, interacting in an enchanted forest.
//The winner of this game is the first player who can meet all
// the other players at least once (ties are allowed).
// Assuming that there is a method meet(i, j),
// which is called each time a player i meets a player j (with i 6= j),
//describe a way to keep track of the pairs of meeting players
//and who is the winner.
//    2. Keeping Track of Meetings:
//   - Each time a meeting occurs between player i and player j,
//   call the method meet(i, j) and update the corresponding entry
//   in the adjacency matrix or list to indicate the meeting.
//   For instance, if meeting player i with player j, you would
//   set adjacency[i][j] = true (in the case of an adjacency matrix)
//   or add player j to the list of neighbors for player
//   i (in the case of an adjacency list).
}
