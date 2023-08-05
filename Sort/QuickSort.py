class QuickSort:
    
    def partition(array, start, end):
        pivot = array[-1]
        i = start - 1
        for j in range(start, end - 1):
            if (array[j] < pivot):
                i += 1
                temp = array[i]
                array[i] = array[j]
                array[j] = temp
        i += 1
        temp = array[i]
        array[i] = array[end]
        array[end] = temp
        
        return i
    
    def quickSort(array, start, end):
        if end <= start:
            return
        pivot:int = partition(array, start, end)
        quickSort(array, start, pivot - 1)
        quickSort(array, pivot + 1, end)
        
    
    
    array = [8, 7, 9, 2, 3, 1, 5, 4, 6]

    quickSort(array, 0, len(array) - 1)

    output = ""
    for num in array:
        output += (f'{num} ')
    print(output)