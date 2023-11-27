def clumsy(n):
    if n <= 2:
        return n

    result = n * (n - 1) // (1 if n - 2 == 0 else (n - 2)) + (n - 3)
    n -= 4

    while n > 0:
        result -= n * (n - 1) // (1 if n - 2 == 0 else (n - 2))
        if n - 3 > 0:
            result += (n - 3)
        n -= 4

    return result

def main():
    n = int(input())
    result = clumsy(n)
    print(result - 1)

if __name__ == "__main__":
    main()
             