class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count = {}
        for num in nums:
            count[num] = 1 + count.get(num, 0)

        heap = []
        for num, cnt in count.items():
            heapq.heappush(heap, (cnt, num))
            if len(heap) > k:
                heapq.heappop(heap)

        res = []
        while heap:
            res.append(heapq.heappop(heap)[1])

        return res