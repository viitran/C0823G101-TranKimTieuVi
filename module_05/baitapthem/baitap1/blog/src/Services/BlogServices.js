import axios from "axios";
export const findAll = async (searchParams) => {
  try {
    const result = await axios.get(`http://localhost:8080/blogs?title_like=${searchParams.title}&tags.name_like=${searchParams.tags}`);
    return result.data;
  } catch (error) {
    console.log(error);
  }
};

export const findAllTags = async () => {
  try {
    const result = await axios.get(`http://localhost:8080/tags`);
    return result.data;
  } catch (error) {
    console.log(error);
  }
}

export const update = async(post) =>{
  try {
    const result = await axios.put(`http://localhost:8080/blogs/${post.id}`,post);
    return result.data;
  } catch (error) {
    console.log(error);
  }
}

export const save = async (post) => {
  try {
    const result = await axios.post(`http://localhost:8080/blogs`, post);
    return result.data;
  } catch (error) {
    console.log(error);
  }
};

export const findById = async (id) => {
  try {
    const result = await axios.get(`http://localhost:8080/blogs/${id}`);
    return result.data;
  } catch (error) {
    console.log(error);
  }
};

export const remove = async (id) => {
  try {
    const result = await axios.delete(`http://localhost:8080/blogs/${id}`);
    return result.status;
  } catch (error) {
    console.log(error);
  }
};
