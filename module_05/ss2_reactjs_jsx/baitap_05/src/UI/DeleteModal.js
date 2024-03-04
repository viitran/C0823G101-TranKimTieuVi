import React from "react";
import Button from "react-bootstrap/Button";
import Modal from "react-bootstrap/Modal";
import { toast } from "react-toastify";
import 'react-toastify/dist/ReactToastify.css';
function DeleteModal(props) {
    const {show,setShow,onDeleteHandler,title} = props;
    const handleClose = () => setShow(false);
    const handleDelete = () => {
        onDeleteHandler();
        handleClose();
        toast("Delete Success")
    }
  return (
    <>
      <Modal show={show} onHide={handleClose}>
        <Modal.Header closeButton>
          <Modal.Title>Thông báo</Modal.Title>
        </Modal.Header>
        <Modal.Body>Are you sure to want to delete the post{title}</Modal.Body>
        <Modal.Footer>
          <Button variant="secondary" onClick={handleClose}>
            Close
          </Button>
          <Button variant="danger" onClick={handleDelete}>
            Delete
          </Button>
        </Modal.Footer>
      </Modal>
    </>
  );
}
export default DeleteModal;
