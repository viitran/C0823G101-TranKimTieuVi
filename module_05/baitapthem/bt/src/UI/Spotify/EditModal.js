import { Button, Modal } from "react-bootstrap"
import { useState } from "react"
function EditModal(props) {
  const { show, setShow, onEdit } = props;
  const [status, setStatus] = useState(0);

  const handleClose = () => setShow(false)

  const handleStatusChange = (e) => {
    setStatus(e.target.value)
  }

  const handleEdit = () => {
    handleClose();
    onEdit(status);
  }


  return (
    <>
      <Modal show={show} onHide={handleClose}>
        <Modal.Header closeButton>
          <Modal.Title>Modal heading</Modal.Title>
        </Modal.Header>
        <Modal.Body>
        <label form="editStatus">
          Chỉnh sửa trạng thái: 
        </label>
        <select value={status} onChange={handleStatusChange}>
          <option value="0">Công khai</option>
          <option value="1">Riêng tư</option>
        </select>
        </Modal.Body>
        <Modal.Footer>
          <Button variant="secondary" onClick={handleClose}>
            Close
          </Button>
          <Button variant="danger" onClick={handleEdit}>
            Cập nhật
          </Button>
        </Modal.Footer>
      </Modal>
    </>
  )
}
export default EditModal;