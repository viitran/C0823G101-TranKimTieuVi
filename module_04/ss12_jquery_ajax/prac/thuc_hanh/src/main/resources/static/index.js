function successHandler() {
    $.ajax({
        type: "GET",
        //tên API
        url: "/smartphones",
        //xử lý khi thành công
        success: function (data) {
            // hiển thị danh sách ở đây
            let content = ' <table id="display-list" border="1"><tr>\n' +
                ' <th>Producer</td>\n' +
                ' <th>Model</td>\n' +
                ' <th>Price</td>\n' +
                ' <th>Delete</td>\n' +
                ' </tr>';
            for (let i = 0; i < data.length; i++) {
                content += getSmartphone(data[i]);
            }
            content += "</table>"
            document.getElementById('smartphoneList').innerHTML = content;
        }
    });
}
function addNewSmartPhone() {
    //lấy dữ liệu từ form html
    let producer = $('#producer').val();
    let model = $('#model').val();
    let price = $('#price').val();
    let newSmartphone = {
        producer: producer,
        model: model,
        price: price
    };
    // gọi phương thức ajax
    $.ajax({
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        type: "POST",
        data: JSON.stringify(newSmartphone),
        //tên API
        url: "http://localhost:8080/smartphones",
        //xử lý khi thành công
        success: console.log("success")
    });
    //chặn sự kiện mặc định của thẻ
    event.preventDefault();
}
function displayFormCreate() {
    document.getElementById('smartphoneList').style.display = "none";
    document.getElementById('add-smartphone').style.display = "block";
    document.getElementById('display-create').style.display = "none";
    document.getElementById('title').style.display = "none";
}

function getSmartphone(smartphone) {
    return `<tr><td >${smartphone.producer}</td><td >${smartphone.model}</td><td >${smartphone.price}</td>` +
        `<td class="btn"><button class="deleteSmartphone" onclick="deleteSmartphone(${smartphone.id})">Delete</button></td></tr>`;
}

function deleteSmartphone(id) {
    $.ajax({
        type: "DELETE",
        //tên API
        url: `http://localhost:8080/smartphones/${id}`,
        //xử lý khi thành công
        success: successHandler
    });
}