// Sử dụng Rest parameter và Spread perator để tạo một hàm nhận vào danh sách các số và trả về tổng của chúng.
let total = (a:number, b:number, ...arg: number[])=>{
    let arr = [a,b,...arg];
    let restp = arr.reduce((totality,val) => totality + val)
    console.log(restp);
    
} 
total(2,3,5,6)



 