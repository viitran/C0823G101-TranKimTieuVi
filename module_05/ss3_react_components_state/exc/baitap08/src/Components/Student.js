import { Component } from "react";

export class StudentList extends Component() {
  render() {
    const { id, sName, sPhoneNumber, sEmail } = this.props;
    return (
      <table>
        <tr>
            <th>#</th>
            <th>Name</th>
            <th>Phone</th>
            <th>Email</th>
            <th>Action</th>
        </tr>
        <tr key={id}>
          <td>{id}</td>
          <td>{sName}</td>
          <td>{sPhoneNumber}</td>
          <td>{sEmail}</td>
        </tr>
      </table>
    );
  }
}
