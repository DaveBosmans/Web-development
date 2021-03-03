import React from 'react';

const ServicesHome = () => {
    return (
        <section id="services" className="block spacer p-bottom-xl-2">
            <div className="wrapper">
                <div className="row gutter-width-md with-pb-md service-items">
                    <div className="col-sm-12 col-md-4 col-lg-4 col-xl-4">
                        <div className="service">
                            <div className="service-icon">
                                <i className="malex-icon-strategy"></i>
                            </div>

                            <h4 className="service-t-head">Web Design</h4>

                            <p className="service-description"> Met veel creativiteit, passie en perfectionisme ontwerpen wij websites voor startups en gevestigde bedrijven.</p>

                            <div className="service-btn">
                                <a title="Read more" className="btn btn-sm btn-link btn-icon-hover p-0 border-0 min-w-auto link-no-space text-uppercase" href={ process.env.PUBLIC_URL + "/service-inside" }>
                                    <i className="malex-icon-arrow-right i-large"></i>
                                    <span className="btn-text">Lees Meer</span>
                                </a>
                            </div>
                        </div>
                    </div>

                    <div className="col-sm-12 col-md-4 col-lg-4 col-xl-4">
                        <div className="service">
                            <div className="service-icon">
                                <i className="malex-icon-choice"></i>
                            </div>

                            <h4 className="service-t-head">Wordpress</h4>

                            <p className="service-description">Wordpress biedt veel mogelijkheden, zo bouwen wij in mum van tijd een ideale website of webshop.</p>

                            <div className="service-btn">
                                <a title="Read more" className="btn btn-sm btn-link btn-icon-hover p-0 border-0 min-w-auto link-no-space text-uppercase" href={ process.env.PUBLIC_URL + "/service-inside" }>
                                    <i className="malex-icon-arrow-right i-large"></i>
                                    <span className="btn-text">Lees Meer</span>
                                </a>
                            </div>
                        </div>
                    </div>

                    <div className="col-sm-12 col-md-4 col-lg-4 col-xl-4">
                        <div className="service">
                            <div className="service-icon">
                                <i className="malex-icon-chart-5"></i>
                            </div>

                            <h4 className="service-t-head">Web Development</h4>

                            <p className="service-description"> Naast html/css/javascript, bouwen wij ook websites via React, voor snelle laadtijden en vloeiende overgangen op uw website.</p>

                            <div className="service-btn">
                                <a title="Read more" className="btn btn-sm btn-link btn-icon-hover p-0 border-0 min-w-auto link-no-space text-uppercase" href={ process.env.PUBLIC_URL + "/service-inside" }>
                                    <i className="malex-icon-arrow-right i-large"></i>
                                    <span className="btn-text">Lees Meer</span>
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    );
};

export default ServicesHome;