function isPalindromicArray(values: number[]) {
  for (let index = 0; index < Math.floor(values.length / 2); index += 1) {
    if (values[index] !== values[values.length - 1 - index]) {
      return false;
    }
  }

  return true;
}
