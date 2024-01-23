import React from "react";
import ReactDOM from "react-dom/client";
const name = "Vi trần";
// React.createElement("h1", { style: { textAlign: "center" } }, name);
const root = ReactDOM.createRoot(document.getElementById("root"));
// root.render(
//   React.createElement("h1", { style: { textAlign: "center" } }, name)
// );

<h1 style={{ textAlign: "center" }}>
	{ name }
</h1>

root.render(
  <h1 style={{ textAlign: "center" }}>
	{ name }
  </h1>
);
