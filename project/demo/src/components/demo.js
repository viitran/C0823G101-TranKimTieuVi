import React, { useState, useEffect } from "react";
import { Button, Modal, Form } from "react-bootstrap";
import { ProductFormModal } from "./modal";
import { getAllList } from './../services/product-service';

export function ProductList() {
  const [products, setProducts] = useState([]);
  const [show, setShow] = useState(false);
  const [currentProduct, setCurrentProduct] = useState(null);

  const getProducts = async () => {
    try {
      const res = await getAllList();
      setProducts(res);
    } catch (error) {
      console.log(error);
    }
  };

  useEffect(() => {
    getProducts();
  }, []);

  const handleShow = (product = null) => {
    setCurrentProduct(product);
    setShow(true);
  };

  const handleClose = () => setShow(false);

  const handleSave = (product) => {
    if (currentProduct) {
      // Edit
      console.log("edit");
      setProducts((prevProducts) =>
        prevProducts.map((p) => (p.id === product.id ? product : p))
      );
    } else {
      // Create
      console.log("create");
      setProducts((prevProducts) => [
        ...prevProducts,
        { ...product, id: prevProducts.length + 1 },
      ]);
    }
  };
  if (!products) return <div>loading...</div>;
  return (
    <>
      <h1>Product List</h1>
      <Button variant="primary" onClick={() => handleShow()}>
        Create Product
      </Button>

      <table className="table mt-3">
        <thead>
          <tr>
            <th scope="col">#</th>
            <th scope="col">Name</th>
            <th scope="col">Author</th>
            <th scope="col">Action</th>
          </tr>
        </thead>
        <tbody className="table-group-divider table-divider-color">
          {products.map((pr, index) => (
            <tr key={pr.id}>
              <td>{index + 1}</td>
              <td>{pr.name}</td>
              <td>{pr.author}</td>
              <td>
                <Button variant="primary" onClick={() => handleShow(pr)}>
                  Edit
                </Button>
              </td>
            </tr>
          ))}
        </tbody>
      </table>

      <ProductFormModal
        show={show}
        handleClose={handleClose}
        initialData={currentProduct}
        onSave={handleSave}
      />
    </>
  );
}
