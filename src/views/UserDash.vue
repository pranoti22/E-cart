<template>
    <div id="reg">
        <h1>Shop</h1>
        <label for="category" >Choose a category:</label>
            <select id="category" name="category" ref="category" v-model="input.category" >
                <option v-for="items in data" :key="items.category"  >{{items.category}}</option>
                <option value="" ></option>
                <option value="" ></option>
                <option value="" ></option>
            </select><br><br>
        <label for="product">Choose a product:</label>
            <select id="product" name="product" ref="product" v-model="input.product">
                <option v-for="items in data" :key="items.productName"  >{{items.productName}}</option>
                <option value="" ></option>
                <option value=""  ></option>
                <option value=""  ></option>
            </select><br><br>
            <label for="cars">{{}}Product price here</label><br><br>
            <label for="cars" >Add required Qty:</label>
            <input type="number" id="quantity" name="quantity" min="1" max="5"  v-model="input.qty"><br><br>
        <button type="button" v-on:click="addItem()" style="align:center">Add to cart</button>
        <button type="button" v-on:click="addItem()" style="align:center">view cart</button>
        <button type="button" v-on:click="addItem()" style="align:center">Pay</button>
    </div>
</template>

<script>
import axios from 'axios';
    export default {
        name: 'UserDash',
        data() {
            return {
                input: {
                   product:"",
                   category:"",
                   qty:""
                },
                data:[]
            }
        },
        methods: {
            beforeMount() {
                 axios.get('http://localhost:8084/products').then(resp => {
                  this.data=resp.data;
                  console.log(this.data);
                 });
            },
            addItem(){

            },
            generateOrder(){

            }
        }
    }
</script>

<style scoped>
    #reg {
        width: 800px;
        border: 1px solid #CCCCCC;
        background-color: #FFFFFF;
        margin: auto;
        margin-top: 100px;
        padding: 20px;
    }
</style>