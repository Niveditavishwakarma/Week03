package hashmapproblems.longestconsecutivesequence;
import java.util.*;
    public class LongestConsecutiveSequence {
        public int findLongestConsecutiveSequence(int[] arr) {
            Set<Integer> numSet = new HashSet<>();
            for (int num : arr) {
                numSet.add(num);
            }

            int longestStreak = 0;

            for (int num : arr) {
                if (!numSet.contains(num - 1)) {
                    int currentNum = num;
                    int currentStreak = 1;

                    while (numSet.contains(currentNum + 1)) {
                        currentNum++;
                        currentStreak++;
                    }

                    longestStreak = Math.max(longestStreak, currentStreak);
                }
            }

            return longestStreak;
        }

    }
