import {ReactComponent as Arrow} from 'assets/img/arrow.svg';
import './style.css';

export default function Pagination() {
    return (
        <div className="dsmovie-pagination-container">
            <div className="dsmovie-pagination-box">
                <button className="dsmovie-pagination-button" disabled={true} >
                    <Arrow />
                </button>
                <p>{`${1} de ${1}`}</p>
                <button className="dsmovie-pagination-button" disabled={true} >
                    <Arrow className="dsmovie-flip-horizontal" />
                </button>
            </div>
        </div>
    )
}