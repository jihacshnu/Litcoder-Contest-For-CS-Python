def containsNearbyDuplicate(nums, k):
    num_dict = {}

    for i, num in enumerate(nums):
        if num in num_dict and i - num_dict[num] <= k:
            return "Yes"
        num_dict[num] = i

    return "No"

# Input reading from the user
nums = list(map(int, input().split()))
k = int(input())

result = containsNearbyDuplicate(nums, k)
print( result)
                                                                                                                            