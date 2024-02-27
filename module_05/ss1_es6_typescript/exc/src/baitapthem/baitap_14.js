// 1. Viết hàm kiểm tra 1 số có phải là số nguyên tố
const isPrime = (num) => {
    if (num <= 1) {
      return false;
    }
    for (let i = 2, sqrt = Math.sqrt(num); i <= sqrt; i++) {
      if (num % i === 0) {
        return false;
      }
    }
    return true;
  };

//2. Cho 1 mảng số nguyên. Sử dụng filter để lọc ra các số là số nguyên tố

let firstNumb = [1,2,3,4,11,5,7,9,2,6];
const result = firstNumb.filter((num) => isPrime(num));
console.log(result);
