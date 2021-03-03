import React from 'react';

const AboutsUs = () => {
    return (
        <div className="wrapper">
            <div className="title">
                <h6 className="text-primary text-uppercase">Over Ons</h6>
            </div>

            <div className="row gutter-width-md with-pb-md">
                <div className="col-sm-12 col-md-6 col-lg-6 col-xl-6">
                    <div className="description-2">
                        <h2>Zorg dat uw bedrijf online goed zichtbaar is en zorg voor een goede online presentatie</h2>
                    </div>

                    <div className="signature spacer m-top-lg">
                        <div className="signature-img">
                            <img src="assets/img/demo/23_img.png" alt="Signature" />
                        </div>
                        <div className="signature-content">
                            <h5 className="signature-name">Dave Bosmans</h5>
                            <p className="signature-position">CEO van DB Webstudio</p>
                        </div>
                    </div>
                </div>

                <div className="col-sm-12 col-md-6 col-lg-6 col-xl-6">
                    <div className="description-2">
                        <p>DB Webstudio staat bekend om zijn creatieve designs en technische skills, deze combinatie zorgt ervoor dat we levendige en gebruiksvriendelijke technische websites ontwikkelen.
                        </p>
                    </div>

                    <div className="description-2 spacer p-top-lg">
                        <p>lorem ipsum dolor sit amet, consectetur adip lorem ipsum dolor sit amet, consectetur adip lorem ipsum dolor sit amet, consectetur adip lorem ipsum dolor sit amet</p>
                    </div>
                </div>
            </div>

            {/* <div className="icon-list">
                <div className="icon-list-items">
                    <div className="icon-list-item">
                        <p><span className="d-flex">
                            <i className="fas fa-check"></i><span>Constant Improvement</span></span></p>
                    </div>

                    <div className="icon-list-item">
                        <p><span className="d-flex"><i className="fas fa-check"></i><span>Commitment to Customers</span></span>
                        </p>
                    </div>

                    <div className="icon-list-item">
                        <p><span className="d-flex"><i className="fas fa-check"></i><span>Best Quality You Can Get</span></span>
                        </p>
                    </div>

                    <div className="icon-list-item">
                        <p><span className="d-flex"><i className="fas fa-check"></i><span>30 Days Money Back Warranty</span></span>
                        </p>
                    </div>
                </div>
            </div> */}
        </div>
    );
};

export default AboutsUs;
