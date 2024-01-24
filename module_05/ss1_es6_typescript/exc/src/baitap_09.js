// Sử dụng Rest parameter để nhận vào
// một danh sách tên và trả về chuỗi định dạng "Welcome, [tên1], [tên2], [tên3], ..." cho tất cả các tên.
function welcomeMessage() {
    var names = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        names[_i] = arguments[_i];
    }
    return "Welcome, ".concat(names.join(", "));
}
console.log(welcomeMessage("Lati", "Vtran", "Vi"));
