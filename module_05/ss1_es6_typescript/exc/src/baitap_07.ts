// Sử dụng destructuring để trích xuất các giá trị "name" và "age" từ một mảng chứa các đối tượng "person".
let person = {
    name : 'Vi',
    address : 'Côn đảo',
    age : 17
}
let person1 = {
    name : 'Lati',
    address : 'nhà',
    age : 20
}

let {name:p1,...rest1} = person;
let {name:p2,...rest2} = person1;
console.log(p1);
console.log(p2);
console.log(rest1);
console.log(rest2);
