import React from "react";
import ReactDOM from "react-dom/client";
import "bootstrap/dist/css/bootstrap.css";
import './index.css';


let student = [
  {
    Commpany: "Alfreds Futterkiste",
    Contact: "Maria Anders",
    Country: "Germany",
  },
  {
    Commpany: "Centro comercial Moctezuma",
    Contact: "Francisco Chang",
    Country: "Mexico",
  },
  {
    Commpany: "Emst Handel",
    Contact: "Roland Mendel",
    Country: " Austria",
  },
  {
    Commpany: "Iland Trading",
    Contact: "Helen Bennett",
    Country: "UK",
  },
  {
    Commpany: "Laughing Bacchus Winecellars",
    Contact: "Yoshi Tannamuri",
    Country: "Canada",
  },
  {
    Commpany: "Magazzini Alimentari Riuniti",
    Contact: "Giovanni Rovelli",
    Country: "Italy",
  },
];

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(
  <div>
    <table >
    <tr>
      <th>Commpany</th>
      <th>Contact</th>
      <th>Country</th>
    </tr>
    {student.map((std) => (
      <tr>
        <td>{std.Commpany}</td>
        <td>{std.Contact}</td>
        <td>{std.Country}</td>
      </tr>
    ))}
    </table>
  </div>
);
