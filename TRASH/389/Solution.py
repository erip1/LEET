class Solution:
    def findTheDifference(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: str
        """
         return ''.join(chr(ord(a) ^ ord(b)) for a,b in zip(s1,s2))
