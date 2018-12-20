import React from 'react';
import { Link } from 'react-router-dom';


const HolidayCreateComponent = (props) => {


    return ( 
    <form className="container" onSubmit={props.handleSubmit}>

    <div className="form-group">
        <label>Holiday name</label>
        <input 
        name="name"
        onChange={props.handleChange}
        className="form-control"
        placeholder="Enter holiday name"/>
    </div>
    <div className="form-group">
        <label>DEscription</label>
        <input 
        name="description"
        onChange={props.handleChange}
        className="form-control"
        placeholder="Enter description"/>
    </div>
    <div className="form-group">
        <label>Image Url</label>
        <input 
        name="image"  
        onChange={props.handleChange}
        className="form-control"
        placeholder="Enter image Url"/>
    </div>
    
    <div className="form-group">
        <label>Institution type</label>
        <select class="custom-select" id="inputGroupSelect01"  name="type"   
        onChange={props.handleChange}>
            <option selected>Choose...</option>
            <option value="National">National</option>
            <option value="Private">Private</option>
        </select>

    </div>
    <div className="form-group">
        <label>City of institution</label>
        <input 
        name="city"
        onChange={props.handleChange}
        className="form-control"
        placeholder="Enter city of institution"/>
    </div>
    
    <button  onSubmit={props.onSubmit} type="submit" className="btn btn-success mx-1">
    Save</button>
    <Link className="btn btn-primary mx-1" to='/admin/institutions/'>Back</Link>
    
</form>)
}

export default HolidayCreateComponent;