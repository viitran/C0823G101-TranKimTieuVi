import axios from "axios";

export const findAll = async (searchParam) => {
  try {
    const result = await axios(`http://localhost:8080/posts?title_like=${searchParam.title}&_sort=title&_order=${searchParam.sortTitle}`);
    return result.data;
  } catch (error) {
    console.log(error);
  }
};

export const save = async (post) => {
  try {
    const result = await axios.post("http://localhost:8080/posts", post);
    return result.data;
  } catch (error) {
    console.log(error);
  }
};

export const findById = async (id) => {
  try {
    const result = await axios.get(`http://localhost:8080/posts/${id}`);
    return result.data;
  } catch (error) {
    console.log(error);
  }
};

export const update = async (post) => {
  try {
    const result = await axios.put(
      `http://localhost:8080/posts/${post.id}`,
      post
    );
    return result.data;
  } catch (error) {
    console.log(error);
  }
};

export const remove = async (id) => {
  try {
    const result = await axios.delete(`http://localhost:8080/posts/${id}`);
    return result.data;
  } catch (error) {
    console.log(error);
  }
};
