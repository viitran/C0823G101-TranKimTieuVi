import { useEffect, useState } from "react";

function Selector() {
  let [select, setSelect] = useState(0);
  // eslint-disable-next-line no-unused-vars
  let [value, setValue] = useState("");
  const choice = (e) => {
    setSelect(e.target.value);
  };

  useEffect(() => {
    switch (select) {
      case 0:
        setValue("JavaScript");
        break;
      case 1:
        setValue("Java");
        break;
      case 2:
        setValue("C++");
        break;
      case 3:
        setValue("ReactJs");
        break;
      default:
    }
  }, [select]
   );

  return (
    <div>
      <h3>
        Khoá học:
        <select onChange={e => {choice (e);}}>
          <option value={0}>JavaScript</option>
          <option value={1}>Java</option>
          <option value={2}>C++</option>
          <option value={3}>ReactJs</option>
        </select>
      </h3>
      <h3>Khoá bạn đã chọn là {select}</h3>
    </div>
  );
}
export default Selector;
