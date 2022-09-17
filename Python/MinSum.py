def main(input: [int]) -> [int]: 
    if (len(input) <= 2): return input

    print(f"input: {input}")
    sorted_input = bubbleSort(input)
    print(f"sorted: {sorted_input}")

    pair = [0, 0]
    smallers = []
    smallest = 0
    print(f"len: {len(input)}")
    for i in range(0, len(input) - 1):
        difference = abs(sorted_input[i] - sorted_input[i+1])
        if i == 0: # first smallest
            smallest = difference

        if difference < smallest: # new min. difference
            smallers = []
            smallest = difference

        if difference <= smallest: # add small enough pairs
            smallers.append([sorted_input[i], sorted_input[i+1]])
    print(f"smallest: {smallest}")

    return smallers

# Bubble sort o  w o  
def bubbleSort(array: [int]) -> [int]:
    index = 1
    while index < len(array):
        index2 = 1
        while index2 < len(array) - index:
            if array[index2 - 1] > array[index2]:
                aux = array[index2]
                array[index2] = array[index2 - 1]
                array[index2 - 1] = aux
            index2 += 1
        index += 1
    return array


input = [4, 8, 30, 2, 20, 10, 5, 15, 22, 31]
#input = [6, 2, 4, 10]
#input = [6, 3, 6]
solution = main(input)
print(f"output: {solution}")
