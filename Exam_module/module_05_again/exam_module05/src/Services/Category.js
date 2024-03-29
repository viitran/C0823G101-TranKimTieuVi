import axios from "axios";

export const findAllCate = async () => {
  try {
    const result = await axios.get(`http://localhost:8080/category`);
    return result.data;
  } catch (error) {
    console.log(error);
  }
};
