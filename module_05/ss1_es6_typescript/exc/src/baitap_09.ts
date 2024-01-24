// Sử dụng Rest parameter để nhận vào
// một danh sách tên và trả về chuỗi định dạng "Welcome, [tên1], [tên2], [tên3], ..." cho tất cả các tên.
function welcomeMessage(...names: string[]): string {
  return `Welcome, ${names.join(", ")}`;
}

console.log(welcomeMessage("Lati", "Vtran", "Vi"));
