import './App.css';
import CreateSpotifyApp from './UI/Spotify/create/CreateSpotifyApp';
import SpotifyApp from './UI/Spotify/SpotifyApp';
import { Route,Routes } from 'react-router-dom';

function App() {
  return (
    <div>
      <Routes>
        <Route path='/' element={<SpotifyApp/>}/>
        <Route path='/create' element={<CreateSpotifyApp/>}/>
      </Routes>
    </div>
  );
}

export default App;
