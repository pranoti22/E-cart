<template>
    <div id="login">
        <p>{{msg}}</p>
        <h1>Login</h1>
        <input type="text" name="username" v-model="input.username" placeholder="Username" />
        <input type="password" name="password" v-model="input.password" placeholder="Password" />
        <button type="button" v-on:click="login">Login</button>
    </div>
</template>

<script>
import axios from 'axios';
    export default {
        name: 'Login',
        data() {
            return {
                input: {
                    username: "",
                    password: ""
                },
                users:[],
                flag:0,
                msg:""
            }
        },
        methods: {
            
            login() {
                 //this.users=axios.get("http://localhost:8084/users");
                axios.get('http://localhost:8084/users').then(resp => {
                 this.users=resp.data;
                 this.searchData();
                 //console.log(this.users);
                 });
                 
                if(this.flag)
                {
                    this.$router.replace({name:'UserDash'})
                }
                else{
                          this.msg="invalid login";
                }
              
                  
                
            },
            searchData(){
                 
                   var data=this.users;
             data.forEach(element => {
                 if(element.userName === this.input.username && element.paswrd === this.input.password)
                 { //this.$router.replace({name:'UserDash'})
                      this.flag=1;
                 }
             });
                 }
        
            
            }
        }
    
</script>

<style scoped>
    #login {
        width: 500px;
        border: 1px solid #CCCCCC;
        background-color: #FFFFFF;
        margin: auto;
        margin-top: 200px;
        padding: 20px;
    }
</style>