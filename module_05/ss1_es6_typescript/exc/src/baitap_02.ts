// Sử dụng arrow function và reduce để tính tổng các phần tử trong mảng.
let numb:Array<number>=[1,2,3,6,7];
let sumNumb:number = numb.reduce((totality,value) => totality + value)
console.log(sumNumb);
