import React from 'react';
import { Link } from 'react-router-dom';

type props = {
    link: string;
    linkText: string;
}

const Filters = ({ link, linkText }: props) => (
<div className="filters-container records-actions">
    <Link to={link}>
            <button className="action-filters">
                    {linkText}
            </button>
    </Link>
</div>
);

export default Filters;