import MovieCard from "components/MovieCard";
import Pagination from "components/Pagination";

export default function Listing() {
    return (
        <>
            <Pagination />
            <div className="container">
                <div className="row">
                    <div className="col-lg-3 col-md-4 col-sm-6 mb-3">
                        <MovieCard />
                    </div>
                    <div className="col-lg-3 col-md-4 col-sm-6 mb-3">
                        <MovieCard />
                    </div>
                    <div className="col-lg-3 col-md-4 col-sm-6 mb-3">
                        <MovieCard />
                    </div>
                    <div className="col-lg-3 col-md-4 col-sm-6 mb-3">
                        <MovieCard />
                    </div>
                    <div className="col-lg-3 col-md-4 col-sm-6 mb-3">
                        <MovieCard />
                    </div>
                    <div className="col-lg-3 col-md-4 col-sm-6 mb-3">
                        <MovieCard />
                    </div>
                </div>
            </div>
        </>
    )
}