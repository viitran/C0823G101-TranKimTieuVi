import axios from "axios";

export const findAll = async (searchParam) => {
    try {
        const result = await axios.get(`http://localhost:8080/clothing`);
        return result.data;
    } catch (error) {
        console.log(error.message);
    }
}

export const update = async (clothing) => {
    try {
        const result = await axios.put(`http://localhost:8080/clothing/${clothing.id}`, clothing);
        return result.data;
    } catch (error) {
        console.log(error.message);
    }
}

export const findById = async (id) => {
    const res = await axios.get(`http://localhost:8080/clothing/${id}`);
    return res.data;
  };

  export const create = async (clothing) => {
    try {
        const result = await axios.post(`http://localhost:8080/create`, clothing);
        return result.data;
    }catch(error){
        console.log(error.message);
    }
}