function Product(props){
    const {x,showModal}=props
    return (
        <div className="col-md-4 col-sm-6 col-lg-3 mb-4">
            <div className="card border-0 shadow-sm">
                <img src={"http://localhost:8080/"+x.photo} className="card-img-top" alt={x.pname} style={{height: "250px", objectFit: "cover"}} />
                <div className="card-body p-3">
                    <h5 className="card-title mb-0">{x.pname}</h5>
                    <p className="card-text mb-2">{x.brand}</p>
                    <p className="card-text mb-0">&#8377; {x.price}</p>
                </div>
                <div className="card-footer bg-white border-0 p-0">
                    <button onClick={e=>showModal(x)} className="btn btn-primary btn-sm rounded-0 w-100">Book Event</button>
                </div>
            </div>
        </div>
    )
}

export default Product;
