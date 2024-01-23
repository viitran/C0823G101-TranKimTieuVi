//  Tạo một mảng mới chứa các số lớn hơn 5 từ mảng ban đầu.

let arr: Array<number> = [5,6,3,7,1];
let newArr: Array<number> = arr.filter((num) => num > 5  );
console.log(newArr);

