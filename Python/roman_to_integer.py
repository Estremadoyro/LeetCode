# O(n)
def roman_to_integer(s: str) -> int:
    total = 0
    i = 0
    while i < len(s):
        substraction = check_substraction(s[i], s[i+1]) if i != len(s) - 1 else 0
        if substraction != 0:
            total += substraction 
            i += 2
        else:
            next_number = check_roman(s[i])
            total += next_number
            i += 1
        
    return total
# III
# limit = 3 - 1 = 2 (0, 1)

def check_roman(s: str) -> int:
    if s == "I": return 1
    if s == "V": return 5
    if s == "X": return 10
    if s == "L": return 50
    if s == "C": return 100
    if s == "D": return 500
    if s == "M": return 1000

def check_substraction(n1: int, n2) -> int:
    if n1 == "I" and n2 == "V":
        return 4
    if n1 == "I" and n2 == "X":
        return 9
    if n1 == "X" and n2 == "L":
        return 40
    if n1 == "X" and n2 == "C":
        return 90
    if n1 == "C" and n2 == "D":
        return 400
    if n1 == "C" and n2 == "M":
        return 900
    else: return 0

print(f"output: {roman_to_integer('III')}")
print(f"output: {roman_to_integer('LVIII')}")
print(f"output: {roman_to_integer('MCMXCIV')}")
