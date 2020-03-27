import React, {useEffect} from 'react';
;
import '@shopify/polaris/styles.css';

import ReactDOM from 'react-dom'


const Index = () => {

    let name = document.getElementById("user_name");
    if(name !== null){
        console.log(name);
    }

    return(
        <div>
            Hello world from react native
        </div>

    );
};

ReactDOM.render(<Index />, document.getElementById("index"));