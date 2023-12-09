public class sixth {
//    2.10 What are some potential efficiency disadvantages of having very shallow inheritance trees,
//    that is, a large set of classes, A, B, C, and so on, such that all of these classes extend a single class, Z?
//    1. Rigidity in Hierarchy: When all classes directly extend a single class,
//    the resulting structure can become rigid.
//    It might limit the flexibility and autonomy of individual classes since they share a single common ancestor.
//    This can make it challenging to introduce variations in behavior specific to each class without
//    modifying the common ancestor, potentially leading to brittle code.
//
//2. Duplication of Behavior: With a shallow inheritance tree,
// you might see the replication of behavior across classes due to the limited options for capturing
// diverse behaviors without modifying the shared base class Z.
// This can lead to redundant code and reduce the potential for effective code reuse.
//
//3. Maintenance Complexity: As the number of classes connected through shallow inheritance increases,
// maintaining and managing shared behavior or attributes becomes increasingly complex.
// Changes in the common ancestor Z might ripple through all the derived classes A, B, C, and so on,
// potentially leading to the need for widespread modifications, which can be error-prone.
//
//4. Potential for Monolithic Design: Shallow inheritance structures might inadvertently encourage
// a monolithic design approach, where many classes directly depend on a single class,
// leading to a potential lack of modularity and encapsulation.
//
//5. Increased Memory Footprint: Each class in the hierarchy might directly inherit
// members and behaviors from the common parent Z, potentially leading to an increased memory footprint.
// This can result in a larger memory usage for instances of these classes,
// even for features or behavior not relevant to a specific subclass.
//
//6. Tight Coupling: Increased coupling is a risk in shallow inheritance structures,
// especially when all classes share a common superclass.
// Changes to the common ancestor can propagate widely across the class hierarchy,
// making classes more tightly coupled and decreasing their independence.
}
