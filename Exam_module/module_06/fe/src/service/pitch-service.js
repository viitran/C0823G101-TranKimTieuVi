import axios from "axios";

export const getAllType = async () => {
  const res = await axios.get(`http://localhost:8080/pitch-type`);
  return res.data;
};

export const remove = async (id) => {
  const res = await axios.post(`http://localhost:8080/delete/${id}`);
  return res.data;
};

export const getAllArea = async () => {
  const res = await axios.get(`http://localhost:8080/pitch-area`);
  return res.data;
};

export const getAllPitch = async () => {
  const res = await axios.get(`http://localhost:8080`);
  return res.data;
};

export const create = async (data) => {
  try {
    const res = await axios.post(`http://localhost:8080/create-pitch`, data);
    return res.data;
  } catch (error) {
    console.log(error);
  }
};

export const getAllTime = async () => {
  try {
    const res = await axios.get(`http://localhost:8080/time`);
    return res.data;
  } catch (error) {
    console.log(error);
  }
};
