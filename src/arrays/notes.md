# Arrays — Patterns and Notes

## Linear scan for max/min
When the goal is to find an extreme value (max or min) in an unsorted array,
initialize a tracking variable to the first element, then compare against
every subsequent element in a single pass.

- Time complexity: O(n) — one pass, every element visited once.
- Space complexity: O(1) — one variable used regardless of input size.
- No sorting is required or beneficial here; sorting to find a max would cost
  O(n log n), which is worse than the O(n) linear scan.

## Open questions or caveats to revisit
- FindMax.java does not currently handle an empty or null input array.
  TODO: Throw an explicit exception.