def minStepsToTargetSweetness(target, candies):
    candies.sort()
    steps = 0
    while candies[0] < target:
        if len(candies) < 2:
            return -1  # Not enough candies to reach target sweetness

        least_sweet = candies.pop(0)
        second_least_sweet = candies.pop(0)
        new_sweetness = least_sweet + 2 * second_least_sweet
        candies.insert(0, new_sweetness)
        candies.sort()
        steps += 1

    return steps

# Input reading from the user
target = int(input())
candies = list(map(int, input().split()))

result = minStepsToTargetSweetness(target, candies)
print(result)
                                                                                                                            