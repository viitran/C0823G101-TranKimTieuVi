// Kiểm tra 1 mảng có chứa số V hay không nếu có trả về V không thì trả về "không tìm thấy".
var arrayAlphabet = ["a", "B", "c", "x", "Z"];
var found = false;
for (var i = 0; i < arrayAlphabet.length; i++) {
    if (arrayAlphabet[i].toLowerCase() === "v") {
        found = true;
        break;
    }
}
if (found) {
    console.log("V");
}
else {
    console.log("Không tìm thấy");
}
