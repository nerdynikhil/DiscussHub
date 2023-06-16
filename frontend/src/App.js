import React from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Header from './components/common/Header';
import Footer from './components/common/Footer';
import Home from './components/pages/Home';
import Discussions from './components/pages/Discussions';

function App() {
  return (
    <div className="App">
      <Router>
        <Header />
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/discussions" element={<Discussions />} />
          {/* Add more routes as needed */}
        </Routes>
        <Footer />
      </Router>
    </div>
  );
}

export default App;
