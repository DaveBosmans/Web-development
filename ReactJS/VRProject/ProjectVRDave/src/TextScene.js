import React from 'react';
import {Text, View, StyleSheet, Video, asset, VrButton, Sound} from 'react-vr';

export default class TextScene extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            video: false,
            audio: true,
            wavFile: '\Relaxing-bird-sounds.mp3',
        };
    }

    useAudio() {
        if(this.state.audio === true) {
            return <Sound 
                loop={true}
                volume={5}
                source={{
                    wav: asset(this.state.wavFile)
                }}
            />
        }
    }

    startVideo() {
        this.setState({
            video: true,
            audio: false,
        })
    }

    rederItems() {
        if (this.state.video === false) {
            return  <Text
            style={{
                backgroundColor: '#777879',
                fontSize: 0.5,
                fontWeight: '400',
                paddingLeft: 0.2,
                paddingRight: 0.2,
                textAlign: 'center',
                textAlignVertical: 'center',
                transform: [
                    {translate: [-150, -150, -400]},
                    {scale: 50},
                    {rotateX: 0},
                    {rotateY: 0},
                    {rotateZ: 0}
                  ]
            }}
            >Iets over mij: Piano, klik hier</Text>
        } else {
            return <Video
                source= {{uri: '/static_assets/Stories We Tell Ourselves.mp4'}}
                style={{
                    height: 2,
                    width: 3.56,
                    transform: [
                        {translate: [-3, 1, -3]},
                        {rotateY: 15},
                        {rotateZ:0},
                        {rotateX:0}
                    ]
                }}
            />
        }
    }

    render() {
        return (
            <View>
               <VrButton onClick= {this.startVideo.bind(this)}>
                   {this.rederItems()}
               </VrButton>
               {this.useAudio()}

{/* 2e tekst voorbeeld */}
            {/* <Text
                style={{
                    backgroundColor: '#777879',
                    fontSize: 0.5,
                    paddingLeft: 0.2,
                    paddingRight: 0.2,
                    textAlign: 'center',
                    textAlignVertical: 'center',
                    transform: [
                        {translate: [-150, -150, -400]},
                        {scale: 50},
                        {rotateX: 0},
                        {rotateY: 0},
                        {rotateZ: 0}
                      ]
                }}
                >Iets over mij: Piano, klik hier</Text> */}
            </View>
        )
    }
}