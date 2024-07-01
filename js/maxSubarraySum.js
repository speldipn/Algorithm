function maxSubarraySum(arr, value){
  let max = 0;
  let i = 0;
  if(value > arr.length) return null;
  while (i < arr.length) {
    let sum = arr.slice(i, i + value).reduce((i, v) => i + v, 0);
    if(sum > max) {
      max = sum;
    }
    i++;
  }
  return max;
}

maxSubarraySum([100,200,300,400], 2) // 700
maxSubarraySum([1,4,2,10,23,3,1,0,20], 4)  // 39 
maxSubarraySum([-3,4,0,-2,6,-1], 2) // 5
maxSubarraySum([3,-2,7,-4,1,-1,4,-2,1],2) // 5
maxSubarraySum([2,3], 3) // null