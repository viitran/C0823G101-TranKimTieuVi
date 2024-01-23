// Sử dụng destructuring với rest parameter để 
// trích xuất phần tử đầu tiên vào biến "first" và các phần tử còn lại vào một mảng mới "rest".

let people = {
    name : 'Vi',
    address : 'Côn đảo'
}
let {name:first, ...rest } = people; 
console.log(first);
console.log(rest);
