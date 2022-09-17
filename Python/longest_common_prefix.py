class Solution:
    def longestCommonPrefix(self, strs: [str]) -> str:
        shortest = self.shortest_word(strs)
        print(f"shortest word: {shortest}")

        final_prefix = ""
        for i in range(0, len(shortest)):
            threshold = 0
            for j in range(0, len(strs)):
                if shortest[i] != strs[j][i]: return final_prefix
                if shortest[i] == strs[j][i]: threshold += 1
                # All words from array match the current letter
                if threshold == len(strs): final_prefix += strs[j][i]

        return final_prefix

    def shortest_word(self, words: [str]) -> str:
        shortest = ""
        for i in range(0, len(words)):
            if i == 0: shortest = words[i]
            if len(words[i]) < len(shortest): shortest = words[i]
        return shortest

# ["flower","flow","flight"]
# 
output_1 = Solution().longestCommonPrefix(["flower","flow","flight"])
output_2 = Solution().longestCommonPrefix(["dog","racecar","car"])
output_3 = Solution().longestCommonPrefix(["cir","car"])
output_4 = Solution().longestCommonPrefix(["aca","cba"])
print(f"output: {output_1}")
print(f"output: {output_2}")
print(f"output: {output_3}")
print(f"output: {output_4}")
