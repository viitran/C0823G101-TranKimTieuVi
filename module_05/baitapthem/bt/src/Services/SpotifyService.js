import axios from 'axios';
export const findAll = async () => {
    try {
        const result = await axios.get('http://localhost:8080/spotify');
        return result.data;
    } catch (error) {
        console.log(error.message);
    }
}

export const create = async (value) => {
    try {
        const result = await axios.post('http://localhost:8080/spotify', value);
        return result.data;
    } catch (error) {
        console.log(error.message);
    }
}

export const update = async (value) => {
    try {
        const result = await axios.put(`http://localhost:8080/spotify/${value.id}`, value);
        return result.data;
    } catch (error) {
        console.log(error.message);
    }
}

export const remove = async (id) => {
    try {
        const result = await axios.delete(`http://localhost:8080/spotify/${id}`);
        return result.data;
    } catch (error) {
        console.log(error.message);
    }
}

export const findById = async (id) => {
    try {
        const result = await axios.get(`http://localhost:8080/spotify/${id}`);
        return result.data;
    } catch (error) {
        console.log(error.message);
    }
}