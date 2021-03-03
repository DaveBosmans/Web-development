import React, { Fragment } from 'react';
import MetaTags from 'react-meta-tags';

import Loading from '../blocks/loading/Loading';
import Header from '../blocks/header/Header';
import Footer from '../blocks/footer/Footer';

import PageTitleSearch from '../blocks/page-title/PageTitleSearch';
import LoadMore from '../components/loadmore/LoadMore';

import SearchItemsData from '../data/search-results/searchItems';

const SearchResults = () => {
    document.body.classList.add( 'search-results' );
    document.body.classList.add( 'title-opacity-true' );

    return (
        <Fragment>
            <MetaTags>
                <meta charSet="UTF-8" />
                <title>Search results | Malex - Business Consulting Agency React JS Template</title>

                <meta httpEquiv="x-ua-compatible" content="ie=edge" />
                <meta name="viewport" content="width=device-width, initial-scale=1" />
                <meta name="description" content="" />
                <meta name="keywords" content="" />
                <meta name="robots" content="index, follow, noodp" />
                <meta name="googlebot" content="index, follow" />
                <meta name="google" content="notranslate" />
                <meta name="format-detection" content="telephone=no" />
            </MetaTags>

            <Loading />

            <Header />

            <main id="main" className="site-main">
                <PageTitleSearch />

                <div id="page-content" className="spacer p-top-xl">
                    <div className="wrapper">
                        <div className="content">
                            <div className="row gutter-width-md with-pb-lg">
                                { SearchItemsData && SearchItemsData.map( ( item, key ) => {
                                    return (
                                        <div key={ key } className="col-xl-4 col-lg-4 col-md-4 col-sm-12">
                                            <div className="card card-post">
                                                <div className="card-body p-0">
                                                    <h5 className="card-title">
                                                        <a title={ item.title } className="d-block" href={ process.env.PUBLIC_URL + item.link }>{ item.title }</a>
                                                    </h5>
        
                                                    <p className="card-text">{ item.description }</p>
        
                                                    <div className="card-btn">
                                                        <a title="Read more" className="btn btn-sm btn-link btn-icon-hover p-0 border-0 min-w-auto link-no-space text-uppercase" href={ process.env.PUBLIC_URL + item.link }>
                                                            <i className="malex-icon-arrow-right i-large"></i>
                                                            <span className="btn-text">Read more</span>
                                                        </a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    );
                                })}
                            </div>

                            <LoadMore />
                        </div>
                    </div>
                </div>
            </main>

            <Footer />
        </Fragment>
    );
};

export default SearchResults;
