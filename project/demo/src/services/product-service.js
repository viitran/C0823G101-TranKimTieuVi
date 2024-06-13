import axios from "axios";

export const getAllList = async () => {
  const res = await axios.get(`http://localhost:8080/books`);
  return res.data;
};
