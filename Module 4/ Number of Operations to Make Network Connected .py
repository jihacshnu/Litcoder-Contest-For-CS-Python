def min_operations_for_connectivity(N, connections):
    # Create an adjacency list representation of the graph
    graph = {i: set() for i in range(N)}
    for connection in connections:
        city1, city2 = connection
        graph[city1].add(city2)
        graph[city2].add(city1)

    # Helper function for DFS traversal
    def dfs(node, visited):
        visited.add(node)
        for neighbor in graph[node]:
            if neighbor not in visited:
                dfs(neighbor, visited)

    # Initialize variables
    visited = set()
    components = 0

    # Count the number of connected components
    for node in range(N):
        if node not in visited:
            dfs(node, visited)
            components += 1

    # If there is onlynetwork connected one connected component, all cities are connected
    if components == 1:
        return 0
    elif components > 1:
        # If there are multiple connected components, count the number of operations needed
        # to connect them all (number of edges to add = components - 1)
        return components - 1
    else:
        # If there are no connected components, it means there are isolated cities
        return -1

# Exercise-1 input from user
N_exercise_1 = int(input())
M_exercise_1 = int(input())
connections_exercise_1 = []

for _ in range(M_exercise_1):
    connection_input = input()
    connection = tuple(map(int, connection_input.split()))
    connections_exercise_1.append(connection)

result_exercise_1 = min_operations_for_connectivity(N_exercise_1, connections_exercise_1)
print(result_exercise_1)
                                                                                                                            