import React from 'react';

const DarkLogo = () => {
    return (    
        <a className="logo logo-primary adv-dark transform-scale-h" title="Logo" href={ process.env.PUBLIC_URL +"/" }>
            {/* <img src="assets/img/logo/logo-dark.svg" alt="Logo" /> */}
            <p>DB Webstudio</p>
        </a>
    );
};

const LightLogo = () => {
    return (    
        <a className="logo logo-secondary adv-light transform-scale-h" title="Logo" href={ process.env.PUBLIC_URL +"/" }>
            {/* <img src="assets/img/logo/logo-light.svg" alt="Logo" /> */}
            <p>DB Webstudio</p>
        </a>
    );
};

const ShowLogo = ( color ) => {
    const showColor = color.showColor;

    if ( showColor === "dark" ) {
      return <DarkLogo />;
    }
    return <LightLogo />;
};

const HomeHeaderLogo = ( props ) => {
    return (
        <div className="header-logo">
            <ShowLogo showColor={ props.logoColor } />
        </div>
    );
};

export default HomeHeaderLogo;