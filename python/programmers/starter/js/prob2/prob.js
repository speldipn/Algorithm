function solution(brown, yellow) {
  var answer = [];
  const samples = [];
  const primes = getPrimes(brown + yellow);
  for (let i = 0; i < primes.length; ++i) {
    for (let j = 0; j < primes.length; ++j) {
      if(primes[i] * primes[j] === brown + yellow) {
        samples.push([primes[i], primes[j]]);
      }
    }
  }
  let resultIndex = 0;
  for (let i = 1; i < samples.length; ++i) {
    const a = Math.abs(samples[resultIndex][0] - samples[resultIndex][1]);
    const b = Math.abs(samples[i][0] - samples[i][1]);
    if(a > b) {
      resultIndex = i;
    }
  }
  answer = [...samples[resultIndex].sort().reverse()];

  return answer;
}

function getPrimes(n) {
  const primes = [];
  for(let i = 1; i <= n; ++i) {
    if((n % i) === 0) {
      primes.push(i);
    }
  }
  return primes;
}

const s1 = solution(10, 2);
console.log(s1);
const s2 = solution(8, 1);
console.log(s2);
const s3 = solution(24, 24);
console.log(s3);

/*

1 1 1 1 1 1 1 1 
1 2 2 2 2 2 2 1
1 2 2 2 2 2 2 1
1 2 2 2 2 2 2 1
1 2 2 2 2 2 2 1
1 1 1 1 1 1 1 1 

*/
