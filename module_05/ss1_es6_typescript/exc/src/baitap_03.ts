// Kiểm tra 1 mảng có chứa số V hay không nếu có trả về V không thì trả về "không tìm thấy".
let arrayAlphabet: Array<String> = ["a", "B", "V", "x", "Z"];
let array1: Array<String> = arrayAlphabet.map((a) => a.toLowerCase());
for (let i = 0; i < array1.length; i++) {
  if (array1[i] == "v") {
    console.log(array1[i]);
    break;
  } else {
    console.log("không tìm thấy");
    break;
  }
}
