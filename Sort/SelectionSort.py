class SelectionSort:
    
    def selectionSort(array):
        for i in range(0, len(array) - 1):
            min = i
            for j in range(i + 1, len(array)):
                if array[min] > array[j]:
                    min = j
            temp = array[i]
            array[i] = array[min]
            array[min] = temp

    array = [8, 7, 9, 2, 3, 1, 5, 4, 6]

    selectionSort(array)

    output = ""
    for num in array:
        output += (f'{num} ')
    print(output)