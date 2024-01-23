// Kiểm tra 1 mảng tất cả các phần tử trong mảng đó có lớn hơn 0 hay không?.
let d:Array<number> = [1,2,3];
let d1:number = d.reduce((sum4,value) => sum4 + value )
if(d1 > 0){
console.log("OK");
} else{
console.log("NO");
}
