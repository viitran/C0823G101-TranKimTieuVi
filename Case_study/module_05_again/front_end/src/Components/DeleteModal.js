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
          <Modal.Title style={{ color: "red" }}>Thông báo</Modal.Title>
        </Modal.Header>
        <Modal.Body>Bạn có chắc chắn muốn sa thải nhân viên này ?!</Modal.Body>
        <Modal.Footer>
          <Button variant="secondary" onClick={handleClose}>
            Hủy
          </Button>
          <Button variant="primary" onClick={handleRemove}>
            Xóa
          </Button>
        </Modal.Footer>
      </Modal>
    </>
  );
}

export default DeleteModal;
