class Solution:
    def numberOfSpecialChars(self, word: str) -> int:
        wrd = set(word)
        return sum(c.lower() in wrd and c.upper() in wrd for c in set(word.lower()))