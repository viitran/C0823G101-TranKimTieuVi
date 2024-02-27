const person = {
  firstName: "John",
  lastNam: "Doe",
  age: 30,
  gender: "male",
  occupation: "developer",
  nationality: "American",
  city: "New York",
  hobbies: ["reading", "traveling", "photography"],
  languages: ["English", "French"],
  education: {
    degree: "Bachelor",
    major: "Computer Science",
    university: "Harvard University",
  },
};

// Hãy tạo ra 1 đối tượng student gồm các thuộc tính và giá trị lấy từ đối tượng person và hiển thị ra thông tin của student vừa tạo
const student = {
    firstName: person.firstName,
    gender: person.gender,
    degree: person.education.degree,
    english : person.languages[0]
}
console.log(student);
