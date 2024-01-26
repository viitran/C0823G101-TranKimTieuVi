import {useState,useEffect} from 'react'

function Selection() {
    const[selectCar,setSelectCar] = useState(0)
    const[selectColor,setSelectColor] = useState("")

    const cars = [
        { id: 1, name: 'Toyota', color: ['Red', 'Blue', 'Green'] },
        { id: 2, name: 'Honda', color: ['Black', 'White', 'Silver'] },
        { id: 3, name: 'Ford', color: ['Yellow', 'Orange', 'Purple'] }
    ]
    const choice = e => {
        setSelectCar(e.target.selectCar);
        selectColor(e.target.selectColor);
    }

    return (
        <div>
            <select onChange={choice} value={selectCar} name="cars">
                {cars.map((car) => (
                    <option key={car.id} value={car.id}>
                        {car.name}
                    </option>
                ))}
            </select>

            <select onChange={choice} value={selectColor} name="colors">
                {cars.find((c) => c.id === selectCar)?.color?.map((color, index) => (
                    <option key={index} value={color}>
                        {color}
                    </option>
                ))}
            </select>
        </div>
    )
}
export default Selection;