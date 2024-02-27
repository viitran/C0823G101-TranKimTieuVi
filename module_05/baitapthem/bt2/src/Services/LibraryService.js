import axios from "axios";
export const findAll = async () => {
  try {
    const result = await axios.get("http://localhost:8080/library");
    return result.data;
  } catch (error) {
    console.log(error);
  }
};

export const create = async (value) => {
  try {
    const result = await axios.post("http://localhost:8080/library", value);
    return result.data;
  } catch (error) {
    console.log(error);
  }
};

export const update = async (value) => {
  try {
    const result = await axios.put(
      `http://localhost:8080/library/${value.id}`,
      value
    );
    return result.data;
  } catch (error) {
    console.log(error);
  }
};

export const remove = async (id) => {
  try {
    const result = await axios.delete(`http://localhost:8080/library/${id}`);
    return result.data;
  } catch (error) {
    console.log(error);
  }
};

export const findById = async (id) => {
  try {
    const result = await axios.get(`http://localhost:8080/library/${id}`);
    return result.data;
  } catch (error) {
    console.log(error);
  }
};
