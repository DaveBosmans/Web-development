import React from 'react';
import {
  asset,
  Pano,
  Text,
  View,
  AmbientLight,
  StyleSheet,
  Model,
} from 'react-vr';
import TextScene from './TextScene';

export default class ProjectVRDave extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            background:'lobby.jpeg',
        }
    }
  render() {
    return (
     <View>
      
        <AmbientLight intensity={2.5} />
        <Pano source={asset(this.state.background)}/>
        <TextScene />

        {/* PIANO MODEL */}
        <Model 
          source={{
            obj: asset('/piano_obj/mus001.obj'),
            mtl: asset('/piano_obj/mus001.mtl')
          }}
          style={{
            transform: [
              {translate: [150, -200, -500]},
              {scale: 0.150},
              {rotateX: -90},
              {rotateY: 0},
              {rotateZ: 160}
            ]
          }}
          />

{/* MODEL IETS */}
      {/* <Model 
          source={{
            obj: asset('/piano_obj/mus001.obj'),
            mtl: asset('/piano_obj/mus001.mtl')
          }}
          style={{
            transform: [
              {translate: [150, -200, -500]},
              {scale: 0.150},
              {rotateX: -90},
              {rotateY: 0},
              {rotateZ: 160}
            ]
          }}
          /> */}

{/* MODEL IETS */}
        {/* <Model 
          source={{
            obj: asset('/piano_obj/mus001.obj'),
            mtl: asset('/piano_obj/mus001.mtl')
          }}
          style={{
            transform: [
              {translate: [150, -200, -500]},
              {scale: 0.150},
              {rotateX: -90},
              {rotateY: 0},
              {rotateZ: 160}
            ]
          }}
          /> */}
      </View>
    );
  }
};
