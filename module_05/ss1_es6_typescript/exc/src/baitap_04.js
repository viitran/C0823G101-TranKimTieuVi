// Kiểm tra 1 mảng tất cả các phần tử trong mảng đó có lớn hơn 0 hay không?.
var d = [1, 2, 3];
var d1 = d.reduce(function (sum4, value) { return sum4 + value; });
if (d1 > 0) {
    console.log("OK");
}
else {
    console.log("NO");
}
