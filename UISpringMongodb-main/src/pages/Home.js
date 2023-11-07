import React from "react";
import { Typography, Button } from "@mui/material";
import { Link } from "react-router-dom";
import "../App.css";
import { green } from "@mui/material/colors";

const Home = () => {
  return (
    <div>
      <Typography
        sx={{ margin: "5%" }}
        variant="h3"
        align="center"
        color="green"
      >
        HI 'Nara' Get Hired or Hire people for free!
      </Typography>
      <div align="center">
        <ul className="ul">
          <li>
            <Button sx={{ margin: "2% 3%" }} variant="outlined">
              <Link to="/employer/dashboard">Hire talent</Link>
            </Button>
          </li>
          <li>
            <Button sx={{ margin: "2% 3%" }} variant="outlined">
              <Link to="/employee/feed">Get Job Now</Link>
            </Button>
          </li>
        </ul>
      </div>
    </div>
  );
};

export default Home;
