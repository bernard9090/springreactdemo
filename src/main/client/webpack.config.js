const HtmlWebPackPlugin = require("html-webpack-plugin");
const path = require("path");

const htmlPlugin = new HtmlWebPackPlugin({
    template:"./src/index.html",
    filename:"./index.html"
});



module.exports = {
    performance: {
        hints: false,
        maxEntrypointSize: 51200000,
        maxAssetSize: 512000
    },
    output: {
        path: path.resolve("dist"),
        filename: "static.js.index.js",
        publicPath: '/'
    },

    module:{
        rules:[
            {
                test:/\.js$/,
                exclude:/node_modules/,
                use:{
                    loader:'babel-loader',
                }
            },
            {
                test: /\.css$/i,
                use: ['style-loader', 'css-loader'],
            },
            {
                test:/\.(png|svg|jpg|jpeg|gif|woff(2)?|ttf|eot|otf)$/,
                use:[
                    'file-loader'
                ]
            }
        ]
    },
    devServer: {
        historyApiFallback: true,
    },
    plugins:[htmlPlugin]
};