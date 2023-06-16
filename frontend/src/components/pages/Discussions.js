import React, { useEffect, useState } from 'react';
import axios from 'axios';


function Discussions() {
  const [discussions, setDiscussions] = useState([]);

  useEffect(() => {
    // Fetch discussions from backend API
    axios.get('/api/discussions')
      .then(response => {
        setDiscussions(response.data);
      })
      .catch(error => {
        console.error('Error fetching discussions:', error);
      });
  }, []);

  return (
    <div>
      <h2>Group Discussions</h2>
      <ul>
        {discussions.map(discussion => (
          <li key={discussion.id}>{discussion.title}</li>
        ))}
      </ul>
    </div>
  );
}

export default Discussions;
