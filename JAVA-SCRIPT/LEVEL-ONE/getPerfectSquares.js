function getPerfectSquares(numbers) {
  const result = [];
  for (const number of numbers) {
    if (Math.sqrt(number) % 1 === 0) {
      result.push(number);
    }
  }
  return result;
}

console.log(getPerfectSquares([4, 7, 9, 10, 16, 18,9]))
