import React from 'react';

import ModalMenuLanguages from '../menu/ModalMenuLanguages';

const PageTitleHome = () => {
    return (
        <section id="page-title" className="block with-img with-service-items" style={ { backgroundImage: `url( ${ require( "../../assets/img/placeholder/1920x1000.jpg" ) } )` } }>
            <div className="wrapper d-flex flex-column justify-content-center">
                <div className="page-title-body page-title-body-space-left">
                    <div className="title">
                        <h1 className="large">Web Development<br/> Agency</h1>
                    </div>

                    <div className="description spacer p-top-lg">
                        <p>We are digital business consulting agency that helps companies increase better incomes and help with branding for faster business growing.</p>
                    </div>

                    <div className="spacer p-top-lg no-space">
                        <a href={ process.env.PUBLIC_URL + "/about-us"} className="btn btn-outline-tertiary">Learn More</a>
                    </div>
                </div>

                <div className="page-title-footer full-width">
                    <div className="d-flex justify-content-between">
                        <a href="#services" className="scroll-to-id scroll-animation">
                            <i className="malex-icon-long-arrow-down i-large-2"></i>
                        </a>

                        <div className="align-self-end">
                            <ModalMenuLanguages />
                        </div>
                    </div>
                </div>
            </div>

            <div className="page-title-bg-color"></div>
        </section>
    );
};

export default PageTitleHome;
