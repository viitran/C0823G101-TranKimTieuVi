import React, { useState, useEffect } from "react";
import * as p from "../Services/PostService.js";
function Home() {
  const [posts, setPosts] = useState([]);
  const findAll = async () => {
    try {
      const result = await p.findAll();
      setPosts(result);
    } catch (error) {
      console.log(error.message);
    }
  };
  useEffect(() => {
    findAll();
    console.log(posts);
  }, []);
  if (!posts) return <div>loading...</div>;
  return (
    <div>
      <h3 style={{ textAlign: "center"}}> List Posts</h3>
      <table className="table table-hover">
        <thead>
          <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Category</th>
            <th>Time</th>
            <th>Action</th>
          </tr>
        </thead>
        <tbody>
          {posts.map((post, index) => (
            <tr key={post.id}>
              <td>{index + 1}</td>
              <td style={{color: "blue"}}>{post.title}</td>
              <td>{post.category}</td>
              <td>{post.updatedAt}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}
export default Home;
