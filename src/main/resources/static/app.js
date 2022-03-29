const MyNameApp = {
    data() {
        return {
             titulo : null,
       		 url : null

        }
    },
    methods : {
        async getInfo(){

        const req = await fetch("http://localhost:8080/index");
        const data = await req.json(); 
        console.log(data);

      }
    },
     mounted(){
      this.getInfo()
    }
}

Vue.createApp(MyNameApp).mount("#app"); 