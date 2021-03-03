import React from 'react';

const HeaderMenuPrimary = () => {
    return (
        <div className="menu">
            <nav className="menu-primary">
                <ul className="nav">
                    <li className="nav-item">
                        <a title="Services" href={ process.env.PUBLIC_URL + "/#services" }>Diensten</a>
                    </li>

                    <li className="nav-item">
                        <a title="About Us" href={ process.env.PUBLIC_URL + "/#about-us" }>Over Ons</a>
                    </li>

                    <li className="nav-item">
                        <a title="Teams" href={ process.env.PUBLIC_URL + "/#team-members" }>Team</a>
                    </li>

                    <li className="nav-item">
                        <a title="Pricing" href={ process.env.PUBLIC_URL + "/#price-plans" }>Prijzen</a>
                    </li>

                    <li className="nav-item">
                        <a title="Testimonials" href={ process.env.PUBLIC_URL + "/#testimonials" }>Testimonials</a>
                    </li>

                    <li className={ "nav-item " + ( window.location.pathname.includes( "/news" ) || window.location.pathname.includes( "/news-single-page" )? "current-nav-item" : "" ) }>
                        <a title="News" href={ process.env.PUBLIC_URL + "/news" }>Nieuws</a>
                    </li>

                    <li className="nav-item">
                        <a title="Contacts" href={ process.env.PUBLIC_URL + "/#contacts" }>Contact</a>
                    </li>
                </ul>
            </nav>
        </div>
    );
};

export default HeaderMenuPrimary;
