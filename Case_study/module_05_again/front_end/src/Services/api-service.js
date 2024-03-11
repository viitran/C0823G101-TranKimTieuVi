import axios from 'axios';

// config cho axios => neeus lafm ve security
export const instance = axios.create({
    baseURL: "http://localhost:8080",
    withCredentials: false,
    headers: {
      'Access-Control-Allow-Origin' : '*',
      'Access-Control-Allow-Methods':'*',
      'Access-Control-Allow-Headers': '*'
      }
  });