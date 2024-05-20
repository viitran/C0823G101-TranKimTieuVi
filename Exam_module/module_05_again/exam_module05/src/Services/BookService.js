import axios from "axios";

export const getAllBook = async (searchParam) => {
  try {
    const result = await axios.get(
      `http://localhost:8080/books?title_like=${searchParam.title}&category.name_like=${searchParam.category}`
    );
    return result.data;
  } catch (error) {
    console.log(error);
  }
};

export const create = async (book) => {
  try {
    const result = await axios.post(`http://localhost:8080/books`, book);
    return result.data;
  } catch (error) {
    console.log(error);
  }
};

export const update = async (book) => {
  try {
    const result = await axios.patch(
      `http://localhost:8080/books/${book.id}`,
      book
    );
    return result.data;
  } catch (error) {
    console.log(error);
  }
};

export const findById = async (id) => {
  try {
    const result = await axios.get(`http://localhost:8080/books/${id}`);
    return result.data;
  } catch (error) {
    console.log(error);
  }
};

export const remove = async (id) => {
  const res = await axios.delete(`http://localhost:8080/books/${id}`);
  return res.data;
};
