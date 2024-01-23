// Tìm phần tử đầu tiên trong mảng lớn hơn 3.
let array5: Array<number> = [2, 3, 1, 0];
let newArr5: Array<number> = array5.filter((b) => b > 3);

if (newArr5.length > 0) {
  console.log(newArr5[0]);
} else {
  console.log("Không có phần tử nào lớn hơn 3 trong mảng");
}

