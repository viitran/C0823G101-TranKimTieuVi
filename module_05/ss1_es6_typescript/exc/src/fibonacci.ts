
    let a:number = 0;
    let b:number = 1;
    let c:number = 0;
    let sum:number = 0;
    let input: number = 20;
    for (let i = 0; i < input; i++) {
        c = array + b;
        array = b;
        b = c;
        sum = sum + array;
        console.log(`${array}`);
    }
    console.log(`tổng ${array} số đầu tiên trong dãy fibonacci là ${sum}`);
    
