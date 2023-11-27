def job_sequencing(job_count, job_names, deadlines, profits):
    jobs = list(zip(job_names, deadlines, profits))
    jobs.sort(key=lambda x: (x[2], -x[1]), reverse=True)  # Sort by profit (descending) and deadline (ascending)

    result = []
    time_slots = [False] * (job_count + 1)

    for job in jobs:
        deadline = job[1]
        while deadline > 0 and time_slots[deadline]:
            deadline -= 1

        if deadline > 0:
            result.append(job[0])
            time_slots[deadline] = True

    return result

try:
    job_count = int(input().strip())
    job_names = input().strip().split()
    deadlines = list(map(int, input().strip().split()))
    profits = list(map(int, input().strip().split()))

    result = job_sequencing(job_count, job_names, deadlines, profits)
    print(" ".join(result))

except ValueError:
    print("Invalid input. Please enter valid integers for the job count, deadlines, and profits.")
                                                                                                                            