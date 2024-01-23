var a = 0;
var b = 1;
var c = 0;
var sum = 0;
var input = 20;
for (var i = 0; i < input; i++) {
    c = a + b;
    a = b;
    b = c;
    sum = sum + a;
    console.log("".concat(a, " + <br>"));
}
console.log("t\u1ED5ng ".concat(a, " s\u1ED1 \u0111\u1EA7u ti\u00EAn trong d\u00E3y fibonacci l\u00E0 ").concat(sum));
