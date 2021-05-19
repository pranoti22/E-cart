<template>
    <div id="reg">
        <p v-if="errors.lenght">
    <b>Please correct the following error(s):</b>
    <ul>
      <li v-for='error in errors'  v-bind:key='error'>{{ error }}</li>
    </ul>
  </p>
        <h1>Register</h1>
        <input type="text" name="fullname" v-model="input.fullName" placeholder="fullname" /><br><br>
        <input type="email" name="mail" v-model="input.email" placeholder="Email" /><br><br>
        <input type="text" name="mobNo" v-model="input.mobNo" placeholder="Moble Number" /><br><br>
        <textarea placeholder="Address" name="address" v-model="input.address"></textarea><br><br>
        <input type="text" name="username" v-model="input.userName" placeholder="Username" /><br><br>
        <input type="password" name="password" v-model="input.paswrd" placeholder="Password" /><br><br>
        <button type="button" v-on:click="validations($event)" style="align:center">Register</button>
    </div>
</template>

<script>
 import axios from 'axios';
    export default {
        name: 'Register',
        data() {
            return {
                input: {
                    fullName:"",
                    email:"",
                    mobNo:"",
                    address:"",
                    userName: "",
                    paswrd: ""
                },
                errors:[],
                show:'false'
            }
        },
        methods: {
            register(){
                  
                axios.post("http://localhost:8084/saveuser",this.input).then((result) => {
                 console.log(result);
                  });
            },
            validations(e){
                if(!this.input.fullname || !this.input.mobNo|| !this.input.mail|| !this.input.address || !this.input.password || !this.input.username)
                 {
                     this.errors.push("Some fields left blank.Please fill all the fields!!");
                 }
                 if(!this.validEmail(this.input.mail))
                 {this.errors.push("Enter valid email");}

                 if(!this.validMobno(this.input.mobNo))
                 {this.errors.push("Enter valid Mobile number");}

                 if(!this.validPassword(this.input.password))
                 {this.errors.push("Password needs to be min 5 charaters with atleast 1 digit and 1 chapital letter 1 samll letter ");}


                e.preventDefault();
                
                    axios.post("http://localhost:8084/saveuser",this.input).then((result) => {
                 console.log(result);
                  });
                
            },
            validEmail: function (email) {
      let re = /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/;
      console.log(re.test(email));
      return re.test(email);
    },
    validPassword: function (pwd) {
      let re = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{5,10}$/;
      console.log(re.test(pwd));
      return re.test(pwd);
    },
    validMobno(mob){
        let re =/^[789]\d{9}$/;
        console.log(re.test(mob));
        return re.test(mob);
    },

    }
    }
</script>

<style scoped>
    #reg {
        width: 500px;
        border: 1px solid #CCCCCC;
        background-color: #FFFFFF;
        margin: auto;
        margin-top: 100px;
        padding: 20px;
    }
</style>
