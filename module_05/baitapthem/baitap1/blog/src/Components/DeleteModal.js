import Button from "react-bootstrap/Button";
import Modal from "react-bootstrap/Modal";

function DeleteModal(props) {
  const { show, setShow, onDeleteHandler, title } = props;

  const handleClose = () => setShow(false);

  const handleRemove = () => {
    onDeleteHandler();
    handleClose();
  };
  return (
    <>
      <Modal
        show={show}
        onHide={handleClose}
        backdrop="static"
        keyboard={false}
      >
        <Modal.Header closeButton>
          <Modal.Title>Attention ! !</Modal.Title>
        </Modal.Header>
        <Modal.Body>
          Are you sure you want to delete the blog with the title: {title} ?
        </Modal.Body>
        <Modal.Footer>
          <Button variant="secondary" onClick={handleClose}>
            Close
          </Button>
          <Button variant="primary" onClick={handleRemove}>
            Delete
          </Button>
        </Modal.Footer>
      </Modal>
    </>
  );
}

export default DeleteModal;
