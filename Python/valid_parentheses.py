#  BigO: O(k * n)
class Solution:
    def isValid(self, s: str) -> bool: 
        if len(s) % 2 != 0: return False
        openers = []
        for i in range(0, len(s)):
            if s[i] == "(" or s[i] == "[" or s[i] == "{":
                openers.append(s[i])
                print(f"(ADD) openers: {openers}")
            # closers 
            else:
                if len(openers) > 0:
                    if self.check_valid_pair(openers[-1], s[i]):
                        del openers[-1]
                        print(f"(DEL) openers: {openers}")
                    else: return False
                else: return False
        return len(openers) == 0

    def check_valid_pair(self, s1: str, s2: str) -> bool:
        print(f"s1: {s1} | s2: {s2}")
        if s1 == "(" and s2 == ")": return True
        elif s1 == "[" and s2 == "]": return True
        return s1 == "{" and s2 == "}" 




sol = Solution()
input = "()[{}()]"
output = sol.isValid(input)
print(f"output: {output}")

input = "]"
output = sol.isValid(input)
print(f"output: {output}")

input = "([}}])"
output = sol.isValid(input)
print(f"output: {output}")
