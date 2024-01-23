// Sử dụng arrow function và reduce để tính tổng các phần tử trong mảng.
var numb = [1, 2, 3, 6, 7];
var sumNumb = numb.reduce(function (totality, value) { return totality + value; });
console.log(sumNumb);
