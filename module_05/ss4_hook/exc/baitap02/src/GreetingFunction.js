import React, { useState, useEffect } from 'react';

export default function Greeting() {
    const [firstName, setFirstName] = useState(window.localStorage.getItem('classFirstName') || '');
    const [lastName, setLastName] = useState(window.localStorage.getItem('classLastName') || '');

    useEffect(() => {
        window.localStorage.setItem('classFirstName', firstName);
        window.localStorage.setItem('classLastName', lastName);
    }, [firstName, lastName]);

    const handleFirstNameChange = (e) => {
        setFirstName(e.target.value);
    };

    const handleLastNameChange = (e) => {
        setLastName(e.target.value);
    };

    return (
        <div>
            <input 
                value={firstName}
                onChange={handleFirstNameChange}
            />
            <br/>
            <input 
                value={lastName}
                onChange={handleLastNameChange}
            />
            <p>
                Xin chào, {' '}
                <span>
                    {firstName} {lastName}
                </span>
            </p>
        </div>
    );
}
