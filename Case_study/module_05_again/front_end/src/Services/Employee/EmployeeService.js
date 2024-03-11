import axios from "axios"

export const findAllPositionEmp = async() =>{
    try {
        const result = await axios.get(`http://localhost:8080/position`);
        return result.data;
    } catch (error) {
        console.log(error);        
    }
}

export const findAllQualificationsEmp = async() =>{
    try {
        const result = await axios.get(`http://localhost:8080/qualifications`);
        return result.data;
    } catch (error) {
        console.log(error);        
    }
}

export const findAllWorkingPartsEmp = async() =>{
    try {
        const result = await axios.get(`http://localhost:8080/working-parts`);
        return result.data;
    } catch (error) {
        console.log(error);        
    }
}

export const findAllEmp = async() =>{
    try {
        const result = await axios.get(`http://localhost:8080/employee`);
        return result.data;
    } catch (error) {
        console.log(error);
    }
}

export const create = async (emp) => {
    try {
        const result = await axios.post(`http://localhost:8080/create`, emp);
        return result.data;
    }catch(error){
        console.log(error.message);
    }
}

// upd nen truyen vao doi tuog
export const update = async (employee) =>{
    try {
        const result = await axios.post(`http://localhost:8080/edit`,employee);
        return result.data;
    } catch (error) {
        console.log(error);
    }
}

export const remove = async (id) => {
    try {
        const result = await axios.post(`http://localhost:8080/delete/${id}`);
        // doi delete sang post vi be chanwj
        return result.data;
    } catch (error) {
        console.log(error);
    }
}

export const findById = async(id) =>{
    try {
        const result = await axios.get(`http://localhost:8080/employee/${id}`);
        return result.data;
    } catch (error) {
        console.log(error);
    }
}
