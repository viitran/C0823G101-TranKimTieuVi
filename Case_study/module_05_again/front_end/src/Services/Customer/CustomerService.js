import axios from "axios";

export const findAllTypeCus = async () =>{
    try {
        const result = await axios.get(`http://localhost:8080/customer-type`);
        return result.data;
    } catch (error) {
        console.log(error);
    }
}

export const findAllCustomer = async() =>{
    try {
        const result = await axios.get(`http://localhost:8080/customers`);
        return result.data;
    } catch (error) {
        console.log(error);
    }
}

export const createCustomer = async (customer) => {
    try {
        const result = await axios.post(`http://localhost:8080/create-customer`, customer);
        return result.data;
    } catch (error) {
        console.log(error);
    }
}

export const updateCustomer = async (customer) => {
    try {
        const result = await axios.post(`http://localhost:8080/update-customer`,customer);
        return result.data;
    } catch (error) {
        console.log(error);
    }
}

export const findIdCustomer = async (id) => {
    try {
        const result = await axios.get(`http://localhost:8080/customer/${id}`);
        return result.data;
    } catch (error) {
        console.log(error);
    }
}


