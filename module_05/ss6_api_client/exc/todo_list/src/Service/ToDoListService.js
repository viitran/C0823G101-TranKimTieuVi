import axios from "axios";

export const findAll = async () => {
    try {
        const result = await axios.get('http://localhost:8080/todo');
        return result.data;
    } catch (error) {
        console.log(error.message);
    }
};

export const save = async (list) => {
    try {
        const result = await axios.post('http://localhost:8080/todo',list);
        return result.data;
    } catch (error) {
        console.log(error.message);
    }
};