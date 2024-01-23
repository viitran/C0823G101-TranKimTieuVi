// Kiểm tra 1 mảng có chứa số V hay không nếu có trả về V không thì trả về "không tìm thấy".
var arrayAlphabet = ["a", "B", "v", "x", "Z"];
var array1 = arrayAlphabet.map(function (a) { return a.toLowerCase(); });
for (var i = 0; i < array1.length; i++) {
    if (array1[i] == "v") {
        console.log(array1[i]);
        break;
    }
    else {
        console.log("không tìm thấy");
        break;
    }
}
