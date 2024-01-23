//  Tạo một mảng mới chứa các số lớn hơn 5 từ mảng ban đầu.
var arr = [5, 6, 3, 7, 1];
var newArr = arr.filter(function (num) { return num > 5; });
console.log(newArr);
