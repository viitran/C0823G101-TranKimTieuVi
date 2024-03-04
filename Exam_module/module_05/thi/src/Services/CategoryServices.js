import axios from "axios";

export const findAllCategories = async () => {
  try {
    const result = await axios.get("http://localhost:8080/categories");
    return result.data;
  } catch (error) {
    console.error(error.message);
    throw error;
  }
};

export const findByIdCate = async (id) => {
  const res = await axios.get(`http://localhost:8080/categories/${id}`);
  return res.data;
};

