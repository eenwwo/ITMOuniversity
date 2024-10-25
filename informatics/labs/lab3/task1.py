import re

"""
468173 % 6 = 5 Eyes: [
468173 % 4 = 1 Nose: < 
468173 % 8 = 5 Mouth: /
Smile: [</
"""

def solve(string):
    pattern = re.compile(r'\[<\/')
    return len(re.findall(pattern, string))