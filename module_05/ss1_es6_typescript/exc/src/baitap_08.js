var __spreadArray = (this && this.__spreadArray) || function (to, from, pack) {
    if (pack || arguments.length === 2) for (var i = 0, l = from.length, ar; i < l; i++) {
        if (ar || !(i in from)) {
            if (!ar) ar = Array.prototype.slice.call(from, 0, i);
            ar[i] = from[i];
        }
    }
    return to.concat(ar || Array.prototype.slice.call(from));
};
// Sử dụng Rest parameter và Spread perator để tạo một hàm nhận vào danh sách các số và trả về tổng của chúng.
var total = function (a, b) {
    var arg = [];
    for (var _i = 2; _i < arguments.length; _i++) {
        arg[_i - 2] = arguments[_i];
    }
    var arr = __spreadArray([a, b], arg, true);
    var restp = arr.reduce(function (totality, val) { return totality + val; });
    console.log(restp);
};
total(2, 3, 5, 6);
