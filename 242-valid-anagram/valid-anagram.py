class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if dict(Counter(s)) == dict(Counter(t)):
            return True
        return False