var __rest = (this && this.__rest) || function (s, e) {
    var t = {};
    for (var p in s) if (Object.prototype.hasOwnProperty.call(s, p) && e.indexOf(p) < 0)
        t[p] = s[p];
    if (s != null && typeof Object.getOwnPropertySymbols === "function")
        for (var i = 0, p = Object.getOwnPropertySymbols(s); i < p.length; i++) {
            if (e.indexOf(p[i]) < 0 && Object.prototype.propertyIsEnumerable.call(s, p[i]))
                t[p[i]] = s[p[i]];
        }
    return t;
};
// Sử dụng destructuring để trích xuất các giá trị "name" và "age" từ một mảng chứa các đối tượng "person".
var person = {
    name: 'Vi',
    address: 'Côn đảo',
    age: 17
};
var person1 = {
    name: 'Lati',
    address: 'nhà',
    age: 20
};
var p1 = person.name, rest1 = __rest(person, ["name"]);
var p2 = person1.name, rest2 = __rest(person1, ["name"]);
console.log(p1);
console.log(p2);
console.log(rest1);
console.log(rest2);
