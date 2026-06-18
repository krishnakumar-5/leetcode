// Last updated: 6/18/2026, 10:43:30 PM
class Solution:
    def findRelativeRanks(self, score: List[int]) -> List[str]:
        n = len(score)
        M = max(score)
        scoreToIndex = [-1] * (M + 1)
        for i in range(n):
            scoreToIndex[score[i]] = i

        MEDALS = ["Gold Medal", "Silver Medal", "Bronze Medal"]
        place = 1
        ranks = [None] * n
        for score in range(M, -1, -1):
            if scoreToIndex[score] != -1:
                if place < 4:
                    ranks[scoreToIndex[score]] = MEDALS[place - 1]
                else:
                    ranks[scoreToIndex[score]] = str(place)
                place += 1
        return ranks