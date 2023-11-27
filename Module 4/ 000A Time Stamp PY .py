from collections import defaultdict

class TimeTravelersArchive:
    def _init_(self):
        self.data = defaultdict(list)

    def Store(self, key, value, timestamp):
        self.data[key].append((timestamp, value))

    def Retrieve(self, key, timestamp):
        if key not in self.data:
            return "empty"

        if timestamp < 1:
            return "empty"

        values = self.data[key]

        # Binary search to find the latest value with timestamp <= given timestamp
        left, right = 0, len(values) - 1
        while left <= right:
            mid = (left + right) // 2
            if values[mid][0] == timestamp:
                return values[mid][1]
            elif values[mid][0] < timestamp:
                left = mid + 1
            else:
                right = mid - 1

        # Check if there is any value with timestamp less than or equal to the given timestamp
        if right >= 0:
            return values[right][1]
        else:
            return "empty"

# Exercise-1 input from user
archive = TimeTravelersArchive()

while True:
    try:
        user_input = input()
        tokens = user_input.split()
        command = tokens[0].lower()

        if command == "store":
            key, value, timestamp = tokens[1], tokens[2], int(tokens[3])
            archive.Store(key, value, timestamp)
        elif command == "retrieve":
            key, timestamp = tokens[1], int(tokens[2])
            result = archive.Retrieve(key, timestamp)
            print(result)
        else:
            print("Wrong method called, please call Store or Retrieve method")

    except EOFError:
        break