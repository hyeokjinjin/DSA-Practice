class BinarySearch:

    def binarySearch(array, target):

        low = 0
        high = len(array) - 1
        i = 1

        while low <= high:
            mid = int(low + (high - low) / 2)
            guess = array[mid]
            print(f'Guess is {guess} with {i} guesses')

            if guess == target:
                return mid
            elif guess > target:
                high = mid - 1
                i += 1
            elif guess < target:
                low = mid + 1
                i += 1

        return None

    array = []
    for i in range(0, 1000):
        array.append(i)

    print(binarySearch(array, 4))
