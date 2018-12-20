import React from 'react';
import axios from 'axios';
import { Link } from 'react-router-dom';
import InstCreateComponent from './HolidayCreateComponent';
class InstCreateContainer extends React.Component {

    constructor(){
        super();
        this.state = {    
            image: '',
            type: '',
            category: '',
            city: '',
            title: ''
        };
    }

    
    handleChange = (event) => {
        event.preventDefault();
            this.setState({[event.target.name]:event.target.value})
        
    
    } 
    handleSubmit = (event) => {
        event.preventDefault();

        axios.post("http://localhost:8081/library/api/institutions/new/", this.state)
        .then(response =>{
            this.props.history.push('/admin/institutions');
            alert("Added institution " + this.state.title + " to repository")
        })
        .catch(err => {
            alert("Information is not correct" + err);
        });
        

    }
    render() {
    return <InstCreateComponent 
                handleSubmit={this.handleSubmit}
                handleChange={this.handleChange}
                onSubmit={() => this.onSubmit}
    
                    />
    
    

    }
}

export default InstCreateContainer;