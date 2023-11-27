def number_of_people_knowing_secret(n, delay, forget):
    people_knowing_secret = 0
    secrets_known = [0] * (n + 1)

    for day in range(n + 1):
        if day >= delay and day - forget - 1 >= 0:
            people_knowing_secret -= secrets_known[day - forget - 1]

        if day >= delay:
            people_knowing_secret += 1
            secrets_known[day] = 1

    return people_knowing_secret

# Example usage with user input:
try:
    n = int(input())
    delay = int(input())
    forget = int(input())

    result = number_of_people_knowing_secret(n, delay, forget)
    print(result)

except ValueError:
    print("Invalid input. Please enter valid integers for the number of days, delay, and forgetting day.")
                                                                                                                            