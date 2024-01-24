// Kiểm tra 1 mảng có chứa số V hay không nếu có trả về V không thì trả về "không tìm thấy".
let arrayAlphabet: Array<String> = ["a", "B", "c", "x", "Z"];
let found: boolean = false;

for (let i = 0; i < arrayAlphabet.length; i++) {
  if (arrayAlphabet[i].toLowerCase() === "v") {
    found = true;
    break;
  }
}

if (found) {
  console.log("V");
} else {
  console.log("Không tìm thấy");
}
