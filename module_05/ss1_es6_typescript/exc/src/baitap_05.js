// Tìm phần tử đầu tiên trong mảng lớn hơn 3.
var array5 = [2, 3, 1, 0];
var newArr5 = array5.filter(function (b) { return b > 3; });
if (newArr5.length > 0) {
    console.log(newArr5[0]);
}
else {
    console.log("Không có phần tử nào lớn hơn 3 trong mảng.");
}
